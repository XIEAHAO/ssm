package com.zking.ssm.ly.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Plan {
    private Integer planId;

    private Integer planUserId;

    private String planUserName;

    private Integer planStaffId;

    private String planStaffName;

    private Integer planStatus;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date planEndTime;

    private Date planCrateTime;

    public Plan(Integer planId, Integer planUserId, String planUserName, Integer planStaffId, String planStaffName, Integer planStatus, Date planEndTime, Date planCrateTime) {
        this.planId = planId;
        this.planUserId = planUserId;
        this.planUserName = planUserName;
        this.planStaffId = planStaffId;
        this.planStaffName = planStaffName;
        this.planStatus = planStatus;
        this.planEndTime = planEndTime;
        this.planCrateTime = planCrateTime;
    }

    public Plan() {
        super();
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getPlanUserId() {
        return planUserId;
    }

    public void setPlanUserId(Integer planUserId) {
        this.planUserId = planUserId;
    }

    public String getPlanUserName() {
        return planUserName;
    }

    public void setPlanUserName(String planUserName) {
        this.planUserName = planUserName;
    }

    public Integer getPlanStaffId() {
        return planStaffId;
    }

    public void setPlanStaffId(Integer planStaffId) {
        this.planStaffId = planStaffId;
    }

    public String getPlanStaffName() {
        return planStaffName;
    }

    public void setPlanStaffName(String planStaffName) {
        this.planStaffName = planStaffName;
    }

    public Integer getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(Integer planStatus) {
        this.planStatus = planStatus;
    }

    public Date getPlanEndTime() {
        return planEndTime;
    }

    public void setPlanEndTime(Date planEndTime) {
        this.planEndTime = planEndTime;
    }

    public Date getPlanCrateTime() {
        return planCrateTime;
    }

    public void setPlanCrateTime(Date planCrateTime) {
        this.planCrateTime = planCrateTime;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "planId=" + planId +
                ", planUserId=" + planUserId +
                ", planUserName='" + planUserName + '\'' +
                ", planStaffId=" + planStaffId +
                ", planStaffName='" + planStaffName + '\'' +
                ", planStatus=" + planStatus +
                ", planEndTime=" + planEndTime +
                ", planCrateTime=" + planCrateTime +
                '}';
    }
}