package com.echarts.controller;

import com.echarts.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.echarts.model.User;


@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    private static final Logger logger  = LoggerFactory.getLogger(UserController.class);

    /**
     * 本地访问内容地址 ：http://localhost:8080/lmycc/hello
     * @param map
     * @return
     */
    @RequestMapping("/hello")
    public String helloHtml(HashMap<String, Object> map) {
        map.put("hello", "欢迎进入HTML页面");
        map.put("hello", "欢迎进入HTML页面");
        map.put("hello", "欢迎进入HTML页面");
        map.put("hello", "欢迎进入HTML页面");
        map.put("hello", "欢迎进入HTML页面");
        map.put("hello", "欢迎进入HTML页面");
        map.put("hello", "欢迎进入HTML页面");
        map.put("hello", "欢迎进入HTML页面");
        return "redirect:/index.html";
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
        try {
            String className  = "com.echarts.model.User";
            Class<User> clas =  (Class<User>)Class.forName(className);

            User user = clas.newInstance();
            Map<String,String> map = new HashMap<>();
            map.put("kecheng","语文");
            user.setName("张三");
            user.setAge(12);
            user.setAa(map);
            System.out.println(user.toString());
            System.out.println(user.toString());
            System.out.println(user.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return userService.selectAllUser();
    }
}
