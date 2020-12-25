package com.zking.ssm.qx.controller;

import com.zking.ssm.qx.model.Right;
import com.zking.ssm.qx.service.IRight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 家父
 * @site www.1610802539@qq.com
 * @company XIE啊豪
 * @create 2020-12-22 16:52
 */
@Controller
@Component
@RequestMapping("/right")
public class RightController {

    @Autowired
    private IRight iright;

    @RequestMapping("/right")
    @ResponseBody
    public Map right(String roleId,String id){
        System.out.println("到这里来啦asadasdas"+roleId+id);
        int  userRoleId=Integer.valueOf(roleId);
        System.out.println("前端传过来的"+userRoleId);
        System.out.println("到这里来啦");
        Map<String,Object> mapper = new HashMap<>();
        List<Right> rights = iright.listPermissionsByUserName(Integer.valueOf(userRoleId));
        List<Right> righ=   iright.listPermissionsNoByUserName(Integer.valueOf(userRoleId));
        List<String> bb=new ArrayList<String>();
        for(Right i : rights){
            i.setRlist(iright.listPermissionsByright_parent_code(i.getRightCode()));
            bb.add(i.getRightCode());
        }
        for(Right v:righ){
            if(bb.contains(v.getRightParentCode())==false){
                int j=0;
                int x=0;
                for(Right i : rights){
                    if(v.getRightParentCode()!=i.getRightCode()){
                        j++;
                    }else{
                        x=j+1;
                    }
                }
                System.out.println("测试1");
                if(j==rights.size()&&!rights.contains(iright.listPermissionsByrightCode(v.getRightParentCode()))){
                    System.out.println("测试2");
                    if(!rights.get(j-1).getRightCode().equals(v.getRightParentCode())){
                        rights.add(iright.listPermissionsByrightCode(v.getRightParentCode()));
                        List<Right> a=new ArrayList<>();
                        a.add(v);
                        rights.get(j).setRlist(a);
                    }else {
                        rights.get(j-1).getRlist().add(v);
                    }
                    System.out.println("rigjt长度"+rights.size()+"j"+j);
                    System.out.println("测试2");
                }else{
                    if(rights.get(x).getRlist().contains(v)==false){
                        rights.get(x).getRlist().add(v);
                    }
                    System.out.println("测试3");
                }
            }
        }
        mapper.put("list",rights);
        System.out.println("返回啦");
        return mapper;
    }


}
