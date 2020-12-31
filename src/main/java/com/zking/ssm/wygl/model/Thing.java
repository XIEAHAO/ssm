package com.zking.ssm.wygl.model;

import java.util.Date;

public class Thing {
    private Integer thingId;

    private String thingName;

    private Integer thingHouseId;

    private Integer thingStatus;

    private Date thingCreateTime;

    private Integer thingStaffId;

    private String thingStaffName;

    private String houseName;

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public Thing(Integer thingId, String thingName, Integer thingHouseId, Integer thingStatus, Date thingCreateTime, Integer thingStaffId, String thingStaffName) {
        this.thingId = thingId;
        this.thingName = thingName;
        this.thingHouseId = thingHouseId;
        this.thingStatus = thingStatus;
        this.thingCreateTime = thingCreateTime;
        this.thingStaffId = thingStaffId;
        this.thingStaffName = thingStaffName;
    }

    public Thing() {
        super();
    }

    public Integer getThingId() {
        return thingId;
    }

    public void setThingId(Integer thingId) {
        this.thingId = thingId;
    }

    public String getThingName() {
        return thingName;
    }

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    public Integer getThingHouseId() {
        return thingHouseId;
    }

    public void setThingHouseId(Integer thingHouseId) {
        this.thingHouseId = thingHouseId;
    }

    public Integer getThingStatus() {
        return thingStatus;
    }

    public void setThingStatus(Integer thingStatus) {
        this.thingStatus = thingStatus;
    }

    public Date getThingCreateTime() {
        return thingCreateTime;
    }

    public void setThingCreateTime(Date thingCreateTime) {
        this.thingCreateTime = thingCreateTime;
    }

    public Integer getThingStaffId() {
        return thingStaffId;
    }

    public void setThingStaffId(Integer thingStaffId) {
        this.thingStaffId = thingStaffId;
    }

    public String getThingStaffName() {
        return thingStaffName;
    }

    public void setThingStaffName(String thingStaffName) {
        this.thingStaffName = thingStaffName;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "thingId=" + thingId +
                ", thingName='" + thingName + '\'' +
                ", thingHouseId=" + thingHouseId +
                ", thingStatus=" + thingStatus +
                ", thingCreateTime=" + thingCreateTime +
                ", thingStaffId=" + thingStaffId +
                ", thingStaffName='" + thingStaffName + '\'' +
                '}';
    }
}