package com.zking.ssm.wygl.service;

import com.zking.ssm.wygl.model.House;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 小赵
 * @site
 * @company t250
 * @create  2020-12-23 20:29
 */
@Transactional
public interface IHouse {
    int deleteByPrimaryKey(Integer houseId);
    int insert(House record);
    int insertSelective(House record);
    @Transactional(readOnly = true)
    House selectByPrimaryKey(Integer houseId);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
    @Transactional(readOnly = true)
    List<House> queryAll(House record);
}
