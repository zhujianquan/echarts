package com.echarts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyBean
 * @Description TODO
 * @Author zhujianquanAdministrator
 * @Date 2019/03/01 14:29
 */

@Component
public class MyBean implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.err.println(args);

    }
}
