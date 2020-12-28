package com.zking.ssm.qx.service.imp;

import com.zking.ssm.qx.mapper.RoleMapper;
import com.zking.ssm.qx.model.Role;
import com.zking.ssm.qx.service.IRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 小丑终究是我自己
 * @site www.您配吗.com
 * @company 小丑公司
 * @create 2020-12-28 14:00
 */
@Service("irole")
@Scope("prototype")
public class IRoleImpl implements IRole {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public int deleteByPrimaryKey(Long roleId) {
        return roleMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public int insert(Role record) {
        return roleMapper.insert(record);
    }

    @Override
    public int insertSelective(Role record) {
        return roleMapper.insertSelective(record);
    }

    @Override
    public Role selectByPrimaryKey(Long roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }

    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return roleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        return roleMapper.updateByPrimaryKey(record);
    }

    @Override
    public List SelectAll(Role role) {
        System.out.println("调用了方法SelectAll");
        return roleMapper.SelectAll(role);
    }
}
