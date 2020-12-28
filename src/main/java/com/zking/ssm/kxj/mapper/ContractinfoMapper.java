package com.zking.ssm.kxj.mapper;

import com.zking.ssm.kxj.model.Contractinfo;

import java.util.List;

public interface ContractinfoMapper {
    int deleteByPrimaryKey(Integer contractId);

    int insert(Contractinfo record);

    int insertSelective(Contractinfo record);

    Contractinfo selectByPrimaryKey(Integer contractId);

    int updateByPrimaryKeySelective(Contractinfo record);

    int updateByPrimaryKey(Contractinfo record);

    List query(Contractinfo record);
}