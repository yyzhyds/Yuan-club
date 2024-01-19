package com.zhy.oss.config;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 19/1/2024 下午4:14
 */
@Configuration
public class MinioConfig {

    /**
     * minioUrl
    */
    @Value("${minio.url}")
    private String url;

    /**
     * minio账户
     */
    @Value("${minio.accessKey}")
    private String accessKey;

    /**
     * minio密码
     */
    @Value("${minio.secretKey}")
    private String secretKey;

    /**
     * 构造minio客户端
     */
    @Bean
    public MinioClient getMinioClient(){
        return MinioClient.builder().endpoint(url).credentials(accessKey,secretKey).build();

    }

}
