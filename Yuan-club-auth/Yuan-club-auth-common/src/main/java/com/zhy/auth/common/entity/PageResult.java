package com.zhy.auth.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 17/1/2024 下午5:00
 */
@Data
public class PageResult<T> implements Serializable {

    private Integer pageNo = 1;
    private Integer pageSize = 20;
    private Integer total = 0;
    private Integer totalPages = 0;
    private List<T> result = Collections.emptyList();

    private Integer startPage = 1;
    private Integer endPage = 1;

    public void setRecords(List<T> result){
        this.result = result;
        if (result != null && result.size() > 0){
            setTotal(result.size());
        }
    }

    public void setTotal(Integer total){
        this.total = total;
        if (this.pageSize > 0){
            this.totalPages = (total/this.pageSize) + (total % this.pageSize == 0 ? 0 : 1);
        }else {
            this.totalPages = 0;
        }
        this.startPage = (this.totalPages > 0 ?(this.pageNo - 1) * this.totalPages : 0 ) + 1;
        this.endPage = (this.startPage - 1) + this.pageSize * (this.totalPages > 0 ? 0 : 1);
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }
}
