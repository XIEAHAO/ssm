package com.zking.ssm.wygl.service;

import com.zking.ssm.wygl.model.Image;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 小赵
 * @site
 * @company t250
 * @create  2020-12-25 21:34
 */
public interface IImage {
    int deleteByPrimaryKey(Integer imageId);

    int insert(Image record);

    int insertSelective(Image record);

    @Transactional(readOnly = true)
    Image selectByPrimaryKey(Integer imageId);

    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKey(Image record);
}
