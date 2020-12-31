package com.zking.ssm.wygl.service;

import com.zking.ssm.wygl.model.Thing;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 小赵
 * @site
 * @company t250
 * @create  2020-12-28 10:53
 */
@Transactional
public interface IThing {
    int deleteByPrimaryKey(Integer thingId);

    int insert(Thing record);

    int insertSelective(Thing record);
    @Transactional(readOnly = true)
    Thing selectByPrimaryKey(Integer thingId);

    int updateByPrimaryKeySelective(Thing record);

    int updateByPrimaryKey(Thing record);
    List queryAll(Thing thing);
}
