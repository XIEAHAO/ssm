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
    public Map UpPassword(String userName,String Password,String Password1,String Password2){
        user.setUserName(userName);
        String message="";
        User u=userBiz.selectByName(user);
        if(!u.getUserPassword().equals(Password)){
            message="密码错误哦，小伙子";
        }else if(!Password1.equals(Password2)){
            message="两次密码不一样啊";
        }else {
            u.setUserPassword(Password1);
            message="账户密码修改成功";
        }
        Map<String,Object> mapper = new HashMap<>();
        mapper.put("message",message);
        return  mapper;
    }
    public Map Select(User u){
        Map<String,Object> mapper = new HashMap<>();
        mapper.put("list",userBiz.SelectUser(user));
        return  mapper;
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
        String aac="";
        int userFlag=0;
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
            message="登录成功,欢迎您"+f.getUserName();
            i=1;
            id=f.getUserId();
            roleId=f.getUserRoleId();
            aac=f.getUserName();
            userFlag=f.getUserFlag();
            System.out.println("roleId"+roleId);
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
        mapper.put("admin",aac);
        mapper.put("userFlag",userFlag);
        return mapper;
    }





}
