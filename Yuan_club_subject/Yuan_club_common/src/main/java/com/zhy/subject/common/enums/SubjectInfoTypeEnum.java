package com.zhy.subject.common.enums;

import lombok.Getter;

/**
 * @author Lenovo
 * @version 1.0
 * @description 分类类型枚举
 * @date 16/1/2024 上午9:23
 */

@Getter
public enum SubjectInfoTypeEnum {
    RADIO(1,"单选"),
    MULTIPLE(2,"多选"),
    JUDGE(3,"判断"),
    BRIEF(4,"简答");

    public int code;
    public String desc;
    SubjectInfoTypeEnum(int code, String desc){
        this.code = code;
        this.desc = desc;
    }
    public static SubjectInfoTypeEnum getByCode(int codeVal){
        for (SubjectInfoTypeEnum resultCodeEnum : SubjectInfoTypeEnum.values()){
            if ((resultCodeEnum.code == codeVal)){
                return resultCodeEnum;
            }
        }
        return null;
    }
}
