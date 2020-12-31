package com.zking.ssm.wygl.service.imp;

import com.zking.ssm.wygl.mapper.ImageMapper;
import com.zking.ssm.wygl.model.Image;
import com.zking.ssm.wygl.service.IImage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author 小赵
 * @site
 * @company t250
 * @create  2020-12-25 21:37
 */
@Service
@Scope("prototype")
public class IImageImpl implements IImage {
    private ImageMapper imageMapper;
    @Override
    public int deleteByPrimaryKey(Integer imageId) {
        return imageMapper.deleteByPrimaryKey(imageId);
    }

    @Override
    public int insert(Image record) {
        return imageMapper.insert(record);
    }

    @Override
    public int insertSelective(Image record) {
        return imageMapper.insertSelective(record);
    }

    @Override
    public Image selectByPrimaryKey(Integer imageId) {
        return imageMapper.selectByPrimaryKey(imageId);
    }

    @Override
    public int updateByPrimaryKeySelective(Image record) {
        return imageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Image record) {
        return imageMapper.updateByPrimaryKey(record);
    }
}
