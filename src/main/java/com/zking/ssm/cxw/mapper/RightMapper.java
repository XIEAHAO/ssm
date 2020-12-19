package com.zking.ssm.cxw.mapper;

import com.zking.ssm.cxw.model.Right;
import com.zking.ssm.cxw.model.Role;
import com.zking.ssm.cxw.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RightMapper {
    int deleteByPrimaryKey(String rightCode);

    int insert(Right record);

    int insertSelective(Right record);

    Right selectByPrimaryKey(String rightCode);

    int updateByPrimaryKeySelective(Right record);

    int updateByPrimaryKey(Right record);

    /**
     * 查询指定用户拥有的权限
     * @param role
     * @return
     */
    List<Right> listPermissionsByUserName(Role role);

    /**
     * 查询指定用户拥有的子权限
     * @param
     * @return
     */
    List<Right> listPermissionsBy(@Param("roleId") long roleId,@Param("rightParentCode") long rightParentCode);
}