package com.yzp.service.impl;

import com.yzp.entity.Order;
import com.yzp.mapper.OrderMapper;
import com.yzp.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yangzp
 * @since 2022-10-24
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
