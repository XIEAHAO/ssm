package com.zking.ssm.ly.service.impl;

import com.zking.ssm.ly.mapper.OrdersMapper;
import com.zking.ssm.ly.model.Orders;
import com.zking.ssm.ly.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author smallyu
 * @create  2020-12-22 21:09
 */
@Service
@Scope("prototype")
public class IOrdersImpl implements IOrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public int deleteByPrimaryKey(Integer orderId) {
        return ordersMapper.deleteByPrimaryKey(orderId);
    }

    @Override
    public int insert(Orders record) {
        return ordersMapper.insert(record);
    }

    @Override
    public int insertSelective(Orders record) {
        return ordersMapper.insertSelective(record);
    }

    @Override
    public Orders selectByPrimaryKey(Integer orderId) {
        return ordersMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKeySelective(Orders record) {
        return ordersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Orders record) {
        return ordersMapper.updateByPrimaryKey(record);
    }

    @Override
    public List queryAllOrders(Orders record) {
        return ordersMapper.queryAllOrders(record);
    }
}
