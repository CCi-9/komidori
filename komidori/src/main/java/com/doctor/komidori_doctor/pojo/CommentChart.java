package com.doctor.komidori_doctor.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Component
public class CommentChart {
    private Integer commentId;

    private Integer answerId;

    private Integer commentUserId;

    private String commentContent;

    private Integer commentStatus;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime commentDate;

    private String commentUserName;

    private String commentUserImg;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(Integer commentUserId) {
        this.commentUserId = commentUserId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }

    public LocalDateTime getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(LocalDateTime commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentUserName() {
        return commentUserName;
    }

    public void setCommentUserName(String commentUserName) {
        this.commentUserName = commentUserName == null ? null : commentUserName.trim();
    }

    public String getCommentUserImg() {
        return commentUserImg;
    }

    public void setCommentUserImg(String commentUserImg) {
        this.commentUserImg = commentUserImg == null ? null : commentUserImg.trim();
    }
}