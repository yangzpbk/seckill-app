package com.yzp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yzp.common.exception.GlobalException;
import com.yzp.common.packdto.outdto.R;
import com.yzp.common.packdto.outdto.ResultCodeEnum;
import com.yzp.dto.login.LoginIn;
import com.yzp.entity.User;
import com.yzp.mapper.UserMapper;
import com.yzp.service.IUserService;
import com.yzp.utils.MD5Util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yangzp
 * @since 2022-09-26
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    /**
     * @param loginIn
     * @Description:登录逻辑
     * @return: [loginVo]
     * @Author: yangzp
     * @Date 2022/9/29 23:28
     */

    @Override
    public R toLogin(@Valid LoginIn loginIn) {
        String account = loginIn.getAccount();
        String password = loginIn.getPassword();
        User user = userMapper.selectById(account);
        if (user == null) {
            throw new GlobalException(ResultCodeEnum.LOGIN_NO_USER_ERROR);
        }
        if (!MD5Util.formPassToDBPass(password, user.getSalt()).equals(user.getPassword())) {
            throw new GlobalException(ResultCodeEnum.ACCOUNT_OR_PASSWORD_ERROR);
        }
        return R.ok().message("登陆成功！");
    }
}
