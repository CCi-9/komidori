package com.doctor.komidori_doctor.pojo;

import java.time.LocalDateTime;
import java.util.Date;

public class CourseInfo {
    private Integer courseId;

    private Integer courseType;

    private Integer courseDocId;

    private Integer courseClassId;

    private LocalDateTime courseDate;

    private Integer courseGoodReview;

    private Float coursePrice;

    private String courseImg;

    private String courseTitle;

    private String courseContent;

    private String courseIntroduction;

    private PublicCategoryChart publicCategoryChart;

    public PublicCategoryChart getPublicCategoryChart() {
        return publicCategoryChart;
    }

    public void setPublicCategoryChart(PublicCategoryChart publicCategoryChart) {
        this.publicCategoryChart = publicCategoryChart;
    }

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

    public LocalDateTime getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(LocalDateTime courseDate) {
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

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle == null ? null : courseTitle.trim();
    }

    public String getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(String courseContent) {
        this.courseContent = courseContent == null ? null : courseContent.trim();
    }

    public String getCourseIntroduction() {
        return courseIntroduction;
    }

    public void setCourseIntroduction(String courseIntroduction) {
        this.courseIntroduction = courseIntroduction == null ? null : courseIntroduction.trim();
    }
}