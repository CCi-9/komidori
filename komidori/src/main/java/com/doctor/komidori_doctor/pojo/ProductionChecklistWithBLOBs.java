package com.doctor.komidori_doctor.pojo;

public class ProductionChecklistWithBLOBs extends ProductionChecklist {
    private String proListAim;

    private String proListContent;

    private String proListTip;

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