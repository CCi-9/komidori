package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.List;

public class NurseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NurseInfoExample() {
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

        public Criteria andNurseIdIsNull() {
            addCriterion("nurse_id is null");
            return (Criteria) this;
        }

        public Criteria andNurseIdIsNotNull() {
            addCriterion("nurse_id is not null");
            return (Criteria) this;
        }

        public Criteria andNurseIdEqualTo(Integer value) {
            addCriterion("nurse_id =", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdNotEqualTo(Integer value) {
            addCriterion("nurse_id <>", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdGreaterThan(Integer value) {
            addCriterion("nurse_id >", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nurse_id >=", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdLessThan(Integer value) {
            addCriterion("nurse_id <", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdLessThanOrEqualTo(Integer value) {
            addCriterion("nurse_id <=", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdIn(List<Integer> values) {
            addCriterion("nurse_id in", values, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdNotIn(List<Integer> values) {
            addCriterion("nurse_id not in", values, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdBetween(Integer value1, Integer value2) {
            addCriterion("nurse_id between", value1, value2, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("nurse_id not between", value1, value2, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseNameIsNull() {
            addCriterion("nurse_name is null");
            return (Criteria) this;
        }

        public Criteria andNurseNameIsNotNull() {
            addCriterion("nurse_name is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNameEqualTo(String value) {
            addCriterion("nurse_name =", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameNotEqualTo(String value) {
            addCriterion("nurse_name <>", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameGreaterThan(String value) {
            addCriterion("nurse_name >", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_name >=", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameLessThan(String value) {
            addCriterion("nurse_name <", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameLessThanOrEqualTo(String value) {
            addCriterion("nurse_name <=", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameLike(String value) {
            addCriterion("nurse_name like", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameNotLike(String value) {
            addCriterion("nurse_name not like", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameIn(List<String> values) {
            addCriterion("nurse_name in", values, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameNotIn(List<String> values) {
            addCriterion("nurse_name not in", values, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameBetween(String value1, String value2) {
            addCriterion("nurse_name between", value1, value2, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameNotBetween(String value1, String value2) {
            addCriterion("nurse_name not between", value1, value2, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseAgeIsNull() {
            addCriterion("nurse_age is null");
            return (Criteria) this;
        }

        public Criteria andNurseAgeIsNotNull() {
            addCriterion("nurse_age is not null");
            return (Criteria) this;
        }

        public Criteria andNurseAgeEqualTo(Integer value) {
            addCriterion("nurse_age =", value, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeNotEqualTo(Integer value) {
            addCriterion("nurse_age <>", value, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeGreaterThan(Integer value) {
            addCriterion("nurse_age >", value, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("nurse_age >=", value, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeLessThan(Integer value) {
            addCriterion("nurse_age <", value, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeLessThanOrEqualTo(Integer value) {
            addCriterion("nurse_age <=", value, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeIn(List<Integer> values) {
            addCriterion("nurse_age in", values, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeNotIn(List<Integer> values) {
            addCriterion("nurse_age not in", values, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeBetween(Integer value1, Integer value2) {
            addCriterion("nurse_age between", value1, value2, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("nurse_age not between", value1, value2, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseTelIsNull() {
            addCriterion("nurse_tel is null");
            return (Criteria) this;
        }

        public Criteria andNurseTelIsNotNull() {
            addCriterion("nurse_tel is not null");
            return (Criteria) this;
        }

        public Criteria andNurseTelEqualTo(String value) {
            addCriterion("nurse_tel =", value, "nurseTel");
            return (Criteria) this;
        }

        public Criteria andNurseTelNotEqualTo(String value) {
            addCriterion("nurse_tel <>", value, "nurseTel");
            return (Criteria) this;
        }

        public Criteria andNurseTelGreaterThan(String value) {
            addCriterion("nurse_tel >", value, "nurseTel");
            return (Criteria) this;
        }

        public Criteria andNurseTelGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_tel >=", value, "nurseTel");
            return (Criteria) this;
        }

        public Criteria andNurseTelLessThan(String value) {
            addCriterion("nurse_tel <", value, "nurseTel");
            return (Criteria) this;
        }

        public Criteria andNurseTelLessThanOrEqualTo(String value) {
            addCriterion("nurse_tel <=", value, "nurseTel");
            return (Criteria) this;
        }

        public Criteria andNurseTelLike(String value) {
            addCriterion("nurse_tel like", value, "nurseTel");
            return (Criteria) this;
        }

        public Criteria andNurseTelNotLike(String value) {
            addCriterion("nurse_tel not like", value, "nurseTel");
            return (Criteria) this;
        }

        public Criteria andNurseTelIn(List<String> values) {
            addCriterion("nurse_tel in", values, "nurseTel");
            return (Criteria) this;
        }

        public Criteria andNurseTelNotIn(List<String> values) {
            addCriterion("nurse_tel not in", values, "nurseTel");
            return (Criteria) this;
        }

        public Criteria andNurseTelBetween(String value1, String value2) {
            addCriterion("nurse_tel between", value1, value2, "nurseTel");
            return (Criteria) this;
        }

        public Criteria andNurseTelNotBetween(String value1, String value2) {
            addCriterion("nurse_tel not between", value1, value2, "nurseTel");
            return (Criteria) this;
        }

        public Criteria andNurseIdcardIsNull() {
            addCriterion("nurse_idcard is null");
            return (Criteria) this;
        }

        public Criteria andNurseIdcardIsNotNull() {
            addCriterion("nurse_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andNurseIdcardEqualTo(String value) {
            addCriterion("nurse_idcard =", value, "nurseIdcard");
            return (Criteria) this;
        }

        public Criteria andNurseIdcardNotEqualTo(String value) {
            addCriterion("nurse_idcard <>", value, "nurseIdcard");
            return (Criteria) this;
        }

        public Criteria andNurseIdcardGreaterThan(String value) {
            addCriterion("nurse_idcard >", value, "nurseIdcard");
            return (Criteria) this;
        }

        public Criteria andNurseIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_idcard >=", value, "nurseIdcard");
            return (Criteria) this;
        }

        public Criteria andNurseIdcardLessThan(String value) {
            addCriterion("nurse_idcard <", value, "nurseIdcard");
            return (Criteria) this;
        }

        public Criteria andNurseIdcardLessThanOrEqualTo(String value) {
            addCriterion("nurse_idcard <=", value, "nurseIdcard");
            return (Criteria) this;
        }

        public Criteria andNurseIdcardLike(String value) {
            addCriterion("nurse_idcard like", value, "nurseIdcard");
            return (Criteria) this;
        }

        public Criteria andNurseIdcardNotLike(String value) {
            addCriterion("nurse_idcard not like", value, "nurseIdcard");
            return (Criteria) this;
        }

        public Criteria andNurseIdcardIn(List<String> values) {
            addCriterion("nurse_idcard in", values, "nurseIdcard");
            return (Criteria) this;
        }

        public Criteria andNurseIdcardNotIn(List<String> values) {
            addCriterion("nurse_idcard not in", values, "nurseIdcard");
            return (Criteria) this;
        }

        public Criteria andNurseIdcardBetween(String value1, String value2) {
            addCriterion("nurse_idcard between", value1, value2, "nurseIdcard");
            return (Criteria) this;
        }

        public Criteria andNurseIdcardNotBetween(String value1, String value2) {
            addCriterion("nurse_idcard not between", value1, value2, "nurseIdcard");
            return (Criteria) this;
        }

        public Criteria andNurseCityIsNull() {
            addCriterion("nurse_city is null");
            return (Criteria) this;
        }

        public Criteria andNurseCityIsNotNull() {
            addCriterion("nurse_city is not null");
            return (Criteria) this;
        }

        public Criteria andNurseCityEqualTo(String value) {
            addCriterion("nurse_city =", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityNotEqualTo(String value) {
            addCriterion("nurse_city <>", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityGreaterThan(String value) {
            addCriterion("nurse_city >", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_city >=", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityLessThan(String value) {
            addCriterion("nurse_city <", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityLessThanOrEqualTo(String value) {
            addCriterion("nurse_city <=", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityLike(String value) {
            addCriterion("nurse_city like", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityNotLike(String value) {
            addCriterion("nurse_city not like", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityIn(List<String> values) {
            addCriterion("nurse_city in", values, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityNotIn(List<String> values) {
            addCriterion("nurse_city not in", values, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityBetween(String value1, String value2) {
            addCriterion("nurse_city between", value1, value2, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityNotBetween(String value1, String value2) {
            addCriterion("nurse_city not between", value1, value2, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseRaceIsNull() {
            addCriterion("nurse_race is null");
            return (Criteria) this;
        }

        public Criteria andNurseRaceIsNotNull() {
            addCriterion("nurse_race is not null");
            return (Criteria) this;
        }

        public Criteria andNurseRaceEqualTo(String value) {
            addCriterion("nurse_race =", value, "nurseRace");
            return (Criteria) this;
        }

        public Criteria andNurseRaceNotEqualTo(String value) {
            addCriterion("nurse_race <>", value, "nurseRace");
            return (Criteria) this;
        }

        public Criteria andNurseRaceGreaterThan(String value) {
            addCriterion("nurse_race >", value, "nurseRace");
            return (Criteria) this;
        }

        public Criteria andNurseRaceGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_race >=", value, "nurseRace");
            return (Criteria) this;
        }

        public Criteria andNurseRaceLessThan(String value) {
            addCriterion("nurse_race <", value, "nurseRace");
            return (Criteria) this;
        }

        public Criteria andNurseRaceLessThanOrEqualTo(String value) {
            addCriterion("nurse_race <=", value, "nurseRace");
            return (Criteria) this;
        }

        public Criteria andNurseRaceLike(String value) {
            addCriterion("nurse_race like", value, "nurseRace");
            return (Criteria) this;
        }

        public Criteria andNurseRaceNotLike(String value) {
            addCriterion("nurse_race not like", value, "nurseRace");
            return (Criteria) this;
        }

        public Criteria andNurseRaceIn(List<String> values) {
            addCriterion("nurse_race in", values, "nurseRace");
            return (Criteria) this;
        }

        public Criteria andNurseRaceNotIn(List<String> values) {
            addCriterion("nurse_race not in", values, "nurseRace");
            return (Criteria) this;
        }

        public Criteria andNurseRaceBetween(String value1, String value2) {
            addCriterion("nurse_race between", value1, value2, "nurseRace");
            return (Criteria) this;
        }

        public Criteria andNurseRaceNotBetween(String value1, String value2) {
            addCriterion("nurse_race not between", value1, value2, "nurseRace");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageIsNull() {
            addCriterion("nurse_language is null");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageIsNotNull() {
            addCriterion("nurse_language is not null");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageEqualTo(String value) {
            addCriterion("nurse_language =", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageNotEqualTo(String value) {
            addCriterion("nurse_language <>", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageGreaterThan(String value) {
            addCriterion("nurse_language >", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_language >=", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageLessThan(String value) {
            addCriterion("nurse_language <", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageLessThanOrEqualTo(String value) {
            addCriterion("nurse_language <=", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageLike(String value) {
            addCriterion("nurse_language like", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageNotLike(String value) {
            addCriterion("nurse_language not like", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageIn(List<String> values) {
            addCriterion("nurse_language in", values, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageNotIn(List<String> values) {
            addCriterion("nurse_language not in", values, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageBetween(String value1, String value2) {
            addCriterion("nurse_language between", value1, value2, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageNotBetween(String value1, String value2) {
            addCriterion("nurse_language not between", value1, value2, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseFollowIsNull() {
            addCriterion("nurse_follow is null");
            return (Criteria) this;
        }

        public Criteria andNurseFollowIsNotNull() {
            addCriterion("nurse_follow is not null");
            return (Criteria) this;
        }

        public Criteria andNurseFollowEqualTo(Integer value) {
            addCriterion("nurse_follow =", value, "nurseFollow");
            return (Criteria) this;
        }

        public Criteria andNurseFollowNotEqualTo(Integer value) {
            addCriterion("nurse_follow <>", value, "nurseFollow");
            return (Criteria) this;
        }

        public Criteria andNurseFollowGreaterThan(Integer value) {
            addCriterion("nurse_follow >", value, "nurseFollow");
            return (Criteria) this;
        }

        public Criteria andNurseFollowGreaterThanOrEqualTo(Integer value) {
            addCriterion("nurse_follow >=", value, "nurseFollow");
            return (Criteria) this;
        }

        public Criteria andNurseFollowLessThan(Integer value) {
            addCriterion("nurse_follow <", value, "nurseFollow");
            return (Criteria) this;
        }

        public Criteria andNurseFollowLessThanOrEqualTo(Integer value) {
            addCriterion("nurse_follow <=", value, "nurseFollow");
            return (Criteria) this;
        }

        public Criteria andNurseFollowIn(List<Integer> values) {
            addCriterion("nurse_follow in", values, "nurseFollow");
            return (Criteria) this;
        }

        public Criteria andNurseFollowNotIn(List<Integer> values) {
            addCriterion("nurse_follow not in", values, "nurseFollow");
            return (Criteria) this;
        }

        public Criteria andNurseFollowBetween(Integer value1, Integer value2) {
            addCriterion("nurse_follow between", value1, value2, "nurseFollow");
            return (Criteria) this;
        }

        public Criteria andNurseFollowNotBetween(Integer value1, Integer value2) {
            addCriterion("nurse_follow not between", value1, value2, "nurseFollow");
            return (Criteria) this;
        }

        public Criteria andNurseOrdersIsNull() {
            addCriterion("nurse_orders is null");
            return (Criteria) this;
        }

        public Criteria andNurseOrdersIsNotNull() {
            addCriterion("nurse_orders is not null");
            return (Criteria) this;
        }

        public Criteria andNurseOrdersEqualTo(Integer value) {
            addCriterion("nurse_orders =", value, "nurseOrders");
            return (Criteria) this;
        }

        public Criteria andNurseOrdersNotEqualTo(Integer value) {
            addCriterion("nurse_orders <>", value, "nurseOrders");
            return (Criteria) this;
        }

        public Criteria andNurseOrdersGreaterThan(Integer value) {
            addCriterion("nurse_orders >", value, "nurseOrders");
            return (Criteria) this;
        }

        public Criteria andNurseOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("nurse_orders >=", value, "nurseOrders");
            return (Criteria) this;
        }

        public Criteria andNurseOrdersLessThan(Integer value) {
            addCriterion("nurse_orders <", value, "nurseOrders");
            return (Criteria) this;
        }

        public Criteria andNurseOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("nurse_orders <=", value, "nurseOrders");
            return (Criteria) this;
        }

        public Criteria andNurseOrdersIn(List<Integer> values) {
            addCriterion("nurse_orders in", values, "nurseOrders");
            return (Criteria) this;
        }

        public Criteria andNurseOrdersNotIn(List<Integer> values) {
            addCriterion("nurse_orders not in", values, "nurseOrders");
            return (Criteria) this;
        }

        public Criteria andNurseOrdersBetween(Integer value1, Integer value2) {
            addCriterion("nurse_orders between", value1, value2, "nurseOrders");
            return (Criteria) this;
        }

        public Criteria andNurseOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("nurse_orders not between", value1, value2, "nurseOrders");
            return (Criteria) this;
        }

        public Criteria andNurseGoodReviewIsNull() {
            addCriterion("nurse_good_review is null");
            return (Criteria) this;
        }

        public Criteria andNurseGoodReviewIsNotNull() {
            addCriterion("nurse_good_review is not null");
            return (Criteria) this;
        }

        public Criteria andNurseGoodReviewEqualTo(Integer value) {
            addCriterion("nurse_good_review =", value, "nurseGoodReview");
            return (Criteria) this;
        }

        public Criteria andNurseGoodReviewNotEqualTo(Integer value) {
            addCriterion("nurse_good_review <>", value, "nurseGoodReview");
            return (Criteria) this;
        }

        public Criteria andNurseGoodReviewGreaterThan(Integer value) {
            addCriterion("nurse_good_review >", value, "nurseGoodReview");
            return (Criteria) this;
        }

        public Criteria andNurseGoodReviewGreaterThanOrEqualTo(Integer value) {
            addCriterion("nurse_good_review >=", value, "nurseGoodReview");
            return (Criteria) this;
        }

        public Criteria andNurseGoodReviewLessThan(Integer value) {
            addCriterion("nurse_good_review <", value, "nurseGoodReview");
            return (Criteria) this;
        }

        public Criteria andNurseGoodReviewLessThanOrEqualTo(Integer value) {
            addCriterion("nurse_good_review <=", value, "nurseGoodReview");
            return (Criteria) this;
        }

        public Criteria andNurseGoodReviewIn(List<Integer> values) {
            addCriterion("nurse_good_review in", values, "nurseGoodReview");
            return (Criteria) this;
        }

        public Criteria andNurseGoodReviewNotIn(List<Integer> values) {
            addCriterion("nurse_good_review not in", values, "nurseGoodReview");
            return (Criteria) this;
        }

        public Criteria andNurseGoodReviewBetween(Integer value1, Integer value2) {
            addCriterion("nurse_good_review between", value1, value2, "nurseGoodReview");
            return (Criteria) this;
        }

        public Criteria andNurseGoodReviewNotBetween(Integer value1, Integer value2) {
            addCriterion("nurse_good_review not between", value1, value2, "nurseGoodReview");
            return (Criteria) this;
        }

        public Criteria andNurseWorkAgeIsNull() {
            addCriterion("nurse_work_age is null");
            return (Criteria) this;
        }

        public Criteria andNurseWorkAgeIsNotNull() {
            addCriterion("nurse_work_age is not null");
            return (Criteria) this;
        }

        public Criteria andNurseWorkAgeEqualTo(Integer value) {
            addCriterion("nurse_work_age =", value, "nurseWorkAge");
            return (Criteria) this;
        }

        public Criteria andNurseWorkAgeNotEqualTo(Integer value) {
            addCriterion("nurse_work_age <>", value, "nurseWorkAge");
            return (Criteria) this;
        }

        public Criteria andNurseWorkAgeGreaterThan(Integer value) {
            addCriterion("nurse_work_age >", value, "nurseWorkAge");
            return (Criteria) this;
        }

        public Criteria andNurseWorkAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("nurse_work_age >=", value, "nurseWorkAge");
            return (Criteria) this;
        }

        public Criteria andNurseWorkAgeLessThan(Integer value) {
            addCriterion("nurse_work_age <", value, "nurseWorkAge");
            return (Criteria) this;
        }

        public Criteria andNurseWorkAgeLessThanOrEqualTo(Integer value) {
            addCriterion("nurse_work_age <=", value, "nurseWorkAge");
            return (Criteria) this;
        }

        public Criteria andNurseWorkAgeIn(List<Integer> values) {
            addCriterion("nurse_work_age in", values, "nurseWorkAge");
            return (Criteria) this;
        }

        public Criteria andNurseWorkAgeNotIn(List<Integer> values) {
            addCriterion("nurse_work_age not in", values, "nurseWorkAge");
            return (Criteria) this;
        }

        public Criteria andNurseWorkAgeBetween(Integer value1, Integer value2) {
            addCriterion("nurse_work_age between", value1, value2, "nurseWorkAge");
            return (Criteria) this;
        }

        public Criteria andNurseWorkAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("nurse_work_age not between", value1, value2, "nurseWorkAge");
            return (Criteria) this;
        }

        public Criteria andNurseEmailIsNull() {
            addCriterion("nurse_email is null");
            return (Criteria) this;
        }

        public Criteria andNurseEmailIsNotNull() {
            addCriterion("nurse_email is not null");
            return (Criteria) this;
        }

        public Criteria andNurseEmailEqualTo(String value) {
            addCriterion("nurse_email =", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailNotEqualTo(String value) {
            addCriterion("nurse_email <>", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailGreaterThan(String value) {
            addCriterion("nurse_email >", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_email >=", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailLessThan(String value) {
            addCriterion("nurse_email <", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailLessThanOrEqualTo(String value) {
            addCriterion("nurse_email <=", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailLike(String value) {
            addCriterion("nurse_email like", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailNotLike(String value) {
            addCriterion("nurse_email not like", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailIn(List<String> values) {
            addCriterion("nurse_email in", values, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailNotIn(List<String> values) {
            addCriterion("nurse_email not in", values, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailBetween(String value1, String value2) {
            addCriterion("nurse_email between", value1, value2, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailNotBetween(String value1, String value2) {
            addCriterion("nurse_email not between", value1, value2, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseImgIsNull() {
            addCriterion("nurse_img is null");
            return (Criteria) this;
        }

        public Criteria andNurseImgIsNotNull() {
            addCriterion("nurse_img is not null");
            return (Criteria) this;
        }

        public Criteria andNurseImgEqualTo(String value) {
            addCriterion("nurse_img =", value, "nurseImg");
            return (Criteria) this;
        }

        public Criteria andNurseImgNotEqualTo(String value) {
            addCriterion("nurse_img <>", value, "nurseImg");
            return (Criteria) this;
        }

        public Criteria andNurseImgGreaterThan(String value) {
            addCriterion("nurse_img >", value, "nurseImg");
            return (Criteria) this;
        }

        public Criteria andNurseImgGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_img >=", value, "nurseImg");
            return (Criteria) this;
        }

        public Criteria andNurseImgLessThan(String value) {
            addCriterion("nurse_img <", value, "nurseImg");
            return (Criteria) this;
        }

        public Criteria andNurseImgLessThanOrEqualTo(String value) {
            addCriterion("nurse_img <=", value, "nurseImg");
            return (Criteria) this;
        }

        public Criteria andNurseImgLike(String value) {
            addCriterion("nurse_img like", value, "nurseImg");
            return (Criteria) this;
        }

        public Criteria andNurseImgNotLike(String value) {
            addCriterion("nurse_img not like", value, "nurseImg");
            return (Criteria) this;
        }

        public Criteria andNurseImgIn(List<String> values) {
            addCriterion("nurse_img in", values, "nurseImg");
            return (Criteria) this;
        }

        public Criteria andNurseImgNotIn(List<String> values) {
            addCriterion("nurse_img not in", values, "nurseImg");
            return (Criteria) this;
        }

        public Criteria andNurseImgBetween(String value1, String value2) {
            addCriterion("nurse_img between", value1, value2, "nurseImg");
            return (Criteria) this;
        }

        public Criteria andNurseImgNotBetween(String value1, String value2) {
            addCriterion("nurse_img not between", value1, value2, "nurseImg");
            return (Criteria) this;
        }

        public Criteria andNurseIntroductionIsNull() {
            addCriterion("nurse_introduction is null");
            return (Criteria) this;
        }

        public Criteria andNurseIntroductionIsNotNull() {
            addCriterion("nurse_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andNurseIntroductionEqualTo(String value) {
            addCriterion("nurse_introduction =", value, "nurseIntroduction");
            return (Criteria) this;
        }

        public Criteria andNurseIntroductionNotEqualTo(String value) {
            addCriterion("nurse_introduction <>", value, "nurseIntroduction");
            return (Criteria) this;
        }

        public Criteria andNurseIntroductionGreaterThan(String value) {
            addCriterion("nurse_introduction >", value, "nurseIntroduction");
            return (Criteria) this;
        }

        public Criteria andNurseIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_introduction >=", value, "nurseIntroduction");
            return (Criteria) this;
        }

        public Criteria andNurseIntroductionLessThan(String value) {
            addCriterion("nurse_introduction <", value, "nurseIntroduction");
            return (Criteria) this;
        }

        public Criteria andNurseIntroductionLessThanOrEqualTo(String value) {
            addCriterion("nurse_introduction <=", value, "nurseIntroduction");
            return (Criteria) this;
        }

        public Criteria andNurseIntroductionLike(String value) {
            addCriterion("nurse_introduction like", value, "nurseIntroduction");
            return (Criteria) this;
        }

        public Criteria andNurseIntroductionNotLike(String value) {
            addCriterion("nurse_introduction not like", value, "nurseIntroduction");
            return (Criteria) this;
        }

        public Criteria andNurseIntroductionIn(List<String> values) {
            addCriterion("nurse_introduction in", values, "nurseIntroduction");
            return (Criteria) this;
        }

        public Criteria andNurseIntroductionNotIn(List<String> values) {
            addCriterion("nurse_introduction not in", values, "nurseIntroduction");
            return (Criteria) this;
        }

        public Criteria andNurseIntroductionBetween(String value1, String value2) {
            addCriterion("nurse_introduction between", value1, value2, "nurseIntroduction");
            return (Criteria) this;
        }

        public Criteria andNurseIntroductionNotBetween(String value1, String value2) {
            addCriterion("nurse_introduction not between", value1, value2, "nurseIntroduction");
            return (Criteria) this;
        }

        public Criteria andNurseNvqIsNull() {
            addCriterion("nurse_NVQ is null");
            return (Criteria) this;
        }

        public Criteria andNurseNvqIsNotNull() {
            addCriterion("nurse_NVQ is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNvqEqualTo(String value) {
            addCriterion("nurse_NVQ =", value, "nurseNvq");
            return (Criteria) this;
        }

        public Criteria andNurseNvqNotEqualTo(String value) {
            addCriterion("nurse_NVQ <>", value, "nurseNvq");
            return (Criteria) this;
        }

        public Criteria andNurseNvqGreaterThan(String value) {
            addCriterion("nurse_NVQ >", value, "nurseNvq");
            return (Criteria) this;
        }

        public Criteria andNurseNvqGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_NVQ >=", value, "nurseNvq");
            return (Criteria) this;
        }

        public Criteria andNurseNvqLessThan(String value) {
            addCriterion("nurse_NVQ <", value, "nurseNvq");
            return (Criteria) this;
        }

        public Criteria andNurseNvqLessThanOrEqualTo(String value) {
            addCriterion("nurse_NVQ <=", value, "nurseNvq");
            return (Criteria) this;
        }

        public Criteria andNurseNvqLike(String value) {
            addCriterion("nurse_NVQ like", value, "nurseNvq");
            return (Criteria) this;
        }

        public Criteria andNurseNvqNotLike(String value) {
            addCriterion("nurse_NVQ not like", value, "nurseNvq");
            return (Criteria) this;
        }

        public Criteria andNurseNvqIn(List<String> values) {
            addCriterion("nurse_NVQ in", values, "nurseNvq");
            return (Criteria) this;
        }

        public Criteria andNurseNvqNotIn(List<String> values) {
            addCriterion("nurse_NVQ not in", values, "nurseNvq");
            return (Criteria) this;
        }

        public Criteria andNurseNvqBetween(String value1, String value2) {
            addCriterion("nurse_NVQ between", value1, value2, "nurseNvq");
            return (Criteria) this;
        }

        public Criteria andNurseNvqNotBetween(String value1, String value2) {
            addCriterion("nurse_NVQ not between", value1, value2, "nurseNvq");
            return (Criteria) this;
        }

        public Criteria andNurseRankIsNull() {
            addCriterion("nurse_rank is null");
            return (Criteria) this;
        }

        public Criteria andNurseRankIsNotNull() {
            addCriterion("nurse_rank is not null");
            return (Criteria) this;
        }

        public Criteria andNurseRankEqualTo(Integer value) {
            addCriterion("nurse_rank =", value, "nurseRank");
            return (Criteria) this;
        }

        public Criteria andNurseRankNotEqualTo(Integer value) {
            addCriterion("nurse_rank <>", value, "nurseRank");
            return (Criteria) this;
        }

        public Criteria andNurseRankGreaterThan(Integer value) {
            addCriterion("nurse_rank >", value, "nurseRank");
            return (Criteria) this;
        }

        public Criteria andNurseRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("nurse_rank >=", value, "nurseRank");
            return (Criteria) this;
        }

        public Criteria andNurseRankLessThan(Integer value) {
            addCriterion("nurse_rank <", value, "nurseRank");
            return (Criteria) this;
        }

        public Criteria andNurseRankLessThanOrEqualTo(Integer value) {
            addCriterion("nurse_rank <=", value, "nurseRank");
            return (Criteria) this;
        }

        public Criteria andNurseRankIn(List<Integer> values) {
            addCriterion("nurse_rank in", values, "nurseRank");
            return (Criteria) this;
        }

        public Criteria andNurseRankNotIn(List<Integer> values) {
            addCriterion("nurse_rank not in", values, "nurseRank");
            return (Criteria) this;
        }

        public Criteria andNurseRankBetween(Integer value1, Integer value2) {
            addCriterion("nurse_rank between", value1, value2, "nurseRank");
            return (Criteria) this;
        }

        public Criteria andNurseRankNotBetween(Integer value1, Integer value2) {
            addCriterion("nurse_rank not between", value1, value2, "nurseRank");
            return (Criteria) this;
        }

        public Criteria andNursePriceIsNull() {
            addCriterion("nurse_price is null");
            return (Criteria) this;
        }

        public Criteria andNursePriceIsNotNull() {
            addCriterion("nurse_price is not null");
            return (Criteria) this;
        }

        public Criteria andNursePriceEqualTo(Float value) {
            addCriterion("nurse_price =", value, "nursePrice");
            return (Criteria) this;
        }

        public Criteria andNursePriceNotEqualTo(Float value) {
            addCriterion("nurse_price <>", value, "nursePrice");
            return (Criteria) this;
        }

        public Criteria andNursePriceGreaterThan(Float value) {
            addCriterion("nurse_price >", value, "nursePrice");
            return (Criteria) this;
        }

        public Criteria andNursePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("nurse_price >=", value, "nursePrice");
            return (Criteria) this;
        }

        public Criteria andNursePriceLessThan(Float value) {
            addCriterion("nurse_price <", value, "nursePrice");
            return (Criteria) this;
        }

        public Criteria andNursePriceLessThanOrEqualTo(Float value) {
            addCriterion("nurse_price <=", value, "nursePrice");
            return (Criteria) this;
        }

        public Criteria andNursePriceIn(List<Float> values) {
            addCriterion("nurse_price in", values, "nursePrice");
            return (Criteria) this;
        }

        public Criteria andNursePriceNotIn(List<Float> values) {
            addCriterion("nurse_price not in", values, "nursePrice");
            return (Criteria) this;
        }

        public Criteria andNursePriceBetween(Float value1, Float value2) {
            addCriterion("nurse_price between", value1, value2, "nursePrice");
            return (Criteria) this;
        }

        public Criteria andNursePriceNotBetween(Float value1, Float value2) {
            addCriterion("nurse_price not between", value1, value2, "nursePrice");
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