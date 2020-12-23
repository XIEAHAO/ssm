package com.zking.ssm.qx.service.imp;

import com.zking.ssm.base.shiro.PasswordHelper;
import com.zking.ssm.qx.mapper.UserMapper;
import com.zking.ssm.qx.model.User;
import com.zking.ssm.qx.service.IUserBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Luox
 * @site www.kengni.com
 * @company xxx公司
 * @create  2020-12-18 17:04
 */
@Service("userBiz")
@Scope("prototype")
public class IUserBizImpl implements IUserBiz {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String selectById(User record) {
        String message = null;
        System.out.println("到这里了");
        User u = userMapper.selectByName(record);
        System.out.println("asdasds");
        if (null == u || !PasswordHelper.checkCredentials(record.getUserPassword(), u.getUserSalt(), u.getUserPassword())) {
            message = "帐号或密码错误";
        } else if (new Integer(1).equals(u.getUserLocked())) {
            message = "帐号已锁定，请与管理员联系";
        } else {
            if (u.getUserFlag() == 0) {
                message = "该用户已被禁用，请与管理员联系";
            } else if (u.getUserFlag() == 1) {
                List<String> list = userMapper.listRolesByUserName(u);
                if (list.size() == 0) {
                    message = "该用户所属角色已被禁用，请与管理员联系";
                }
            }
        }
        return message;
    }

    @Override
    public User selectByName(User record) {
        return userMapper.selectByName(record);
    }

    @Override
    public Set<String> listPermissionsByUserName(User user) {
        return new HashSet<String>(userMapper.listPermissionsByUserName(user));
    }

    @Override
    public Set<String> listRolesByUserName(User user) {
        return new HashSet<String>(userMapper.listRolesByUserName(user));
    }

    @Override
    public int insert(User record) {
        //md5+盐
        String salt = PasswordHelper.createSalt();
        String credentials = PasswordHelper.createCredentials(record.getUserPassword(), salt);

        record.setUserId(null);
        record.setUserSalt(salt);
        record.setUserPassword(credentials);
        record.setUserFlag(1);
        record.setUserLocked(0L);
        userMapper.insert(record);
        return userMapper.insertByRrid(record.getUserRoleId(),record.getUserId());
    }

}
