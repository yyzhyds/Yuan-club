package com.zhy.subject.common.enums;

import lombok.Getter;

/**
 * @author Lenovo
 * @version 1.0
 * @description 分类类型枚举
 * @date 16/1/2024 上午9:23
 */

@Getter
public enum CategoryTypeEnum {
    PRIMARY(1,"岗位大类"),
    SECOND(2,"二级分类");

    public int code;
    public String desc;
    CategoryTypeEnum(int code, String desc){
        this.code = code;
        this.desc = desc;
    }
    public static CategoryTypeEnum getByCode(int codeVal){
        for (CategoryTypeEnum resultCodeEnum : CategoryTypeEnum.values()){
            if ((resultCodeEnum.code == codeVal)){
                return resultCodeEnum;
            }
        }
        return null;
    }
}
