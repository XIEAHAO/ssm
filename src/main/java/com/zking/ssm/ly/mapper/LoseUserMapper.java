package com.zking.ssm.ly.mapper;

import com.zking.ssm.ly.model.LoseUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoseUserMapper {
    int deleteByPrimaryKey(Integer loseuserId);

    int insert(LoseUser record);

    int insertSelective(LoseUser record);

    LoseUser selectByPrimaryKey(Integer loseuserId);

    int updateByPrimaryKeySelective(LoseUser record);

    int updateByPrimaryKey(LoseUser record);

    List queryAllLoseUser(LoseUser record);
}