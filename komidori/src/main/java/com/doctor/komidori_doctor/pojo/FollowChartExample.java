package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FollowChartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FollowChartExample() {
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

        public Criteria andFollowMatIdIsNull() {
            addCriterion("follow_mat_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowMatIdIsNotNull() {
            addCriterion("follow_mat_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowMatIdEqualTo(Integer value) {
            addCriterion("follow_mat_id =", value, "followMatId");
            return (Criteria) this;
        }

        public Criteria andFollowMatIdNotEqualTo(Integer value) {
            addCriterion("follow_mat_id <>", value, "followMatId");
            return (Criteria) this;
        }

        public Criteria andFollowMatIdGreaterThan(Integer value) {
            addCriterion("follow_mat_id >", value, "followMatId");
            return (Criteria) this;
        }

        public Criteria andFollowMatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_mat_id >=", value, "followMatId");
            return (Criteria) this;
        }

        public Criteria andFollowMatIdLessThan(Integer value) {
            addCriterion("follow_mat_id <", value, "followMatId");
            return (Criteria) this;
        }

        public Criteria andFollowMatIdLessThanOrEqualTo(Integer value) {
            addCriterion("follow_mat_id <=", value, "followMatId");
            return (Criteria) this;
        }

        public Criteria andFollowMatIdIn(List<Integer> values) {
            addCriterion("follow_mat_id in", values, "followMatId");
            return (Criteria) this;
        }

        public Criteria andFollowMatIdNotIn(List<Integer> values) {
            addCriterion("follow_mat_id not in", values, "followMatId");
            return (Criteria) this;
        }

        public Criteria andFollowMatIdBetween(Integer value1, Integer value2) {
            addCriterion("follow_mat_id between", value1, value2, "followMatId");
            return (Criteria) this;
        }

        public Criteria andFollowMatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_mat_id not between", value1, value2, "followMatId");
            return (Criteria) this;
        }

        public Criteria andFollowDocIdIsNull() {
            addCriterion("follow_doc_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowDocIdIsNotNull() {
            addCriterion("follow_doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowDocIdEqualTo(Integer value) {
            addCriterion("follow_doc_id =", value, "followDocId");
            return (Criteria) this;
        }

        public Criteria andFollowDocIdNotEqualTo(Integer value) {
            addCriterion("follow_doc_id <>", value, "followDocId");
            return (Criteria) this;
        }

        public Criteria andFollowDocIdGreaterThan(Integer value) {
            addCriterion("follow_doc_id >", value, "followDocId");
            return (Criteria) this;
        }

        public Criteria andFollowDocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_doc_id >=", value, "followDocId");
            return (Criteria) this;
        }

        public Criteria andFollowDocIdLessThan(Integer value) {
            addCriterion("follow_doc_id <", value, "followDocId");
            return (Criteria) this;
        }

        public Criteria andFollowDocIdLessThanOrEqualTo(Integer value) {
            addCriterion("follow_doc_id <=", value, "followDocId");
            return (Criteria) this;
        }

        public Criteria andFollowDocIdIn(List<Integer> values) {
            addCriterion("follow_doc_id in", values, "followDocId");
            return (Criteria) this;
        }

        public Criteria andFollowDocIdNotIn(List<Integer> values) {
            addCriterion("follow_doc_id not in", values, "followDocId");
            return (Criteria) this;
        }

        public Criteria andFollowDocIdBetween(Integer value1, Integer value2) {
            addCriterion("follow_doc_id between", value1, value2, "followDocId");
            return (Criteria) this;
        }

        public Criteria andFollowDocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_doc_id not between", value1, value2, "followDocId");
            return (Criteria) this;
        }

        public Criteria andFollowDateIsNull() {
            addCriterion("follow_date is null");
            return (Criteria) this;
        }

        public Criteria andFollowDateIsNotNull() {
            addCriterion("follow_date is not null");
            return (Criteria) this;
        }

        public Criteria andFollowDateEqualTo(Date value) {
            addCriterion("follow_date =", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateNotEqualTo(Date value) {
            addCriterion("follow_date <>", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateGreaterThan(Date value) {
            addCriterion("follow_date >", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateGreaterThanOrEqualTo(Date value) {
            addCriterion("follow_date >=", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateLessThan(Date value) {
            addCriterion("follow_date <", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateLessThanOrEqualTo(Date value) {
            addCriterion("follow_date <=", value, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateIn(List<Date> values) {
            addCriterion("follow_date in", values, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateNotIn(List<Date> values) {
            addCriterion("follow_date not in", values, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateBetween(Date value1, Date value2) {
            addCriterion("follow_date between", value1, value2, "followDate");
            return (Criteria) this;
        }

        public Criteria andFollowDateNotBetween(Date value1, Date value2) {
            addCriterion("follow_date not between", value1, value2, "followDate");
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