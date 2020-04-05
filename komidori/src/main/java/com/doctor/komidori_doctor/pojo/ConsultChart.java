package com.doctor.komidori_doctor.pojo;

import java.util.Date;

public class ConsultChart {
    private Integer consultId;

    private Integer docId;

    private Integer matId;

    private Date consultDate;

    private Float consultPrice;

    private String consultContent;

    public Integer getConsultId() {
        return consultId;
    }

    public void setConsultId(Integer consultId) {
        this.consultId = consultId;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public Integer getMatId() {
        return matId;
    }

    public void setMatId(Integer matId) {
        this.matId = matId;
    }

    public Date getConsultDate() {
        return consultDate;
    }

    public void setConsultDate(Date consultDate) {
        this.consultDate = consultDate;
    }

    public Float getConsultPrice() {
        return consultPrice;
    }

    public void setConsultPrice(Float consultPrice) {
        this.consultPrice = consultPrice;
    }

    public String getConsultContent() {
        return consultContent;
    }

    public void setConsultContent(String consultContent) {
        this.consultContent = consultContent == null ? null : consultContent.trim();
    }
}