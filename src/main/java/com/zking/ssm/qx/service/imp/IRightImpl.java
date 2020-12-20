package com.zking.ssm.qx.service.imp;

import com.zking.ssm.qx.mapper.RightMapper;
import com.zking.ssm.qx.model.Right;
import com.zking.ssm.qx.service.IRight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Luox
 * @site www.kengni.com
 * @company xxx公司
 * @create  2020-12-19 15:50
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
}
