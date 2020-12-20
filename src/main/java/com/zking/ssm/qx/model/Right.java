package com.zking.ssm.qx.model;

import java.util.List;

public class Right {
    private String rightCode;

    private String rightParentCode;

    private String rightText;

    private String rightUrl;

    private String rightTip;

    private String rightPermission;

    private List<Right> rlist;

    public Right(String rightCode, String rightParentCode, String rightText, String rightUrl, String rightTip, String rightPermission) {
        this.rightCode = rightCode;
        this.rightParentCode = rightParentCode;
        this.rightText = rightText;
        this.rightUrl = rightUrl;
        this.rightTip = rightTip;
        this.rightPermission = rightPermission;
    }

    public Right() {
        super();
    }

    public List<Right> getRlist() {
        return rlist;
    }

    public void setRlist(List<Right> rlist) {
        this.rlist = rlist;
    }

    public String getRightCode() {
        return rightCode;
    }

    public void setRightCode(String rightCode) {
        this.rightCode = rightCode;
    }

    public String getRightParentCode() {
        return rightParentCode;
    }

    public void setRightParentCode(String rightParentCode) {
        this.rightParentCode = rightParentCode;
    }

    public String getRightText() {
        return rightText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText;
    }

    public String getRightUrl() {
        return rightUrl;
    }

    public void setRightUrl(String rightUrl) {
        this.rightUrl = rightUrl;
    }

    public String getRightTip() {
        return rightTip;
    }

    public void setRightTip(String rightTip) {
        this.rightTip = rightTip;
    }

    public String getRightPermission() {
        return rightPermission;
    }

    public void setRightPermission(String rightPermission) {
        this.rightPermission = rightPermission;
    }
}