package com.zking.ssm.qx.controller;

import com.zking.ssm.qx.model.User;
import com.zking.ssm.qx.service.IUserBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 家父
 * @site www.1610802539@qq.com
 * @company XIE啊豪
 * @create 2020-12-22 16:52
 */
@Controller
@Component
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserBiz userBiz;
    private User user = new User();

    @RequestMapping("/insert")
    @ResponseBody
    public Map insert(String userName, String userPassword, int userRoleId){
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        user.setUserRoleId(Long.valueOf(userRoleId));
        Map<String,Object> mapper = new HashMap<>();
        userBiz.insert(user);

        mapper.put("message","新增用户成功");
        return mapper;
    }
    @RequestMapping("/login")
    @ResponseBody
    public Map login(String userName, String userPassword){
        user.setUserName(userName);
        Map<String,Object> mapper = new HashMap<>();
        String message = "";
        int i = 0;
        long roleId = 0;
        long id = 0;
        if(userBiz.selectByName(this.user)==null){
            message="账号名不存在喔小兄弟";
            System.out.println("账号名不存在喔小兄弟");
            i=0;
        }else{
        User f = userBiz.selectByName(this.user);
            System.out.println(f);
        if(f.getUserFlag()==0){
            message="账户已被查封，自己看看自己干的事";
            System.out.println("账户已被查封，自己看看自己干的事");
            i=0;
        }else {
        if(f.getUserPassword().equals(userPassword)){
            System.out.println("登录成功");
            message="登录成功";
            i=1;
            id=f.getUserId();
            roleId=f.getUserRoleId();
        }else {
            System.out.println("登录失败,账号密码失败");
            message="登录失败,账号密码错误";
            i=0;
        }
        }
        }
        mapper.put("message",message);
        mapper.put("code",i);
        mapper.put("roleId",roleId);
        mapper.put("id",id);
        return mapper;
    }





}
