package com.zhy.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Lenovo
 * @version 1.0
 * @description 刷题微服务启动类
 * @date 14/1/2024 下午4:30
 */
@SpringBootApplication
@ComponentScan("com.zhy")
@MapperScan("com.zhy.**.mapper")
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class,args);
    }
}
