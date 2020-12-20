package com.zking.ssm.qx.model;

public class User {
    private Long userId;

    private String userName;

    private String userPassword;

    private Long userRoleId;

    private Integer userFlag;

    private String userSalt;

    private Long userLocked;

    public User(Long userId, String userName, String userPassword, Long userRoleId, Integer userFlag, String userSalt, Long userLocked) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRoleId = userRoleId;
        this.userFlag = userFlag;
        this.userSalt = userSalt;
        this.userLocked = userLocked;
    }

    public User() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Integer getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(Integer userFlag) {
        this.userFlag = userFlag;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    public Long getUserLocked() {
        return userLocked;
    }

    public void setUserLocked(Long userLocked) {
        this.userLocked = userLocked;
    }


    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userRoleId=" + userRoleId +
                ", userFlag=" + userFlag +
                ", userSalt='" + userSalt + '\'' +
                ", userLocked=" + userLocked +
                '}';
    }
}