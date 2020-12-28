package com.zking.ssm.ly.mapper;

import com.zking.ssm.ly.model.Vacate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VacateMapper {
    int deleteByPrimaryKey(Integer vacateId);

    int insert(Vacate record);

    int insertSelective(Vacate record);

    Vacate selectByPrimaryKey(Integer vacateId);

    int updateByPrimaryKeySelective(Vacate record);

    int updateByPrimaryKey(Vacate record);

    List queryAllVacate(Vacate record);
}