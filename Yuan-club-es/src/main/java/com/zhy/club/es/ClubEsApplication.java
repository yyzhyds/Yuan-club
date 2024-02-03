package com.zhy.club.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 2/2/2024 上午11:49
 */
@SpringBootApplication
public class ClubEsApplication {
    public static void main(String[] args) {
        System.setProperty("es.set.netty.runtime.available.processors", "false");
        SpringApplication.run(ClubEsApplication.class,args);
    }
}
