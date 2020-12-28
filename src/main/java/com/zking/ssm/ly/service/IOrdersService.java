package com.zking.ssm.ly.service;

import com.zking.ssm.ly.model.Orders;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author smallyu
 * @create  2020-12-22 21:06
 */
@Transactional
public interface IOrdersService {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Orders record);

    int insertSelective(Orders record);
    @Transactional(readOnly = true)
    Orders selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    /**
     * 查询所有并且模糊查询
     * @param record
     * @return
     */
    @Transactional(readOnly = true)
    List queryAllOrders(Orders record);
}
