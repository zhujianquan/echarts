package com.echarts.service.UserServiceImp;

import com.echarts.dao.OrderDao;
import com.echarts.model.Order;
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

    @Resource
    private OrderDao orderDao;

    @Override
    public List<HashMap<String, Object>> selectAllUser() {
        return userDao.selectAllUser();
    }

    @Override
    @Transactional
    public HashMap<String, Object> getUserCount() {
        int count = userDao.getUserCount();
        HashMap<String, Object> map= new HashMap<String, Object>();
        map.put("count",count);
         return map;
    }


    @Override
    @Transactional
    public  Order selectOrderResultMap(int id){

        Order o =  orderDao.selectOrderResultMap(id);
        System.out.println(o);
       return o;
    }

    @Override
    @Transactional
    public List<Order> queryAll() {
        List<Order> list =  orderDao.queryAll();
//        System.out.println(1/0);
        return list;
    }


}
