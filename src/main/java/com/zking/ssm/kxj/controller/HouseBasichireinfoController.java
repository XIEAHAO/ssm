package com.zking.ssm.kxj.controller;

import com.zking.ssm.kxj.model.Housebasichireinfo;
import com.zking.ssm.kxj.service.IHousebasichireinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author kxj
 * @create  2020-12-25 15:21
 */
@Controller
@Component
@RequestMapping("/house")
public class HouseBasichireinfoController {
    @Autowired
    private IHousebasichireinfoService iHousebasichireinfoService;
//    @Autowired
    private Housebasichireinfo housebasichireinfo=new Housebasichireinfo();
    @RequestMapping("/query")
    @ResponseBody
    public List query(Housebasichireinfo record){
        System.out.println("11111111111");
        List list=iHousebasichireinfoService.query(record);

        return list;

    }
}
