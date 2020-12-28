package com.zking.ssm.ly.controller;

import com.zking.ssm.ly.model.Orders;
import com.zking.ssm.ly.model.Plan;
import com.zking.ssm.ly.service.IPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author smallyu
 * @create  2020-12-23 11:33
 */
@Controller
@Component
@RequestMapping("/plan")
public class PlanController {
    @Autowired
    private IPlanService iPlanService;

    @RequestMapping("queryAllPlan")
    @ResponseBody
    public List queryAll(Plan plan){
        System.out.println("hhhhplan");
        List ls=iPlanService.queryAllPlan(plan);
        return ls;
    }
    @RequestMapping("queryPlan")
    @ResponseBody
    public Plan selectplan(int planId){
        System.out.println("hhhhplan"+planId);
        Plan p=iPlanService.selectByPrimaryKey(planId);
        return p;
    }
    @RequestMapping("updatePlan")
    @ResponseBody
    public void updateplan(Plan plan){
        System.out.println("hhhhplan"+plan);
        iPlanService.updateByPrimaryKeySelective(plan);
    }
}
