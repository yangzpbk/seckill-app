package com.yzp.common.packdto.outdto;

import lombok.Getter;
import lombok.ToString;

/**
 * @ClassName : ResultCodeEnum
 * @Description : 返回码定义枚举类
 * @Author : yangzp
 * @Date: 2022-10-24 10:32
 */
@Getter
@ToString
public enum ResultCodeEnum {

    SUCCESS(true, 200, "成功"),
    UNKNOWN_REASON(false, 20001, "未知错误"),

    BAD_SQL_GRAMMAR(false, 21001, "sql语法错误"),

    JSON_PARSE_ERROR(false, 21002, "json解析异常"),

    PARAM_ERROR(false, 21003, "参数不正确"),

    LOGIN_NO_USER_ERROR(false, 500001, "不存在此用户!"),

    ACCOUNT_OR_PASSWORD_ERROR(false, 500002, "密码不正确!"),

    MOBILE_ERROR(false, 500003, "手机号码格式不正确!"),

    MY_VALUE(false, 30000, "我的错误");

    private Boolean success;

    private Integer code;

    private String message;

    ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}

