package com.zking.ssm.ly.service.impl;

import com.zking.ssm.ly.mapper.LoseUserMapper;
import com.zking.ssm.ly.model.LoseUser;
import com.zking.ssm.ly.service.ILoseUserService;
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
public class LoseUserServiceImpl implements ILoseUserService {
    @Autowired
    private LoseUserMapper loseUserMapper;
    @Override
    public int deleteByPrimaryKey(Integer loseuserId) {
        return loseUserMapper.deleteByPrimaryKey(loseuserId);
    }

    @Override
    public int insert(LoseUser record) {
        return loseUserMapper.insert(record);
    }

    @Override
    public int insertSelective(LoseUser record) {
        return loseUserMapper.insertSelective(record);
    }

    @Override
    public LoseUser selectByPrimaryKey(Integer loseuserId) {
        return loseUserMapper.selectByPrimaryKey(loseuserId);
    }

    @Override
    public int updateByPrimaryKeySelective(LoseUser record) {
        return loseUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LoseUser record) {
        return loseUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public List queryAllLoseUser(LoseUser record) {
        return loseUserMapper.queryAllLoseUser(record);
    }
}
