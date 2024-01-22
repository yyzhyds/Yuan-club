package com.zhy.auth.common.entity;

import lombok.Getter;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 15/1/2024 上午10:25
 */
@Getter
public enum ResultCodeEnum {
    SUCCESS(200,"成功"),
    FAIL(500,"失败");

    public int code;
    public String desc;
    ResultCodeEnum(int code, String desc){
        this.code = code;
        this.desc = desc;
    }
    public static ResultCodeEnum getByCode(int codeVal){
        for (ResultCodeEnum resultCodeEnum : ResultCodeEnum.values()){
            if ((resultCodeEnum.code == codeVal)){
                return resultCodeEnum;
            }
        }
        return null;
    }
}