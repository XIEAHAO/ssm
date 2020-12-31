package com.zking.ssm.wygl.mapper;

import com.zking.ssm.wygl.model.Thing;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ThingMapper {
    int deleteByPrimaryKey(Integer thingId);

    int insert(Thing record);

    int insertSelective(Thing record);
    @Transactional(readOnly = true)
    Thing selectByPrimaryKey(Integer thingId);

    int updateByPrimaryKeySelective(Thing record);

    int updateByPrimaryKey(Thing record);
    @Transactional(readOnly = true)
    List queryAll(Thing thing);
}