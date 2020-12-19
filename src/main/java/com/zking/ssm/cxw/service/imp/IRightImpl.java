package com.zking.ssm.cxw.service.imp;

import com.zking.ssm.cxw.model.Right;
import com.zking.ssm.cxw.model.Role;
import com.zking.ssm.cxw.service.IRight;

import java.util.List;

/**
 * @author Luox
 * @site www.kengni.com
 * @company xxx公司
 * @create  2020-12-19 15:50
 */
public class IRightImpl implements IRight {

    @Override
    public List<Right> listPermissionsByUserName(Role role) {
        return null;
    }

    @Override
    public List<Right> listPermissionsBy(long roleId, long rightParentCode) {
        return null;
    }
}
