package com.zking.ssm.kxj.mapper;

import com.zking.ssm.kxj.model.Bill;

import java.util.List;

public interface BillMapper {
    int deleteByPrimaryKey(Integer billId);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(Integer billId);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
    List query(Bill record);
}