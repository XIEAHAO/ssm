package com.zking.ssm.cxw.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zking.ssm.cxw.model.User;
import com.zking.ssm.cxw.service.IUserBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Luox
 * @site www.kengni.com
 * @company xxx公司
 * @create  2020-12-18 17:54
 */
@Controller
@Component
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserBiz userBiz;
    private User user = new User();



    @RequestMapping("/index.shtml")
    public String toLogin(Model model) {
        System.out.println("toLogin");
        return "index";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Map insert(String userName, String userPassword, Long userRoleId){
        Map<String,Object> mapper = new HashMap<>();
        userBiz.insert(user);
        mapper.put("message","新增用户成功");
        return mapper;
    }
    @RequestMapping("/login")
    @ResponseBody
    public Map login(String userName, String userPassword){
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        Map<String,Object> mapper = new HashMap<>();
        String message = userBiz.selectById(user);
        int i = 0;
        long roleId = 0;
        long id = 0;
        if(message==null){
            message = "登录成功";
            i  =1;
            User u = userBiz.selectByName(this.user);
            roleId = u.getUserRoleId();
            id = u.getUserId();
        }
        mapper.put("message",message);
        mapper.put("da",i);
        mapper.put("roleId",roleId);
        mapper.put("id",id);
        return mapper;
    }





}
