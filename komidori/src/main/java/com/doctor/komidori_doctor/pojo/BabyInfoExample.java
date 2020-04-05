package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BabyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BabyInfoExample() {
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

        public Criteria andBabyIdIsNull() {
            addCriterion("baby_id is null");
            return (Criteria) this;
        }

        public Criteria andBabyIdIsNotNull() {
            addCriterion("baby_id is not null");
            return (Criteria) this;
        }

        public Criteria andBabyIdEqualTo(Integer value) {
            addCriterion("baby_id =", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdNotEqualTo(Integer value) {
            addCriterion("baby_id <>", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdGreaterThan(Integer value) {
            addCriterion("baby_id >", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("baby_id >=", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdLessThan(Integer value) {
            addCriterion("baby_id <", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdLessThanOrEqualTo(Integer value) {
            addCriterion("baby_id <=", value, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdIn(List<Integer> values) {
            addCriterion("baby_id in", values, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdNotIn(List<Integer> values) {
            addCriterion("baby_id not in", values, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdBetween(Integer value1, Integer value2) {
            addCriterion("baby_id between", value1, value2, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("baby_id not between", value1, value2, "babyId");
            return (Criteria) this;
        }

        public Criteria andBabyNameIsNull() {
            addCriterion("baby_name is null");
            return (Criteria) this;
        }

        public Criteria andBabyNameIsNotNull() {
            addCriterion("baby_name is not null");
            return (Criteria) this;
        }

        public Criteria andBabyNameEqualTo(String value) {
            addCriterion("baby_name =", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameNotEqualTo(String value) {
            addCriterion("baby_name <>", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameGreaterThan(String value) {
            addCriterion("baby_name >", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameGreaterThanOrEqualTo(String value) {
            addCriterion("baby_name >=", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameLessThan(String value) {
            addCriterion("baby_name <", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameLessThanOrEqualTo(String value) {
            addCriterion("baby_name <=", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameLike(String value) {
            addCriterion("baby_name like", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameNotLike(String value) {
            addCriterion("baby_name not like", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameIn(List<String> values) {
            addCriterion("baby_name in", values, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameNotIn(List<String> values) {
            addCriterion("baby_name not in", values, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameBetween(String value1, String value2) {
            addCriterion("baby_name between", value1, value2, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameNotBetween(String value1, String value2) {
            addCriterion("baby_name not between", value1, value2, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyStatusIsNull() {
            addCriterion("baby_status is null");
            return (Criteria) this;
        }

        public Criteria andBabyStatusIsNotNull() {
            addCriterion("baby_status is not null");
            return (Criteria) this;
        }

        public Criteria andBabyStatusEqualTo(Integer value) {
            addCriterion("baby_status =", value, "babyStatus");
            return (Criteria) this;
        }

        public Criteria andBabyStatusNotEqualTo(Integer value) {
            addCriterion("baby_status <>", value, "babyStatus");
            return (Criteria) this;
        }

        public Criteria andBabyStatusGreaterThan(Integer value) {
            addCriterion("baby_status >", value, "babyStatus");
            return (Criteria) this;
        }

        public Criteria andBabyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("baby_status >=", value, "babyStatus");
            return (Criteria) this;
        }

        public Criteria andBabyStatusLessThan(Integer value) {
            addCriterion("baby_status <", value, "babyStatus");
            return (Criteria) this;
        }

        public Criteria andBabyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("baby_status <=", value, "babyStatus");
            return (Criteria) this;
        }

        public Criteria andBabyStatusIn(List<Integer> values) {
            addCriterion("baby_status in", values, "babyStatus");
            return (Criteria) this;
        }

        public Criteria andBabyStatusNotIn(List<Integer> values) {
            addCriterion("baby_status not in", values, "babyStatus");
            return (Criteria) this;
        }

        public Criteria andBabyStatusBetween(Integer value1, Integer value2) {
            addCriterion("baby_status between", value1, value2, "babyStatus");
            return (Criteria) this;
        }

        public Criteria andBabyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("baby_status not between", value1, value2, "babyStatus");
            return (Criteria) this;
        }

        public Criteria andBabyBirthIsNull() {
            addCriterion("baby_birth is null");
            return (Criteria) this;
        }

        public Criteria andBabyBirthIsNotNull() {
            addCriterion("baby_birth is not null");
            return (Criteria) this;
        }

        public Criteria andBabyBirthEqualTo(Date value) {
            addCriterionForJDBCDate("baby_birth =", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("baby_birth <>", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("baby_birth >", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("baby_birth >=", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthLessThan(Date value) {
            addCriterionForJDBCDate("baby_birth <", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("baby_birth <=", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthIn(List<Date> values) {
            addCriterionForJDBCDate("baby_birth in", values, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("baby_birth not in", values, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("baby_birth between", value1, value2, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("baby_birth not between", value1, value2, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabySexIsNull() {
            addCriterion("baby_sex is null");
            return (Criteria) this;
        }

        public Criteria andBabySexIsNotNull() {
            addCriterion("baby_sex is not null");
            return (Criteria) this;
        }

        public Criteria andBabySexEqualTo(String value) {
            addCriterion("baby_sex =", value, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexNotEqualTo(String value) {
            addCriterion("baby_sex <>", value, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexGreaterThan(String value) {
            addCriterion("baby_sex >", value, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexGreaterThanOrEqualTo(String value) {
            addCriterion("baby_sex >=", value, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexLessThan(String value) {
            addCriterion("baby_sex <", value, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexLessThanOrEqualTo(String value) {
            addCriterion("baby_sex <=", value, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexLike(String value) {
            addCriterion("baby_sex like", value, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexNotLike(String value) {
            addCriterion("baby_sex not like", value, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexIn(List<String> values) {
            addCriterion("baby_sex in", values, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexNotIn(List<String> values) {
            addCriterion("baby_sex not in", values, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexBetween(String value1, String value2) {
            addCriterion("baby_sex between", value1, value2, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabySexNotBetween(String value1, String value2) {
            addCriterion("baby_sex not between", value1, value2, "babySex");
            return (Criteria) this;
        }

        public Criteria andBabyAgeIsNull() {
            addCriterion("baby_age is null");
            return (Criteria) this;
        }

        public Criteria andBabyAgeIsNotNull() {
            addCriterion("baby_age is not null");
            return (Criteria) this;
        }

        public Criteria andBabyAgeEqualTo(String value) {
            addCriterion("baby_age =", value, "babyAge");
            return (Criteria) this;
        }

        public Criteria andBabyAgeNotEqualTo(String value) {
            addCriterion("baby_age <>", value, "babyAge");
            return (Criteria) this;
        }

        public Criteria andBabyAgeGreaterThan(String value) {
            addCriterion("baby_age >", value, "babyAge");
            return (Criteria) this;
        }

        public Criteria andBabyAgeGreaterThanOrEqualTo(String value) {
            addCriterion("baby_age >=", value, "babyAge");
            return (Criteria) this;
        }

        public Criteria andBabyAgeLessThan(String value) {
            addCriterion("baby_age <", value, "babyAge");
            return (Criteria) this;
        }

        public Criteria andBabyAgeLessThanOrEqualTo(String value) {
            addCriterion("baby_age <=", value, "babyAge");
            return (Criteria) this;
        }

        public Criteria andBabyAgeLike(String value) {
            addCriterion("baby_age like", value, "babyAge");
            return (Criteria) this;
        }

        public Criteria andBabyAgeNotLike(String value) {
            addCriterion("baby_age not like", value, "babyAge");
            return (Criteria) this;
        }

        public Criteria andBabyAgeIn(List<String> values) {
            addCriterion("baby_age in", values, "babyAge");
            return (Criteria) this;
        }

        public Criteria andBabyAgeNotIn(List<String> values) {
            addCriterion("baby_age not in", values, "babyAge");
            return (Criteria) this;
        }

        public Criteria andBabyAgeBetween(String value1, String value2) {
            addCriterion("baby_age between", value1, value2, "babyAge");
            return (Criteria) this;
        }

        public Criteria andBabyAgeNotBetween(String value1, String value2) {
            addCriterion("baby_age not between", value1, value2, "babyAge");
            return (Criteria) this;
        }

        public Criteria andBabyCityIsNull() {
            addCriterion("baby_city is null");
            return (Criteria) this;
        }

        public Criteria andBabyCityIsNotNull() {
            addCriterion("baby_city is not null");
            return (Criteria) this;
        }

        public Criteria andBabyCityEqualTo(String value) {
            addCriterion("baby_city =", value, "babyCity");
            return (Criteria) this;
        }

        public Criteria andBabyCityNotEqualTo(String value) {
            addCriterion("baby_city <>", value, "babyCity");
            return (Criteria) this;
        }

        public Criteria andBabyCityGreaterThan(String value) {
            addCriterion("baby_city >", value, "babyCity");
            return (Criteria) this;
        }

        public Criteria andBabyCityGreaterThanOrEqualTo(String value) {
            addCriterion("baby_city >=", value, "babyCity");
            return (Criteria) this;
        }

        public Criteria andBabyCityLessThan(String value) {
            addCriterion("baby_city <", value, "babyCity");
            return (Criteria) this;
        }

        public Criteria andBabyCityLessThanOrEqualTo(String value) {
            addCriterion("baby_city <=", value, "babyCity");
            return (Criteria) this;
        }

        public Criteria andBabyCityLike(String value) {
            addCriterion("baby_city like", value, "babyCity");
            return (Criteria) this;
        }

        public Criteria andBabyCityNotLike(String value) {
            addCriterion("baby_city not like", value, "babyCity");
            return (Criteria) this;
        }

        public Criteria andBabyCityIn(List<String> values) {
            addCriterion("baby_city in", values, "babyCity");
            return (Criteria) this;
        }

        public Criteria andBabyCityNotIn(List<String> values) {
            addCriterion("baby_city not in", values, "babyCity");
            return (Criteria) this;
        }

        public Criteria andBabyCityBetween(String value1, String value2) {
            addCriterion("baby_city between", value1, value2, "babyCity");
            return (Criteria) this;
        }

        public Criteria andBabyCityNotBetween(String value1, String value2) {
            addCriterion("baby_city not between", value1, value2, "babyCity");
            return (Criteria) this;
        }

        public Criteria andBabyImgIsNull() {
            addCriterion("baby_img is null");
            return (Criteria) this;
        }

        public Criteria andBabyImgIsNotNull() {
            addCriterion("baby_img is not null");
            return (Criteria) this;
        }

        public Criteria andBabyImgEqualTo(String value) {
            addCriterion("baby_img =", value, "babyImg");
            return (Criteria) this;
        }

        public Criteria andBabyImgNotEqualTo(String value) {
            addCriterion("baby_img <>", value, "babyImg");
            return (Criteria) this;
        }

        public Criteria andBabyImgGreaterThan(String value) {
            addCriterion("baby_img >", value, "babyImg");
            return (Criteria) this;
        }

        public Criteria andBabyImgGreaterThanOrEqualTo(String value) {
            addCriterion("baby_img >=", value, "babyImg");
            return (Criteria) this;
        }

        public Criteria andBabyImgLessThan(String value) {
            addCriterion("baby_img <", value, "babyImg");
            return (Criteria) this;
        }

        public Criteria andBabyImgLessThanOrEqualTo(String value) {
            addCriterion("baby_img <=", value, "babyImg");
            return (Criteria) this;
        }

        public Criteria andBabyImgLike(String value) {
            addCriterion("baby_img like", value, "babyImg");
            return (Criteria) this;
        }

        public Criteria andBabyImgNotLike(String value) {
            addCriterion("baby_img not like", value, "babyImg");
            return (Criteria) this;
        }

        public Criteria andBabyImgIn(List<String> values) {
            addCriterion("baby_img in", values, "babyImg");
            return (Criteria) this;
        }

        public Criteria andBabyImgNotIn(List<String> values) {
            addCriterion("baby_img not in", values, "babyImg");
            return (Criteria) this;
        }

        public Criteria andBabyImgBetween(String value1, String value2) {
            addCriterion("baby_img between", value1, value2, "babyImg");
            return (Criteria) this;
        }

        public Criteria andBabyImgNotBetween(String value1, String value2) {
            addCriterion("baby_img not between", value1, value2, "babyImg");
            return (Criteria) this;
        }

        public Criteria andBabyMomIdIsNull() {
            addCriterion("baby_mom_id is null");
            return (Criteria) this;
        }

        public Criteria andBabyMomIdIsNotNull() {
            addCriterion("baby_mom_id is not null");
            return (Criteria) this;
        }

        public Criteria andBabyMomIdEqualTo(Integer value) {
            addCriterion("baby_mom_id =", value, "babyMomId");
            return (Criteria) this;
        }

        public Criteria andBabyMomIdNotEqualTo(Integer value) {
            addCriterion("baby_mom_id <>", value, "babyMomId");
            return (Criteria) this;
        }

        public Criteria andBabyMomIdGreaterThan(Integer value) {
            addCriterion("baby_mom_id >", value, "babyMomId");
            return (Criteria) this;
        }

        public Criteria andBabyMomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("baby_mom_id >=", value, "babyMomId");
            return (Criteria) this;
        }

        public Criteria andBabyMomIdLessThan(Integer value) {
            addCriterion("baby_mom_id <", value, "babyMomId");
            return (Criteria) this;
        }

        public Criteria andBabyMomIdLessThanOrEqualTo(Integer value) {
            addCriterion("baby_mom_id <=", value, "babyMomId");
            return (Criteria) this;
        }

        public Criteria andBabyMomIdIn(List<Integer> values) {
            addCriterion("baby_mom_id in", values, "babyMomId");
            return (Criteria) this;
        }

        public Criteria andBabyMomIdNotIn(List<Integer> values) {
            addCriterion("baby_mom_id not in", values, "babyMomId");
            return (Criteria) this;
        }

        public Criteria andBabyMomIdBetween(Integer value1, Integer value2) {
            addCriterion("baby_mom_id between", value1, value2, "babyMomId");
            return (Criteria) this;
        }

        public Criteria andBabyMomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("baby_mom_id not between", value1, value2, "babyMomId");
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