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

        return  housebasichireinfoMapper.deleteByPrimaryKey(infoId);
    }

    @Override
    public int insert(Housebasichireinfo record) {

        return  housebasichireinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Housebasichireinfo record) {

        return housebasichireinfoMapper.insertSelective(record);
    }

    @Override
    public Housebasichireinfo selectByPrimaryKey(Integer infoId) {

        return housebasichireinfoMapper.selectByPrimaryKey(infoId);
    }

    @Override
    public int updateByPrimaryKeySelective(Housebasichireinfo record) {

        return housebasichireinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Housebasichireinfo record) {

        return housebasichireinfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public List query(Housebasichireinfo record) {

        return housebasichireinfoMapper.query(record);
    }
}
