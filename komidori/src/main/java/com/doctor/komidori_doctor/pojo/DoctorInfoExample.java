package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.List;

public class DoctorInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Integer value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Integer value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Integer value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Integer value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Integer> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Integer> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNull() {
            addCriterion("doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNotNull() {
            addCriterion("doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameEqualTo(String value) {
            addCriterion("doctor_name =", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotEqualTo(String value) {
            addCriterion("doctor_name <>", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThan(String value) {
            addCriterion("doctor_name >", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_name >=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThan(String value) {
            addCriterion("doctor_name <", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("doctor_name <=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLike(String value) {
            addCriterion("doctor_name like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotLike(String value) {
            addCriterion("doctor_name not like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIn(List<String> values) {
            addCriterion("doctor_name in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotIn(List<String> values) {
            addCriterion("doctor_name not in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameBetween(String value1, String value2) {
            addCriterion("doctor_name between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotBetween(String value1, String value2) {
            addCriterion("doctor_name not between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorSexIsNull() {
            addCriterion("doctor_sex is null");
            return (Criteria) this;
        }

        public Criteria andDoctorSexIsNotNull() {
            addCriterion("doctor_sex is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorSexEqualTo(String value) {
            addCriterion("doctor_sex =", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexNotEqualTo(String value) {
            addCriterion("doctor_sex <>", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexGreaterThan(String value) {
            addCriterion("doctor_sex >", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_sex >=", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexLessThan(String value) {
            addCriterion("doctor_sex <", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexLessThanOrEqualTo(String value) {
            addCriterion("doctor_sex <=", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexLike(String value) {
            addCriterion("doctor_sex like", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexNotLike(String value) {
            addCriterion("doctor_sex not like", value, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexIn(List<String> values) {
            addCriterion("doctor_sex in", values, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexNotIn(List<String> values) {
            addCriterion("doctor_sex not in", values, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexBetween(String value1, String value2) {
            addCriterion("doctor_sex between", value1, value2, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorSexNotBetween(String value1, String value2) {
            addCriterion("doctor_sex not between", value1, value2, "doctorSex");
            return (Criteria) this;
        }

        public Criteria andDoctorAgeIsNull() {
            addCriterion("doctor_age is null");
            return (Criteria) this;
        }

        public Criteria andDoctorAgeIsNotNull() {
            addCriterion("doctor_age is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorAgeEqualTo(Integer value) {
            addCriterion("doctor_age =", value, "doctorAge");
            return (Criteria) this;
        }

        public Criteria andDoctorAgeNotEqualTo(Integer value) {
            addCriterion("doctor_age <>", value, "doctorAge");
            return (Criteria) this;
        }

        public Criteria andDoctorAgeGreaterThan(Integer value) {
            addCriterion("doctor_age >", value, "doctorAge");
            return (Criteria) this;
        }

        public Criteria andDoctorAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_age >=", value, "doctorAge");
            return (Criteria) this;
        }

        public Criteria andDoctorAgeLessThan(Integer value) {
            addCriterion("doctor_age <", value, "doctorAge");
            return (Criteria) this;
        }

        public Criteria andDoctorAgeLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_age <=", value, "doctorAge");
            return (Criteria) this;
        }

        public Criteria andDoctorAgeIn(List<Integer> values) {
            addCriterion("doctor_age in", values, "doctorAge");
            return (Criteria) this;
        }

        public Criteria andDoctorAgeNotIn(List<Integer> values) {
            addCriterion("doctor_age not in", values, "doctorAge");
            return (Criteria) this;
        }

        public Criteria andDoctorAgeBetween(Integer value1, Integer value2) {
            addCriterion("doctor_age between", value1, value2, "doctorAge");
            return (Criteria) this;
        }

        public Criteria andDoctorAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_age not between", value1, value2, "doctorAge");
            return (Criteria) this;
        }

        public Criteria andDoctorPwdIsNull() {
            addCriterion("doctor_pwd is null");
            return (Criteria) this;
        }

        public Criteria andDoctorPwdIsNotNull() {
            addCriterion("doctor_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorPwdEqualTo(String value) {
            addCriterion("doctor_pwd =", value, "doctorPwd");
            return (Criteria) this;
        }

        public Criteria andDoctorPwdNotEqualTo(String value) {
            addCriterion("doctor_pwd <>", value, "doctorPwd");
            return (Criteria) this;
        }

        public Criteria andDoctorPwdGreaterThan(String value) {
            addCriterion("doctor_pwd >", value, "doctorPwd");
            return (Criteria) this;
        }

        public Criteria andDoctorPwdGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_pwd >=", value, "doctorPwd");
            return (Criteria) this;
        }

        public Criteria andDoctorPwdLessThan(String value) {
            addCriterion("doctor_pwd <", value, "doctorPwd");
            return (Criteria) this;
        }

        public Criteria andDoctorPwdLessThanOrEqualTo(String value) {
            addCriterion("doctor_pwd <=", value, "doctorPwd");
            return (Criteria) this;
        }

        public Criteria andDoctorPwdLike(String value) {
            addCriterion("doctor_pwd like", value, "doctorPwd");
            return (Criteria) this;
        }

        public Criteria andDoctorPwdNotLike(String value) {
            addCriterion("doctor_pwd not like", value, "doctorPwd");
            return (Criteria) this;
        }

        public Criteria andDoctorPwdIn(List<String> values) {
            addCriterion("doctor_pwd in", values, "doctorPwd");
            return (Criteria) this;
        }

        public Criteria andDoctorPwdNotIn(List<String> values) {
            addCriterion("doctor_pwd not in", values, "doctorPwd");
            return (Criteria) this;
        }

        public Criteria andDoctorPwdBetween(String value1, String value2) {
            addCriterion("doctor_pwd between", value1, value2, "doctorPwd");
            return (Criteria) this;
        }

        public Criteria andDoctorPwdNotBetween(String value1, String value2) {
            addCriterion("doctor_pwd not between", value1, value2, "doctorPwd");
            return (Criteria) this;
        }

        public Criteria andDoctorTelIsNull() {
            addCriterion("doctor_tel is null");
            return (Criteria) this;
        }

        public Criteria andDoctorTelIsNotNull() {
            addCriterion("doctor_tel is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorTelEqualTo(String value) {
            addCriterion("doctor_tel =", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelNotEqualTo(String value) {
            addCriterion("doctor_tel <>", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelGreaterThan(String value) {
            addCriterion("doctor_tel >", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_tel >=", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelLessThan(String value) {
            addCriterion("doctor_tel <", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelLessThanOrEqualTo(String value) {
            addCriterion("doctor_tel <=", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelLike(String value) {
            addCriterion("doctor_tel like", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelNotLike(String value) {
            addCriterion("doctor_tel not like", value, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelIn(List<String> values) {
            addCriterion("doctor_tel in", values, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelNotIn(List<String> values) {
            addCriterion("doctor_tel not in", values, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelBetween(String value1, String value2) {
            addCriterion("doctor_tel between", value1, value2, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorTelNotBetween(String value1, String value2) {
            addCriterion("doctor_tel not between", value1, value2, "doctorTel");
            return (Criteria) this;
        }

        public Criteria andDoctorIdcardIsNull() {
            addCriterion("doctor_idcard is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdcardIsNotNull() {
            addCriterion("doctor_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdcardEqualTo(String value) {
            addCriterion("doctor_idcard =", value, "doctorIdcard");
            return (Criteria) this;
        }

        public Criteria andDoctorIdcardNotEqualTo(String value) {
            addCriterion("doctor_idcard <>", value, "doctorIdcard");
            return (Criteria) this;
        }

        public Criteria andDoctorIdcardGreaterThan(String value) {
            addCriterion("doctor_idcard >", value, "doctorIdcard");
            return (Criteria) this;
        }

        public Criteria andDoctorIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_idcard >=", value, "doctorIdcard");
            return (Criteria) this;
        }

        public Criteria andDoctorIdcardLessThan(String value) {
            addCriterion("doctor_idcard <", value, "doctorIdcard");
            return (Criteria) this;
        }

        public Criteria andDoctorIdcardLessThanOrEqualTo(String value) {
            addCriterion("doctor_idcard <=", value, "doctorIdcard");
            return (Criteria) this;
        }

        public Criteria andDoctorIdcardLike(String value) {
            addCriterion("doctor_idcard like", value, "doctorIdcard");
            return (Criteria) this;
        }

        public Criteria andDoctorIdcardNotLike(String value) {
            addCriterion("doctor_idcard not like", value, "doctorIdcard");
            return (Criteria) this;
        }

        public Criteria andDoctorIdcardIn(List<String> values) {
            addCriterion("doctor_idcard in", values, "doctorIdcard");
            return (Criteria) this;
        }

        public Criteria andDoctorIdcardNotIn(List<String> values) {
            addCriterion("doctor_idcard not in", values, "doctorIdcard");
            return (Criteria) this;
        }

        public Criteria andDoctorIdcardBetween(String value1, String value2) {
            addCriterion("doctor_idcard between", value1, value2, "doctorIdcard");
            return (Criteria) this;
        }

        public Criteria andDoctorIdcardNotBetween(String value1, String value2) {
            addCriterion("doctor_idcard not between", value1, value2, "doctorIdcard");
            return (Criteria) this;
        }

        public Criteria andDoctorStatusIsNull() {
            addCriterion("doctor_status is null");
            return (Criteria) this;
        }

        public Criteria andDoctorStatusIsNotNull() {
            addCriterion("doctor_status is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorStatusEqualTo(Integer value) {
            addCriterion("doctor_status =", value, "doctorStatus");
            return (Criteria) this;
        }

        public Criteria andDoctorStatusNotEqualTo(Integer value) {
            addCriterion("doctor_status <>", value, "doctorStatus");
            return (Criteria) this;
        }

        public Criteria andDoctorStatusGreaterThan(Integer value) {
            addCriterion("doctor_status >", value, "doctorStatus");
            return (Criteria) this;
        }

        public Criteria andDoctorStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_status >=", value, "doctorStatus");
            return (Criteria) this;
        }

        public Criteria andDoctorStatusLessThan(Integer value) {
            addCriterion("doctor_status <", value, "doctorStatus");
            return (Criteria) this;
        }

        public Criteria andDoctorStatusLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_status <=", value, "doctorStatus");
            return (Criteria) this;
        }

        public Criteria andDoctorStatusIn(List<Integer> values) {
            addCriterion("doctor_status in", values, "doctorStatus");
            return (Criteria) this;
        }

        public Criteria andDoctorStatusNotIn(List<Integer> values) {
            addCriterion("doctor_status not in", values, "doctorStatus");
            return (Criteria) this;
        }

        public Criteria andDoctorStatusBetween(Integer value1, Integer value2) {
            addCriterion("doctor_status between", value1, value2, "doctorStatus");
            return (Criteria) this;
        }

        public Criteria andDoctorStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_status not between", value1, value2, "doctorStatus");
            return (Criteria) this;
        }

        public Criteria andDoctorCityIsNull() {
            addCriterion("doctor_city is null");
            return (Criteria) this;
        }

        public Criteria andDoctorCityIsNotNull() {
            addCriterion("doctor_city is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorCityEqualTo(String value) {
            addCriterion("doctor_city =", value, "doctorCity");
            return (Criteria) this;
        }

        public Criteria andDoctorCityNotEqualTo(String value) {
            addCriterion("doctor_city <>", value, "doctorCity");
            return (Criteria) this;
        }

        public Criteria andDoctorCityGreaterThan(String value) {
            addCriterion("doctor_city >", value, "doctorCity");
            return (Criteria) this;
        }

        public Criteria andDoctorCityGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_city >=", value, "doctorCity");
            return (Criteria) this;
        }

        public Criteria andDoctorCityLessThan(String value) {
            addCriterion("doctor_city <", value, "doctorCity");
            return (Criteria) this;
        }

        public Criteria andDoctorCityLessThanOrEqualTo(String value) {
            addCriterion("doctor_city <=", value, "doctorCity");
            return (Criteria) this;
        }

        public Criteria andDoctorCityLike(String value) {
            addCriterion("doctor_city like", value, "doctorCity");
            return (Criteria) this;
        }

        public Criteria andDoctorCityNotLike(String value) {
            addCriterion("doctor_city not like", value, "doctorCity");
            return (Criteria) this;
        }

        public Criteria andDoctorCityIn(List<String> values) {
            addCriterion("doctor_city in", values, "doctorCity");
            return (Criteria) this;
        }

        public Criteria andDoctorCityNotIn(List<String> values) {
            addCriterion("doctor_city not in", values, "doctorCity");
            return (Criteria) this;
        }

        public Criteria andDoctorCityBetween(String value1, String value2) {
            addCriterion("doctor_city between", value1, value2, "doctorCity");
            return (Criteria) this;
        }

        public Criteria andDoctorCityNotBetween(String value1, String value2) {
            addCriterion("doctor_city not between", value1, value2, "doctorCity");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalIsNull() {
            addCriterion("doctor_hospital is null");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalIsNotNull() {
            addCriterion("doctor_hospital is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalEqualTo(String value) {
            addCriterion("doctor_hospital =", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalNotEqualTo(String value) {
            addCriterion("doctor_hospital <>", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalGreaterThan(String value) {
            addCriterion("doctor_hospital >", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_hospital >=", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalLessThan(String value) {
            addCriterion("doctor_hospital <", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalLessThanOrEqualTo(String value) {
            addCriterion("doctor_hospital <=", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalLike(String value) {
            addCriterion("doctor_hospital like", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalNotLike(String value) {
            addCriterion("doctor_hospital not like", value, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalIn(List<String> values) {
            addCriterion("doctor_hospital in", values, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalNotIn(List<String> values) {
            addCriterion("doctor_hospital not in", values, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalBetween(String value1, String value2) {
            addCriterion("doctor_hospital between", value1, value2, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorHospitalNotBetween(String value1, String value2) {
            addCriterion("doctor_hospital not between", value1, value2, "doctorHospital");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptIsNull() {
            addCriterion("doctor_dept is null");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptIsNotNull() {
            addCriterion("doctor_dept is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptEqualTo(String value) {
            addCriterion("doctor_dept =", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptNotEqualTo(String value) {
            addCriterion("doctor_dept <>", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptGreaterThan(String value) {
            addCriterion("doctor_dept >", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_dept >=", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptLessThan(String value) {
            addCriterion("doctor_dept <", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptLessThanOrEqualTo(String value) {
            addCriterion("doctor_dept <=", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptLike(String value) {
            addCriterion("doctor_dept like", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptNotLike(String value) {
            addCriterion("doctor_dept not like", value, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptIn(List<String> values) {
            addCriterion("doctor_dept in", values, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptNotIn(List<String> values) {
            addCriterion("doctor_dept not in", values, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptBetween(String value1, String value2) {
            addCriterion("doctor_dept between", value1, value2, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorDeptNotBetween(String value1, String value2) {
            addCriterion("doctor_dept not between", value1, value2, "doctorDept");
            return (Criteria) this;
        }

        public Criteria andDoctorEmailIsNull() {
            addCriterion("doctor_email is null");
            return (Criteria) this;
        }

        public Criteria andDoctorEmailIsNotNull() {
            addCriterion("doctor_email is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorEmailEqualTo(String value) {
            addCriterion("doctor_email =", value, "doctorEmail");
            return (Criteria) this;
        }

        public Criteria andDoctorEmailNotEqualTo(String value) {
            addCriterion("doctor_email <>", value, "doctorEmail");
            return (Criteria) this;
        }

        public Criteria andDoctorEmailGreaterThan(String value) {
            addCriterion("doctor_email >", value, "doctorEmail");
            return (Criteria) this;
        }

        public Criteria andDoctorEmailGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_email >=", value, "doctorEmail");
            return (Criteria) this;
        }

        public Criteria andDoctorEmailLessThan(String value) {
            addCriterion("doctor_email <", value, "doctorEmail");
            return (Criteria) this;
        }

        public Criteria andDoctorEmailLessThanOrEqualTo(String value) {
            addCriterion("doctor_email <=", value, "doctorEmail");
            return (Criteria) this;
        }

        public Criteria andDoctorEmailLike(String value) {
            addCriterion("doctor_email like", value, "doctorEmail");
            return (Criteria) this;
        }

        public Criteria andDoctorEmailNotLike(String value) {
            addCriterion("doctor_email not like", value, "doctorEmail");
            return (Criteria) this;
        }

        public Criteria andDoctorEmailIn(List<String> values) {
            addCriterion("doctor_email in", values, "doctorEmail");
            return (Criteria) this;
        }

        public Criteria andDoctorEmailNotIn(List<String> values) {
            addCriterion("doctor_email not in", values, "doctorEmail");
            return (Criteria) this;
        }

        public Criteria andDoctorEmailBetween(String value1, String value2) {
            addCriterion("doctor_email between", value1, value2, "doctorEmail");
            return (Criteria) this;
        }

        public Criteria andDoctorEmailNotBetween(String value1, String value2) {
            addCriterion("doctor_email not between", value1, value2, "doctorEmail");
            return (Criteria) this;
        }

        public Criteria andDoctorBookableIsNull() {
            addCriterion("doctor_bookable is null");
            return (Criteria) this;
        }

        public Criteria andDoctorBookableIsNotNull() {
            addCriterion("doctor_bookable is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorBookableEqualTo(Integer value) {
            addCriterion("doctor_bookable =", value, "doctorBookable");
            return (Criteria) this;
        }

        public Criteria andDoctorBookableNotEqualTo(Integer value) {
            addCriterion("doctor_bookable <>", value, "doctorBookable");
            return (Criteria) this;
        }

        public Criteria andDoctorBookableGreaterThan(Integer value) {
            addCriterion("doctor_bookable >", value, "doctorBookable");
            return (Criteria) this;
        }

        public Criteria andDoctorBookableGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_bookable >=", value, "doctorBookable");
            return (Criteria) this;
        }

        public Criteria andDoctorBookableLessThan(Integer value) {
            addCriterion("doctor_bookable <", value, "doctorBookable");
            return (Criteria) this;
        }

        public Criteria andDoctorBookableLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_bookable <=", value, "doctorBookable");
            return (Criteria) this;
        }

        public Criteria andDoctorBookableIn(List<Integer> values) {
            addCriterion("doctor_bookable in", values, "doctorBookable");
            return (Criteria) this;
        }

        public Criteria andDoctorBookableNotIn(List<Integer> values) {
            addCriterion("doctor_bookable not in", values, "doctorBookable");
            return (Criteria) this;
        }

        public Criteria andDoctorBookableBetween(Integer value1, Integer value2) {
            addCriterion("doctor_bookable between", value1, value2, "doctorBookable");
            return (Criteria) this;
        }

        public Criteria andDoctorBookableNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_bookable not between", value1, value2, "doctorBookable");
            return (Criteria) this;
        }

        public Criteria andDoctorFollowIsNull() {
            addCriterion("doctor_follow is null");
            return (Criteria) this;
        }

        public Criteria andDoctorFollowIsNotNull() {
            addCriterion("doctor_follow is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorFollowEqualTo(Integer value) {
            addCriterion("doctor_follow =", value, "doctorFollow");
            return (Criteria) this;
        }

        public Criteria andDoctorFollowNotEqualTo(Integer value) {
            addCriterion("doctor_follow <>", value, "doctorFollow");
            return (Criteria) this;
        }

        public Criteria andDoctorFollowGreaterThan(Integer value) {
            addCriterion("doctor_follow >", value, "doctorFollow");
            return (Criteria) this;
        }

        public Criteria andDoctorFollowGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_follow >=", value, "doctorFollow");
            return (Criteria) this;
        }

        public Criteria andDoctorFollowLessThan(Integer value) {
            addCriterion("doctor_follow <", value, "doctorFollow");
            return (Criteria) this;
        }

        public Criteria andDoctorFollowLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_follow <=", value, "doctorFollow");
            return (Criteria) this;
        }

        public Criteria andDoctorFollowIn(List<Integer> values) {
            addCriterion("doctor_follow in", values, "doctorFollow");
            return (Criteria) this;
        }

        public Criteria andDoctorFollowNotIn(List<Integer> values) {
            addCriterion("doctor_follow not in", values, "doctorFollow");
            return (Criteria) this;
        }

        public Criteria andDoctorFollowBetween(Integer value1, Integer value2) {
            addCriterion("doctor_follow between", value1, value2, "doctorFollow");
            return (Criteria) this;
        }

        public Criteria andDoctorFollowNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_follow not between", value1, value2, "doctorFollow");
            return (Criteria) this;
        }

        public Criteria andDoctorGoodReviewIsNull() {
            addCriterion("doctor_good_review is null");
            return (Criteria) this;
        }

        public Criteria andDoctorGoodReviewIsNotNull() {
            addCriterion("doctor_good_review is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorGoodReviewEqualTo(Integer value) {
            addCriterion("doctor_good_review =", value, "doctorGoodReview");
            return (Criteria) this;
        }

        public Criteria andDoctorGoodReviewNotEqualTo(Integer value) {
            addCriterion("doctor_good_review <>", value, "doctorGoodReview");
            return (Criteria) this;
        }

        public Criteria andDoctorGoodReviewGreaterThan(Integer value) {
            addCriterion("doctor_good_review >", value, "doctorGoodReview");
            return (Criteria) this;
        }

        public Criteria andDoctorGoodReviewGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_good_review >=", value, "doctorGoodReview");
            return (Criteria) this;
        }

        public Criteria andDoctorGoodReviewLessThan(Integer value) {
            addCriterion("doctor_good_review <", value, "doctorGoodReview");
            return (Criteria) this;
        }

        public Criteria andDoctorGoodReviewLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_good_review <=", value, "doctorGoodReview");
            return (Criteria) this;
        }

        public Criteria andDoctorGoodReviewIn(List<Integer> values) {
            addCriterion("doctor_good_review in", values, "doctorGoodReview");
            return (Criteria) this;
        }

        public Criteria andDoctorGoodReviewNotIn(List<Integer> values) {
            addCriterion("doctor_good_review not in", values, "doctorGoodReview");
            return (Criteria) this;
        }

        public Criteria andDoctorGoodReviewBetween(Integer value1, Integer value2) {
            addCriterion("doctor_good_review between", value1, value2, "doctorGoodReview");
            return (Criteria) this;
        }

        public Criteria andDoctorGoodReviewNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_good_review not between", value1, value2, "doctorGoodReview");
            return (Criteria) this;
        }

        public Criteria andDoctorOrdersIsNull() {
            addCriterion("doctor_orders is null");
            return (Criteria) this;
        }

        public Criteria andDoctorOrdersIsNotNull() {
            addCriterion("doctor_orders is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorOrdersEqualTo(Integer value) {
            addCriterion("doctor_orders =", value, "doctorOrders");
            return (Criteria) this;
        }

        public Criteria andDoctorOrdersNotEqualTo(Integer value) {
            addCriterion("doctor_orders <>", value, "doctorOrders");
            return (Criteria) this;
        }

        public Criteria andDoctorOrdersGreaterThan(Integer value) {
            addCriterion("doctor_orders >", value, "doctorOrders");
            return (Criteria) this;
        }

        public Criteria andDoctorOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_orders >=", value, "doctorOrders");
            return (Criteria) this;
        }

        public Criteria andDoctorOrdersLessThan(Integer value) {
            addCriterion("doctor_orders <", value, "doctorOrders");
            return (Criteria) this;
        }

        public Criteria andDoctorOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_orders <=", value, "doctorOrders");
            return (Criteria) this;
        }

        public Criteria andDoctorOrdersIn(List<Integer> values) {
            addCriterion("doctor_orders in", values, "doctorOrders");
            return (Criteria) this;
        }

        public Criteria andDoctorOrdersNotIn(List<Integer> values) {
            addCriterion("doctor_orders not in", values, "doctorOrders");
            return (Criteria) this;
        }

        public Criteria andDoctorOrdersBetween(Integer value1, Integer value2) {
            addCriterion("doctor_orders between", value1, value2, "doctorOrders");
            return (Criteria) this;
        }

        public Criteria andDoctorOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_orders not between", value1, value2, "doctorOrders");
            return (Criteria) this;
        }

        public Criteria andDoctorCourseNumIsNull() {
            addCriterion("doctor_course_num is null");
            return (Criteria) this;
        }

        public Criteria andDoctorCourseNumIsNotNull() {
            addCriterion("doctor_course_num is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorCourseNumEqualTo(Integer value) {
            addCriterion("doctor_course_num =", value, "doctorCourseNum");
            return (Criteria) this;
        }

        public Criteria andDoctorCourseNumNotEqualTo(Integer value) {
            addCriterion("doctor_course_num <>", value, "doctorCourseNum");
            return (Criteria) this;
        }

        public Criteria andDoctorCourseNumGreaterThan(Integer value) {
            addCriterion("doctor_course_num >", value, "doctorCourseNum");
            return (Criteria) this;
        }

        public Criteria andDoctorCourseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_course_num >=", value, "doctorCourseNum");
            return (Criteria) this;
        }

        public Criteria andDoctorCourseNumLessThan(Integer value) {
            addCriterion("doctor_course_num <", value, "doctorCourseNum");
            return (Criteria) this;
        }

        public Criteria andDoctorCourseNumLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_course_num <=", value, "doctorCourseNum");
            return (Criteria) this;
        }

        public Criteria andDoctorCourseNumIn(List<Integer> values) {
            addCriterion("doctor_course_num in", values, "doctorCourseNum");
            return (Criteria) this;
        }

        public Criteria andDoctorCourseNumNotIn(List<Integer> values) {
            addCriterion("doctor_course_num not in", values, "doctorCourseNum");
            return (Criteria) this;
        }

        public Criteria andDoctorCourseNumBetween(Integer value1, Integer value2) {
            addCriterion("doctor_course_num between", value1, value2, "doctorCourseNum");
            return (Criteria) this;
        }

        public Criteria andDoctorCourseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_course_num not between", value1, value2, "doctorCourseNum");
            return (Criteria) this;
        }

        public Criteria andDoctorIntroductionIsNull() {
            addCriterion("doctor_introduction is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIntroductionIsNotNull() {
            addCriterion("doctor_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIntroductionEqualTo(String value) {
            addCriterion("doctor_introduction =", value, "doctorIntroduction");
            return (Criteria) this;
        }

        public Criteria andDoctorIntroductionNotEqualTo(String value) {
            addCriterion("doctor_introduction <>", value, "doctorIntroduction");
            return (Criteria) this;
        }

        public Criteria andDoctorIntroductionGreaterThan(String value) {
            addCriterion("doctor_introduction >", value, "doctorIntroduction");
            return (Criteria) this;
        }

        public Criteria andDoctorIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_introduction >=", value, "doctorIntroduction");
            return (Criteria) this;
        }

        public Criteria andDoctorIntroductionLessThan(String value) {
            addCriterion("doctor_introduction <", value, "doctorIntroduction");
            return (Criteria) this;
        }

        public Criteria andDoctorIntroductionLessThanOrEqualTo(String value) {
            addCriterion("doctor_introduction <=", value, "doctorIntroduction");
            return (Criteria) this;
        }

        public Criteria andDoctorIntroductionLike(String value) {
            addCriterion("doctor_introduction like", value, "doctorIntroduction");
            return (Criteria) this;
        }

        public Criteria andDoctorIntroductionNotLike(String value) {
            addCriterion("doctor_introduction not like", value, "doctorIntroduction");
            return (Criteria) this;
        }

        public Criteria andDoctorIntroductionIn(List<String> values) {
            addCriterion("doctor_introduction in", values, "doctorIntroduction");
            return (Criteria) this;
        }

        public Criteria andDoctorIntroductionNotIn(List<String> values) {
            addCriterion("doctor_introduction not in", values, "doctorIntroduction");
            return (Criteria) this;
        }

        public Criteria andDoctorIntroductionBetween(String value1, String value2) {
            addCriterion("doctor_introduction between", value1, value2, "doctorIntroduction");
            return (Criteria) this;
        }

        public Criteria andDoctorIntroductionNotBetween(String value1, String value2) {
            addCriterion("doctor_introduction not between", value1, value2, "doctorIntroduction");
            return (Criteria) this;
        }

        public Criteria andDoctorImgIsNull() {
            addCriterion("doctor_img is null");
            return (Criteria) this;
        }

        public Criteria andDoctorImgIsNotNull() {
            addCriterion("doctor_img is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorImgEqualTo(String value) {
            addCriterion("doctor_img =", value, "doctorImg");
            return (Criteria) this;
        }

        public Criteria andDoctorImgNotEqualTo(String value) {
            addCriterion("doctor_img <>", value, "doctorImg");
            return (Criteria) this;
        }

        public Criteria andDoctorImgGreaterThan(String value) {
            addCriterion("doctor_img >", value, "doctorImg");
            return (Criteria) this;
        }

        public Criteria andDoctorImgGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_img >=", value, "doctorImg");
            return (Criteria) this;
        }

        public Criteria andDoctorImgLessThan(String value) {
            addCriterion("doctor_img <", value, "doctorImg");
            return (Criteria) this;
        }

        public Criteria andDoctorImgLessThanOrEqualTo(String value) {
            addCriterion("doctor_img <=", value, "doctorImg");
            return (Criteria) this;
        }

        public Criteria andDoctorImgLike(String value) {
            addCriterion("doctor_img like", value, "doctorImg");
            return (Criteria) this;
        }

        public Criteria andDoctorImgNotLike(String value) {
            addCriterion("doctor_img not like", value, "doctorImg");
            return (Criteria) this;
        }

        public Criteria andDoctorImgIn(List<String> values) {
            addCriterion("doctor_img in", values, "doctorImg");
            return (Criteria) this;
        }

        public Criteria andDoctorImgNotIn(List<String> values) {
            addCriterion("doctor_img not in", values, "doctorImg");
            return (Criteria) this;
        }

        public Criteria andDoctorImgBetween(String value1, String value2) {
            addCriterion("doctor_img between", value1, value2, "doctorImg");
            return (Criteria) this;
        }

        public Criteria andDoctorImgNotBetween(String value1, String value2) {
            addCriterion("doctor_img not between", value1, value2, "doctorImg");
            return (Criteria) this;
        }

        public Criteria andDoctorRankIsNull() {
            addCriterion("doctor_rank is null");
            return (Criteria) this;
        }

        public Criteria andDoctorRankIsNotNull() {
            addCriterion("doctor_rank is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorRankEqualTo(String value) {
            addCriterion("doctor_rank =", value, "doctorRank");
            return (Criteria) this;
        }

        public Criteria andDoctorRankNotEqualTo(String value) {
            addCriterion("doctor_rank <>", value, "doctorRank");
            return (Criteria) this;
        }

        public Criteria andDoctorRankGreaterThan(String value) {
            addCriterion("doctor_rank >", value, "doctorRank");
            return (Criteria) this;
        }

        public Criteria andDoctorRankGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_rank >=", value, "doctorRank");
            return (Criteria) this;
        }

        public Criteria andDoctorRankLessThan(String value) {
            addCriterion("doctor_rank <", value, "doctorRank");
            return (Criteria) this;
        }

        public Criteria andDoctorRankLessThanOrEqualTo(String value) {
            addCriterion("doctor_rank <=", value, "doctorRank");
            return (Criteria) this;
        }

        public Criteria andDoctorRankLike(String value) {
            addCriterion("doctor_rank like", value, "doctorRank");
            return (Criteria) this;
        }

        public Criteria andDoctorRankNotLike(String value) {
            addCriterion("doctor_rank not like", value, "doctorRank");
            return (Criteria) this;
        }

        public Criteria andDoctorRankIn(List<String> values) {
            addCriterion("doctor_rank in", values, "doctorRank");
            return (Criteria) this;
        }

        public Criteria andDoctorRankNotIn(List<String> values) {
            addCriterion("doctor_rank not in", values, "doctorRank");
            return (Criteria) this;
        }

        public Criteria andDoctorRankBetween(String value1, String value2) {
            addCriterion("doctor_rank between", value1, value2, "doctorRank");
            return (Criteria) this;
        }

        public Criteria andDoctorRankNotBetween(String value1, String value2) {
            addCriterion("doctor_rank not between", value1, value2, "doctorRank");
            return (Criteria) this;
        }

        public Criteria andDoctorVerifyIsNull() {
            addCriterion("doctor_verify is null");
            return (Criteria) this;
        }

        public Criteria andDoctorVerifyIsNotNull() {
            addCriterion("doctor_verify is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorVerifyEqualTo(Integer value) {
            addCriterion("doctor_verify =", value, "doctorVerify");
            return (Criteria) this;
        }

        public Criteria andDoctorVerifyNotEqualTo(Integer value) {
            addCriterion("doctor_verify <>", value, "doctorVerify");
            return (Criteria) this;
        }

        public Criteria andDoctorVerifyGreaterThan(Integer value) {
            addCriterion("doctor_verify >", value, "doctorVerify");
            return (Criteria) this;
        }

        public Criteria andDoctorVerifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_verify >=", value, "doctorVerify");
            return (Criteria) this;
        }

        public Criteria andDoctorVerifyLessThan(Integer value) {
            addCriterion("doctor_verify <", value, "doctorVerify");
            return (Criteria) this;
        }

        public Criteria andDoctorVerifyLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_verify <=", value, "doctorVerify");
            return (Criteria) this;
        }

        public Criteria andDoctorVerifyIn(List<Integer> values) {
            addCriterion("doctor_verify in", values, "doctorVerify");
            return (Criteria) this;
        }

        public Criteria andDoctorVerifyNotIn(List<Integer> values) {
            addCriterion("doctor_verify not in", values, "doctorVerify");
            return (Criteria) this;
        }

        public Criteria andDoctorVerifyBetween(Integer value1, Integer value2) {
            addCriterion("doctor_verify between", value1, value2, "doctorVerify");
            return (Criteria) this;
        }

        public Criteria andDoctorVerifyNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_verify not between", value1, value2, "doctorVerify");
            return (Criteria) this;
        }

        public Criteria andDcotorStrengthIsNull() {
            addCriterion("dcotor_strength is null");
            return (Criteria) this;
        }

        public Criteria andDcotorStrengthIsNotNull() {
            addCriterion("dcotor_strength is not null");
            return (Criteria) this;
        }

        public Criteria andDcotorStrengthEqualTo(String value) {
            addCriterion("dcotor_strength =", value, "dcotorStrength");
            return (Criteria) this;
        }

        public Criteria andDcotorStrengthNotEqualTo(String value) {
            addCriterion("dcotor_strength <>", value, "dcotorStrength");
            return (Criteria) this;
        }

        public Criteria andDcotorStrengthGreaterThan(String value) {
            addCriterion("dcotor_strength >", value, "dcotorStrength");
            return (Criteria) this;
        }

        public Criteria andDcotorStrengthGreaterThanOrEqualTo(String value) {
            addCriterion("dcotor_strength >=", value, "dcotorStrength");
            return (Criteria) this;
        }

        public Criteria andDcotorStrengthLessThan(String value) {
            addCriterion("dcotor_strength <", value, "dcotorStrength");
            return (Criteria) this;
        }

        public Criteria andDcotorStrengthLessThanOrEqualTo(String value) {
            addCriterion("dcotor_strength <=", value, "dcotorStrength");
            return (Criteria) this;
        }

        public Criteria andDcotorStrengthLike(String value) {
            addCriterion("dcotor_strength like", value, "dcotorStrength");
            return (Criteria) this;
        }

        public Criteria andDcotorStrengthNotLike(String value) {
            addCriterion("dcotor_strength not like", value, "dcotorStrength");
            return (Criteria) this;
        }

        public Criteria andDcotorStrengthIn(List<String> values) {
            addCriterion("dcotor_strength in", values, "dcotorStrength");
            return (Criteria) this;
        }

        public Criteria andDcotorStrengthNotIn(List<String> values) {
            addCriterion("dcotor_strength not in", values, "dcotorStrength");
            return (Criteria) this;
        }

        public Criteria andDcotorStrengthBetween(String value1, String value2) {
            addCriterion("dcotor_strength between", value1, value2, "dcotorStrength");
            return (Criteria) this;
        }

        public Criteria andDcotorStrengthNotBetween(String value1, String value2) {
            addCriterion("dcotor_strength not between", value1, value2, "dcotorStrength");
            return (Criteria) this;
        }

        public Criteria andOnlinePriceIsNull() {
            addCriterion("online_price is null");
            return (Criteria) this;
        }

        public Criteria andOnlinePriceIsNotNull() {
            addCriterion("online_price is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinePriceEqualTo(Float value) {
            addCriterion("online_price =", value, "onlinePrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePriceNotEqualTo(Float value) {
            addCriterion("online_price <>", value, "onlinePrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePriceGreaterThan(Float value) {
            addCriterion("online_price >", value, "onlinePrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("online_price >=", value, "onlinePrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePriceLessThan(Float value) {
            addCriterion("online_price <", value, "onlinePrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePriceLessThanOrEqualTo(Float value) {
            addCriterion("online_price <=", value, "onlinePrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePriceIn(List<Float> values) {
            addCriterion("online_price in", values, "onlinePrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePriceNotIn(List<Float> values) {
            addCriterion("online_price not in", values, "onlinePrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePriceBetween(Float value1, Float value2) {
            addCriterion("online_price between", value1, value2, "onlinePrice");
            return (Criteria) this;
        }

        public Criteria andOnlinePriceNotBetween(Float value1, Float value2) {
            addCriterion("online_price not between", value1, value2, "onlinePrice");
            return (Criteria) this;
        }

        public Criteria andOfflinePriceIsNull() {
            addCriterion("offline_price is null");
            return (Criteria) this;
        }

        public Criteria andOfflinePriceIsNotNull() {
            addCriterion("offline_price is not null");
            return (Criteria) this;
        }

        public Criteria andOfflinePriceEqualTo(Float value) {
            addCriterion("offline_price =", value, "offlinePrice");
            return (Criteria) this;
        }

        public Criteria andOfflinePriceNotEqualTo(Float value) {
            addCriterion("offline_price <>", value, "offlinePrice");
            return (Criteria) this;
        }

        public Criteria andOfflinePriceGreaterThan(Float value) {
            addCriterion("offline_price >", value, "offlinePrice");
            return (Criteria) this;
        }

        public Criteria andOfflinePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("offline_price >=", value, "offlinePrice");
            return (Criteria) this;
        }

        public Criteria andOfflinePriceLessThan(Float value) {
            addCriterion("offline_price <", value, "offlinePrice");
            return (Criteria) this;
        }

        public Criteria andOfflinePriceLessThanOrEqualTo(Float value) {
            addCriterion("offline_price <=", value, "offlinePrice");
            return (Criteria) this;
        }

        public Criteria andOfflinePriceIn(List<Float> values) {
            addCriterion("offline_price in", values, "offlinePrice");
            return (Criteria) this;
        }

        public Criteria andOfflinePriceNotIn(List<Float> values) {
            addCriterion("offline_price not in", values, "offlinePrice");
            return (Criteria) this;
        }

        public Criteria andOfflinePriceBetween(Float value1, Float value2) {
            addCriterion("offline_price between", value1, value2, "offlinePrice");
            return (Criteria) this;
        }

        public Criteria andOfflinePriceNotBetween(Float value1, Float value2) {
            addCriterion("offline_price not between", value1, value2, "offlinePrice");
            return (Criteria) this;
        }

        public Criteria andConsultableIsNull() {
            addCriterion("consultable is null");
            return (Criteria) this;
        }

        public Criteria andConsultableIsNotNull() {
            addCriterion("consultable is not null");
            return (Criteria) this;
        }

        public Criteria andConsultableEqualTo(Integer value) {
            addCriterion("consultable =", value, "consultable");
            return (Criteria) this;
        }

        public Criteria andConsultableNotEqualTo(Integer value) {
            addCriterion("consultable <>", value, "consultable");
            return (Criteria) this;
        }

        public Criteria andConsultableGreaterThan(Integer value) {
            addCriterion("consultable >", value, "consultable");
            return (Criteria) this;
        }

        public Criteria andConsultableGreaterThanOrEqualTo(Integer value) {
            addCriterion("consultable >=", value, "consultable");
            return (Criteria) this;
        }

        public Criteria andConsultableLessThan(Integer value) {
            addCriterion("consultable <", value, "consultable");
            return (Criteria) this;
        }

        public Criteria andConsultableLessThanOrEqualTo(Integer value) {
            addCriterion("consultable <=", value, "consultable");
            return (Criteria) this;
        }

        public Criteria andConsultableIn(List<Integer> values) {
            addCriterion("consultable in", values, "consultable");
            return (Criteria) this;
        }

        public Criteria andConsultableNotIn(List<Integer> values) {
            addCriterion("consultable not in", values, "consultable");
            return (Criteria) this;
        }

        public Criteria andConsultableBetween(Integer value1, Integer value2) {
            addCriterion("consultable between", value1, value2, "consultable");
            return (Criteria) this;
        }

        public Criteria andConsultableNotBetween(Integer value1, Integer value2) {
            addCriterion("consultable not between", value1, value2, "consultable");
            return (Criteria) this;
        }

        public Criteria andDocWorkAgeIsNull() {
            addCriterion("doc_work_age is null");
            return (Criteria) this;
        }

        public Criteria andDocWorkAgeIsNotNull() {
            addCriterion("doc_work_age is not null");
            return (Criteria) this;
        }

        public Criteria andDocWorkAgeEqualTo(Integer value) {
            addCriterion("doc_work_age =", value, "docWorkAge");
            return (Criteria) this;
        }

        public Criteria andDocWorkAgeNotEqualTo(Integer value) {
            addCriterion("doc_work_age <>", value, "docWorkAge");
            return (Criteria) this;
        }

        public Criteria andDocWorkAgeGreaterThan(Integer value) {
            addCriterion("doc_work_age >", value, "docWorkAge");
            return (Criteria) this;
        }

        public Criteria andDocWorkAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("doc_work_age >=", value, "docWorkAge");
            return (Criteria) this;
        }

        public Criteria andDocWorkAgeLessThan(Integer value) {
            addCriterion("doc_work_age <", value, "docWorkAge");
            return (Criteria) this;
        }

        public Criteria andDocWorkAgeLessThanOrEqualTo(Integer value) {
            addCriterion("doc_work_age <=", value, "docWorkAge");
            return (Criteria) this;
        }

        public Criteria andDocWorkAgeIn(List<Integer> values) {
            addCriterion("doc_work_age in", values, "docWorkAge");
            return (Criteria) this;
        }

        public Criteria andDocWorkAgeNotIn(List<Integer> values) {
            addCriterion("doc_work_age not in", values, "docWorkAge");
            return (Criteria) this;
        }

        public Criteria andDocWorkAgeBetween(Integer value1, Integer value2) {
            addCriterion("doc_work_age between", value1, value2, "docWorkAge");
            return (Criteria) this;
        }

        public Criteria andDocWorkAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("doc_work_age not between", value1, value2, "docWorkAge");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}