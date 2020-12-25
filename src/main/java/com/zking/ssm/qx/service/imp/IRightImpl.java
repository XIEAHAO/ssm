package com.zking.ssm.qx.service.imp;

import com.zking.ssm.qx.mapper.RightMapper;
import com.zking.ssm.qx.model.Right;
import com.zking.ssm.qx.service.IRight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 家父
 * @site www.1610802539@qq.com
 * @company XIE啊豪
 * @create 2020-12-22 16:52
 */
@Service
@Scope("prototype")
public class IRightImpl implements IRight {

    @Autowired
    private RightMapper rightMapper;

    @Override
    public List listPermissionsByUserName(Integer roleId) {
        return rightMapper.listPermissionsByUserName(roleId);
    }

    @Override
    public List<Right> listPermissionsBy(long roleId, String rightParentCode) {
        return rightMapper.listPermissionsBy(roleId,rightParentCode);
    }

    @Override
    public List listPermissionsByright_parent_code(String  rightParentCode) {
        return rightMapper.listPermissionsByright_parent_code(rightParentCode);
    }

    @Override
    public List listPermissionsNoByUserName(Integer roleId) {
        return rightMapper.listPermissionsNoByUserName(roleId);
    }

    @Override
    public Right listPermissionsByrightCode(String rightCode) {
        return rightMapper.listPermissionsByrightCode(rightCode);
    }

}
