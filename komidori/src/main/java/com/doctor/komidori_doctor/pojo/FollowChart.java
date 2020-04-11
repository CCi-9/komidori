package com.doctor.komidori_doctor.pojo;

import java.util.Date;
import java.util.List;

public class FollowChart extends FollowChartKey {

    private Integer followMatId;

    private Integer followDocId;

    private Date followDate;

    private DoctorInfo doctorInfo;

    public DoctorInfo getDoctorInfo() {
        return doctorInfo;
    }

    @Override
    public Integer getFollowMatId() {
        return followMatId;
    }

    @Override
    public void setFollowMatId(Integer followMatId) {
        this.followMatId = followMatId;
    }

    @Override
    public Integer getFollowDocId() {
        return followDocId;
    }

    @Override
    public void setFollowDocId(Integer followDocId) {
        this.followDocId = followDocId;
    }

    public void setDoctorInfo(DoctorInfo doctorInfo) {
        this.doctorInfo = doctorInfo;
    }


    public Date getFollowDate() {
        return followDate;
    }

    public void setFollowDate(Date followDate) {
        this.followDate = followDate;
    }
}