package com.zking.ssm.kxj.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Remburse {
    @Override
    public String toString() {
        return "Remburse{" +
                "remburseId=" + remburseId +
                ", remburseStaffId=" + remburseStaffId +
                ", remburseStaffName='" + remburseStaffName + '\'' +
                ", remburseType='" + remburseType + '\'' +
                ", remburseTime=" + remburseTime +
                ", remburseMoney='" + remburseMoney + '\'' +
                ", rembursePlanId=" + rembursePlanId +
                ", remburseState='" + remburseState + '\'' +
                ", remburseReason='" + remburseReason + '\'' +
                ", remburseRejection='" + remburseRejection + '\'' +
                '}';
    }

    private Integer remburseId;

    private Integer remburseStaffId;

    private String remburseStaffName;

    private String remburseType;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date remburseTime;

    private String remburseMoney;

    private Integer rembursePlanId;

    private String remburseState;

    private String remburseReason;

    private String remburseRejection;

    public Remburse(Integer remburseId, Integer remburseStaffId, String remburseStaffName, String remburseType, Date remburseTime, String remburseMoney, Integer rembursePlanId, String remburseState, String remburseReason, String remburseRejection) {
        this.remburseId = remburseId;
        this.remburseStaffId = remburseStaffId;
        this.remburseStaffName = remburseStaffName;
        this.remburseType = remburseType;
        this.remburseTime = remburseTime;
        this.remburseMoney = remburseMoney;
        this.rembursePlanId = rembursePlanId;
        this.remburseState = remburseState;
        this.remburseReason = remburseReason;
        this.remburseRejection = remburseRejection;
    }

    public Remburse() {
        super();
    }

    public Integer getRemburseId() {
        return remburseId;
    }

    public void setRemburseId(Integer remburseId) {
        this.remburseId = remburseId;
    }

    public Integer getRemburseStaffId() {
        return remburseStaffId;
    }

    public void setRemburseStaffId(Integer remburseStaffId) {
        this.remburseStaffId = remburseStaffId;
    }

    public String getRemburseStaffName() {
        return remburseStaffName;
    }

    public void setRemburseStaffName(String remburseStaffName) {
        this.remburseStaffName = remburseStaffName;
    }

    public String getRemburseType() {
        return remburseType;
    }

    public void setRemburseType(String remburseType) {
        this.remburseType = remburseType;
    }

    public Date getRemburseTime() {
        return remburseTime;
    }

    public void setRemburseTime(Date remburseTime) {
        this.remburseTime = remburseTime;
    }

    public String getRemburseMoney() {
        return remburseMoney;
    }

    public void setRemburseMoney(String remburseMoney) {
        this.remburseMoney = remburseMoney;
    }

    public Integer getRembursePlanId() {
        return rembursePlanId;
    }

    public void setRembursePlanId(Integer rembursePlanId) {
        this.rembursePlanId = rembursePlanId;
    }

    public String getRemburseState() {
        return remburseState;
    }

    public void setRemburseState(String remburseState) {
        this.remburseState = remburseState;
    }

    public String getRemburseReason() {
        return remburseReason;
    }

    public void setRemburseReason(String remburseReason) {
        this.remburseReason = remburseReason;
    }

    public String getRemburseRejection() {
        return remburseRejection;
    }

    public void setRemburseRejection(String remburseRejection) {
        this.remburseRejection = remburseRejection;
    }
}