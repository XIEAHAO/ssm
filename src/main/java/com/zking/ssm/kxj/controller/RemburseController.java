package com.zking.ssm.kxj.controller;

import com.zking.ssm.kxj.model.Remburse;
import com.zking.ssm.kxj.service.RemburseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author kxj
 * @create  2020-12-25 15:22
 */
@Controller
@Component
@RequestMapping("/remburse")
public class RemburseController {
    @Autowired
    private RemburseService remburseService;
    private Remburse remburse=new Remburse();
    @RequestMapping("/query")
    @ResponseBody
    public List query(Remburse record){
        List list = remburseService.query(record);
        return list;
    }

    @RequestMapping("/insertremburse")
    @ResponseBody
    public void insert(Remburse record){
        remburseService.insertSelective(record);
    }

    @RequestMapping("/updateremburse")
    @ResponseBody
    public void update(Remburse record){
        remburseService.updateByPrimaryKeySelective(record);
    }
}
