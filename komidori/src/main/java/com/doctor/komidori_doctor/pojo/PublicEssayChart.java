package com.doctor.komidori_doctor.pojo;

import java.util.Date;

public class PublicEssayChart {
    private Integer essayId;

    private String essayTitle;

    private Integer essayAuthorId;

    private Date essayDate;

    private Integer essayCategory;

    private Integer essayGoodReview;

    private String essayContent;

    private Integer essayStatus;

    public Integer getEssayId() {
        return essayId;
    }

    public void setEssayId(Integer essayId) {
        this.essayId = essayId;
    }

    public String getEssayTitle() {
        return essayTitle;
    }

    public void setEssayTitle(String essayTitle) {
        this.essayTitle = essayTitle == null ? null : essayTitle.trim();
    }

    public Integer getEssayAuthorId() {
        return essayAuthorId;
    }

    public void setEssayAuthorId(Integer essayAuthorId) {
        this.essayAuthorId = essayAuthorId;
    }

    public Date getEssayDate() {
        return essayDate;
    }

    public void setEssayDate(Date essayDate) {
        this.essayDate = essayDate;
    }

    public Integer getEssayCategory() {
        return essayCategory;
    }

    public void setEssayCategory(Integer essayCategory) {
        this.essayCategory = essayCategory;
    }

    public Integer getEssayGoodReview() {
        return essayGoodReview;
    }

    public void setEssayGoodReview(Integer essayGoodReview) {
        this.essayGoodReview = essayGoodReview;
    }

    public String getEssayContent() {
        return essayContent;
    }

    public void setEssayContent(String essayContent) {
        this.essayContent = essayContent == null ? null : essayContent.trim();
    }

    public Integer getEssayStatus() {
        return essayStatus;
    }

    public void setEssayStatus(Integer essayStatus) {
        this.essayStatus = essayStatus;
    }
}