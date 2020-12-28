package com.zking.ssm.ly.service;

import com.zking.ssm.ly.model.Vacate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author smallyu
 * @create  2020-12-23 9:48
 */
@Transactional
public interface IVacateService {
    int deleteByPrimaryKey(Integer vacateId);

    int insert(Vacate record);

    int insertSelective(Vacate record);
    @Transactional(readOnly = true)
    Vacate selectByPrimaryKey(Integer vacateId);

    int updateByPrimaryKeySelective(Vacate record);

    int updateByPrimaryKey(Vacate record);
    @Transactional(readOnly = true)
    List queryAllVacate(Vacate record);

}
