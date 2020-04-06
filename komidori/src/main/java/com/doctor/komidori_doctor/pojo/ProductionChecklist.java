package com.doctor.komidori_doctor.pojo;

public class ProductionChecklist {
    private Integer proListId;

    private String proListName;

    private String proListDate;

    private String proListAim;

    private String proListContent;

    private String proListTip;

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

    public String getProListAim() {
        return proListAim;
    }

    public void setProListAim(String proListAim) {
        this.proListAim = proListAim == null ? null : proListAim.trim();
    }

    public String getProListContent() {
        return proListContent;
    }

    public void setProListContent(String proListContent) {
        this.proListContent = proListContent == null ? null : proListContent.trim();
    }

    public String getProListTip() {
        return proListTip;
    }

    public void setProListTip(String proListTip) {
        this.proListTip = proListTip == null ? null : proListTip.trim();
    }
}