package com.zking.ssm.kxj.controller;

import com.zking.ssm.kxj.model.Contractinfo;
import com.zking.ssm.kxj.service.IContractinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author kxj
 * @create  2020-12-25 15:20
 */
@Controller
@Component
@RequestMapping("/ckht")
public class ContractionInfoController {
    @Autowired
    private IContractinfoService iContractinfoService;
    private Contractinfo contractinfo;
    @RequestMapping("/query")
    @ResponseBody
    public List query(Contractinfo record){
//        System.out.println("11111111111");
        List list=iContractinfoService.query(record);

        return list;

    }
}
