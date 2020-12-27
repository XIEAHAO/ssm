package com.zking.ssm.kxj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import java.util.Date;



public class Bill {
    @Override
    public String toString() {
        return "Bill{" +
                "billId=" + billId +
                ", billStaffName='" + billStaffName + '\'' +
                ", billStaffId=" + billStaffId +
                ", billType='" + billType + '\'' +
                ", billReceivable='" + billReceivable + '\'' +
                ", billCapital='" + billCapital + '\'' +
                ", billStatus=" + billStatus +
                ", billTime=" + billTime +
                ", billSm='" + billSm + '\'' +
                '}';
    }

    private Integer billId;

    private String billStaffName;

    private Integer billStaffId;

    private String billType;

    private String billReceivable;

    private String billCapital;

    private Integer billStatus;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date billTime;

    private String billSm;

    public Bill(Integer billId, String billStaffName, Integer billStaffId, String billType, String billReceivable, String billCapital, Integer billStatus, Date billTime, String billSm) {
        this.billId = billId;
        this.billStaffName = billStaffName;
        this.billStaffId = billStaffId;
        this.billType = billType;
        this.billReceivable = billReceivable;
        this.billCapital = billCapital;
        this.billStatus = billStatus;
        this.billTime = billTime;
        this.billSm = billSm;
    }

    public Bill() {
        super();
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getBillStaffName() {
        return billStaffName;
    }

    public void setBillStaffName(String billStaffName) {
        this.billStaffName = billStaffName;
    }

    public Integer getBillStaffId() {
        return billStaffId;
    }

    public void setBillStaffId(Integer billStaffId) {
        this.billStaffId = billStaffId;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillReceivable() {
        return billReceivable;
    }

    public void setBillReceivable(String billReceivable) {
        this.billReceivable = billReceivable;
    }

    public String getBillCapital() {
        return billCapital;
    }

    public void setBillCapital(String billCapital) {
        this.billCapital = billCapital;
    }

    public Integer getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(Integer billStatus) {
        this.billStatus = billStatus;
    }

    public Date getBillTime() {
        return billTime;
    }

    public void setBillTime(Date billTime) {
        this.billTime = billTime;
    }

    public String getBillSm() {
        return billSm;
    }

    public void setBillSm(String billSm) {
        this.billSm = billSm;
    }
}