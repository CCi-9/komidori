package com.doctor.komidori_doctor.pojo;

import java.util.Date;

public class EmailInfo {
    private Integer emailId;

    private String emailTitle;

    private String emailFromId;

    private Integer emailToDocId;

    private Integer emailToAdminId;

    private String emailContent;

    private Integer emailStatus;

    private Date emailDate;

    private Integer validateType;

    private Integer validateCourseId;

    private Integer validateDocId;

    public Integer getEmailId() {
        return emailId;
    }

    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    public String getEmailTitle() {
        return emailTitle;
    }

    public void setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle == null ? null : emailTitle.trim();
    }

    public String getEmailFromId() {
        return emailFromId;
    }

    public void setEmailFromId(String emailFromId) {
        this.emailFromId = emailFromId == null ? null : emailFromId.trim();
    }

    public Integer getEmailToDocId() {
        return emailToDocId;
    }

    public void setEmailToDocId(Integer emailToDocId) {
        this.emailToDocId = emailToDocId;
    }

    public Integer getEmailToAdminId() {
        return emailToAdminId;
    }

    public void setEmailToAdminId(Integer emailToAdminId) {
        this.emailToAdminId = emailToAdminId;
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent == null ? null : emailContent.trim();
    }

    public Integer getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(Integer emailStatus) {
        this.emailStatus = emailStatus;
    }

    public Date getEmailDate() {
        return emailDate;
    }

    public void setEmailDate(Date emailDate) {
        this.emailDate = emailDate;
    }

    public Integer getValidateType() {
        return validateType;
    }

    public void setValidateType(Integer validateType) {
        this.validateType = validateType;
    }

    public Integer getValidateCourseId() {
        return validateCourseId;
    }

    public void setValidateCourseId(Integer validateCourseId) {
        this.validateCourseId = validateCourseId;
    }

    public Integer getValidateDocId() {
        return validateDocId;
    }

    public void setValidateDocId(Integer validateDocId) {
        this.validateDocId = validateDocId;
    }
}