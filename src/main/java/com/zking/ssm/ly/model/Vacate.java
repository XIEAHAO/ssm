package com.zking.ssm.ly.model;

import java.util.Date;

public class Vacate {
    private Integer vacateId;

    private Integer vacateStatus;

    private Integer vacateStaffId;

    private String vacateName;

    private Date vacateDate;

    private Integer vacateFate;

    private String vacateText;

    public Vacate(Integer vacateId, Integer vacateStatus, Integer vacateStaffId, String vacateName, Date vacateDate, Integer vacateFate, String vacateText) {
        this.vacateId = vacateId;
        this.vacateStatus = vacateStatus;
        this.vacateStaffId = vacateStaffId;
        this.vacateName = vacateName;
        this.vacateDate = vacateDate;
        this.vacateFate = vacateFate;
        this.vacateText = vacateText;
    }

    public Vacate() {
        super();
    }

    public Integer getVacateId() {
        return vacateId;
    }

    public void setVacateId(Integer vacateId) {
        this.vacateId = vacateId;
    }

    public Integer getVacateStatus() {
        return vacateStatus;
    }

    public void setVacateStatus(Integer vacateStatus) {
        this.vacateStatus = vacateStatus;
    }

    public Integer getVacateStaffId() {
        return vacateStaffId;
    }

    public void setVacateStaffId(Integer vacateStaffId) {
        this.vacateStaffId = vacateStaffId;
    }

    public String getVacateName() {
        return vacateName;
    }

    public void setVacateName(String vacateName) {
        this.vacateName = vacateName;
    }

    public Date getVacateDate() {
        return vacateDate;
    }

    public void setVacateDate(Date vacateDate) {
        this.vacateDate = vacateDate;
    }

    public Integer getVacateFate() {
        return vacateFate;
    }

    public void setVacateFate(Integer vacateFate) {
        this.vacateFate = vacateFate;
    }

    public String getVacateText() {
        return vacateText;
    }

    public void setVacateText(String vacateText) {
        this.vacateText = vacateText;
    }

    @Override
    public String toString() {
        return "Vacate{" +
                "vacateId=" + vacateId +
                ", vacateStatus=" + vacateStatus +
                ", vacateStaffId=" + vacateStaffId +
                ", vacateName='" + vacateName + '\'' +
                ", vacateDate=" + vacateDate +
                ", vacateFate=" + vacateFate +
                ", vacateText='" + vacateText + '\'' +
                '}';
    }
}