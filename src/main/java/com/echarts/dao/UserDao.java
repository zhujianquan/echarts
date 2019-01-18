package com.echarts.dao;

import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

public interface UserDao {

   public  List<HashMap<String,Object>> selectAllUser();

   @Select("SELECT COUNT(1) FROM t_user where 1=1")
   public int getUserCount();
}
