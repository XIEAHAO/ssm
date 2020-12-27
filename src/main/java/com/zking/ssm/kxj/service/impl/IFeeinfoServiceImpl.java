package com.zking.ssm.kxj.service.impl;

import com.zking.ssm.kxj.mapper.FeeinfoMapper;
import com.zking.ssm.kxj.model.Feeinfo;
import com.zking.ssm.kxj.service.IFeeinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kxj
 * @create  2020-12-23 15:16
 */
@Service
@Scope("prototype")
public class IFeeinfoServiceImpl implements IFeeinfoService {
    @Autowired
    private FeeinfoMapper feeinfoMapper;
    @Override
    public int deleteByPrimaryKey(Integer feeId) {
        feeinfoMapper.deleteByPrimaryKey(feeId);
        return 0;
    }

    @Override
    public int insert(Feeinfo record) {
        feeinfoMapper.insert(record);
        return 0;
    }

    @Override
    public int insertSelective(Feeinfo record) {
        feeinfoMapper.insertSelective(record);
        return 0;
    }

    @Override
    public Feeinfo selectByPrimaryKey(Integer feeId) {
        feeinfoMapper.selectByPrimaryKey(feeId);
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Feeinfo record) {
        feeinfoMapper.updateByPrimaryKeySelective(record);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Feeinfo record) {
        feeinfoMapper.updateByPrimaryKey(record);
        return 0;
    }

    @Override
    public List query(Feeinfo record) {
        return  feeinfoMapper.query(record);
    }
}
