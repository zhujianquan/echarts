package com.echarts.dao;

import com.echarts.model.Order;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author zhujianquanAdministrator
 * @Date 2019/03/01 10:01
 */
public interface OrderDao {

    public Order selectOrderResultMap(int id);
}
