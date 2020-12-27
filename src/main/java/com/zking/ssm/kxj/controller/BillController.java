package com.zking.ssm.kxj.controller;

import com.zking.ssm.kxj.model.Bill;
import com.zking.ssm.kxj.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kxj
 * @create  2020-12-23 16:29
 */
@Controller
@Component
@RequestMapping("/bill")
public class BillController {
    @Autowired
    private IBillService iBillService;
    private Bill bill=new Bill();
    @RequestMapping("/query")
    @ResponseBody
    public List query(Bill record){
        System.out.println("11111111111");
        List list=iBillService.query(record);

        return list;

    }
}
