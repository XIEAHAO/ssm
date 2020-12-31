package com.zking.ssm.wygl.service.imp;

import com.zking.ssm.wygl.mapper.ThingMapper;
import com.zking.ssm.wygl.model.Thing;
import com.zking.ssm.wygl.service.IThing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 小赵
 * @site
 * @company t250
 * @create  2020-12-28 10:54
 */
@Service
@Scope("prototype")
public class IThingImpl implements IThing {
    @Autowired
    private ThingMapper thingMapper;
    @Override
    public int deleteByPrimaryKey(Integer thingId) {
        return thingMapper.deleteByPrimaryKey(thingId);
    }

    @Override
    public int insert(Thing record) {
        return thingMapper.insert(record);
    }

    @Override
    public int insertSelective(Thing record) {
        return thingMapper.insertSelective(record);
    }

    @Override
    public Thing selectByPrimaryKey(Integer thingId) {
        return thingMapper.selectByPrimaryKey(thingId);
    }

    @Override
    public int updateByPrimaryKeySelective(Thing record) {
        return thingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Thing record) {
        return thingMapper.updateByPrimaryKey(record);
    }
    public List queryAll(Thing thing){
        return thingMapper.queryAll(thing);
    }
}
