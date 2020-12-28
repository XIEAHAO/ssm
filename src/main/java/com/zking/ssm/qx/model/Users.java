package com.zking.ssm.qx.model;

import java.util.Date;

public class Users {
//  用户id
    private Integer userId;
//  用户姓名
    private String userName;
//  用户类型
    private String userType;
//  用户密码
    private String userPassword;
//  用户电话
    private String userTel;
//  用户身份证
    private String userSfz;
//  用户性别
    private String userSex;
//  用户工作
    private String userJob;
//  用户邮件
    private String userEmail;
//  用户创建时间
    private Date userCreateTime;

    public Users(Integer userId, String userName, String userType, String userPassword, String userTel, String userSfz, String userSex, String userJob, String userEmail, Date userCreateTime) {
        this.userId = userId;
        this.userName = userName;
        this.userType = userType;
        this.userPassword = userPassword;
        this.userTel = userTel;
        this.userSfz = userSfz;
        this.userSex = userSex;
        this.userJob = userJob;
        this.userEmail = userEmail;
        this.userCreateTime = userCreateTime;
    }

    public Users() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserSfz() {
        return userSfz;
    }

    public void setUserSfz(String userSfz) {
        this.userSfz = userSfz;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserJob() {
        return userJob;
    }

    public void setUserJob(String userJob) {
        this.userJob = userJob;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userType='" + userType + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userSfz='" + userSfz + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userJob='" + userJob + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userCreateTime=" + userCreateTime +
                '}';
    }
}