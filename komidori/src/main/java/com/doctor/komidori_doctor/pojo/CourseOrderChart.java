package com.doctor.komidori_doctor.pojo;

import java.util.Date;

public class CourseOrderChart {
    private Integer courseOrderId;

    private Integer courseOrderMatId;

    private Integer courseOrderCid;

    private Date courseOrderDate;

    private CourseInfo courseInfo;

    public CourseInfo getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(CourseInfo courseInfo) {
        this.courseInfo = courseInfo;
    }

    public Integer getCourseOrderId() {
        return courseOrderId;
    }

    public void setCourseOrderId(Integer courseOrderId) {
        this.courseOrderId = courseOrderId;
    }

    public Integer getCourseOrderMatId() {
        return courseOrderMatId;
    }

    public void setCourseOrderMatId(Integer courseOrderMatId) {
        this.courseOrderMatId = courseOrderMatId;
    }

    public Integer getCourseOrderCid() {
        return courseOrderCid;
    }

    public void setCourseOrderCid(Integer courseOrderCid) {
        this.courseOrderCid = courseOrderCid;
    }

    public Date getCourseOrderDate() {
        return courseOrderDate;
    }

    public void setCourseOrderDate(Date courseOrderDate) {
        this.courseOrderDate = courseOrderDate;
    }
}