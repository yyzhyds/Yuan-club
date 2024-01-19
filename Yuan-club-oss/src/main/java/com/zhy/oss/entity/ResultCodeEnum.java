package com.zhy.oss.entity;

import lombok.Getter;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 19/1/2024 下午5:31
 */
@Getter
public enum ResultCodeEnum {
    SUCCESS(200,"成功"),
    FAIL(500,"失败");

    public int code;

    public String desc;

    ResultCodeEnum(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public static ResultCodeEnum getByCode(int codeVal){
        for(ResultCodeEnum resultCodeEnum : ResultCodeEnum.values()){
            if(resultCodeEnum.code == codeVal){
                return resultCodeEnum;
            }
        }
        return null;
    }

}
