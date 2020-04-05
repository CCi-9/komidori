package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.List;

public class PublicCategoryChartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PublicCategoryChartExample() {
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

        public Criteria andPublicCategoryIdIsNull() {
            addCriterion("public_category_id is null");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryIdIsNotNull() {
            addCriterion("public_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryIdEqualTo(Integer value) {
            addCriterion("public_category_id =", value, "publicCategoryId");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryIdNotEqualTo(Integer value) {
            addCriterion("public_category_id <>", value, "publicCategoryId");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryIdGreaterThan(Integer value) {
            addCriterion("public_category_id >", value, "publicCategoryId");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("public_category_id >=", value, "publicCategoryId");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryIdLessThan(Integer value) {
            addCriterion("public_category_id <", value, "publicCategoryId");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("public_category_id <=", value, "publicCategoryId");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryIdIn(List<Integer> values) {
            addCriterion("public_category_id in", values, "publicCategoryId");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryIdNotIn(List<Integer> values) {
            addCriterion("public_category_id not in", values, "publicCategoryId");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("public_category_id between", value1, value2, "publicCategoryId");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("public_category_id not between", value1, value2, "publicCategoryId");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryNameIsNull() {
            addCriterion("public_category_name is null");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryNameIsNotNull() {
            addCriterion("public_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryNameEqualTo(String value) {
            addCriterion("public_category_name =", value, "publicCategoryName");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryNameNotEqualTo(String value) {
            addCriterion("public_category_name <>", value, "publicCategoryName");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryNameGreaterThan(String value) {
            addCriterion("public_category_name >", value, "publicCategoryName");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("public_category_name >=", value, "publicCategoryName");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryNameLessThan(String value) {
            addCriterion("public_category_name <", value, "publicCategoryName");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("public_category_name <=", value, "publicCategoryName");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryNameLike(String value) {
            addCriterion("public_category_name like", value, "publicCategoryName");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryNameNotLike(String value) {
            addCriterion("public_category_name not like", value, "publicCategoryName");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryNameIn(List<String> values) {
            addCriterion("public_category_name in", values, "publicCategoryName");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryNameNotIn(List<String> values) {
            addCriterion("public_category_name not in", values, "publicCategoryName");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryNameBetween(String value1, String value2) {
            addCriterion("public_category_name between", value1, value2, "publicCategoryName");
            return (Criteria) this;
        }

        public Criteria andPublicCategoryNameNotBetween(String value1, String value2) {
            addCriterion("public_category_name not between", value1, value2, "publicCategoryName");
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