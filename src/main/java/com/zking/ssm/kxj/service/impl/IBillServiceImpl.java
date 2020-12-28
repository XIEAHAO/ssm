package com.zking.ssm.kxj.service.impl;

import com.zking.ssm.kxj.mapper.BillMapper;
import com.zking.ssm.kxj.model.Bill;
import com.zking.ssm.kxj.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kxj
 * @create  2020-12-22 21:15
 */
@Service
@Scope("prototype")
public class IBillServiceImpl implements IBillService {
    @Autowired
    private BillMapper billMapper;
    @Override
    public int deleteByPrimaryKey(Integer billId) {
        billMapper.deleteByPrimaryKey(billId);
        return 0;
    }

    @Override
    public int insert(Bill record) {

        return billMapper.insert(record);
    }

    @Override
    public int insertSelective(Bill record) {
        int i= billMapper.insertSelective(record);
        return i;
    }

    @Override
    public Bill selectByPrimaryKey(Integer billId) {
        billMapper.selectByPrimaryKey(billId);
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Bill record) {
        billMapper.updateByPrimaryKeySelective(record);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Bill record) {
        billMapper.updateByPrimaryKey(record);
        return 0;
    }

    @Override
    public List query(Bill record) {

        return billMapper.query(record);
    }
}
