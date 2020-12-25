package com.zking.ssm.kxj.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Feeinfo {
    @Override
    public String toString() {
        return "Feeinfo{" +
                "feeId=" + feeId +
                ", feeHouseName='" + feeHouseName + '\'' +
                ", feeHouseId=" + feeHouseId +
                ", feeUserId=" + feeUserId +
                ", feeUserName='" + feeUserName + '\'' +
                ", feeBuildingName='" + feeBuildingName + '\'' +
                ", feeStartDate=" + feeStartDate +
                ", feeEndDate=" + feeEndDate +
                ", feePrice=" + feePrice +
                ", feeStartCount=" + feeStartCount +
                ", feeUsedCount=" + feeUsedCount +
                ", feePriceCount=" + feePriceCount +
                ", feeStaffName='" + feeStaffName + '\'' +
                ", feeCreateTime=" + feeCreateTime +
                ", feeStaffId=" + feeStaffId +
                ", feeEndCount=" + feeEndCount +
                ", feeType='" + feeType + '\'' +
                '}';
    }

    private Integer feeId;

    private String feeHouseName;

    private Integer feeHouseId;

    private Integer feeUserId;

    private String feeUserName;

    private String feeBuildingName;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date feeStartDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date feeEndDate;

    private Integer feePrice;

    private Integer feeStartCount;

    private Integer feeUsedCount;

    private Integer feePriceCount;

    private String feeStaffName;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date feeCreateTime;

    private Integer feeStaffId;

    private Integer feeEndCount;

    private String feeType;

    public Feeinfo(Integer feeId, String feeHouseName, Integer feeHouseId, Integer feeUserId, String feeUserName, String feeBuildingName, Date feeStartDate, Date feeEndDate, Integer feePrice, Integer feeStartCount, Integer feeUsedCount, Integer feePriceCount, String feeStaffName, Date feeCreateTime, Integer feeStaffId, Integer feeEndCount, String feeType) {
        this.feeId = feeId;
        this.feeHouseName = feeHouseName;
        this.feeHouseId = feeHouseId;
        this.feeUserId = feeUserId;
        this.feeUserName = feeUserName;
        this.feeBuildingName = feeBuildingName;
        this.feeStartDate = feeStartDate;
        this.feeEndDate = feeEndDate;
        this.feePrice = feePrice;
        this.feeStartCount = feeStartCount;
        this.feeUsedCount = feeUsedCount;
        this.feePriceCount = feePriceCount;
        this.feeStaffName = feeStaffName;
        this.feeCreateTime = feeCreateTime;
        this.feeStaffId = feeStaffId;
        this.feeEndCount = feeEndCount;
        this.feeType = feeType;
    }

    public Feeinfo() {
        super();
    }

    public Integer getFeeId() {
        return feeId;
    }

    public void setFeeId(Integer feeId) {
        this.feeId = feeId;
    }

    public String getFeeHouseName() {
        return feeHouseName;
    }

    public void setFeeHouseName(String feeHouseName) {
        this.feeHouseName = feeHouseName;
    }

    public Integer getFeeHouseId() {
        return feeHouseId;
    }

    public void setFeeHouseId(Integer feeHouseId) {
        this.feeHouseId = feeHouseId;
    }

    public Integer getFeeUserId() {
        return feeUserId;
    }

    public void setFeeUserId(Integer feeUserId) {
        this.feeUserId = feeUserId;
    }

    public String getFeeUserName() {
        return feeUserName;
    }

    public void setFeeUserName(String feeUserName) {
        this.feeUserName = feeUserName;
    }

    public String getFeeBuildingName() {
        return feeBuildingName;
    }

    public void setFeeBuildingName(String feeBuildingName) {
        this.feeBuildingName = feeBuildingName;
    }

    public Date getFeeStartDate() {
        return feeStartDate;
    }

    public void setFeeStartDate(Date feeStartDate) {
        this.feeStartDate = feeStartDate;
    }

    public Date getFeeEndDate() {
        return feeEndDate;
    }

    public void setFeeEndDate(Date feeEndDate) {
        this.feeEndDate = feeEndDate;
    }

    public Integer getFeePrice() {
        return feePrice;
    }

    public void setFeePrice(Integer feePrice) {
        this.feePrice = feePrice;
    }

    public Integer getFeeStartCount() {
        return feeStartCount;
    }

    public void setFeeStartCount(Integer feeStartCount) {
        this.feeStartCount = feeStartCount;
    }

    public Integer getFeeUsedCount() {
        return feeUsedCount;
    }

    public void setFeeUsedCount(Integer feeUsedCount) {
        this.feeUsedCount = feeUsedCount;
    }

    public Integer getFeePriceCount() {
        return feePriceCount;
    }

    public void setFeePriceCount(Integer feePriceCount) {
        this.feePriceCount = feePriceCount;
    }

    public String getFeeStaffName() {
        return feeStaffName;
    }

    public void setFeeStaffName(String feeStaffName) {
        this.feeStaffName = feeStaffName;
    }

    public Date getFeeCreateTime() {
        return feeCreateTime;
    }

    public void setFeeCreateTime(Date feeCreateTime) {
        this.feeCreateTime = feeCreateTime;
    }

    public Integer getFeeStaffId() {
        return feeStaffId;
    }

    public void setFeeStaffId(Integer feeStaffId) {
        this.feeStaffId = feeStaffId;
    }

    public Integer getFeeEndCount() {
        return feeEndCount;
    }

    public void setFeeEndCount(Integer feeEndCount) {
        this.feeEndCount = feeEndCount;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }
}