package com.yzp.controller;

import com.yzp.common.comstr.CommonObject;
import com.yzp.common.packdto.indto.I;
import com.yzp.common.packdto.outdto.R;
import com.yzp.dto.login.LoginIn;
import com.yzp.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @ClassName : LoginController
 * @Description : login controlller
 * @Author : yangzp
 * @Date: 2022-09-26 00:29
 */
@Api(tags = "登录模块")
@RequestMapping(CommonObject.PreFix + "/login")
@RestController
public class LoginController {

    @Autowired
    IUserService iUserService;

    @ApiOperation(value = "登陆操作")
    @PostMapping("/toLogin")
    public R toLogin(@RequestBody @Valid I<LoginIn> inDto) {
        return iUserService.toLogin(inDto.getData());
    }
}
