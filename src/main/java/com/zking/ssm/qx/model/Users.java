package com.zking.ssm.qx.model;

import java.util.Date;

public class Users {
    private Integer userId;

    private String userName;

    private String userType;

    private String userPassword;

    private String userTel;

    private String userSfz;

    private String userSex;

    private String userJob;

    private String userEmail;

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
}