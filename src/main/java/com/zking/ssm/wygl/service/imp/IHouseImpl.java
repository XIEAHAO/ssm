package com.zking.ssm.wygl.service.imp;

import com.zking.ssm.wygl.mapper.HouseMapper;
import com.zking.ssm.wygl.model.House;
import com.zking.ssm.wygl.service.IHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 小赵
 * @site
 * @company t250
 * @create  2020-12-23 20:30
 */
@Service
@Scope("prototype")
public class IHouseImpl implements IHouse {
    @Autowired
    private HouseMapper houseMapper;
    @Override
    public int deleteByPrimaryKey(Integer houseId) {
        return houseMapper.deleteByPrimaryKey(houseId);
    }

    @Override
    public int insert(House record) {
        return houseMapper.insert(record);
    }

    @Override
    public int insertSelective(House record) {
        return houseMapper.insertSelective(record);
    }

    @Override
    public House selectByPrimaryKey(Integer houseId) {
        return houseMapper.selectByPrimaryKey(houseId) ;
    }

    @Override
    public int updateByPrimaryKeySelective(House record) {
        return houseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(House record) {
        return houseMapper.updateByPrimaryKey(record) ;
    }
    @Override
    public List<House> queryAll(House record){
        return houseMapper.queryAll(record);
    }
}
