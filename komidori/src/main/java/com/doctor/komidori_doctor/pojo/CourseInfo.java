package com.doctor.komidori_doctor.pojo;

import java.util.Date;

public class CourseInfo {
    private Integer courseId;

    private Integer courseType;

    private Integer courseDocId;

    private Integer courseClassId;

    private Date courseDate;

    private Integer courseGoodReview;

    private Float coursePrice;

    private String courseImg;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getCourseType() {
        return courseType;
    }

    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    public Integer getCourseDocId() {
        return courseDocId;
    }

    public void setCourseDocId(Integer courseDocId) {
        this.courseDocId = courseDocId;
    }

    public Integer getCourseClassId() {
        return courseClassId;
    }

    public void setCourseClassId(Integer courseClassId) {
        this.courseClassId = courseClassId;
    }

    public Date getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(Date courseDate) {
        this.courseDate = courseDate;
    }

    public Integer getCourseGoodReview() {
        return courseGoodReview;
    }

    public void setCourseGoodReview(Integer courseGoodReview) {
        this.courseGoodReview = courseGoodReview;
    }

    public Float getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(Float coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg == null ? null : courseImg.trim();
    }
}