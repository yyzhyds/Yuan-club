package com.zhy.subject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
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
@EnableFeignClients(basePackages = {"com.zhy"})
public class SubjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SubjectApplication.class,args);
    }
}
