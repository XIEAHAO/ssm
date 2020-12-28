package com.zking.ssm.ly.service;

import com.zking.ssm.ly.model.Staff;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author smallyu
 * @create  2020-12-23 9:41
 */
@Transactional
public interface IStaffService {
    int deleteByPrimaryKey(Integer staffId);

    int insert(Staff record);

    int insertSelective(Staff record);
    @Transactional(readOnly = true)
    Staff selectByPrimaryKey(Integer staffId);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
    @Transactional(readOnly = true)
    List queryAallStaff(Staff record);
}
