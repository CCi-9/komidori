package com.doctor.komidori_doctor.pojo;

import java.util.Date;

public class FollowChart extends FollowChartKey {
    private Date followDate;

    public Date getFollowDate() {
        return followDate;
    }

    public void setFollowDate(Date followDate) {
        this.followDate = followDate;
    }
}