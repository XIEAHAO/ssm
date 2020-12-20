package com.zking.ssm.qx.controller;

import com.zking.ssm.qx.model.Right;
import com.zking.ssm.qx.service.IRight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Luox
 * @site www.kengni.com
 * @company xxx公司
 * @create  2020-12-19 16:01
 */
@Controller
@Component
@RequestMapping("/right")
public class RightController {

    @Autowired
    private IRight iright;
//    private Right right =new Right();
//    private Role role  = new Role();


    @RequestMapping("/right")
    @ResponseBody
    public Map right(int userRoleId){
        Map<String,Object> mapper = new HashMap<>();
        List<Right> rights = iright.listPermissionsByUserName(Integer.valueOf(userRoleId));
        for(int i=0;i<rights.size();i++){
            List<Right> rights1 = iright.listPermissionsBy(userRoleId, rights.get(i).getRightCode());
            rights.get(i).setRlist(rights1);
        }
        for(int i=0;i<rights.size();i+=1) {
            if(rights.get(i).getRlist().size()==0) {
                rights.remove(i);
                i--;
            }
        }
        mapper.put("list",rights);
        return mapper;
    }


}
