package com.zking.ssm.qx.service.imp;

import com.zking.ssm.qx.mapper.UsersMapper;
import com.zking.ssm.qx.model.Users;
import com.zking.ssm.qx.service.IUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 小丑终究是我自己
 * @site www.您配吗.com
 * @company 小丑公司
 * @create 2020-12-28 15:44
 */
@Service("iusers")
@Scope("prototype")
public class IUsersImpl implements IUsers {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return usersMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(Users record) {
        return usersMapper.insert(record);
    }

    @Override
    public int insertSelective(Users record) {
        return usersMapper.insertSelective(record);
    }

    @Override
    public Users selectByPrimaryKey(Integer userId) {
        return usersMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(Users record) {
        return usersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return updateByPrimaryKey(record);
    }

    @Override
    public List SelectUsers(Users users) {
        return usersMapper.SelectUsers(users);
    }
}
