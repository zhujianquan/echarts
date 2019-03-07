package com.echarts.dao;

import com.echarts.model.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author zhujianquanAdministrator
 * @Date 2019/03/01 10:01
 */
@Mapper
public interface OrderDao {

    Order selectOrderResultMap(int id);

    List<Order> queryAll();

}
