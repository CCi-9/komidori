package com.doctor.komidori_doctor.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Maternal implements Serializable {
    private int maternal_id;
    private String maternal_name;
    private int maternal_age;
    private String maternal_nickname;
    private String maternal_pwd;
    private String maternal_tel;
    private int maternal_status;
    private String maternal_email;
    private String maternal_city;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate pregnant_date;
    private String maternal_idcard;
    private int maternal_idcard_type;
    private int maternal_follow;
    private int maternal_preg_week;
    private String maternal_img;

    @Override
    public String toString() {
        return "Maternal{" +
                "maternal_id=" + maternal_id +
                ", maternal_name='" + maternal_name + '\'' +
                ", maternal_age=" + maternal_age +
                ", maternal_nickname='" + maternal_nickname + '\'' +
                ", maternal_pwd='" + maternal_pwd + '\'' +
                ", maternal_tel='" + maternal_tel + '\'' +
                ", maternal_status=" + maternal_status +
                ", maternal_email='" + maternal_email + '\'' +
                ", maternal_city='" + maternal_city + '\'' +
                ", pregnant_date=" + pregnant_date +
                ", maternal_idcard='" + maternal_idcard + '\'' +
                ", maternal_idcard_type=" + maternal_idcard_type +
                ", maternal_follow=" + maternal_follow +
                ", maternal_preg_week=" + maternal_preg_week +
                ", maternal_img='" + maternal_img + '\'' +
                '}';
    }

    public int getMaternal_id() {
        return maternal_id;
    }

    public void setMaternal_id(int maternal_id) {
        this.maternal_id = maternal_id;
    }

    public String getMaternal_name() {
        return maternal_name;
    }

    public void setMaternal_name(String maternal_name) {
        this.maternal_name = maternal_name;
    }

    public int getMaternal_age() {
        return maternal_age;
    }

    public void setMaternal_age(int maternal_age) {
        this.maternal_age = maternal_age;
    }

    public String getMaternal_nickname() {
        return maternal_nickname;
    }

    public void setMaternal_nickname(String maternal_nickname) {
        this.maternal_nickname = maternal_nickname;
    }

    public String getMaternal_pwd() {
        return maternal_pwd;
    }

    public void setMaternal_pwd(String maternal_pwd) {
        this.maternal_pwd = maternal_pwd;
    }

    public String getMaternal_tel() {
        return maternal_tel;
    }

    public void setMaternal_tel(String maternal_tel) {
        this.maternal_tel = maternal_tel;
    }

    public int getMaternal_status() {
        return maternal_status;
    }

    public void setMaternal_status(int maternal_status) {
        this.maternal_status = maternal_status;
    }

    public String getMaternal_email() {
        return maternal_email;
    }

    public void setMaternal_email(String maternal_email) {
        this.maternal_email = maternal_email;
    }

    public String getMaternal_city() {
        return maternal_city;
    }

    public void setMaternal_city(String maternal_city) {
        this.maternal_city = maternal_city;
    }

    public LocalDate getPregnant_date() {
        return pregnant_date;
    }

    public void setPregnant_date(LocalDate pregnant_date) {
        this.pregnant_date = pregnant_date;
    }

    public String getMaternal_idcard() {
        return maternal_idcard;
    }

    public void setMaternal_idcard(String maternal_idcard) {
        this.maternal_idcard = maternal_idcard;
    }

    public int getMaternal_idcard_type() {
        return maternal_idcard_type;
    }

    public void setMaternal_idcard_type(int maternal_idcard_type) {
        this.maternal_idcard_type = maternal_idcard_type;
    }

    public int getMaternal_follow() {
        return maternal_follow;
    }

    public void setMaternal_follow(int maternal_follow) {
        this.maternal_follow = maternal_follow;
    }

    public int getMaternal_preg_week() {
        return maternal_preg_week;
    }

    public void setMaternal_preg_week(int maternal_preg_week) {
        this.maternal_preg_week = maternal_preg_week;
    }

    public String getMaternal_img() {
        return maternal_img;
    }

    public void setMaternal_img(String maternal_img) {
        this.maternal_img = maternal_img;
    }
}
