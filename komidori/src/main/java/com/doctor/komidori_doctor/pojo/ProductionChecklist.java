package com.doctor.komidori_doctor.pojo;

public class ProductionChecklist {
    private Integer proListId;

    private String proListName;

    private String proListDate;

    public Integer getProListId() {
        return proListId;
    }

    public void setProListId(Integer proListId) {
        this.proListId = proListId;
    }

    public String getProListName() {
        return proListName;
    }

    public void setProListName(String proListName) {
        this.proListName = proListName == null ? null : proListName.trim();
    }

    public String getProListDate() {
        return proListDate;
    }

    public void setProListDate(String proListDate) {
        this.proListDate = proListDate == null ? null : proListDate.trim();
    }
}