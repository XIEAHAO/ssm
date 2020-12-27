package com.zking.ssm.kxj.service;

import com.zking.ssm.kxj.model.Housebasichireinfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author kxj
 * @create  2020-12-23 15:11
 */
@Transactional
public interface IHousebasichireinfoService {
    int deleteByPrimaryKey(Integer infoId);

    int insert(Housebasichireinfo record);

    int insertSelective(Housebasichireinfo record);
    @Transactional(readOnly = true)
    Housebasichireinfo selectByPrimaryKey(Integer infoId);

    int updateByPrimaryKeySelective(Housebasichireinfo record);

    int updateByPrimaryKey(Housebasichireinfo record);
    @Transactional(readOnly = true)
    List query(Housebasichireinfo record);
}
