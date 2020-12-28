package com.zking.ssm.ly.controller;

import com.zking.ssm.ly.model.LoseUser;
import com.zking.ssm.ly.model.Orders;
import com.zking.ssm.ly.model.Plan;
import com.zking.ssm.ly.service.ILoseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author smallyu
 * @create  2020-12-23 11:31
 */
@Controller
@Component
@RequestMapping("/loseuser")
public class LoseUserController {
    @Autowired
    private ILoseUserService loseUserService;
    @RequestMapping("queryAllLoseUser")
    @ResponseBody
    public List queryAll(LoseUser loseUser){
        System.out.println("hhhh loseuser");
        System.out.println("我就进来了 哈哈哈");
        List lst=loseUserService.queryAllLoseUser(loseUser);
        System.out.println(lst);
        return lst;
    }

    @RequestMapping("updatelose")
    @ResponseBody
    public void updatelose(LoseUser loseUser){
        System.out.println("hhhhplan"+loseUser);
        loseUserService.updateByPrimaryKeySelective(loseUser);
        System.out.println("修改成功");
    }

    @RequestMapping("addlose")
    @ResponseBody
    public void addlose(LoseUser loseUser){
        System.out.println("hhhhplan"+loseUser);
        loseUserService.insertSelective(loseUser);
        System.out.println("添加成功");
    }

}
