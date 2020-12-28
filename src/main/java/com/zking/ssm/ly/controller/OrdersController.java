package com.zking.ssm.ly.controller;

import com.zking.ssm.ly.model.Orders;
import com.zking.ssm.ly.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author smallyu
 * @create  2020-12-22 21:17
 */
@Controller
@Component
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private IOrdersService iOrders;

//    public void queryAll(Model model,Orders orders){
//        List list =iOrders.queryAllOrders(orders);
//    }

   @RequestMapping("queryAll")
   @ResponseBody
   public List queryAll(Orders orders){
        System.out.println("hhhh" +orders);
        List list=iOrders.queryAllOrders(orders);
        return list;
    }

    @RequestMapping("addorders")
    @ResponseBody
    public void addorder(Orders orders){
        System.out.println("hhhh" +orders);
        iOrders.insertSelective(orders);
        System.out.println("添加成功");
    }

    @RequestMapping("updateorders")
    @ResponseBody
    public void updateorder(Orders orders){
        System.out.println("hhhh" +orders);
        iOrders.updateByPrimaryKeySelective(orders);
        System.out.println("修改成功");
    }

}
