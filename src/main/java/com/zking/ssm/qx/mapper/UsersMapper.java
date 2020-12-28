package com.zking.ssm.qx.mapper;

import com.zking.ssm.qx.model.Users;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UsersMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    List SelectUsers (Users users);
}