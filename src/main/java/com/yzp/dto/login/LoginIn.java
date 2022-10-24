package com.yzp.dto.login;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName : LoginIn
 * @Description : 登录入参
 * @Author : yangzp
 * @Date: 2022-10-24 10:58
 */
@Data
public class LoginIn {
    @NotNull
    public String account;
    @NotNull
    public String password;
}
