package com.zhy.test;

import org.apache.http.HttpHost;
import org.elasticsearch.client.IndicesClient;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 2/2/2024 下午12:12
 */
@SpringBootTest
public class CreateIndex {

    /**
     * 添加索引带映射
     */
    @Test
    public void addIndexAndMapping() throws IOException {
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("192.168.100.110", 9200, "http")
                ));
        IndicesClient indicesClient = client.indices();
        CreateIndexRequest createRequest = new CreateIndexRequest("subject");
        String mapping = "{\n" +
                "    \"properties\": {\n" +
                "        \"doc_id\": {\n" +
                "            \"type\": \"long\"\n" +
                "        },\n" +
                "        \"subject_id\": {\n" +
                "            \"type\": \"long\"\n" +
                "        },\n" +
                "        \"subject_type\": {\n" +
                "            \"type\": \"integer\"\n" +
                "        },\n" +
                "        \"create_time\": {\n" +
                "            \"type\": \"long\"\n" +
                "        },\n" +
                "        \"subject_name\": {\n" +
                "            \"type\": \"text\",\n" +
                "            \"analyzer\": \"ik_smart\"\n" +
                "        },\n" +
                "        \"subject_answer\": {\n" +
                "            \"type\": \"text\",\n" +
                "            \"analyzer\": \"ik_smart\"\n" +
                "        },\n" +
                "        \"create_user\": {\n" +
                "            \"type\": \"keyword\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
        createRequest.mapping(mapping, XContentType.JSON);
        CreateIndexResponse response = indicesClient.create(createRequest, RequestOptions.DEFAULT);
        System.out.println(response.isAcknowledged());
    }


    /**
     * 判断索引是否存在
     */
    @Test
    public void existIndex() throws IOException {
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("192.168.100.110", 9200, "http")
                ));
        IndicesClient indices = client.indices();
        GetIndexRequest getRequest = new GetIndexRequest("aaa");
        boolean exists = indices.exists(getRequest, RequestOptions.DEFAULT);
        System.out.println(exists);
    }

}
