package com.echarts.controller;

import com.echarts.model.Order;
import com.echarts.service.UserService;
import com.jedis.RedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @Autowired
    private RedisConfig redisConfig ;
    private static final Logger logger  = LoggerFactory.getLogger(UserController.class);

    /**
     * 本地访问内容地址 ：http://localhost:8080/lmycc/hello
     * @param map
     * @return
     */
    @RequestMapping("/hello")

    public String helloHtml(HashMap<String, Object> map) {
        map.put("hello", "欢迎进入HTML页面");
        return "/index";
    }

    @RequestMapping("/getUserCount")
    @ResponseBody
    public HashMap<String,Object> getUserCount(){
        HashMap<String,Object> map = userService.getUserCount();
        logger.info("数量"+map);
        return map;
    }

    @RequestMapping("/showUser")
    @ResponseBody
    public List<HashMap<String,Object>> selectAllUsers(){
        return userService.selectAllUser();
    }

    @RequestMapping("/demoTest")
    @ResponseBody
    public  HashMap<String,Object> demoTest(){
        redisConfig.set("name","zhangsan");
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("name",redisConfig.get("name"));
        return hashMap;
    }


    @RequestMapping("/getorderById")
    @ResponseBody
    public Order selectOrderResultMap(){
       return userService.selectOrderResultMap(2);
    }

    @RequestMapping("/queryAll")
//    @ResponseBody
    public void queryAll(HttpServletResponse response)throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        List<Order> a = userService.queryAll();

        PrintWriter out =  response.getWriter();
        out.print(mapper.writeValueAsString(a));
        out.flush();
        out.close();

    }

}
