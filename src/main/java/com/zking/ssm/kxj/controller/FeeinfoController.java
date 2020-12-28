package com.zking.ssm.kxj.controller;

import com.zking.ssm.kxj.model.Feeinfo;
import com.zking.ssm.kxj.service.IFeeinfoService;
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
@RequestMapping("/feeinfo")
public class FeeinfoController {
    @Autowired
    private IFeeinfoService iFeeinfoService;
    private Feeinfo feeinfo=new Feeinfo();
    @RequestMapping("/query")
    @ResponseBody
    public List query(Feeinfo record){
//        feeinfo.setFeeType(feeType);
        System.out.println("1111111111111222222222222222");
        List list=iFeeinfoService.query(record);
        System.out.println("3333333333333333544444444444");

        return list;

    }
    @RequestMapping("/feeadd")

    @ResponseBody
    public void add(Feeinfo record){
        System.out.println(record.getFeeHouseName());
        System.out.println("1111111111111111111111111111111111");
       iFeeinfoService.insertSelective(record);

        System.out.println("2222222222222222222222222222222222222");

    }
}
