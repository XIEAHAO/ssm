package com.zking.ssm.qx.service;

import com.zking.ssm.qx.model.Users;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 小丑终究是我自己
 * @site www.您配吗.com
 * @company 小丑公司
 * @create 2020-12-28 15:41
 */
public interface IUsers {
    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    @Transactional(readOnly = true)
    Users selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    @Transactional(readOnly = true)
    List SelectUsers (Users users);
}
