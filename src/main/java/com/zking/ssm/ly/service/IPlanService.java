package com.zking.ssm.ly.service;

import com.zking.ssm.ly.model.Plan;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author smallyu
 * @create  2020-12-23 9:47
 */
@Transactional
public interface IPlanService {
    int deleteByPrimaryKey(Integer planId);

    int insert(Plan record);

    int insertSelective(Plan record);
@Transactional(readOnly = true)
    Plan selectByPrimaryKey(Integer planId);

    int updateByPrimaryKeySelective(Plan record);

    int updateByPrimaryKey(Plan record);
    @Transactional(readOnly = true)

    List queryAllPlan(Plan record);
}
