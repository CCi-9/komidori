package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmailInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmailInfoExample() {
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

        public Criteria andEmailIdIsNull() {
            addCriterion("email_id is null");
            return (Criteria) this;
        }

        public Criteria andEmailIdIsNotNull() {
            addCriterion("email_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmailIdEqualTo(Integer value) {
            addCriterion("email_id =", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotEqualTo(Integer value) {
            addCriterion("email_id <>", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThan(Integer value) {
            addCriterion("email_id >", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_id >=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThan(Integer value) {
            addCriterion("email_id <", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThanOrEqualTo(Integer value) {
            addCriterion("email_id <=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdIn(List<Integer> values) {
            addCriterion("email_id in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotIn(List<Integer> values) {
            addCriterion("email_id not in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdBetween(Integer value1, Integer value2) {
            addCriterion("email_id between", value1, value2, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("email_id not between", value1, value2, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailTitleIsNull() {
            addCriterion("email_title is null");
            return (Criteria) this;
        }

        public Criteria andEmailTitleIsNotNull() {
            addCriterion("email_title is not null");
            return (Criteria) this;
        }

        public Criteria andEmailTitleEqualTo(String value) {
            addCriterion("email_title =", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotEqualTo(String value) {
            addCriterion("email_title <>", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleGreaterThan(String value) {
            addCriterion("email_title >", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleGreaterThanOrEqualTo(String value) {
            addCriterion("email_title >=", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleLessThan(String value) {
            addCriterion("email_title <", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleLessThanOrEqualTo(String value) {
            addCriterion("email_title <=", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleLike(String value) {
            addCriterion("email_title like", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotLike(String value) {
            addCriterion("email_title not like", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleIn(List<String> values) {
            addCriterion("email_title in", values, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotIn(List<String> values) {
            addCriterion("email_title not in", values, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleBetween(String value1, String value2) {
            addCriterion("email_title between", value1, value2, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotBetween(String value1, String value2) {
            addCriterion("email_title not between", value1, value2, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdIsNull() {
            addCriterion("email_from_id is null");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdIsNotNull() {
            addCriterion("email_from_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdEqualTo(Integer value) {
            addCriterion("email_from_id =", value, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdNotEqualTo(Integer value) {
            addCriterion("email_from_id <>", value, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdGreaterThan(Integer value) {
            addCriterion("email_from_id >", value, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_from_id >=", value, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdLessThan(Integer value) {
            addCriterion("email_from_id <", value, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdLessThanOrEqualTo(Integer value) {
            addCriterion("email_from_id <=", value, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdIn(List<Integer> values) {
            addCriterion("email_from_id in", values, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdNotIn(List<Integer> values) {
            addCriterion("email_from_id not in", values, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdBetween(Integer value1, Integer value2) {
            addCriterion("email_from_id between", value1, value2, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdNotBetween(Integer value1, Integer value2) {
            addCriterion("email_from_id not between", value1, value2, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailToIdIsNull() {
            addCriterion("email_to_id is null");
            return (Criteria) this;
        }

        public Criteria andEmailToIdIsNotNull() {
            addCriterion("email_to_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmailToIdEqualTo(Integer value) {
            addCriterion("email_to_id =", value, "emailToId");
            return (Criteria) this;
        }

        public Criteria andEmailToIdNotEqualTo(Integer value) {
            addCriterion("email_to_id <>", value, "emailToId");
            return (Criteria) this;
        }

        public Criteria andEmailToIdGreaterThan(Integer value) {
            addCriterion("email_to_id >", value, "emailToId");
            return (Criteria) this;
        }

        public Criteria andEmailToIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_to_id >=", value, "emailToId");
            return (Criteria) this;
        }

        public Criteria andEmailToIdLessThan(Integer value) {
            addCriterion("email_to_id <", value, "emailToId");
            return (Criteria) this;
        }

        public Criteria andEmailToIdLessThanOrEqualTo(Integer value) {
            addCriterion("email_to_id <=", value, "emailToId");
            return (Criteria) this;
        }

        public Criteria andEmailToIdIn(List<Integer> values) {
            addCriterion("email_to_id in", values, "emailToId");
            return (Criteria) this;
        }

        public Criteria andEmailToIdNotIn(List<Integer> values) {
            addCriterion("email_to_id not in", values, "emailToId");
            return (Criteria) this;
        }

        public Criteria andEmailToIdBetween(Integer value1, Integer value2) {
            addCriterion("email_to_id between", value1, value2, "emailToId");
            return (Criteria) this;
        }

        public Criteria andEmailToIdNotBetween(Integer value1, Integer value2) {
            addCriterion("email_to_id not between", value1, value2, "emailToId");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIsNull() {
            addCriterion("email_status is null");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIsNotNull() {
            addCriterion("email_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmailStatusEqualTo(Integer value) {
            addCriterion("email_status =", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotEqualTo(Integer value) {
            addCriterion("email_status <>", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusGreaterThan(Integer value) {
            addCriterion("email_status >", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_status >=", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLessThan(Integer value) {
            addCriterion("email_status <", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLessThanOrEqualTo(Integer value) {
            addCriterion("email_status <=", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIn(List<Integer> values) {
            addCriterion("email_status in", values, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotIn(List<Integer> values) {
            addCriterion("email_status not in", values, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusBetween(Integer value1, Integer value2) {
            addCriterion("email_status between", value1, value2, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("email_status not between", value1, value2, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailDateIsNull() {
            addCriterion("email_date is null");
            return (Criteria) this;
        }

        public Criteria andEmailDateIsNotNull() {
            addCriterion("email_date is not null");
            return (Criteria) this;
        }

        public Criteria andEmailDateEqualTo(Date value) {
            addCriterion("email_date =", value, "emailDate");
            return (Criteria) this;
        }

        public Criteria andEmailDateNotEqualTo(Date value) {
            addCriterion("email_date <>", value, "emailDate");
            return (Criteria) this;
        }

        public Criteria andEmailDateGreaterThan(Date value) {
            addCriterion("email_date >", value, "emailDate");
            return (Criteria) this;
        }

        public Criteria andEmailDateGreaterThanOrEqualTo(Date value) {
            addCriterion("email_date >=", value, "emailDate");
            return (Criteria) this;
        }

        public Criteria andEmailDateLessThan(Date value) {
            addCriterion("email_date <", value, "emailDate");
            return (Criteria) this;
        }

        public Criteria andEmailDateLessThanOrEqualTo(Date value) {
            addCriterion("email_date <=", value, "emailDate");
            return (Criteria) this;
        }

        public Criteria andEmailDateIn(List<Date> values) {
            addCriterion("email_date in", values, "emailDate");
            return (Criteria) this;
        }

        public Criteria andEmailDateNotIn(List<Date> values) {
            addCriterion("email_date not in", values, "emailDate");
            return (Criteria) this;
        }

        public Criteria andEmailDateBetween(Date value1, Date value2) {
            addCriterion("email_date between", value1, value2, "emailDate");
            return (Criteria) this;
        }

        public Criteria andEmailDateNotBetween(Date value1, Date value2) {
            addCriterion("email_date not between", value1, value2, "emailDate");
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