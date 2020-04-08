package com.doctor.komidori_doctor.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class BabyInfo {
    private Integer babyId;

    private String babyName;

    private Integer babyStatus;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate babyBirth;

    private String babySex;

    private String babyAge;

    private String babyCity;

    private String babyImg;

    private Integer babyMomId;

    public Integer getBabyId() {
        return babyId;
    }

    public void setBabyId(Integer babyId) {
        this.babyId = babyId;
    }

    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName == null ? null : babyName.trim();
    }

    public Integer getBabyStatus() {
        return babyStatus;
    }

    public void setBabyStatus(Integer babyStatus) {
        this.babyStatus = babyStatus;
    }

    public LocalDate getBabyBirth() {
        return babyBirth;
    }

    public void setBabyBirth(LocalDate babyBirth) {
        this.babyBirth = babyBirth;
    }

    public String getBabySex() {
        return babySex;
    }

    public void setBabySex(String babySex) {
        this.babySex = babySex == null ? null : babySex.trim();
    }

    public String getBabyAge() {
        return babyAge;
    }

    public void setBabyAge(String babyAge) {
        this.babyAge = babyAge == null ? null : babyAge.trim();
    }

    public String getBabyCity() {
        return babyCity;
    }

    public void setBabyCity(String babyCity) {
        this.babyCity = babyCity == null ? null : babyCity.trim();
    }

    public String getBabyImg() {
        return babyImg;
    }

    public void setBabyImg(String babyImg) {
        this.babyImg = babyImg == null ? null : babyImg.trim();
    }

    public Integer getBabyMomId() {
        return babyMomId;
    }

    public void setBabyMomId(Integer babyMomId) {
        this.babyMomId = babyMomId;
    }

    @Override
    public String toString() {
        return "BabyInfo{" +
                "babyId=" + babyId +
                ", babyName='" + babyName + '\'' +
                ", babyStatus=" + babyStatus +
                ", babyBirth=" + babyBirth +
                ", babySex='" + babySex + '\'' +
                ", babyAge='" + babyAge + '\'' +
                ", babyCity='" + babyCity + '\'' +
                ", babyImg='" + babyImg + '\'' +
                ", babyMomId=" + babyMomId +
                '}';
    }
}