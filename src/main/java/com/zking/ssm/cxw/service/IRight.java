package com.zking.ssm.cxw.service;

import com.zking.ssm.cxw.model.Right;
import com.zking.ssm.cxw.model.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Luox
 * @site www.kengni.com
 * @company xxx公司
 * @create  2020-12-18 16:20
 */
public interface IRight {
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
    List<Right> listPermissionsBy(@Param("roleId") long roleId, @Param("rightParentCode") long rightParentCode);
}
