package com.zking.ssm.kxj.service.impl;

import com.zking.ssm.kxj.mapper.RemburseMapper;
import com.zking.ssm.kxj.model.Remburse;
import com.zking.ssm.kxj.service.RemburseService;
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
public class RemburseServiceImpl implements RemburseService {
    @Autowired
    private RemburseMapper remburseMapper;
    @Override
    public int deleteByPrimaryKey(Integer remburseId) {
        remburseMapper.deleteByPrimaryKey(remburseId);
        return 0;
    }

    @Override
    public int insert(Remburse record) {
        remburseMapper.insert(record);
        return 0;
    }

    @Override
    public int insertSelective(Remburse record) {
        remburseMapper.insertSelective(record);
        return 0;
    }

    @Override
    public Remburse selectByPrimaryKey(Integer remburseId) {
        remburseMapper.selectByPrimaryKey(remburseId);
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Remburse record) {
        remburseMapper.updateByPrimaryKeySelective(record);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Remburse record) {
        remburseMapper.updateByPrimaryKey(record);
        return 0;
    }

    @Override
    public List query(Remburse record) {

        return remburseMapper.query(record);
    }
}
