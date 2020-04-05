package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductionChecklistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductionChecklistExample() {
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

        public Criteria andProListIdIsNull() {
            addCriterion("pro_list_id is null");
            return (Criteria) this;
        }

        public Criteria andProListIdIsNotNull() {
            addCriterion("pro_list_id is not null");
            return (Criteria) this;
        }

        public Criteria andProListIdEqualTo(Integer value) {
            addCriterion("pro_list_id =", value, "proListId");
            return (Criteria) this;
        }

        public Criteria andProListIdNotEqualTo(Integer value) {
            addCriterion("pro_list_id <>", value, "proListId");
            return (Criteria) this;
        }

        public Criteria andProListIdGreaterThan(Integer value) {
            addCriterion("pro_list_id >", value, "proListId");
            return (Criteria) this;
        }

        public Criteria andProListIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_list_id >=", value, "proListId");
            return (Criteria) this;
        }

        public Criteria andProListIdLessThan(Integer value) {
            addCriterion("pro_list_id <", value, "proListId");
            return (Criteria) this;
        }

        public Criteria andProListIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_list_id <=", value, "proListId");
            return (Criteria) this;
        }

        public Criteria andProListIdIn(List<Integer> values) {
            addCriterion("pro_list_id in", values, "proListId");
            return (Criteria) this;
        }

        public Criteria andProListIdNotIn(List<Integer> values) {
            addCriterion("pro_list_id not in", values, "proListId");
            return (Criteria) this;
        }

        public Criteria andProListIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_list_id between", value1, value2, "proListId");
            return (Criteria) this;
        }

        public Criteria andProListIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_list_id not between", value1, value2, "proListId");
            return (Criteria) this;
        }

        public Criteria andProListNameIsNull() {
            addCriterion("pro_list_name is null");
            return (Criteria) this;
        }

        public Criteria andProListNameIsNotNull() {
            addCriterion("pro_list_name is not null");
            return (Criteria) this;
        }

        public Criteria andProListNameEqualTo(String value) {
            addCriterion("pro_list_name =", value, "proListName");
            return (Criteria) this;
        }

        public Criteria andProListNameNotEqualTo(String value) {
            addCriterion("pro_list_name <>", value, "proListName");
            return (Criteria) this;
        }

        public Criteria andProListNameGreaterThan(String value) {
            addCriterion("pro_list_name >", value, "proListName");
            return (Criteria) this;
        }

        public Criteria andProListNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_list_name >=", value, "proListName");
            return (Criteria) this;
        }

        public Criteria andProListNameLessThan(String value) {
            addCriterion("pro_list_name <", value, "proListName");
            return (Criteria) this;
        }

        public Criteria andProListNameLessThanOrEqualTo(String value) {
            addCriterion("pro_list_name <=", value, "proListName");
            return (Criteria) this;
        }

        public Criteria andProListNameLike(String value) {
            addCriterion("pro_list_name like", value, "proListName");
            return (Criteria) this;
        }

        public Criteria andProListNameNotLike(String value) {
            addCriterion("pro_list_name not like", value, "proListName");
            return (Criteria) this;
        }

        public Criteria andProListNameIn(List<String> values) {
            addCriterion("pro_list_name in", values, "proListName");
            return (Criteria) this;
        }

        public Criteria andProListNameNotIn(List<String> values) {
            addCriterion("pro_list_name not in", values, "proListName");
            return (Criteria) this;
        }

        public Criteria andProListNameBetween(String value1, String value2) {
            addCriterion("pro_list_name between", value1, value2, "proListName");
            return (Criteria) this;
        }

        public Criteria andProListNameNotBetween(String value1, String value2) {
            addCriterion("pro_list_name not between", value1, value2, "proListName");
            return (Criteria) this;
        }

        public Criteria andProListDateIsNull() {
            addCriterion("pro_list_date is null");
            return (Criteria) this;
        }

        public Criteria andProListDateIsNotNull() {
            addCriterion("pro_list_date is not null");
            return (Criteria) this;
        }

        public Criteria andProListDateEqualTo(String value) {
            addCriterion("pro_list_date =", value, "proListDate");
            return (Criteria) this;
        }

        public Criteria andProListDateNotEqualTo(String value) {
            addCriterion("pro_list_date <>", value, "proListDate");
            return (Criteria) this;
        }

        public Criteria andProListDateGreaterThan(String value) {
            addCriterion("pro_list_date >", value, "proListDate");
            return (Criteria) this;
        }

        public Criteria andProListDateGreaterThanOrEqualTo(String value) {
            addCriterion("pro_list_date >=", value, "proListDate");
            return (Criteria) this;
        }

        public Criteria andProListDateLessThan(String value) {
            addCriterion("pro_list_date <", value, "proListDate");
            return (Criteria) this;
        }

        public Criteria andProListDateLessThanOrEqualTo(String value) {
            addCriterion("pro_list_date <=", value, "proListDate");
            return (Criteria) this;
        }

        public Criteria andProListDateLike(String value) {
            addCriterion("pro_list_date like", value, "proListDate");
            return (Criteria) this;
        }

        public Criteria andProListDateNotLike(String value) {
            addCriterion("pro_list_date not like", value, "proListDate");
            return (Criteria) this;
        }

        public Criteria andProListDateIn(List<String> values) {
            addCriterion("pro_list_date in", values, "proListDate");
            return (Criteria) this;
        }

        public Criteria andProListDateNotIn(List<String> values) {
            addCriterion("pro_list_date not in", values, "proListDate");
            return (Criteria) this;
        }

        public Criteria andProListDateBetween(String value1, String value2) {
            addCriterion("pro_list_date between", value1, value2, "proListDate");
            return (Criteria) this;
        }

        public Criteria andProListDateNotBetween(String value1, String value2) {
            addCriterion("pro_list_date not between", value1, value2, "proListDate");
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