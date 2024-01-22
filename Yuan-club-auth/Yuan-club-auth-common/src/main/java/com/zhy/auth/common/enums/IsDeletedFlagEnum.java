package com.zhy.auth.common.enums;

import lombok.Getter;

/**
 * @author Lenovo
 * @version 1.0
 * @description 删除状态枚举
 * @date 16/1/2024 上午9:23
 */

@Getter
public enum IsDeletedFlagEnum {
    DELETED(1,"已删除"),
    UN_DELETED(0,"未删除");

    public int code;

    public String desc;

    IsDeletedFlagEnum(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static IsDeletedFlagEnum getByCode(int codeVal){
        for(IsDeletedFlagEnum resultCodeEnum : IsDeletedFlagEnum.values()){
            if(resultCodeEnum.code == codeVal){
                return resultCodeEnum;
            }
        }
        return null;
    }



}
