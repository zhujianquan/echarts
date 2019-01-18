package com.echarts.service;

import java.util.HashMap;
import java.util.List;

public interface UserService {

    //获取所有用户
    public List<HashMap<String,Object>> selectAllUser();

    //获取用户数量
    public HashMap<String,Object> getUserCount();

}
