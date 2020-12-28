package com.zking.ssm.ly.service;

import com.zking.ssm.ly.model.LoseUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author smallyu
 * @create  2020-12-23 9:45
 */
@Transactional
public interface ILoseUserService {
    int deleteByPrimaryKey(Integer loseuserId);

    int insert(LoseUser record);

    int insertSelective(LoseUser record);
    @Transactional(readOnly = true)
    LoseUser selectByPrimaryKey(Integer loseuserId);

    int updateByPrimaryKeySelective(LoseUser record);

    int updateByPrimaryKey(LoseUser record);
    @Transactional(readOnly = true)
    List queryAllLoseUser(LoseUser record);
}
