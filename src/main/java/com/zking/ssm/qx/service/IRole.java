package com.zking.ssm.qx.service;

import com.zking.ssm.qx.model.Role;

import java.util.List;

/**
 * @author Luox
 * @site www.kengni.com
 * @company xxx公司
 * @create  2020-12-18 16:20
 */
public interface IRole {
    /**
     * 删除方法
     * @param roleId
     * @return
     */
    int deleteByPrimaryKey(Long roleId);

    /**
     * 添加方法
     * @param record
     * @return
     */
    int insert(Role record);

    /**
     * 添加方法 自动监测是否为空
     * @param record
     * @return
     */
    int insertSelective(Role record);

    /**
     * 查询单个方法
     * @param roleId
     * @return
     */
    Role selectByPrimaryKey(Long roleId);

    /**
     * 修改方法 自动监测是否为空
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * 修改方法
     * @param record
     * @return
     */
    int updateByPrimaryKey(Role record);

    /**
     * 模糊查询方法
     * @param role
     * @return
     */
    List SelectAll (Role role);
}
