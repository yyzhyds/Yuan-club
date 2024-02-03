package com.zhy.test;

import com.alibaba.fastjson.JSON;

import com.zhy.club.es.domain.Subject;
import com.zhy.club.es.mapper.SubjectMapper;
import org.apache.http.HttpHost;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 2/2/2024 下午12:29
 */
@SpringBootTest
public class ImportMySqlToEs {
    @Autowired
    private SubjectMapper subjectMapper;


    /**
     * 批量导入(MySQL  TO  ES)
     */
    @Test
    public void importData() throws IOException {

        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("192.168.100.110", 9200, "http")
                ));
        List<Subject> subjectList = subjectMapper.findAll();
        BulkRequest bulkRequest = new BulkRequest();
        for (Subject subject : subjectList) {
            String data = JSON.toJSONString(subject);//bean --> {}
            IndexRequest indexRequest = new IndexRequest("subject");
            indexRequest.id(subject.getDocId()+"").source(data, XContentType.JSON);
            bulkRequest.add(indexRequest);
        }
        BulkResponse response = client.bulk(bulkRequest, RequestOptions.DEFAULT);
        System.out.println(response.status());
    }
}

