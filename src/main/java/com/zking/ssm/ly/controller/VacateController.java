package com.zking.ssm.ly.controller;

import com.zking.ssm.ly.model.Plan;
import com.zking.ssm.ly.model.Vacate;
import com.zking.ssm.ly.service.IVacateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author smallyu
 * @create  2020-12-23 11:32
 */
@Controller
@Component
@RequestMapping("/vacate")
public class VacateController {
    @Autowired
    private IVacateService vacateService;

    @RequestMapping("queryAllVacate")
    @ResponseBody
    public List queryAll(Vacate vacate){
        System.out.println("hhhhvacate");
        List lst=vacateService.queryAllVacate(vacate);
        return lst;
    }

    @RequestMapping("insertVacate")
    @ResponseBody
    public void  insertvacate(Vacate vacate){
        System.out.println(132456);
        vacateService.insertSelective(vacate);
        System.out.println("添加成功");
    }


    @RequestMapping("updateVacate")
    @ResponseBody
    public void  updatevacate(Vacate vacate){
        vacateService.updateByPrimaryKeySelective(vacate);
        System.out.println("修改成功");
    }
}
