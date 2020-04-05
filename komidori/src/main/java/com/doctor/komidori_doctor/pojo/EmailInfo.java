package com.doctor.komidori_doctor.pojo;

import java.util.Date;

public class EmailInfo {
    private Integer emailId;

    private String emailTitle;

    private Integer emailFromId;

    private Integer emailToId;

    private Integer emailStatus;

    private Date emailDate;

    private String emailContent;

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

    public Integer getEmailFromId() {
        return emailFromId;
    }

    public void setEmailFromId(Integer emailFromId) {
        this.emailFromId = emailFromId;
    }

    public Integer getEmailToId() {
        return emailToId;
    }

    public void setEmailToId(Integer emailToId) {
        this.emailToId = emailToId;
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

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent == null ? null : emailContent.trim();
    }
}