package com.zhy.subject.common.enetity;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 17/1/2024 下午4:57
 */

public class PageInfo {
    private Integer pageNo = 1;
    private Integer pageSize = 20;
    public Integer getPageNo(){
        if (pageNo == null || pageNo < 1){
            return 1;
        }
        return pageNo;
    }

    public Integer getPageSize(){
        if (pageSize == null || pageSize < 1 || pageSize > Integer.MAX_VALUE){
            return 20;
        }
        return pageSize;
    }
}
