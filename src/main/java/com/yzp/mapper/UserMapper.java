package com.yzp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yzp.entity.User;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yangzp
 * @since 2022-09-26
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> queryUserList();
}
