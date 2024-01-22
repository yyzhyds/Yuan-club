package com.zhy.club.gateway;


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
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
    }
}
