package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseOrderChartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseOrderChartExample() {
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

        public Criteria andCourseOrderIdIsNull() {
            addCriterion("course_order_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseOrderIdIsNotNull() {
            addCriterion("course_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseOrderIdEqualTo(Integer value) {
            addCriterion("course_order_id =", value, "courseOrderId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderIdNotEqualTo(Integer value) {
            addCriterion("course_order_id <>", value, "courseOrderId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderIdGreaterThan(Integer value) {
            addCriterion("course_order_id >", value, "courseOrderId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_order_id >=", value, "courseOrderId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderIdLessThan(Integer value) {
            addCriterion("course_order_id <", value, "courseOrderId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_order_id <=", value, "courseOrderId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderIdIn(List<Integer> values) {
            addCriterion("course_order_id in", values, "courseOrderId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderIdNotIn(List<Integer> values) {
            addCriterion("course_order_id not in", values, "courseOrderId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("course_order_id between", value1, value2, "courseOrderId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_order_id not between", value1, value2, "courseOrderId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderMatIdIsNull() {
            addCriterion("course_order_mat_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseOrderMatIdIsNotNull() {
            addCriterion("course_order_mat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseOrderMatIdEqualTo(Integer value) {
            addCriterion("course_order_mat_id =", value, "courseOrderMatId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderMatIdNotEqualTo(Integer value) {
            addCriterion("course_order_mat_id <>", value, "courseOrderMatId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderMatIdGreaterThan(Integer value) {
            addCriterion("course_order_mat_id >", value, "courseOrderMatId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderMatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_order_mat_id >=", value, "courseOrderMatId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderMatIdLessThan(Integer value) {
            addCriterion("course_order_mat_id <", value, "courseOrderMatId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderMatIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_order_mat_id <=", value, "courseOrderMatId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderMatIdIn(List<Integer> values) {
            addCriterion("course_order_mat_id in", values, "courseOrderMatId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderMatIdNotIn(List<Integer> values) {
            addCriterion("course_order_mat_id not in", values, "courseOrderMatId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderMatIdBetween(Integer value1, Integer value2) {
            addCriterion("course_order_mat_id between", value1, value2, "courseOrderMatId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderMatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_order_mat_id not between", value1, value2, "courseOrderMatId");
            return (Criteria) this;
        }

        public Criteria andCourseOrderCidIsNull() {
            addCriterion("course_order_cid is null");
            return (Criteria) this;
        }

        public Criteria andCourseOrderCidIsNotNull() {
            addCriterion("course_order_cid is not null");
            return (Criteria) this;
        }

        public Criteria andCourseOrderCidEqualTo(Integer value) {
            addCriterion("course_order_cid =", value, "courseOrderCid");
            return (Criteria) this;
        }

        public Criteria andCourseOrderCidNotEqualTo(Integer value) {
            addCriterion("course_order_cid <>", value, "courseOrderCid");
            return (Criteria) this;
        }

        public Criteria andCourseOrderCidGreaterThan(Integer value) {
            addCriterion("course_order_cid >", value, "courseOrderCid");
            return (Criteria) this;
        }

        public Criteria andCourseOrderCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_order_cid >=", value, "courseOrderCid");
            return (Criteria) this;
        }

        public Criteria andCourseOrderCidLessThan(Integer value) {
            addCriterion("course_order_cid <", value, "courseOrderCid");
            return (Criteria) this;
        }

        public Criteria andCourseOrderCidLessThanOrEqualTo(Integer value) {
            addCriterion("course_order_cid <=", value, "courseOrderCid");
            return (Criteria) this;
        }

        public Criteria andCourseOrderCidIn(List<Integer> values) {
            addCriterion("course_order_cid in", values, "courseOrderCid");
            return (Criteria) this;
        }

        public Criteria andCourseOrderCidNotIn(List<Integer> values) {
            addCriterion("course_order_cid not in", values, "courseOrderCid");
            return (Criteria) this;
        }

        public Criteria andCourseOrderCidBetween(Integer value1, Integer value2) {
            addCriterion("course_order_cid between", value1, value2, "courseOrderCid");
            return (Criteria) this;
        }

        public Criteria andCourseOrderCidNotBetween(Integer value1, Integer value2) {
            addCriterion("course_order_cid not between", value1, value2, "courseOrderCid");
            return (Criteria) this;
        }

        public Criteria andCourseOrderDateIsNull() {
            addCriterion("course_order_date is null");
            return (Criteria) this;
        }

        public Criteria andCourseOrderDateIsNotNull() {
            addCriterion("course_order_date is not null");
            return (Criteria) this;
        }

        public Criteria andCourseOrderDateEqualTo(Date value) {
            addCriterion("course_order_date =", value, "courseOrderDate");
            return (Criteria) this;
        }

        public Criteria andCourseOrderDateNotEqualTo(Date value) {
            addCriterion("course_order_date <>", value, "courseOrderDate");
            return (Criteria) this;
        }

        public Criteria andCourseOrderDateGreaterThan(Date value) {
            addCriterion("course_order_date >", value, "courseOrderDate");
            return (Criteria) this;
        }

        public Criteria andCourseOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("course_order_date >=", value, "courseOrderDate");
            return (Criteria) this;
        }

        public Criteria andCourseOrderDateLessThan(Date value) {
            addCriterion("course_order_date <", value, "courseOrderDate");
            return (Criteria) this;
        }

        public Criteria andCourseOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("course_order_date <=", value, "courseOrderDate");
            return (Criteria) this;
        }

        public Criteria andCourseOrderDateIn(List<Date> values) {
            addCriterion("course_order_date in", values, "courseOrderDate");
            return (Criteria) this;
        }

        public Criteria andCourseOrderDateNotIn(List<Date> values) {
            addCriterion("course_order_date not in", values, "courseOrderDate");
            return (Criteria) this;
        }

        public Criteria andCourseOrderDateBetween(Date value1, Date value2) {
            addCriterion("course_order_date between", value1, value2, "courseOrderDate");
            return (Criteria) this;
        }

        public Criteria andCourseOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("course_order_date not between", value1, value2, "courseOrderDate");
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