package com.doctor.komidori_doctor.pojo;

public class DoctorInfoWithBLOBs extends DoctorInfo {
    private String doctorIntroduction;

    private String dcotorStrength;

    public String getDoctorIntroduction() {
        return doctorIntroduction;
    }

    public void setDoctorIntroduction(String doctorIntroduction) {
        this.doctorIntroduction = doctorIntroduction == null ? null : doctorIntroduction.trim();
    }

    public String getDcotorStrength() {
        return dcotorStrength;
    }

    public void setDcotorStrength(String dcotorStrength) {
        this.dcotorStrength = dcotorStrength == null ? null : dcotorStrength.trim();
    }
}