package com.zking.ssm.cxw.mapper;

import com.zking.ssm.cxw.model.Role;
import com.zking.ssm.cxw.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    int deleteByPrimaryKey(Long userId);

    /**
     * 用户注册
     * @param record
     * @return
     */
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 登录用户
     */
    User selectById(User record);
    /**
     * 根据用户名称获取用户信息
     */
    User selectByName(User record);

    /**
     * 查询指定用户拥有的权限
     * @param user
     * @return
     */
    List<String> listPermissionsByUserName(User user);

    /**
     * 查询指定用户拥有的角色
     * @param user
     * @return
     */
    List<String> listRolesByUserName(User user);


}