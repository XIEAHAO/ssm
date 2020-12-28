package com.zking.ssm.ly.service.impl;

import com.zking.ssm.ly.mapper.PlanMapper;
import com.zking.ssm.ly.model.Plan;
import com.zking.ssm.ly.service.IPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author smallyu
 * @create  2020-12-23 9:50
 */

@Service
@Scope("prototype")
public class PlanServiceImpl implements IPlanService {
    @Autowired
    private PlanMapper planMapper;
    @Override
    public int deleteByPrimaryKey(Integer planId) {
        return planMapper.deleteByPrimaryKey(planId);
    }

    @Override
    public int insert(Plan record) {
        return insert(record);
    }

    @Override
    public int insertSelective(Plan record) {
        return planMapper.insertSelective(record);
    }

    @Override
    public Plan selectByPrimaryKey(Integer planId) {
        return planMapper.selectByPrimaryKey(planId);
    }

    @Override
    public int updateByPrimaryKeySelective(Plan record) {
        return planMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Plan record) {
        return planMapper.updateByPrimaryKey(record);
    }

    @Override
    public List queryAllPlan(Plan record) {
        return planMapper.queryAllPlan(record);
    }
}
