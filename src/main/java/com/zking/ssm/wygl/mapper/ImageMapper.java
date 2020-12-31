package com.zking.ssm.wygl.mapper;

import com.zking.ssm.wygl.model.Image;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ImageMapper {
    int deleteByPrimaryKey(Integer imageId);

    int insert(Image record);

    int insertSelective(Image record);
    Image selectByPrimaryKey(Integer imageId);

    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKey(Image record);

    List selectById(Integer imageId);
}