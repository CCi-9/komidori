package com.doctor.komidori_doctor.pojo;

public class VaccineInfo {
    private Integer vaccineId;

    private String vaccineName;

    private String vaccineFitDate;

    private String vaccineIntroduce;

    private String vaccinePrevention;

    private String vaccineImmunity;

    public Integer getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(Integer vaccineId) {
        this.vaccineId = vaccineId;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName == null ? null : vaccineName.trim();
    }

    public String getVaccineFitDate() {
        return vaccineFitDate;
    }

    public void setVaccineFitDate(String vaccineFitDate) {
        this.vaccineFitDate = vaccineFitDate == null ? null : vaccineFitDate.trim();
    }

    public String getVaccineIntroduce() {
        return vaccineIntroduce;
    }

    public void setVaccineIntroduce(String vaccineIntroduce) {
        this.vaccineIntroduce = vaccineIntroduce == null ? null : vaccineIntroduce.trim();
    }

    public String getVaccinePrevention() {
        return vaccinePrevention;
    }

    public void setVaccinePrevention(String vaccinePrevention) {
        this.vaccinePrevention = vaccinePrevention == null ? null : vaccinePrevention.trim();
    }

    public String getVaccineImmunity() {
        return vaccineImmunity;
    }

    public void setVaccineImmunity(String vaccineImmunity) {
        this.vaccineImmunity = vaccineImmunity == null ? null : vaccineImmunity.trim();
    }
}