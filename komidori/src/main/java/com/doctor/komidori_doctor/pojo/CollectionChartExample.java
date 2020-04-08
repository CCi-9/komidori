package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectionChartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionChartExample() {
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

        public Criteria andCollectMatIdIsNull() {
            addCriterion("collect_mat_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectMatIdIsNotNull() {
            addCriterion("collect_mat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectMatIdEqualTo(Integer value) {
            addCriterion("collect_mat_id =", value, "collectMatId");
            return (Criteria) this;
        }

        public Criteria andCollectMatIdNotEqualTo(Integer value) {
            addCriterion("collect_mat_id <>", value, "collectMatId");
            return (Criteria) this;
        }

        public Criteria andCollectMatIdGreaterThan(Integer value) {
            addCriterion("collect_mat_id >", value, "collectMatId");
            return (Criteria) this;
        }

        public Criteria andCollectMatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_mat_id >=", value, "collectMatId");
            return (Criteria) this;
        }

        public Criteria andCollectMatIdLessThan(Integer value) {
            addCriterion("collect_mat_id <", value, "collectMatId");
            return (Criteria) this;
        }

        public Criteria andCollectMatIdLessThanOrEqualTo(Integer value) {
            addCriterion("collect_mat_id <=", value, "collectMatId");
            return (Criteria) this;
        }

        public Criteria andCollectMatIdIn(List<Integer> values) {
            addCriterion("collect_mat_id in", values, "collectMatId");
            return (Criteria) this;
        }

        public Criteria andCollectMatIdNotIn(List<Integer> values) {
            addCriterion("collect_mat_id not in", values, "collectMatId");
            return (Criteria) this;
        }

        public Criteria andCollectMatIdBetween(Integer value1, Integer value2) {
            addCriterion("collect_mat_id between", value1, value2, "collectMatId");
            return (Criteria) this;
        }

        public Criteria andCollectMatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_mat_id not between", value1, value2, "collectMatId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIsNull() {
            addCriterion("collection_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIsNotNull() {
            addCriterion("collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdEqualTo(Integer value) {
            addCriterion("collection_id =", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotEqualTo(Integer value) {
            addCriterion("collection_id <>", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThan(Integer value) {
            addCriterion("collection_id >", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_id >=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThan(Integer value) {
            addCriterion("collection_id <", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("collection_id <=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIn(List<Integer> values) {
            addCriterion("collection_id in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotIn(List<Integer> values) {
            addCriterion("collection_id not in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdBetween(Integer value1, Integer value2) {
            addCriterion("collection_id between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_id not between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionDateIsNull() {
            addCriterion("collection_date is null");
            return (Criteria) this;
        }

        public Criteria andCollectionDateIsNotNull() {
            addCriterion("collection_date is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionDateEqualTo(Date value) {
            addCriterion("collection_date =", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateNotEqualTo(Date value) {
            addCriterion("collection_date <>", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateGreaterThan(Date value) {
            addCriterion("collection_date >", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("collection_date >=", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateLessThan(Date value) {
            addCriterion("collection_date <", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateLessThanOrEqualTo(Date value) {
            addCriterion("collection_date <=", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateIn(List<Date> values) {
            addCriterion("collection_date in", values, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateNotIn(List<Date> values) {
            addCriterion("collection_date not in", values, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateBetween(Date value1, Date value2) {
            addCriterion("collection_date between", value1, value2, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateNotBetween(Date value1, Date value2) {
            addCriterion("collection_date not between", value1, value2, "collectionDate");
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