package com.echarts.controller;

import com.echarts.service.UserService;
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
        return userService.getUserCount();
    }

    @RequestMapping("/showUser")
    @ResponseBody
    public List<HashMap<String,Object>> selectAllUsers(){
        return userService.selectAllUser();
    }
}
