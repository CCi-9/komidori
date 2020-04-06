package com.doctor.komidori_doctor.pojo;

import java.util.Date;

public class BookDoctorChart {
    private Integer bdocOrderId;

    private Integer bdocMatId;

    private Integer bdocDocId;

    private Date bdocServiceDate;

    private Date bdocBookDate;

    private String bdocAddr;

    private Float bdocPrice;

    private String bdocRemark;

    private Integer bdocStatus;

    public Integer getBdocOrderId() {
        return bdocOrderId;
    }

    public void setBdocOrderId(Integer bdocOrderId) {
        this.bdocOrderId = bdocOrderId;
    }

    public Integer getBdocMatId() {
        return bdocMatId;
    }

    public void setBdocMatId(Integer bdocMatId) {
        this.bdocMatId = bdocMatId;
    }

    public Integer getBdocDocId() {
        return bdocDocId;
    }

    public void setBdocDocId(Integer bdocDocId) {
        this.bdocDocId = bdocDocId;
    }

    public Date getBdocServiceDate() {
        return bdocServiceDate;
    }

    public void setBdocServiceDate(Date bdocServiceDate) {
        this.bdocServiceDate = bdocServiceDate;
    }

    public Date getBdocBookDate() {
        return bdocBookDate;
    }

    public void setBdocBookDate(Date bdocBookDate) {
        this.bdocBookDate = bdocBookDate;
    }

    public String getBdocAddr() {
        return bdocAddr;
    }

    public void setBdocAddr(String bdocAddr) {
        this.bdocAddr = bdocAddr == null ? null : bdocAddr.trim();
    }

    public Float getBdocPrice() {
        return bdocPrice;
    }

    public void setBdocPrice(Float bdocPrice) {
        this.bdocPrice = bdocPrice;
    }

    public String getBdocRemark() {
        return bdocRemark;
    }

    public void setBdocRemark(String bdocRemark) {
        this.bdocRemark = bdocRemark == null ? null : bdocRemark.trim();
    }

    public Integer getBdocStatus() {
        return bdocStatus;
    }

    public void setBdocStatus(Integer bdocStatus) {
        this.bdocStatus = bdocStatus;
    }
}