package com.zhy.test;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 2/2/2024 上午11:51
 */
@SpringBootTest
public class ElasticsearchTest {
    //@Autowired
    //@Qualifier("restHighLevelClient")
    //private RestHighLevelClient client;
    @Test
    public void contextLoads() {
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("192.168.100.110", 9200, "http")
                ));
        System.out.println(client);
    }


}

