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
}
