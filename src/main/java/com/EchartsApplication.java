package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@MapperScan("com.echarts.dao")
@EnableCaching
public class EchartsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchartsApplication.class, args);
	}

}

