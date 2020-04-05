package com.doctor.komidori_doctor.pojo;

public class BabyGrowthChart {
    private Integer babyGrowthId;

    private String babyGrowthDate;

    private Integer bpd;

    private Integer ac;

    private Integer fl;

    private Float minweight;

    private Float maxwight;

    public Integer getBabyGrowthId() {
        return babyGrowthId;
    }

    public void setBabyGrowthId(Integer babyGrowthId) {
        this.babyGrowthId = babyGrowthId;
    }

    public String getBabyGrowthDate() {
        return babyGrowthDate;
    }

    public void setBabyGrowthDate(String babyGrowthDate) {
        this.babyGrowthDate = babyGrowthDate == null ? null : babyGrowthDate.trim();
    }

    public Integer getBpd() {
        return bpd;
    }

    public void setBpd(Integer bpd) {
        this.bpd = bpd;
    }

    public Integer getAc() {
        return ac;
    }

    public void setAc(Integer ac) {
        this.ac = ac;
    }

    public Integer getFl() {
        return fl;
    }

    public void setFl(Integer fl) {
        this.fl = fl;
    }

    public Float getMinweight() {
        return minweight;
    }

    public void setMinweight(Float minweight) {
        this.minweight = minweight;
    }

    public Float getMaxwight() {
        return maxwight;
    }

    public void setMaxwight(Float maxwight) {
        this.maxwight = maxwight;
    }
}