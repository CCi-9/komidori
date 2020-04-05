package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentChartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentChartExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIsNull() {
            addCriterion("answer_id is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIsNotNull() {
            addCriterion("answer_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdEqualTo(Integer value) {
            addCriterion("answer_id =", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotEqualTo(Integer value) {
            addCriterion("answer_id <>", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThan(Integer value) {
            addCriterion("answer_id >", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_id >=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThan(Integer value) {
            addCriterion("answer_id <", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThanOrEqualTo(Integer value) {
            addCriterion("answer_id <=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIn(List<Integer> values) {
            addCriterion("answer_id in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotIn(List<Integer> values) {
            addCriterion("answer_id not in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdBetween(Integer value1, Integer value2) {
            addCriterion("answer_id between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_id not between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdIsNull() {
            addCriterion("comment_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdIsNotNull() {
            addCriterion("comment_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdEqualTo(Integer value) {
            addCriterion("comment_user_id =", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdNotEqualTo(Integer value) {
            addCriterion("comment_user_id <>", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdGreaterThan(Integer value) {
            addCriterion("comment_user_id >", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_user_id >=", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdLessThan(Integer value) {
            addCriterion("comment_user_id <", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_user_id <=", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdIn(List<Integer> values) {
            addCriterion("comment_user_id in", values, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdNotIn(List<Integer> values) {
            addCriterion("comment_user_id not in", values, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_user_id between", value1, value2, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_user_id not between", value1, value2, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNull() {
            addCriterion("comment_status is null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNotNull() {
            addCriterion("comment_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusEqualTo(Integer value) {
            addCriterion("comment_status =", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotEqualTo(Integer value) {
            addCriterion("comment_status <>", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThan(Integer value) {
            addCriterion("comment_status >", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_status >=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThan(Integer value) {
            addCriterion("comment_status <", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("comment_status <=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIn(List<Integer> values) {
            addCriterion("comment_status in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotIn(List<Integer> values) {
            addCriterion("comment_status not in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusBetween(Integer value1, Integer value2) {
            addCriterion("comment_status between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_status not between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNull() {
            addCriterion("comment_date is null");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNotNull() {
            addCriterion("comment_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDateEqualTo(Date value) {
            addCriterion("comment_date =", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotEqualTo(Date value) {
            addCriterion("comment_date <>", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThan(Date value) {
            addCriterion("comment_date >", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_date >=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThan(Date value) {
            addCriterion("comment_date <", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThanOrEqualTo(Date value) {
            addCriterion("comment_date <=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateIn(List<Date> values) {
            addCriterion("comment_date in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotIn(List<Date> values) {
            addCriterion("comment_date not in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateBetween(Date value1, Date value2) {
            addCriterion("comment_date between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotBetween(Date value1, Date value2) {
            addCriterion("comment_date not between", value1, value2, "commentDate");
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