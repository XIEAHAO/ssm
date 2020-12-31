package com.zking.ssm.wygl.mapper;

import com.zking.ssm.wygl.model.House;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface HouseMapper {
    int deleteByPrimaryKey(Integer houseId);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Integer houseId);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    List<House> queryAll(House record);


}