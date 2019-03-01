package com.echarts.model;

/**
 * @ClassName Order
 * @Description TODO
 * @Author zhujianquanAdministrator
 * @Date 2019/03/01 09:51
 */
public class Order {
    /**
     *
     CREATE TABLE orders(
     order_id INT PRIMARY KEY AUTO_INCREMENT,
     order_no VARCHAR(20),
     order_price FLOAT
     );
     */

    //Order实体类中属性名和orders表中的字段名是不一样的
    private int id;                //id===>order_id
    private String orderNo;        //orderNo===>order_no
    private String price;        //price===>order_price

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", orderNo=" + orderNo + ", price=" + price+ "]";
    }
}
