package com.doctor.komidori_doctor.pojo;

import java.util.Date;

public class CollectionChart extends CollectionChartKey {

    private Integer collectMatId;

    private Integer collectionId;

    private Date collectionDate;

    private PublicEssayChart publicEssayChart;

    public PublicEssayChart getPublicEssayChart() {
        return publicEssayChart;
    }

    public void setPublicEssayChart(PublicEssayChart publicEssayChart) {
        this.publicEssayChart = publicEssayChart;
    }

    @Override
    public Integer getCollectMatId() {
        return collectMatId;
    }

    @Override
    public void setCollectMatId(Integer collectMatId) {
        this.collectMatId = collectMatId;
    }

    @Override
    public Integer getCollectionId() {
        return collectionId;
    }

    @Override
    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }
}