package com.yzp.controller;


import com.yzp.common.comstr.CommonObject;
import com.yzp.common.packdto.outdto.R;
import com.yzp.entity.User;
import com.yzp.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yangzp
 * @since 2022-09-26
 */
@Api(tags = "用户模块")
@RestController
@RequestMapping(CommonObject.PreFix + "/user")
public class UserController {

    @Autowired
    IUserService iUserService;

    @ApiOperation(value = "查询所有用户")
    @PostMapping("/queryUserList")
    public R<List<User>> queryUserList() {
        List<User> userList = iUserService.queryUserList();
        return R.ok().data(userList).message("获取用户列表成功");
    }
}
