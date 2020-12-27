package com.zking.ssm.kxj.service;

import com.zking.ssm.kxj.model.Remburse;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author kxj
 * @create  2020-12-23 15:12
 */
@Transactional
public interface RemburseService {
    int deleteByPrimaryKey(Integer remburseId);

    int insert(Remburse record);

    int insertSelective(Remburse record);
    @Transactional(readOnly = true)
    Remburse selectByPrimaryKey(Integer remburseId);

    int updateByPrimaryKeySelective(Remburse record);

    int updateByPrimaryKey(Remburse record);
    @Transactional(readOnly = true)
    List query(Remburse record);
}
