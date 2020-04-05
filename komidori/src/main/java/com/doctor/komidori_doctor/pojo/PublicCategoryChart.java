package com.doctor.komidori_doctor.pojo;

public class PublicCategoryChart {
    private Integer publicCategoryId;

    private String publicCategoryName;

    public Integer getPublicCategoryId() {
        return publicCategoryId;
    }

    public void setPublicCategoryId(Integer publicCategoryId) {
        this.publicCategoryId = publicCategoryId;
    }

    public String getPublicCategoryName() {
        return publicCategoryName;
    }

    public void setPublicCategoryName(String publicCategoryName) {
        this.publicCategoryName = publicCategoryName == null ? null : publicCategoryName.trim();
    }
}