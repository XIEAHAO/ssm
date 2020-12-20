package com.zking.ssm.qx.service;

import com.zking.ssm.qx.model.User;

import java.util.Set;

/**
 * @author Luox
 * @site www.kengni.com
 * @company xxx公司
 * @create  2020-12-18 16:19
 */
public interface IUserBiz {
    /**
     * 登录用户
     */
    String selectById(User record);
    /**
     * 根据用户名称获取用户信息
     */
    User selectByName(User record);
    /**
     * 查询指定用户拥有的权限
     * @param user
     * @return
     */
    Set<String> listPermissionsByUserName(User user);

    /**
     * 查询指定用户拥有的角色
     * @param user
     * @return
     */
    Set<String> listRolesByUserName(User user);

    /**
     * 用户注册
     * @param record
     * @return
     */
    int insert(User record);

}
