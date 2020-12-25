package com.zking.ssm.kxj.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Housebasichireinfo {
    @Override
    public String toString() {
        return "Housebasichireinfo{" +
                "infoId=" + infoId +
                ", infoHouseId=" + infoHouseId +
                ", infoUserId=" + infoUserId +
                ", infoUserName='" + infoUserName + '\'' +
                ", infoBuildingName='" + infoBuildingName + '\'' +
                ", infoStartDate=" + infoStartDate +
                ", infoEndDate=" + infoEndDate +
                ", infoCrateTime=" + infoCrateTime +
                ", infoHousePrice=" + infoHousePrice +
                ", infoStaffName='" + infoStaffName + '\'' +
                ", infoStaffId=" + infoStaffId +
                '}';
    }

    private Integer infoId;

    private Integer infoHouseId;

    private Integer infoUserId;

    private String infoUserName;

    private String infoBuildingName;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date infoStartDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date infoEndDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date infoCrateTime;

    private Integer infoHousePrice;

    private String infoStaffName;

    private Integer infoStaffId;

    public Housebasichireinfo(Integer infoId, Integer infoHouseId, Integer infoUserId, String infoUserName, String infoBuildingName, Date infoStartDate, Date infoEndDate, Date infoCrateTime, Integer infoHousePrice, String infoStaffName, Integer infoStaffId) {
        this.infoId = infoId;
        this.infoHouseId = infoHouseId;
        this.infoUserId = infoUserId;
        this.infoUserName = infoUserName;
        this.infoBuildingName = infoBuildingName;
        this.infoStartDate = infoStartDate;
        this.infoEndDate = infoEndDate;
        this.infoCrateTime = infoCrateTime;
        this.infoHousePrice = infoHousePrice;
        this.infoStaffName = infoStaffName;
        this.infoStaffId = infoStaffId;
    }

    public Housebasichireinfo() {
        super();
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public Integer getInfoHouseId() {
        return infoHouseId;
    }

    public void setInfoHouseId(Integer infoHouseId) {
        this.infoHouseId = infoHouseId;
    }

    public Integer getInfoUserId() {
        return infoUserId;
    }

    public void setInfoUserId(Integer infoUserId) {
        this.infoUserId = infoUserId;
    }

    public String getInfoUserName() {
        return infoUserName;
    }

    public void setInfoUserName(String infoUserName) {
        this.infoUserName = infoUserName;
    }

    public String getInfoBuildingName() {
        return infoBuildingName;
    }

    public void setInfoBuildingName(String infoBuildingName) {
        this.infoBuildingName = infoBuildingName;
    }

    public Date getInfoStartDate() {
        return infoStartDate;
    }

    public void setInfoStartDate(Date infoStartDate) {
        this.infoStartDate = infoStartDate;
    }

    public Date getInfoEndDate() {
        return infoEndDate;
    }

    public void setInfoEndDate(Date infoEndDate) {
        this.infoEndDate = infoEndDate;
    }

    public Date getInfoCrateTime() {
        return infoCrateTime;
    }

    public void setInfoCrateTime(Date infoCrateTime) {
        this.infoCrateTime = infoCrateTime;
    }

    public Integer getInfoHousePrice() {
        return infoHousePrice;
    }

    public void setInfoHousePrice(Integer infoHousePrice) {
        this.infoHousePrice = infoHousePrice;
    }

    public String getInfoStaffName() {
        return infoStaffName;
    }

    public void setInfoStaffName(String infoStaffName) {
        this.infoStaffName = infoStaffName;
    }

    public Integer getInfoStaffId() {
        return infoStaffId;
    }

    public void setInfoStaffId(Integer infoStaffId) {
        this.infoStaffId = infoStaffId;
    }
}