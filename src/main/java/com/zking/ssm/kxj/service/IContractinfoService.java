package com.zking.ssm.kxj.service;

import com.zking.ssm.kxj.model.Contractinfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author kxj
 * @create  2020-12-23 14:19
 */
@Transactional
public interface IContractinfoService {
    int deleteByPrimaryKey(Integer contractId);

    int insert(Contractinfo record);

    int insertSelective(Contractinfo record);
    @Transactional(readOnly = true)
    Contractinfo selectByPrimaryKey(Integer contractId);

    int updateByPrimaryKeySelective(Contractinfo record);

    int updateByPrimaryKey(Contractinfo record);
    @Transactional(readOnly = true)
    List query(Contractinfo record);
}
