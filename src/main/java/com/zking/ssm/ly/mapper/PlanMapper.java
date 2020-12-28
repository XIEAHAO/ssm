package com.zking.ssm.ly.mapper;

import com.zking.ssm.ly.model.Plan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanMapper {
    int deleteByPrimaryKey(Integer planId);

    int insert(Plan record);

    int insertSelective(Plan record);

    Plan selectByPrimaryKey(Integer planId);

    int updateByPrimaryKeySelective(Plan record);

    int updateByPrimaryKey(Plan record);

    List queryAllPlan(Plan record);
}