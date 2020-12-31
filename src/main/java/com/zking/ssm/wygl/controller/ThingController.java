package com.zking.ssm.wygl.controller;

import com.zking.ssm.wygl.model.House;
import com.zking.ssm.wygl.model.Thing;
import com.zking.ssm.wygl.service.IHouse;
import com.zking.ssm.wygl.service.IThing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 小赵
 * @site
 * @company t250
 * @create  2020-12-28 10:57
 */
@Controller
@RequestMapping("/thing")
public class ThingController {
    @Autowired
    private IThing iThing;
    @Autowired
    private IHouse iHouse;
    @RequestMapping("/addThing")
    @ResponseBody
    public Map addThing(Thing thing){
        System.out.println("在这");
        int insert= iThing.insertSelective(thing);
        Map<String,Object> mapper=new HashMap<>();
        String msg="添加失败";
        System.out.println("添加信息");
        boolean success=false;
        if (insert==1){
            msg="添加成功";
            success=true;
        }
        mapper.put("success",success);
        mapper.put("msg",msg);
        return mapper;
    }
    @RequestMapping("/queryThing")
    @ResponseBody
    public List queryAll(Thing thing){
        List<Thing> list=iThing.queryAll(thing);
        list.forEach(l->{
            House h= iHouse.selectByPrimaryKey(l.getThingHouseId());
            l.setHouseName(h.getHouseName());
        });
        return list;
    }
    @RequestMapping("/selectThing")
    @ResponseBody
    public Thing upThing(Thing thing){
        Thing t= iThing.selectByPrimaryKey(thing.getThingId());
        return t;
    }
    @RequestMapping("/upThing")
    @ResponseBody
    public Map upthing(Thing thing){
        System.out.println("sauh："+thing.getThingId());
        System.out.println("hhhhhhhhhhhhhh");
        int insert= iThing.updateByPrimaryKeySelective(thing);
        Map<String,Object> mapper=new HashMap<>();
        String msg="修改失败";
        boolean success=false;
        if (insert==1){
            msg="修改成功";
            success=true;
        }
        mapper.put("success",success);
        mapper.put("msg",msg);
        return mapper;
    }

}
