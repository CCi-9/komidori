package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MaternalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaternalInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMaternalIdIsNull() {
            addCriterion("maternal_id is null");
            return (Criteria) this;
        }

        public Criteria andMaternalIdIsNotNull() {
            addCriterion("maternal_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaternalIdEqualTo(Integer value) {
            addCriterion("maternal_id =", value, "maternalId");
            return (Criteria) this;
        }

        public Criteria andMaternalIdNotEqualTo(Integer value) {
            addCriterion("maternal_id <>", value, "maternalId");
            return (Criteria) this;
        }

        public Criteria andMaternalIdGreaterThan(Integer value) {
            addCriterion("maternal_id >", value, "maternalId");
            return (Criteria) this;
        }

        public Criteria andMaternalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("maternal_id >=", value, "maternalId");
            return (Criteria) this;
        }

        public Criteria andMaternalIdLessThan(Integer value) {
            addCriterion("maternal_id <", value, "maternalId");
            return (Criteria) this;
        }

        public Criteria andMaternalIdLessThanOrEqualTo(Integer value) {
            addCriterion("maternal_id <=", value, "maternalId");
            return (Criteria) this;
        }

        public Criteria andMaternalIdIn(List<Integer> values) {
            addCriterion("maternal_id in", values, "maternalId");
            return (Criteria) this;
        }

        public Criteria andMaternalIdNotIn(List<Integer> values) {
            addCriterion("maternal_id not in", values, "maternalId");
            return (Criteria) this;
        }

        public Criteria andMaternalIdBetween(Integer value1, Integer value2) {
            addCriterion("maternal_id between", value1, value2, "maternalId");
            return (Criteria) this;
        }

        public Criteria andMaternalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("maternal_id not between", value1, value2, "maternalId");
            return (Criteria) this;
        }

        public Criteria andMaternalNameIsNull() {
            addCriterion("maternal_name is null");
            return (Criteria) this;
        }

        public Criteria andMaternalNameIsNotNull() {
            addCriterion("maternal_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaternalNameEqualTo(String value) {
            addCriterion("maternal_name =", value, "maternalName");
            return (Criteria) this;
        }

        public Criteria andMaternalNameNotEqualTo(String value) {
            addCriterion("maternal_name <>", value, "maternalName");
            return (Criteria) this;
        }

        public Criteria andMaternalNameGreaterThan(String value) {
            addCriterion("maternal_name >", value, "maternalName");
            return (Criteria) this;
        }

        public Criteria andMaternalNameGreaterThanOrEqualTo(String value) {
            addCriterion("maternal_name >=", value, "maternalName");
            return (Criteria) this;
        }

        public Criteria andMaternalNameLessThan(String value) {
            addCriterion("maternal_name <", value, "maternalName");
            return (Criteria) this;
        }

        public Criteria andMaternalNameLessThanOrEqualTo(String value) {
            addCriterion("maternal_name <=", value, "maternalName");
            return (Criteria) this;
        }

        public Criteria andMaternalNameLike(String value) {
            addCriterion("maternal_name like", value, "maternalName");
            return (Criteria) this;
        }

        public Criteria andMaternalNameNotLike(String value) {
            addCriterion("maternal_name not like", value, "maternalName");
            return (Criteria) this;
        }

        public Criteria andMaternalNameIn(List<String> values) {
            addCriterion("maternal_name in", values, "maternalName");
            return (Criteria) this;
        }

        public Criteria andMaternalNameNotIn(List<String> values) {
            addCriterion("maternal_name not in", values, "maternalName");
            return (Criteria) this;
        }

        public Criteria andMaternalNameBetween(String value1, String value2) {
            addCriterion("maternal_name between", value1, value2, "maternalName");
            return (Criteria) this;
        }

        public Criteria andMaternalNameNotBetween(String value1, String value2) {
            addCriterion("maternal_name not between", value1, value2, "maternalName");
            return (Criteria) this;
        }

        public Criteria andMaternalAgeIsNull() {
            addCriterion("maternal_age is null");
            return (Criteria) this;
        }

        public Criteria andMaternalAgeIsNotNull() {
            addCriterion("maternal_age is not null");
            return (Criteria) this;
        }

        public Criteria andMaternalAgeEqualTo(Integer value) {
            addCriterion("maternal_age =", value, "maternalAge");
            return (Criteria) this;
        }

        public Criteria andMaternalAgeNotEqualTo(Integer value) {
            addCriterion("maternal_age <>", value, "maternalAge");
            return (Criteria) this;
        }

        public Criteria andMaternalAgeGreaterThan(Integer value) {
            addCriterion("maternal_age >", value, "maternalAge");
            return (Criteria) this;
        }

        public Criteria andMaternalAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("maternal_age >=", value, "maternalAge");
            return (Criteria) this;
        }

        public Criteria andMaternalAgeLessThan(Integer value) {
            addCriterion("maternal_age <", value, "maternalAge");
            return (Criteria) this;
        }

        public Criteria andMaternalAgeLessThanOrEqualTo(Integer value) {
            addCriterion("maternal_age <=", value, "maternalAge");
            return (Criteria) this;
        }

        public Criteria andMaternalAgeIn(List<Integer> values) {
            addCriterion("maternal_age in", values, "maternalAge");
            return (Criteria) this;
        }

        public Criteria andMaternalAgeNotIn(List<Integer> values) {
            addCriterion("maternal_age not in", values, "maternalAge");
            return (Criteria) this;
        }

        public Criteria andMaternalAgeBetween(Integer value1, Integer value2) {
            addCriterion("maternal_age between", value1, value2, "maternalAge");
            return (Criteria) this;
        }

        public Criteria andMaternalAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("maternal_age not between", value1, value2, "maternalAge");
            return (Criteria) this;
        }

        public Criteria andMaternalNicknameIsNull() {
            addCriterion("maternal_nickname is null");
            return (Criteria) this;
        }

        public Criteria andMaternalNicknameIsNotNull() {
            addCriterion("maternal_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andMaternalNicknameEqualTo(String value) {
            addCriterion("maternal_nickname =", value, "maternalNickname");
            return (Criteria) this;
        }

        public Criteria andMaternalNicknameNotEqualTo(String value) {
            addCriterion("maternal_nickname <>", value, "maternalNickname");
            return (Criteria) this;
        }

        public Criteria andMaternalNicknameGreaterThan(String value) {
            addCriterion("maternal_nickname >", value, "maternalNickname");
            return (Criteria) this;
        }

        public Criteria andMaternalNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("maternal_nickname >=", value, "maternalNickname");
            return (Criteria) this;
        }

        public Criteria andMaternalNicknameLessThan(String value) {
            addCriterion("maternal_nickname <", value, "maternalNickname");
            return (Criteria) this;
        }

        public Criteria andMaternalNicknameLessThanOrEqualTo(String value) {
            addCriterion("maternal_nickname <=", value, "maternalNickname");
            return (Criteria) this;
        }

        public Criteria andMaternalNicknameLike(String value) {
            addCriterion("maternal_nickname like", value, "maternalNickname");
            return (Criteria) this;
        }

        public Criteria andMaternalNicknameNotLike(String value) {
            addCriterion("maternal_nickname not like", value, "maternalNickname");
            return (Criteria) this;
        }

        public Criteria andMaternalNicknameIn(List<String> values) {
            addCriterion("maternal_nickname in", values, "maternalNickname");
            return (Criteria) this;
        }

        public Criteria andMaternalNicknameNotIn(List<String> values) {
            addCriterion("maternal_nickname not in", values, "maternalNickname");
            return (Criteria) this;
        }

        public Criteria andMaternalNicknameBetween(String value1, String value2) {
            addCriterion("maternal_nickname between", value1, value2, "maternalNickname");
            return (Criteria) this;
        }

        public Criteria andMaternalNicknameNotBetween(String value1, String value2) {
            addCriterion("maternal_nickname not between", value1, value2, "maternalNickname");
            return (Criteria) this;
        }

        public Criteria andMaternalPwdIsNull() {
            addCriterion("maternal_pwd is null");
            return (Criteria) this;
        }

        public Criteria andMaternalPwdIsNotNull() {
            addCriterion("maternal_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andMaternalPwdEqualTo(String value) {
            addCriterion("maternal_pwd =", value, "maternalPwd");
            return (Criteria) this;
        }

        public Criteria andMaternalPwdNotEqualTo(String value) {
            addCriterion("maternal_pwd <>", value, "maternalPwd");
            return (Criteria) this;
        }

        public Criteria andMaternalPwdGreaterThan(String value) {
            addCriterion("maternal_pwd >", value, "maternalPwd");
            return (Criteria) this;
        }

        public Criteria andMaternalPwdGreaterThanOrEqualTo(String value) {
            addCriterion("maternal_pwd >=", value, "maternalPwd");
            return (Criteria) this;
        }

        public Criteria andMaternalPwdLessThan(String value) {
            addCriterion("maternal_pwd <", value, "maternalPwd");
            return (Criteria) this;
        }

        public Criteria andMaternalPwdLessThanOrEqualTo(String value) {
            addCriterion("maternal_pwd <=", value, "maternalPwd");
            return (Criteria) this;
        }

        public Criteria andMaternalPwdLike(String value) {
            addCriterion("maternal_pwd like", value, "maternalPwd");
            return (Criteria) this;
        }

        public Criteria andMaternalPwdNotLike(String value) {
            addCriterion("maternal_pwd not like", value, "maternalPwd");
            return (Criteria) this;
        }

        public Criteria andMaternalPwdIn(List<String> values) {
            addCriterion("maternal_pwd in", values, "maternalPwd");
            return (Criteria) this;
        }

        public Criteria andMaternalPwdNotIn(List<String> values) {
            addCriterion("maternal_pwd not in", values, "maternalPwd");
            return (Criteria) this;
        }

        public Criteria andMaternalPwdBetween(String value1, String value2) {
            addCriterion("maternal_pwd between", value1, value2, "maternalPwd");
            return (Criteria) this;
        }

        public Criteria andMaternalPwdNotBetween(String value1, String value2) {
            addCriterion("maternal_pwd not between", value1, value2, "maternalPwd");
            return (Criteria) this;
        }

        public Criteria andMaternalTelIsNull() {
            addCriterion("maternal_tel is null");
            return (Criteria) this;
        }

        public Criteria andMaternalTelIsNotNull() {
            addCriterion("maternal_tel is not null");
            return (Criteria) this;
        }

        public Criteria andMaternalTelEqualTo(String value) {
            addCriterion("maternal_tel =", value, "maternalTel");
            return (Criteria) this;
        }

        public Criteria andMaternalTelNotEqualTo(String value) {
            addCriterion("maternal_tel <>", value, "maternalTel");
            return (Criteria) this;
        }

        public Criteria andMaternalTelGreaterThan(String value) {
            addCriterion("maternal_tel >", value, "maternalTel");
            return (Criteria) this;
        }

        public Criteria andMaternalTelGreaterThanOrEqualTo(String value) {
            addCriterion("maternal_tel >=", value, "maternalTel");
            return (Criteria) this;
        }

        public Criteria andMaternalTelLessThan(String value) {
            addCriterion("maternal_tel <", value, "maternalTel");
            return (Criteria) this;
        }

        public Criteria andMaternalTelLessThanOrEqualTo(String value) {
            addCriterion("maternal_tel <=", value, "maternalTel");
            return (Criteria) this;
        }

        public Criteria andMaternalTelLike(String value) {
            addCriterion("maternal_tel like", value, "maternalTel");
            return (Criteria) this;
        }

        public Criteria andMaternalTelNotLike(String value) {
            addCriterion("maternal_tel not like", value, "maternalTel");
            return (Criteria) this;
        }

        public Criteria andMaternalTelIn(List<String> values) {
            addCriterion("maternal_tel in", values, "maternalTel");
            return (Criteria) this;
        }

        public Criteria andMaternalTelNotIn(List<String> values) {
            addCriterion("maternal_tel not in", values, "maternalTel");
            return (Criteria) this;
        }

        public Criteria andMaternalTelBetween(String value1, String value2) {
            addCriterion("maternal_tel between", value1, value2, "maternalTel");
            return (Criteria) this;
        }

        public Criteria andMaternalTelNotBetween(String value1, String value2) {
            addCriterion("maternal_tel not between", value1, value2, "maternalTel");
            return (Criteria) this;
        }

        public Criteria andMaternalStatusIsNull() {
            addCriterion("maternal_status is null");
            return (Criteria) this;
        }

        public Criteria andMaternalStatusIsNotNull() {
            addCriterion("maternal_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaternalStatusEqualTo(Integer value) {
            addCriterion("maternal_status =", value, "maternalStatus");
            return (Criteria) this;
        }

        public Criteria andMaternalStatusNotEqualTo(Integer value) {
            addCriterion("maternal_status <>", value, "maternalStatus");
            return (Criteria) this;
        }

        public Criteria andMaternalStatusGreaterThan(Integer value) {
            addCriterion("maternal_status >", value, "maternalStatus");
            return (Criteria) this;
        }

        public Criteria andMaternalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("maternal_status >=", value, "maternalStatus");
            return (Criteria) this;
        }

        public Criteria andMaternalStatusLessThan(Integer value) {
            addCriterion("maternal_status <", value, "maternalStatus");
            return (Criteria) this;
        }

        public Criteria andMaternalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("maternal_status <=", value, "maternalStatus");
            return (Criteria) this;
        }

        public Criteria andMaternalStatusIn(List<Integer> values) {
            addCriterion("maternal_status in", values, "maternalStatus");
            return (Criteria) this;
        }

        public Criteria andMaternalStatusNotIn(List<Integer> values) {
            addCriterion("maternal_status not in", values, "maternalStatus");
            return (Criteria) this;
        }

        public Criteria andMaternalStatusBetween(Integer value1, Integer value2) {
            addCriterion("maternal_status between", value1, value2, "maternalStatus");
            return (Criteria) this;
        }

        public Criteria andMaternalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("maternal_status not between", value1, value2, "maternalStatus");
            return (Criteria) this;
        }

        public Criteria andMaternalEmailIsNull() {
            addCriterion("maternal_email is null");
            return (Criteria) this;
        }

        public Criteria andMaternalEmailIsNotNull() {
            addCriterion("maternal_email is not null");
            return (Criteria) this;
        }

        public Criteria andMaternalEmailEqualTo(String value) {
            addCriterion("maternal_email =", value, "maternalEmail");
            return (Criteria) this;
        }

        public Criteria andMaternalEmailNotEqualTo(String value) {
            addCriterion("maternal_email <>", value, "maternalEmail");
            return (Criteria) this;
        }

        public Criteria andMaternalEmailGreaterThan(String value) {
            addCriterion("maternal_email >", value, "maternalEmail");
            return (Criteria) this;
        }

        public Criteria andMaternalEmailGreaterThanOrEqualTo(String value) {
            addCriterion("maternal_email >=", value, "maternalEmail");
            return (Criteria) this;
        }

        public Criteria andMaternalEmailLessThan(String value) {
            addCriterion("maternal_email <", value, "maternalEmail");
            return (Criteria) this;
        }

        public Criteria andMaternalEmailLessThanOrEqualTo(String value) {
            addCriterion("maternal_email <=", value, "maternalEmail");
            return (Criteria) this;
        }

        public Criteria andMaternalEmailLike(String value) {
            addCriterion("maternal_email like", value, "maternalEmail");
            return (Criteria) this;
        }

        public Criteria andMaternalEmailNotLike(String value) {
            addCriterion("maternal_email not like", value, "maternalEmail");
            return (Criteria) this;
        }

        public Criteria andMaternalEmailIn(List<String> values) {
            addCriterion("maternal_email in", values, "maternalEmail");
            return (Criteria) this;
        }

        public Criteria andMaternalEmailNotIn(List<String> values) {
            addCriterion("maternal_email not in", values, "maternalEmail");
            return (Criteria) this;
        }

        public Criteria andMaternalEmailBetween(String value1, String value2) {
            addCriterion("maternal_email between", value1, value2, "maternalEmail");
            return (Criteria) this;
        }

        public Criteria andMaternalEmailNotBetween(String value1, String value2) {
            addCriterion("maternal_email not between", value1, value2, "maternalEmail");
            return (Criteria) this;
        }

        public Criteria andMaternalCityIsNull() {
            addCriterion("maternal_city is null");
            return (Criteria) this;
        }

        public Criteria andMaternalCityIsNotNull() {
            addCriterion("maternal_city is not null");
            return (Criteria) this;
        }

        public Criteria andMaternalCityEqualTo(String value) {
            addCriterion("maternal_city =", value, "maternalCity");
            return (Criteria) this;
        }

        public Criteria andMaternalCityNotEqualTo(String value) {
            addCriterion("maternal_city <>", value, "maternalCity");
            return (Criteria) this;
        }

        public Criteria andMaternalCityGreaterThan(String value) {
            addCriterion("maternal_city >", value, "maternalCity");
            return (Criteria) this;
        }

        public Criteria andMaternalCityGreaterThanOrEqualTo(String value) {
            addCriterion("maternal_city >=", value, "maternalCity");
            return (Criteria) this;
        }

        public Criteria andMaternalCityLessThan(String value) {
            addCriterion("maternal_city <", value, "maternalCity");
            return (Criteria) this;
        }

        public Criteria andMaternalCityLessThanOrEqualTo(String value) {
            addCriterion("maternal_city <=", value, "maternalCity");
            return (Criteria) this;
        }

        public Criteria andMaternalCityLike(String value) {
            addCriterion("maternal_city like", value, "maternalCity");
            return (Criteria) this;
        }

        public Criteria andMaternalCityNotLike(String value) {
            addCriterion("maternal_city not like", value, "maternalCity");
            return (Criteria) this;
        }

        public Criteria andMaternalCityIn(List<String> values) {
            addCriterion("maternal_city in", values, "maternalCity");
            return (Criteria) this;
        }

        public Criteria andMaternalCityNotIn(List<String> values) {
            addCriterion("maternal_city not in", values, "maternalCity");
            return (Criteria) this;
        }

        public Criteria andMaternalCityBetween(String value1, String value2) {
            addCriterion("maternal_city between", value1, value2, "maternalCity");
            return (Criteria) this;
        }

        public Criteria andMaternalCityNotBetween(String value1, String value2) {
            addCriterion("maternal_city not between", value1, value2, "maternalCity");
            return (Criteria) this;
        }

        public Criteria andPregnantDateIsNull() {
            addCriterion("pregnant_date is null");
            return (Criteria) this;
        }

        public Criteria andPregnantDateIsNotNull() {
            addCriterion("pregnant_date is not null");
            return (Criteria) this;
        }

        public Criteria andPregnantDateEqualTo(Date value) {
            addCriterionForJDBCDate("pregnant_date =", value, "pregnantDate");
            return (Criteria) this;
        }

        public Criteria andPregnantDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pregnant_date <>", value, "pregnantDate");
            return (Criteria) this;
        }

        public Criteria andPregnantDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pregnant_date >", value, "pregnantDate");
            return (Criteria) this;
        }

        public Criteria andPregnantDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pregnant_date >=", value, "pregnantDate");
            return (Criteria) this;
        }

        public Criteria andPregnantDateLessThan(Date value) {
            addCriterionForJDBCDate("pregnant_date <", value, "pregnantDate");
            return (Criteria) this;
        }

        public Criteria andPregnantDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pregnant_date <=", value, "pregnantDate");
            return (Criteria) this;
        }

        public Criteria andPregnantDateIn(List<Date> values) {
            addCriterionForJDBCDate("pregnant_date in", values, "pregnantDate");
            return (Criteria) this;
        }

        public Criteria andPregnantDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pregnant_date not in", values, "pregnantDate");
            return (Criteria) this;
        }

        public Criteria andPregnantDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pregnant_date between", value1, value2, "pregnantDate");
            return (Criteria) this;
        }

        public Criteria andPregnantDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pregnant_date not between", value1, value2, "pregnantDate");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardIsNull() {
            addCriterion("maternal_idcard is null");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardIsNotNull() {
            addCriterion("maternal_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardEqualTo(String value) {
            addCriterion("maternal_idcard =", value, "maternalIdcard");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardNotEqualTo(String value) {
            addCriterion("maternal_idcard <>", value, "maternalIdcard");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardGreaterThan(String value) {
            addCriterion("maternal_idcard >", value, "maternalIdcard");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("maternal_idcard >=", value, "maternalIdcard");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardLessThan(String value) {
            addCriterion("maternal_idcard <", value, "maternalIdcard");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardLessThanOrEqualTo(String value) {
            addCriterion("maternal_idcard <=", value, "maternalIdcard");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardLike(String value) {
            addCriterion("maternal_idcard like", value, "maternalIdcard");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardNotLike(String value) {
            addCriterion("maternal_idcard not like", value, "maternalIdcard");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardIn(List<String> values) {
            addCriterion("maternal_idcard in", values, "maternalIdcard");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardNotIn(List<String> values) {
            addCriterion("maternal_idcard not in", values, "maternalIdcard");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardBetween(String value1, String value2) {
            addCriterion("maternal_idcard between", value1, value2, "maternalIdcard");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardNotBetween(String value1, String value2) {
            addCriterion("maternal_idcard not between", value1, value2, "maternalIdcard");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardTypeIsNull() {
            addCriterion("maternal_idcard_type is null");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardTypeIsNotNull() {
            addCriterion("maternal_idcard_type is not null");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardTypeEqualTo(Integer value) {
            addCriterion("maternal_idcard_type =", value, "maternalIdcardType");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardTypeNotEqualTo(Integer value) {
            addCriterion("maternal_idcard_type <>", value, "maternalIdcardType");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardTypeGreaterThan(Integer value) {
            addCriterion("maternal_idcard_type >", value, "maternalIdcardType");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("maternal_idcard_type >=", value, "maternalIdcardType");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardTypeLessThan(Integer value) {
            addCriterion("maternal_idcard_type <", value, "maternalIdcardType");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("maternal_idcard_type <=", value, "maternalIdcardType");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardTypeIn(List<Integer> values) {
            addCriterion("maternal_idcard_type in", values, "maternalIdcardType");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardTypeNotIn(List<Integer> values) {
            addCriterion("maternal_idcard_type not in", values, "maternalIdcardType");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardTypeBetween(Integer value1, Integer value2) {
            addCriterion("maternal_idcard_type between", value1, value2, "maternalIdcardType");
            return (Criteria) this;
        }

        public Criteria andMaternalIdcardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("maternal_idcard_type not between", value1, value2, "maternalIdcardType");
            return (Criteria) this;
        }

        public Criteria andMaternalFollowIsNull() {
            addCriterion("maternal_follow is null");
            return (Criteria) this;
        }

        public Criteria andMaternalFollowIsNotNull() {
            addCriterion("maternal_follow is not null");
            return (Criteria) this;
        }

        public Criteria andMaternalFollowEqualTo(Integer value) {
            addCriterion("maternal_follow =", value, "maternalFollow");
            return (Criteria) this;
        }

        public Criteria andMaternalFollowNotEqualTo(Integer value) {
            addCriterion("maternal_follow <>", value, "maternalFollow");
            return (Criteria) this;
        }

        public Criteria andMaternalFollowGreaterThan(Integer value) {
            addCriterion("maternal_follow >", value, "maternalFollow");
            return (Criteria) this;
        }

        public Criteria andMaternalFollowGreaterThanOrEqualTo(Integer value) {
            addCriterion("maternal_follow >=", value, "maternalFollow");
            return (Criteria) this;
        }

        public Criteria andMaternalFollowLessThan(Integer value) {
            addCriterion("maternal_follow <", value, "maternalFollow");
            return (Criteria) this;
        }

        public Criteria andMaternalFollowLessThanOrEqualTo(Integer value) {
            addCriterion("maternal_follow <=", value, "maternalFollow");
            return (Criteria) this;
        }

        public Criteria andMaternalFollowIn(List<Integer> values) {
            addCriterion("maternal_follow in", values, "maternalFollow");
            return (Criteria) this;
        }

        public Criteria andMaternalFollowNotIn(List<Integer> values) {
            addCriterion("maternal_follow not in", values, "maternalFollow");
            return (Criteria) this;
        }

        public Criteria andMaternalFollowBetween(Integer value1, Integer value2) {
            addCriterion("maternal_follow between", value1, value2, "maternalFollow");
            return (Criteria) this;
        }

        public Criteria andMaternalFollowNotBetween(Integer value1, Integer value2) {
            addCriterion("maternal_follow not between", value1, value2, "maternalFollow");
            return (Criteria) this;
        }

        public Criteria andMaternalPregWeekIsNull() {
            addCriterion("maternal_preg_week is null");
            return (Criteria) this;
        }

        public Criteria andMaternalPregWeekIsNotNull() {
            addCriterion("maternal_preg_week is not null");
            return (Criteria) this;
        }

        public Criteria andMaternalPregWeekEqualTo(Integer value) {
            addCriterion("maternal_preg_week =", value, "maternalPregWeek");
            return (Criteria) this;
        }

        public Criteria andMaternalPregWeekNotEqualTo(Integer value) {
            addCriterion("maternal_preg_week <>", value, "maternalPregWeek");
            return (Criteria) this;
        }

        public Criteria andMaternalPregWeekGreaterThan(Integer value) {
            addCriterion("maternal_preg_week >", value, "maternalPregWeek");
            return (Criteria) this;
        }

        public Criteria andMaternalPregWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("maternal_preg_week >=", value, "maternalPregWeek");
            return (Criteria) this;
        }

        public Criteria andMaternalPregWeekLessThan(Integer value) {
            addCriterion("maternal_preg_week <", value, "maternalPregWeek");
            return (Criteria) this;
        }

        public Criteria andMaternalPregWeekLessThanOrEqualTo(Integer value) {
            addCriterion("maternal_preg_week <=", value, "maternalPregWeek");
            return (Criteria) this;
        }

        public Criteria andMaternalPregWeekIn(List<Integer> values) {
            addCriterion("maternal_preg_week in", values, "maternalPregWeek");
            return (Criteria) this;
        }

        public Criteria andMaternalPregWeekNotIn(List<Integer> values) {
            addCriterion("maternal_preg_week not in", values, "maternalPregWeek");
            return (Criteria) this;
        }

        public Criteria andMaternalPregWeekBetween(Integer value1, Integer value2) {
            addCriterion("maternal_preg_week between", value1, value2, "maternalPregWeek");
            return (Criteria) this;
        }

        public Criteria andMaternalPregWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("maternal_preg_week not between", value1, value2, "maternalPregWeek");
            return (Criteria) this;
        }

        public Criteria andMaternalImgIsNull() {
            addCriterion("maternal_img is null");
            return (Criteria) this;
        }

        public Criteria andMaternalImgIsNotNull() {
            addCriterion("maternal_img is not null");
            return (Criteria) this;
        }

        public Criteria andMaternalImgEqualTo(String value) {
            addCriterion("maternal_img =", value, "maternalImg");
            return (Criteria) this;
        }

        public Criteria andMaternalImgNotEqualTo(String value) {
            addCriterion("maternal_img <>", value, "maternalImg");
            return (Criteria) this;
        }

        public Criteria andMaternalImgGreaterThan(String value) {
            addCriterion("maternal_img >", value, "maternalImg");
            return (Criteria) this;
        }

        public Criteria andMaternalImgGreaterThanOrEqualTo(String value) {
            addCriterion("maternal_img >=", value, "maternalImg");
            return (Criteria) this;
        }

        public Criteria andMaternalImgLessThan(String value) {
            addCriterion("maternal_img <", value, "maternalImg");
            return (Criteria) this;
        }

        public Criteria andMaternalImgLessThanOrEqualTo(String value) {
            addCriterion("maternal_img <=", value, "maternalImg");
            return (Criteria) this;
        }

        public Criteria andMaternalImgLike(String value) {
            addCriterion("maternal_img like", value, "maternalImg");
            return (Criteria) this;
        }

        public Criteria andMaternalImgNotLike(String value) {
            addCriterion("maternal_img not like", value, "maternalImg");
            return (Criteria) this;
        }

        public Criteria andMaternalImgIn(List<String> values) {
            addCriterion("maternal_img in", values, "maternalImg");
            return (Criteria) this;
        }

        public Criteria andMaternalImgNotIn(List<String> values) {
            addCriterion("maternal_img not in", values, "maternalImg");
            return (Criteria) this;
        }

        public Criteria andMaternalImgBetween(String value1, String value2) {
            addCriterion("maternal_img between", value1, value2, "maternalImg");
            return (Criteria) this;
        }

        public Criteria andMaternalImgNotBetween(String value1, String value2) {
            addCriterion("maternal_img not between", value1, value2, "maternalImg");
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