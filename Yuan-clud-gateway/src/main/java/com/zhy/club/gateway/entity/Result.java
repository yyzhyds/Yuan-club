package com.zhy.club.gateway.entity;

import com.zhy.club.gateway.enums.ResultCodeEnum;
import lombok.Data;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 21/1/2024 上午9:27
 */
@Data
public class Result<T> {
    private Boolean success;

    private Integer code;

    private String message;

    private T data;

    public static Result ok() {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        result.setMessage(ResultCodeEnum.SUCCESS.getDesc());
        return result;
    }

    public static <T> Result ok(T data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        result.setMessage(ResultCodeEnum.SUCCESS.getDesc());
        result.setData(data);
        return result;
    }

    public static Result fail() {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(ResultCodeEnum.FAIL.getCode());
        result.setMessage(ResultCodeEnum.FAIL.getDesc());
        return result;
    }

    public static <T> Result fail(T data) {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(ResultCodeEnum.FAIL.getCode());
        result.setMessage(ResultCodeEnum.FAIL.getDesc());
        result.setData(data);
        return result;
    }

    public static Result fail(Integer code,String message) {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

}
