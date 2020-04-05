package com.doctor.komidori_doctor.pojo;

public class NurseInfo {
    private Integer nurseId;

    private String nurseName;

    private Integer nurseAge;

    private String nurseTel;

    private String nurseIdcard;

    private String nurseCity;

    private String nurseRace;

    private String nurseLanguage;

    private Integer nurseFollow;

    private Integer nurseOrders;

    private Integer nurseGoodReview;

    private Integer nurseWorkAge;

    private String nurseEmail;

    private String nurseImg;

    public Integer getNurseId() {
        return nurseId;
    }

    public void setNurseId(Integer nurseId) {
        this.nurseId = nurseId;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName == null ? null : nurseName.trim();
    }

    public Integer getNurseAge() {
        return nurseAge;
    }

    public void setNurseAge(Integer nurseAge) {
        this.nurseAge = nurseAge;
    }

    public String getNurseTel() {
        return nurseTel;
    }

    public void setNurseTel(String nurseTel) {
        this.nurseTel = nurseTel == null ? null : nurseTel.trim();
    }

    public String getNurseIdcard() {
        return nurseIdcard;
    }

    public void setNurseIdcard(String nurseIdcard) {
        this.nurseIdcard = nurseIdcard == null ? null : nurseIdcard.trim();
    }

    public String getNurseCity() {
        return nurseCity;
    }

    public void setNurseCity(String nurseCity) {
        this.nurseCity = nurseCity == null ? null : nurseCity.trim();
    }

    public String getNurseRace() {
        return nurseRace;
    }

    public void setNurseRace(String nurseRace) {
        this.nurseRace = nurseRace == null ? null : nurseRace.trim();
    }

    public String getNurseLanguage() {
        return nurseLanguage;
    }

    public void setNurseLanguage(String nurseLanguage) {
        this.nurseLanguage = nurseLanguage == null ? null : nurseLanguage.trim();
    }

    public Integer getNurseFollow() {
        return nurseFollow;
    }

    public void setNurseFollow(Integer nurseFollow) {
        this.nurseFollow = nurseFollow;
    }

    public Integer getNurseOrders() {
        return nurseOrders;
    }

    public void setNurseOrders(Integer nurseOrders) {
        this.nurseOrders = nurseOrders;
    }

    public Integer getNurseGoodReview() {
        return nurseGoodReview;
    }

    public void setNurseGoodReview(Integer nurseGoodReview) {
        this.nurseGoodReview = nurseGoodReview;
    }

    public Integer getNurseWorkAge() {
        return nurseWorkAge;
    }

    public void setNurseWorkAge(Integer nurseWorkAge) {
        this.nurseWorkAge = nurseWorkAge;
    }

    public String getNurseEmail() {
        return nurseEmail;
    }

    public void setNurseEmail(String nurseEmail) {
        this.nurseEmail = nurseEmail == null ? null : nurseEmail.trim();
    }

    public String getNurseImg() {
        return nurseImg;
    }

    public void setNurseImg(String nurseImg) {
        this.nurseImg = nurseImg == null ? null : nurseImg.trim();
    }
}