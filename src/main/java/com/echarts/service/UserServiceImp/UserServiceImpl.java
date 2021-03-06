package com.echarts.service.UserServiceImp;

import com.echarts.dao.UserDao;
import com.echarts.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<HashMap<String, Object>> selectAllUser() {
        return userDao.selectAllUser();
    }

    @Override
    public HashMap<String, Object> getUserCount() {
        int count = userDao.getUserCount();
        HashMap<String, Object> map= new HashMap<String, Object>();
        map.put("count",count);
         return map;
    }
}
