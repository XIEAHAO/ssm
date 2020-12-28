package com.zking.ssm.qx.model;

import java.util.Date;

public class Staff {
//  员工id
    private Integer staffId;
//  员工姓名
    private String staffName;
//  员工密码
    private String staffPassword;
//  员工邮件
    private String staffEmail;
//  员工身份证
    private String staffSfz;
//  员工电话
    private String staffTel;
//  员工性别
    private String staffSex;
//  员工入职时间
    private Date staffEntrytime;
//  员工工资
    private Integer staffPrice;
//  员工成交单数
    private String staffSuccess;
//  员工奖金
    private String staffBonus;
//  员工离职时间
    private Date staffDepartureTime;
//  员工状态
    private Integer staffStatus;

    public Staff(Integer staffId, String staffName, String staffPassword, String staffEmail, String staffSfz, String staffTel, String staffSex, Date staffEntrytime, Integer staffPrice, String staffSuccess, String staffBonus, Date staffDepartureTime, Integer staffStatus) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffPassword = staffPassword;
        this.staffEmail = staffEmail;
        this.staffSfz = staffSfz;
        this.staffTel = staffTel;
        this.staffSex = staffSex;
        this.staffEntrytime = staffEntrytime;
        this.staffPrice = staffPrice;
        this.staffSuccess = staffSuccess;
        this.staffBonus = staffBonus;
        this.staffDepartureTime = staffDepartureTime;
        this.staffStatus = staffStatus;
    }

    public Staff() {
        super();
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getStaffSfz() {
        return staffSfz;
    }

    public void setStaffSfz(String staffSfz) {
        this.staffSfz = staffSfz;
    }

    public String getStaffTel() {
        return staffTel;
    }

    public void setStaffTel(String staffTel) {
        this.staffTel = staffTel;
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex;
    }

    public Date getStaffEntrytime() {
        return staffEntrytime;
    }

    public void setStaffEntrytime(Date staffEntrytime) {
        this.staffEntrytime = staffEntrytime;
    }

    public Integer getStaffPrice() {
        return staffPrice;
    }

    public void setStaffPrice(Integer staffPrice) {
        this.staffPrice = staffPrice;
    }

    public String getStaffSuccess() {
        return staffSuccess;
    }

    public void setStaffSuccess(String staffSuccess) {
        this.staffSuccess = staffSuccess;
    }

    public String getStaffBonus() {
        return staffBonus;
    }

    public void setStaffBonus(String staffBonus) {
        this.staffBonus = staffBonus;
    }

    public Date getStaffDepartureTime() {
        return staffDepartureTime;
    }

    public void setStaffDepartureTime(Date staffDepartureTime) {
        this.staffDepartureTime = staffDepartureTime;
    }

    public Integer getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(Integer staffStatus) {
        this.staffStatus = staffStatus;
    }
}