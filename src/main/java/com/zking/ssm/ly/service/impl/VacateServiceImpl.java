package com.zking.ssm.ly.service.impl;

import com.zking.ssm.ly.mapper.VacateMapper;
import com.zking.ssm.ly.model.Vacate;
import com.zking.ssm.ly.service.IVacateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author smallyu
 * @create  2020-12-23 9:51
 */

@Service
@Scope("prototype")
public class VacateServiceImpl implements IVacateService {
    @Autowired
    private VacateMapper vacateMapper;
    @Override
    public int deleteByPrimaryKey(Integer vacateId) {
        return vacateMapper.deleteByPrimaryKey(vacateId);
    }

    @Override
    public int insert(Vacate record) {
        return vacateMapper.insert(record);
    }

    @Override
    public int insertSelective(Vacate record) {
        return vacateMapper.insertSelective(record);
    }

    @Override
    public Vacate selectByPrimaryKey(Integer vacateId) {
        return vacateMapper.selectByPrimaryKey(vacateId);
    }

    @Override
    public int updateByPrimaryKeySelective(Vacate record) {
        return vacateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Vacate record) {
        return vacateMapper.updateByPrimaryKey(record);
    }

    @Override
    public List queryAllVacate(Vacate record) {
        return vacateMapper.queryAllVacate(record);
    }
}
