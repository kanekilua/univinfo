package com.kane.univInfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Kane on 2018/6/9.
 */
@SpringBootApplication
@MapperScan(basePackages = "com.kane.univInfo.dao")
@ComponentScan(basePackages = "com.kane.univInfo.service")
@ComponentScan(basePackages = "com.kane.univInfo.controller")
public class Application {
    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }
}
