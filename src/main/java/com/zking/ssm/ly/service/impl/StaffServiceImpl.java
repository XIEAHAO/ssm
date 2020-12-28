package com.zking.ssm.ly.service.impl;

import com.zking.ssm.ly.mapper.StaffMapper;
import com.zking.ssm.ly.model.Staff;
import com.zking.ssm.ly.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author smallyu
 * @create  2020-12-23 9:49
 */

@Service
@Scope("prototype")
public class StaffServiceImpl implements IStaffService {
    @Autowired
    private StaffMapper staffMapper;
    @Override
    public int deleteByPrimaryKey(Integer staffId) {
        return staffMapper.deleteByPrimaryKey(staffId);
    }

    @Override
    public int insert(Staff record) {
        return staffMapper.insert(record);
    }

    @Override
    public int insertSelective(Staff record) {
        return staffMapper.insertSelective(record);
    }

    @Override
    public Staff selectByPrimaryKey(Integer staffId) {
        return staffMapper.selectByPrimaryKey(staffId);
    }

    @Override
    public int updateByPrimaryKeySelective(Staff record) {
        return staffMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Staff record) {
        return staffMapper.updateByPrimaryKey(record);
    }

    @Override
    public List queryAallStaff(Staff record) {
        return staffMapper.queryAallStaff(record);
    }
}
