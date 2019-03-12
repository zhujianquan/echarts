package com.echarts.model;

import java.util.Map;
import java.util.Objects;

public class User {
    private String name;
    private int age;
    private Map<String,String> aa;

//    public User(String name, int age, Map<String, String> aa) {
//        this.name = name;
//        this.age = age;
//        this.aa = aa;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, String> getAa() {
        return aa;
    }

    public void setAa(Map<String, String> aa) {
        this.aa = aa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(aa, user.aa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, aa);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", aa=" + aa +
                '}';
    }
}
