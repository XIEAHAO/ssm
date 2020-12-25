package com.zking.ssm.kxj.service;

import com.zking.ssm.kxj.model.Bill;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author kxj
 * @create  2020-12-22 21:09
 */
@Transactional
public interface IBillService {
    int deleteByPrimaryKey(Integer billId);

    int insert(Bill record);

    int insertSelective(Bill record);
    @Transactional(readOnly = true)
    Bill selectByPrimaryKey(Integer billId);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
    @Transactional(readOnly = true)
    List query(Bill record);
}
