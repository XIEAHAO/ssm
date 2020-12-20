package com.zking.ssm.qx.mapper;

import com.zking.ssm.qx.model.Right;
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
     * @param
     * @return
     */
    List listPermissionsByUserName(Integer roleId);

    /**
     * 查询指定用户拥有的子权限
     * @param
     * @return
     */
    List listPermissionsBy(@Param("roleId") long roleId,@Param("rightParentCode") String rightParentCode);
}