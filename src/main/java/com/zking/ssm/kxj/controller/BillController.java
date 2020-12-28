package com.zking.ssm.kxj.controller;

import com.zking.ssm.kxj.model.Bill;
import com.zking.ssm.kxj.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author kxj
 * @create  2020-12-23 16:29
 */
@Controller
@RequestMapping("/bill")
@ResponseBody
public class BillController {
    @Autowired
    private IBillService iBillService;
    private Bill bill=new Bill();


    @RequestMapping("/query")
    @ResponseBody
    public List query(Bill record){
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(record);
        List list=iBillService.query(record);

        return list;

    }


    @RequestMapping("/billadd")
    @ResponseBody
    public void add(Bill record){
        System.out.println("11111111111");
        record.setBillStatus(1);
        iBillService.insertSelective(record);
        System.out.println("2222222222");


    }

    @RequestMapping("/billdel")
    @ResponseBody
    public void del(Integer billId){
        System.out.println("11111111111");
//        record.setBillStatus(1);
        iBillService.deleteByPrimaryKey(billId);
        System.out.println("2222222222");


    }

}
