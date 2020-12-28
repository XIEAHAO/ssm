package com.zking.ssm.ly.model;

import java.util.Date;
public class LoseUser {
    private Integer loseuserId;

    private Integer loseuserUserId;

    private String loseuserUserName;

    private String loseuserStaffName;

    private Integer loseuserStaffId;

    private Date loseuserCreateTime;

    private String loseuserText;

    private Integer loseuserStatus;

    public LoseUser(Integer loseuserId, Integer loseuserUserId, String loseuserUserName, String loseuserStaffName, Integer loseuserStaffId, Date loseuserCreateTime, String loseuserText, Integer loseuserStatus) {
        this.loseuserId = loseuserId;
        this.loseuserUserId = loseuserUserId;
        this.loseuserUserName = loseuserUserName;
        this.loseuserStaffName = loseuserStaffName;
        this.loseuserStaffId = loseuserStaffId;
        this.loseuserCreateTime = loseuserCreateTime;
        this.loseuserText = loseuserText;
        this.loseuserStatus = loseuserStatus;
    }

    public LoseUser() {
        super();
    }

    public Integer getLoseuserId() {
        return loseuserId;
    }

    public void setLoseuserId(Integer loseuserId) {
        this.loseuserId = loseuserId;
    }

    public Integer getLoseuserUserId() {
        return loseuserUserId;
    }

    public void setLoseuserUserId(Integer loseuserUserId) {
        this.loseuserUserId = loseuserUserId;
    }

    public String getLoseuserUserName() {
        return loseuserUserName;
    }

    public void setLoseuserUserName(String loseuserUserName) {
        this.loseuserUserName = loseuserUserName;
    }

    public String getLoseuserStaffName() {
        return loseuserStaffName;
    }

    public void setLoseuserStaffName(String loseuserStaffName) {
        this.loseuserStaffName = loseuserStaffName;
    }

    public Integer getLoseuserStaffId() {
        return loseuserStaffId;
    }

    public void setLoseuserStaffId(Integer loseuserStaffId) {
        this.loseuserStaffId = loseuserStaffId;
    }

    public Date getLoseuserCreateTime() {
        return loseuserCreateTime;
    }

    public void setLoseuserCreateTime(Date loseuserCreateTime) {
        this.loseuserCreateTime = loseuserCreateTime;
    }

    public String getLoseuserText() {
        return loseuserText;
    }

    public void setLoseuserText(String loseuserText) {
        this.loseuserText = loseuserText;
    }

    public Integer getLoseuserStatus() {
        return loseuserStatus;
    }

    public void setLoseuserStatus(Integer loseuserStatus) {
        this.loseuserStatus = loseuserStatus;
    }

    @Override
    public String toString() {
        return "LoseUser{" +
                "loseuserId=" + loseuserId +
                ", loseuserUserId=" + loseuserUserId +
                ", loseuserUserName='" + loseuserUserName + '\'' +
                ", loseuserStaffName='" + loseuserStaffName + '\'' +
                ", loseuserStaffId=" + loseuserStaffId +
                ", loseuserCreateTime=" + loseuserCreateTime +
                ", loseuserText='" + loseuserText + '\'' +
                ", loseuserStatus=" + loseuserStatus +
                '}';
    }
}