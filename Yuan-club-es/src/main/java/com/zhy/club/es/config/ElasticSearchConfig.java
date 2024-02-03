package com.zhy.club.es.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 2/2/2024 上午11:50
 */
@SpringBootConfiguration
@Configuration
@ConfigurationProperties(prefix = "elasticsearch1")
public class ElasticSearchConfig {
    private String host;
    private int port;

    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    @Bean
    public RestHighLevelClient restHighLevelClient(){
        return new RestHighLevelClient(RestClient.builder(new HttpHost(host,port,"http")));
    }

//    @Bean
//    public RestClient restClient(){
//        return new RestHighLevelClient(RestClient.builder(new HttpHost(host,port,"http"))).getLowLevelClient();
//    }
}

