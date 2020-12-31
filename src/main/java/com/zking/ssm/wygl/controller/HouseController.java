package com.zking.ssm.wygl.controller;


import com.zking.ssm.wygl.model.House;
import com.zking.ssm.wygl.service.IHouse;
import com.zking.ssm.wygl.service.IImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 小赵
 * @site
 * @company t250
 * @create  2020-12-25 15:22
 */
@Controller
@RequestMapping("/house")
@ResponseBody
public class HouseController {
    @Autowired
    private IHouse iHouse;
    @Autowired
    private IImage iImage;

    @RequestMapping("/addHouse")
    @ResponseBody
    public Map addHouse(House house){
        Map<String,Object> mapper=new HashMap<>();
        int insert= iHouse.insertSelective(house);
        String msg="添加失败";
        System.out.println("添加信息");
        boolean success=false;
        if (insert==1){
            msg="添加成功";
            success=true;
        }
        mapper.put("success",success);
        mapper.put("msg",msg);
        System.out.println("搞完啦");
        return mapper;

    }
    @RequestMapping("/selectById")
    @ResponseBody
    public House selectById(House house){
        House h= iHouse.selectByPrimaryKey(house.getHouseId());
        return h;
    }
    @RequestMapping("/queryHouse")
    @ResponseBody
    public List queryAll(House house){
        List<House> list=iHouse.queryAll(house);
        return list;
    }


    @RequestMapping("/houseAll")
    @ResponseBody
    public List houseAll(House house){
        System.out.println("enenenenene");
        List<House> list=iHouse.queryAll(house);
//        for(House h:list){
//            System.out.println("对象"+h);
//        }
        System.out.println("长度："+list.size());
////        list.forEach(l->{
////            System.out.println("jkdsjf"+l.getHouseId());
////           Image image= iImage.selectByPrimaryKey(l.getHouseId());
////           l.setImageFile(image.getImageFile());
////        });
        return  list;
    }
}
