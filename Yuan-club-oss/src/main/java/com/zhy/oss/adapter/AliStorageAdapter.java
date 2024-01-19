package com.zhy.oss.adapter;

import com.zhy.oss.entity.FileInfo;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 19/1/2024 下午5:26
 */

public class AliStorageAdapter implements StorageAdapter{
    @Override
    public void createBucket(String bucket) {

    }

    @Override
    public void uploadFile(MultipartFile uploadFile, String bucket, String objectName) {

    }

    @Override
    public List<String> getAllBucket() {
        List<String> bucketNameList = new LinkedList<>();
        bucketNameList.add("aliyun");
        return bucketNameList;
    }

    @Override
    public List<FileInfo> getAllFile(String bucket) {
        return null;
    }

    @Override
    public InputStream downLoad(String bucket, String objectName) {
        return null;
    }

    @Override
    public void deleteBucket(String bucket) {

    }

    @Override
    public void deleteObject(String bucket, String objectName) {

    }

    @Override
    public String getUrl(String bucket, String objectName) {
        return null;
    }

}
