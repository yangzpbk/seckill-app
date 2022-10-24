package com.yzp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yzp.common.packdto.outdto.R;
import com.yzp.dto.login.LoginIn;
import com.yzp.entity.User;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author yangzp
 * @since 2022-09-26
 */
public interface IUserService extends IService<User> {
    public List<User> queryUserList();

    R toLogin(@Valid LoginIn loginVo);
}
