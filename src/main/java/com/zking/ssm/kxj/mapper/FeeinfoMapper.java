package com.zking.ssm.kxj.mapper;

import com.zking.ssm.kxj.model.Feeinfo;

import java.util.List;

public interface FeeinfoMapper {
    int deleteByPrimaryKey(Integer feeId);

    int insert(Feeinfo record);

    int insertSelective(Feeinfo record);

    Feeinfo selectByPrimaryKey(Integer feeId);

    int updateByPrimaryKeySelective(Feeinfo record);

    int updateByPrimaryKey(Feeinfo record);

    List query(Feeinfo record);
}