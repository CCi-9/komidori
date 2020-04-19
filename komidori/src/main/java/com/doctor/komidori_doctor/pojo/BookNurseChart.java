package com.doctor.komidori_doctor.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class BookNurseChart {
    private Integer bnurseOrderId;

    private Integer bnurseNurseId;

    private Integer bnurseMatId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate bnurseStartDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate bnurseEndDate;

    private Float bnursePrice;

    private String bnurseAddr;

    private Integer bnurseStatus;

    private String bnurseRemark;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime bnurseDate;

    private NurseInfo nurseInfo;

    private  MaternalInfo maternalInfo;

    public void setMaternalInfo(MaternalInfo maternalInfo) {
        this.maternalInfo = maternalInfo;
    }

    public MaternalInfo getMaternalInfo() {
        return maternalInfo;
    }

    public NurseInfo getNurseInfo() {
        return nurseInfo;
    }

    public void setNurseInfo(NurseInfo nurseInfo) {
        this.nurseInfo = nurseInfo;
    }

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

    public LocalDate getBnurseStartDate() {
        return bnurseStartDate;
    }

    public void setBnurseStartDate(LocalDate bnurseStartDate) {
        this.bnurseStartDate = bnurseStartDate;
    }

    public LocalDate getBnurseEndDate() {
        return bnurseEndDate;
    }

    public void setBnurseEndDate(LocalDate bnurseEndDate) {
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

    public LocalDateTime getBnurseDate() {
        return bnurseDate;
    }

    public void setBnurseDate(LocalDateTime bnurseDate) {
        this.bnurseDate = bnurseDate;
    }

    @Override
    public String toString() {
        return "BookNurseChart{" +
                "bnurseOrderId=" + bnurseOrderId +
                ", bnurseNurseId=" + bnurseNurseId +
                ", bnurseMatId=" + bnurseMatId +
                ", bnurseStartDate=" + bnurseStartDate +
                ", bnurseEndDate=" + bnurseEndDate +
                ", bnursePrice=" + bnursePrice +
                ", bnurseAddr='" + bnurseAddr + '\'' +
                ", bnurseStatus=" + bnurseStatus +
                ", bnurseRemark='" + bnurseRemark + '\'' +
                ", bnurseDate=" + bnurseDate +
                '}';
    }
}