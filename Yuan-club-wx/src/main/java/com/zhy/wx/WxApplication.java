package com.zhy.wx;

import com.sun.glass.ui.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 22/1/2024 下午2:49
 */
@SpringBootApplication
@ComponentScan("com.zhy")
public class WxApplication {
    public static void main(String[] args) {
        SpringApplication.run(WxApplication.class,args);
    }
}
