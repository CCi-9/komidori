package com.doctor.komidori_doctor.pojo;

import java.util.Date;

public class EmailInfo {
    private Integer emailId;

    private String emailTitle;

    private String emailFromId;

    private Integer emailToDocId;

    private String emailContent;

    private Integer emailStatus;

    private Date emailDate;

    private Integer emailToMadId;

    private Integer emailToAdminId;

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

    public Integer getEmailToMadId() {
        return emailToMadId;
    }

    public void setEmailToMadId(Integer emailToMadId) {
        this.emailToMadId = emailToMadId;
    }

    public Integer getEmailToAdminId() {
        return emailToAdminId;
    }

    public void setEmailToAdminId(Integer emailToAdminId) {
        this.emailToAdminId = emailToAdminId;
    }
}