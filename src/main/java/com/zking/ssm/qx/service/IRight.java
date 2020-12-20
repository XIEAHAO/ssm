package com.zking.ssm.qx.service;

import com.zking.ssm.qx.model.Right;
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
     * @param
     * @return
     */
    List listPermissionsByUserName(Integer roleId);

    /**
     * 查询指定用户拥有的子权限
     * @param
     * @return
     */
    List<Right> listPermissionsBy(@Param("roleId") long roleId, @Param("rightParentCode") String rightParentCode);
}
