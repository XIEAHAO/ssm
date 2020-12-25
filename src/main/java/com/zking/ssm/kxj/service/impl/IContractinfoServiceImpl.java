package com.zking.ssm.kxj.service.impl;

import com.zking.ssm.kxj.mapper.ContractinfoMapper;
import com.zking.ssm.kxj.model.Contractinfo;
import com.zking.ssm.kxj.service.IContractinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kxj
 * @create  2020-12-23 14:21
 */
@Service
@Scope("prototype")
public class IContractinfoServiceImpl implements IContractinfoService {
    @Autowired
    private ContractinfoMapper contractinfoMapper;
    @Override
    public int deleteByPrimaryKey(Integer contractId) {
        contractinfoMapper.deleteByPrimaryKey(contractId);
        return 0;
    }

    @Override
    public int insert(Contractinfo record) {
        contractinfoMapper.insert(record);
        return 0;
    }

    @Override
    public int insertSelective(Contractinfo record) {
        contractinfoMapper.insertSelective(record);
        return 0;
    }

    @Override
    public Contractinfo selectByPrimaryKey(Integer contractId) {
        contractinfoMapper.selectByPrimaryKey(contractId);
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Contractinfo record) {
        contractinfoMapper.updateByPrimaryKeySelective(record);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Contractinfo record) {
        contractinfoMapper.updateByPrimaryKey(record);
        return 0;
    }

    @Override
    public List query(Contractinfo record) {
        contractinfoMapper.query(record);
        return contractinfoMapper.query(record);
    }
}
