package com.zking.ssm.kxj.mapper;

import com.zking.ssm.kxj.model.Remburse;

import java.util.List;

public interface RemburseMapper {
    int deleteByPrimaryKey(Integer remburseId);

    int insert(Remburse record);

    int insertSelective(Remburse record);

    Remburse selectByPrimaryKey(Integer remburseId);

    int updateByPrimaryKeySelective(Remburse record);

    int updateByPrimaryKey(Remburse record);

    List query(Remburse record);
}