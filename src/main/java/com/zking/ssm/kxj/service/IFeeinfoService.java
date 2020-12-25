package com.zking.ssm.kxj.service;

import com.zking.ssm.kxj.model.Feeinfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author kxj
 * @create  2020-12-23 15:09
 */
@Transactional
public interface IFeeinfoService {
    int deleteByPrimaryKey(Integer feeId);

    int insert(Feeinfo record);

    int insertSelective(Feeinfo record);
    @Transactional(readOnly = true)
    Feeinfo selectByPrimaryKey(Integer feeId);

    int updateByPrimaryKeySelective(Feeinfo record);

    int updateByPrimaryKey(Feeinfo record);
    @Transactional(readOnly = true)
    List query(Feeinfo record);
}
