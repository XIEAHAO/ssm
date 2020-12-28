package com.zking.ssm.ly.controller;

import com.zking.ssm.ly.model.Plan;
import com.zking.ssm.ly.model.Staff;
import com.zking.ssm.ly.service.IStaffService;
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
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private IStaffService iStaffService;

    @RequestMapping("queryAllStaff")
    @ResponseBody
    public List queryAll(Staff staff){
        System.out.println("hhhhstaff");
        List lst=iStaffService.queryAallStaff(staff);
        return lst;
    }
}
