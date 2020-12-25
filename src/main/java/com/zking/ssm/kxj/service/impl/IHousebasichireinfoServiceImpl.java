package com.zking.ssm.kxj.service.impl;

import com.zking.ssm.kxj.mapper.HousebasichireinfoMapper;
import com.zking.ssm.kxj.model.Housebasichireinfo;
import com.zking.ssm.kxj.service.IHousebasichireinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kxj
 * @create  2020-12-23 15:15
 */
@Service
@Scope("prototype")
public class IHousebasichireinfoServiceImpl implements IHousebasichireinfoService {
    @Autowired
    private HousebasichireinfoMapper housebasichireinfoMapper;
    @Override
    public int deleteByPrimaryKey(Integer infoId) {
        housebasichireinfoMapper.deleteByPrimaryKey(infoId);
        return 0;
    }

    @Override
    public int insert(Housebasichireinfo record) {
        housebasichireinfoMapper.insert(record);
        return 0;
    }

    @Override
    public int insertSelective(Housebasichireinfo record) {
        housebasichireinfoMapper.insertSelective(record);
        return 0;
    }

    @Override
    public Housebasichireinfo selectByPrimaryKey(Integer infoId) {
        housebasichireinfoMapper.selectByPrimaryKey(infoId);
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Housebasichireinfo record) {
        housebasichireinfoMapper.updateByPrimaryKeySelective(record);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Housebasichireinfo record) {
        housebasichireinfoMapper.updateByPrimaryKey(record);
        return 0;
    }

    @Override
    public List query(Housebasichireinfo record) {

        return housebasichireinfoMapper.query(record);
    }
}
