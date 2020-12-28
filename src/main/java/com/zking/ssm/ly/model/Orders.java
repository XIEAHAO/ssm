package com.zking.ssm.ly.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Orders {
    private Integer orderId;

    private Integer orderUserId;

    private Integer orderHouseId;

    private Date orderTime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date orderEndDate;

    private Integer orderStaffId1;

    private String orderStaffName1;

    private String orderUserName;

    private String orderHouseName;

    private Integer orderStatus;

    private String orderRemarks;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")

    private Date orderCreateTime;

    private Integer orderStaffId2;

    private Integer orderStaffId3;

    private String orderStaffName2;

    private String orderStaffName3;

    public Orders(Integer orderId, Integer orderUserId, Integer orderHouseId, Date orderTime, Date orderEndDate, Integer orderStaffId1, String orderStaffName1, String orderUserName, String orderHouseName, Integer orderStatus, String orderRemarks, Date orderCreateTime, Integer orderStaffId2, Integer orderStaffId3, String orderStaffName2, String orderStaffName3) {
        this.orderId = orderId;
        this.orderUserId = orderUserId;
        this.orderHouseId = orderHouseId;
        this.orderTime = orderTime;
        this.orderEndDate = orderEndDate;
        this.orderStaffId1 = orderStaffId1;
        this.orderStaffName1 = orderStaffName1;
        this.orderUserName = orderUserName;
        this.orderHouseName = orderHouseName;
        this.orderStatus = orderStatus;
        this.orderRemarks = orderRemarks;
        this.orderCreateTime = orderCreateTime;
        this.orderStaffId2 = orderStaffId2;
        this.orderStaffId3 = orderStaffId3;
        this.orderStaffName2 =orderStaffName2;
        this.orderStaffName3 = orderStaffName3;
    }

    public Orders() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    public Integer getOrderHouseId() {
        return orderHouseId;
    }

    public void setOrderHouseId(Integer orderHouseId) {
        this.orderHouseId = orderHouseId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getOrderEndDate() {
        return orderEndDate;
    }

    public void setOrderEndDate(Date orderEndDate) {
        this.orderEndDate = orderEndDate;
    }

    public Integer getOrderStaffId1() {
        return orderStaffId1;
    }

    public void setOrderStaffId1(Integer orderStaffId1) {
        this.orderStaffId1 = orderStaffId1;
    }

    public String getOrderStaffName1() {
        return orderStaffName1;
    }

    public void setOrderStaffName1(String orderStaffName1) {
        this.orderStaffName1 = orderStaffName1;
    }

    public String getOrderUserName() {
        return orderUserName;
    }

    public void setOrderUserName(String orderUserName) {
        this.orderUserName = orderUserName;
    }

    public String getOrderHouseName() {
        return orderHouseName;
    }

    public void setOrderHouseName(String orderHouseName) {
        this.orderHouseName = orderHouseName;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderRemarks() {
        return orderRemarks;
    }

    public void setOrderRemarks(String orderRemarks) {
        this.orderRemarks = orderRemarks;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Integer getorderStaffId2() {
        return orderStaffId2;
    }

    public void setorderStaffId2(Integer staffId2) {
        this.orderStaffId2 = staffId2;
    }

    public Integer getorderStaffId3() {
        return orderStaffId3;
    }

    public void setorderStaffId3(Integer staffId3) {
        this.orderStaffId3 = staffId3;
    }

    public String getorderStaffName2() {
        return orderStaffName2;
    }

    public void setorderStaffName2(String staffName2) {
        this.orderStaffName2 = staffName2;
    }

    public String getorderStaffName3() {
        return orderStaffName3;
    }

    public void setorderStaffName3(String staffName3) {
        this.orderStaffName3 = staffName3;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", orderUserId=" + orderUserId +
                ", orderHouseId=" + orderHouseId +
                ", orderTime=" + orderTime +
                ", orderEndDate=" + orderEndDate +
                ", orderStaffId1=" + orderStaffId1 +
                ", orderStaffName1='" + orderStaffName1 + '\'' +
                ", orderUserName='" + orderUserName + '\'' +
                ", orderHouseName='" + orderHouseName + '\'' +
                ", orderStatus=" + orderStatus +
                ", orderRemarks='" + orderRemarks + '\'' +
                ", orderCreateTime=" + orderCreateTime +
                ", staffId2=" + orderStaffId2 +
                ", staffId3=" + orderStaffId3 +
                ", staffName2='" + orderStaffName2 + '\'' +
                ", staffName3='" + orderStaffName3 + '\'' +
                '}';
    }
}