package com.zking.ssm.kxj.mapper;

import com.zking.ssm.kxj.model.Housebasichireinfo;

import java.util.List;

public interface HousebasichireinfoMapper {
    int deleteByPrimaryKey(Integer infoId);

    int insert(Housebasichireinfo record);

    int insertSelective(Housebasichireinfo record);

    Housebasichireinfo selectByPrimaryKey(Integer infoId);

    int updateByPrimaryKeySelective(Housebasichireinfo record);

    int updateByPrimaryKey(Housebasichireinfo record);

    List query(Housebasichireinfo record);
}