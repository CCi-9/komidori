package com.doctor.komidori_doctor.pojo;

import java.util.Date;

public class BookNurseChart {
    private Integer bnurseOrderId;

    private Integer bnurseNurseId;

    private Integer bnurseMatId;

    private Date bnurseStartDate;

    private Date bnurseEndDate;

    private Float bnursePrice;

    private String bnurseAddr;

    private Integer bnurseStatus;

    private String bnurseRemark;

    public Integer getBnurseOrderId() {
        return bnurseOrderId;
    }

    public void setBnurseOrderId(Integer bnurseOrderId) {
        this.bnurseOrderId = bnurseOrderId;
    }

    public Integer getBnurseNurseId() {
        return bnurseNurseId;
    }

    public void setBnurseNurseId(Integer bnurseNurseId) {
        this.bnurseNurseId = bnurseNurseId;
    }

    public Integer getBnurseMatId() {
        return bnurseMatId;
    }

    public void setBnurseMatId(Integer bnurseMatId) {
        this.bnurseMatId = bnurseMatId;
    }

    public Date getBnurseStartDate() {
        return bnurseStartDate;
    }

    public void setBnurseStartDate(Date bnurseStartDate) {
        this.bnurseStartDate = bnurseStartDate;
    }

    public Date getBnurseEndDate() {
        return bnurseEndDate;
    }

    public void setBnurseEndDate(Date bnurseEndDate) {
        this.bnurseEndDate = bnurseEndDate;
    }

    public Float getBnursePrice() {
        return bnursePrice;
    }

    public void setBnursePrice(Float bnursePrice) {
        this.bnursePrice = bnursePrice;
    }

    public String getBnurseAddr() {
        return bnurseAddr;
    }

    public void setBnurseAddr(String bnurseAddr) {
        this.bnurseAddr = bnurseAddr == null ? null : bnurseAddr.trim();
    }

    public Integer getBnurseStatus() {
        return bnurseStatus;
    }

    public void setBnurseStatus(Integer bnurseStatus) {
        this.bnurseStatus = bnurseStatus;
    }

    public String getBnurseRemark() {
        return bnurseRemark;
    }

    public void setBnurseRemark(String bnurseRemark) {
        this.bnurseRemark = bnurseRemark == null ? null : bnurseRemark.trim();
    }
}