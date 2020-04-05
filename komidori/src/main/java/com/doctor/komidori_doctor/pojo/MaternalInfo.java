package com.doctor.komidori_doctor.pojo;

import java.util.Date;

public class MaternalInfo {
    private Integer maternalId;

    private String maternalName;

    private Integer maternalAge;

    private String maternalNickname;

    private String maternalPwd;

    private String maternalTel;

    private Integer maternalStatus;

    private String maternalEmail;

    private String maternalCity;

    private Date pregnantDate;

    private String maternalIdcard;

    private Integer maternalIdcardType;

    private Integer maternalFollow;

    private Integer maternalPregWeek;

    private String maternalImg;

    public Integer getMaternalId() {
        return maternalId;
    }

    public void setMaternalId(Integer maternalId) {
        this.maternalId = maternalId;
    }

    public String getMaternalName() {
        return maternalName;
    }

    public void setMaternalName(String maternalName) {
        this.maternalName = maternalName == null ? null : maternalName.trim();
    }

    public Integer getMaternalAge() {
        return maternalAge;
    }

    public void setMaternalAge(Integer maternalAge) {
        this.maternalAge = maternalAge;
    }

    public String getMaternalNickname() {
        return maternalNickname;
    }

    public void setMaternalNickname(String maternalNickname) {
        this.maternalNickname = maternalNickname == null ? null : maternalNickname.trim();
    }

    public String getMaternalPwd() {
        return maternalPwd;
    }

    public void setMaternalPwd(String maternalPwd) {
        this.maternalPwd = maternalPwd == null ? null : maternalPwd.trim();
    }

    public String getMaternalTel() {
        return maternalTel;
    }

    public void setMaternalTel(String maternalTel) {
        this.maternalTel = maternalTel == null ? null : maternalTel.trim();
    }

    public Integer getMaternalStatus() {
        return maternalStatus;
    }

    public void setMaternalStatus(Integer maternalStatus) {
        this.maternalStatus = maternalStatus;
    }

    public String getMaternalEmail() {
        return maternalEmail;
    }

    public void setMaternalEmail(String maternalEmail) {
        this.maternalEmail = maternalEmail == null ? null : maternalEmail.trim();
    }

    public String getMaternalCity() {
        return maternalCity;
    }

    public void setMaternalCity(String maternalCity) {
        this.maternalCity = maternalCity == null ? null : maternalCity.trim();
    }

    public Date getPregnantDate() {
        return pregnantDate;
    }

    public void setPregnantDate(Date pregnantDate) {
        this.pregnantDate = pregnantDate;
    }

    public String getMaternalIdcard() {
        return maternalIdcard;
    }

    public void setMaternalIdcard(String maternalIdcard) {
        this.maternalIdcard = maternalIdcard == null ? null : maternalIdcard.trim();
    }

    public Integer getMaternalIdcardType() {
        return maternalIdcardType;
    }

    public void setMaternalIdcardType(Integer maternalIdcardType) {
        this.maternalIdcardType = maternalIdcardType;
    }

    public Integer getMaternalFollow() {
        return maternalFollow;
    }

    public void setMaternalFollow(Integer maternalFollow) {
        this.maternalFollow = maternalFollow;
    }

    public Integer getMaternalPregWeek() {
        return maternalPregWeek;
    }

    public void setMaternalPregWeek(Integer maternalPregWeek) {
        this.maternalPregWeek = maternalPregWeek;
    }

    public String getMaternalImg() {
        return maternalImg;
    }

    public void setMaternalImg(String maternalImg) {
        this.maternalImg = maternalImg == null ? null : maternalImg.trim();
    }
}