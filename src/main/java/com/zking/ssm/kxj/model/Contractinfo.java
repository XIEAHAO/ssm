package com.zking.ssm.kxj.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Contractinfo {
    @Override
    public String toString() {
        return "Contractinfo{" +
                "contractId=" + contractId +
                ", contractHouseId=" + contractHouseId +
                ", contractHouseName='" + contractHouseName + '\'' +
                ", contractUserId=" + contractUserId +
                ", contractUserName='" + contractUserName + '\'' +
                ", contractBuildingName='" + contractBuildingName + '\'' +
                ", contractState=" + contractState +
                ", contractStartDate=" + contractStartDate +
                ", contractEndDate=" + contractEndDate +
                ", contractTenancy='" + contractTenancy + '\'' +
                ", contractHousePrice=" + contractHousePrice +
                ", contractRentalBond='" + contractRentalBond + '\'' +
                ", contractCreateTime=" + contractCreateTime +
                ", contractStaffId=" + contractStaffId +
                ", contractStaffName='" + contractStaffName + '\'' +
                '}';
    }

    private Integer contractId;

    private Integer contractHouseId;

    private String contractHouseName;

    private Integer contractUserId;

    private String contractUserName;

    private String contractBuildingName;

    private Integer contractState;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date contractStartDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date contractEndDate;

    private String contractTenancy;

    private BigDecimal contractHousePrice;

    private String contractRentalBond;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date contractCreateTime;

    private Integer contractStaffId;

    private String contractStaffName;

    public Contractinfo(Integer contractId, Integer contractHouseId, String contractHouseName, Integer contractUserId, String contractUserName, String contractBuildingName, Integer contractState, Date contractStartDate, Date contractEndDate, String contractTenancy, BigDecimal contractHousePrice, String contractRentalBond, Date contractCreateTime, Integer contractStaffId, String contractStaffName) {
        this.contractId = contractId;
        this.contractHouseId = contractHouseId;
        this.contractHouseName = contractHouseName;
        this.contractUserId = contractUserId;
        this.contractUserName = contractUserName;
        this.contractBuildingName = contractBuildingName;
        this.contractState = contractState;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.contractTenancy = contractTenancy;
        this.contractHousePrice = contractHousePrice;
        this.contractRentalBond = contractRentalBond;
        this.contractCreateTime = contractCreateTime;
        this.contractStaffId = contractStaffId;
        this.contractStaffName = contractStaffName;
    }

    public Contractinfo() {
        super();
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getContractHouseId() {
        return contractHouseId;
    }

    public void setContractHouseId(Integer contractHouseId) {
        this.contractHouseId = contractHouseId;
    }

    public String getContractHouseName() {
        return contractHouseName;
    }

    public void setContractHouseName(String contractHouseName) {
        this.contractHouseName = contractHouseName;
    }

    public Integer getContractUserId() {
        return contractUserId;
    }

    public void setContractUserId(Integer contractUserId) {
        this.contractUserId = contractUserId;
    }

    public String getContractUserName() {
        return contractUserName;
    }

    public void setContractUserName(String contractUserName) {
        this.contractUserName = contractUserName;
    }

    public String getContractBuildingName() {
        return contractBuildingName;
    }

    public void setContractBuildingName(String contractBuildingName) {
        this.contractBuildingName = contractBuildingName;
    }

    public Integer getContractState() {
        return contractState;
    }

    public void setContractState(Integer contractState) {
        this.contractState = contractState;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getContractTenancy() {
        return contractTenancy;
    }

    public void setContractTenancy(String contractTenancy) {
        this.contractTenancy = contractTenancy;
    }

    public BigDecimal getContractHousePrice() {
        return contractHousePrice;
    }

    public void setContractHousePrice(BigDecimal contractHousePrice) {
        this.contractHousePrice = contractHousePrice;
    }

    public String getContractRentalBond() {
        return contractRentalBond;
    }

    public void setContractRentalBond(String contractRentalBond) {
        this.contractRentalBond = contractRentalBond;
    }

    public Date getContractCreateTime() {
        return contractCreateTime;
    }

    public void setContractCreateTime(Date contractCreateTime) {
        this.contractCreateTime = contractCreateTime;
    }

    public Integer getContractStaffId() {
        return contractStaffId;
    }

    public void setContractStaffId(Integer contractStaffId) {
        this.contractStaffId = contractStaffId;
    }

    public String getContractStaffName() {
        return contractStaffName;
    }

    public void setContractStaffName(String contractStaffName) {
        this.contractStaffName = contractStaffName;
    }
}