package com.doctor.komidori_doctor.pojo;

public class BabyGrowthChart {
    private Integer babyGrowthId;

    private String babyGrowthDate;

    private Float bpd;

    private Float ac;

    private Float fl;

    private Float minweight;

    private Float maxwight;

    private Float bpdRange;

    private Float acRange;

    private Float flRange;

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

    public Float getBpd() {
        return bpd;
    }

    public void setBpd(Float bpd) {
        this.bpd = bpd;
    }

    public Float getAc() {
        return ac;
    }

    public void setAc(Float ac) {
        this.ac = ac;
    }

    public Float getFl() {
        return fl;
    }

    public void setFl(Float fl) {
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

    public Float getBpdRange() {
        return bpdRange;
    }

    public void setBpdRange(Float bpdRange) {
        this.bpdRange = bpdRange;
    }

    public Float getAcRange() {
        return acRange;
    }

    public void setAcRange(Float acRange) {
        this.acRange = acRange;
    }

    public Float getFlRange() {
        return flRange;
    }

    public void setFlRange(Float flRange) {
        this.flRange = flRange;
    }
}