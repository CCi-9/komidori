package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PublicEssayChartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PublicEssayChartExample() {
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

        public Criteria andEssayIdIsNull() {
            addCriterion("essay_id is null");
            return (Criteria) this;
        }

        public Criteria andEssayIdIsNotNull() {
            addCriterion("essay_id is not null");
            return (Criteria) this;
        }

        public Criteria andEssayIdEqualTo(Integer value) {
            addCriterion("essay_id =", value, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdNotEqualTo(Integer value) {
            addCriterion("essay_id <>", value, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdGreaterThan(Integer value) {
            addCriterion("essay_id >", value, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("essay_id >=", value, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdLessThan(Integer value) {
            addCriterion("essay_id <", value, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdLessThanOrEqualTo(Integer value) {
            addCriterion("essay_id <=", value, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdIn(List<Integer> values) {
            addCriterion("essay_id in", values, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdNotIn(List<Integer> values) {
            addCriterion("essay_id not in", values, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdBetween(Integer value1, Integer value2) {
            addCriterion("essay_id between", value1, value2, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("essay_id not between", value1, value2, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayTitleIsNull() {
            addCriterion("essay_title is null");
            return (Criteria) this;
        }

        public Criteria andEssayTitleIsNotNull() {
            addCriterion("essay_title is not null");
            return (Criteria) this;
        }

        public Criteria andEssayTitleEqualTo(String value) {
            addCriterion("essay_title =", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleNotEqualTo(String value) {
            addCriterion("essay_title <>", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleGreaterThan(String value) {
            addCriterion("essay_title >", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleGreaterThanOrEqualTo(String value) {
            addCriterion("essay_title >=", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleLessThan(String value) {
            addCriterion("essay_title <", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleLessThanOrEqualTo(String value) {
            addCriterion("essay_title <=", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleLike(String value) {
            addCriterion("essay_title like", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleNotLike(String value) {
            addCriterion("essay_title not like", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleIn(List<String> values) {
            addCriterion("essay_title in", values, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleNotIn(List<String> values) {
            addCriterion("essay_title not in", values, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleBetween(String value1, String value2) {
            addCriterion("essay_title between", value1, value2, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleNotBetween(String value1, String value2) {
            addCriterion("essay_title not between", value1, value2, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayAuthorIdIsNull() {
            addCriterion("essay_author_id is null");
            return (Criteria) this;
        }

        public Criteria andEssayAuthorIdIsNotNull() {
            addCriterion("essay_author_id is not null");
            return (Criteria) this;
        }

        public Criteria andEssayAuthorIdEqualTo(Integer value) {
            addCriterion("essay_author_id =", value, "essayAuthorId");
            return (Criteria) this;
        }

        public Criteria andEssayAuthorIdNotEqualTo(Integer value) {
            addCriterion("essay_author_id <>", value, "essayAuthorId");
            return (Criteria) this;
        }

        public Criteria andEssayAuthorIdGreaterThan(Integer value) {
            addCriterion("essay_author_id >", value, "essayAuthorId");
            return (Criteria) this;
        }

        public Criteria andEssayAuthorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("essay_author_id >=", value, "essayAuthorId");
            return (Criteria) this;
        }

        public Criteria andEssayAuthorIdLessThan(Integer value) {
            addCriterion("essay_author_id <", value, "essayAuthorId");
            return (Criteria) this;
        }

        public Criteria andEssayAuthorIdLessThanOrEqualTo(Integer value) {
            addCriterion("essay_author_id <=", value, "essayAuthorId");
            return (Criteria) this;
        }

        public Criteria andEssayAuthorIdIn(List<Integer> values) {
            addCriterion("essay_author_id in", values, "essayAuthorId");
            return (Criteria) this;
        }

        public Criteria andEssayAuthorIdNotIn(List<Integer> values) {
            addCriterion("essay_author_id not in", values, "essayAuthorId");
            return (Criteria) this;
        }

        public Criteria andEssayAuthorIdBetween(Integer value1, Integer value2) {
            addCriterion("essay_author_id between", value1, value2, "essayAuthorId");
            return (Criteria) this;
        }

        public Criteria andEssayAuthorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("essay_author_id not between", value1, value2, "essayAuthorId");
            return (Criteria) this;
        }

        public Criteria andEssayDateIsNull() {
            addCriterion("essay_date is null");
            return (Criteria) this;
        }

        public Criteria andEssayDateIsNotNull() {
            addCriterion("essay_date is not null");
            return (Criteria) this;
        }

        public Criteria andEssayDateEqualTo(Date value) {
            addCriterion("essay_date =", value, "essayDate");
            return (Criteria) this;
        }

        public Criteria andEssayDateNotEqualTo(Date value) {
            addCriterion("essay_date <>", value, "essayDate");
            return (Criteria) this;
        }

        public Criteria andEssayDateGreaterThan(Date value) {
            addCriterion("essay_date >", value, "essayDate");
            return (Criteria) this;
        }

        public Criteria andEssayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("essay_date >=", value, "essayDate");
            return (Criteria) this;
        }

        public Criteria andEssayDateLessThan(Date value) {
            addCriterion("essay_date <", value, "essayDate");
            return (Criteria) this;
        }

        public Criteria andEssayDateLessThanOrEqualTo(Date value) {
            addCriterion("essay_date <=", value, "essayDate");
            return (Criteria) this;
        }

        public Criteria andEssayDateIn(List<Date> values) {
            addCriterion("essay_date in", values, "essayDate");
            return (Criteria) this;
        }

        public Criteria andEssayDateNotIn(List<Date> values) {
            addCriterion("essay_date not in", values, "essayDate");
            return (Criteria) this;
        }

        public Criteria andEssayDateBetween(Date value1, Date value2) {
            addCriterion("essay_date between", value1, value2, "essayDate");
            return (Criteria) this;
        }

        public Criteria andEssayDateNotBetween(Date value1, Date value2) {
            addCriterion("essay_date not between", value1, value2, "essayDate");
            return (Criteria) this;
        }

        public Criteria andEssayCategoryIsNull() {
            addCriterion("essay_category is null");
            return (Criteria) this;
        }

        public Criteria andEssayCategoryIsNotNull() {
            addCriterion("essay_category is not null");
            return (Criteria) this;
        }

        public Criteria andEssayCategoryEqualTo(Integer value) {
            addCriterion("essay_category =", value, "essayCategory");
            return (Criteria) this;
        }

        public Criteria andEssayCategoryNotEqualTo(Integer value) {
            addCriterion("essay_category <>", value, "essayCategory");
            return (Criteria) this;
        }

        public Criteria andEssayCategoryGreaterThan(Integer value) {
            addCriterion("essay_category >", value, "essayCategory");
            return (Criteria) this;
        }

        public Criteria andEssayCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("essay_category >=", value, "essayCategory");
            return (Criteria) this;
        }

        public Criteria andEssayCategoryLessThan(Integer value) {
            addCriterion("essay_category <", value, "essayCategory");
            return (Criteria) this;
        }

        public Criteria andEssayCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("essay_category <=", value, "essayCategory");
            return (Criteria) this;
        }

        public Criteria andEssayCategoryIn(List<Integer> values) {
            addCriterion("essay_category in", values, "essayCategory");
            return (Criteria) this;
        }

        public Criteria andEssayCategoryNotIn(List<Integer> values) {
            addCriterion("essay_category not in", values, "essayCategory");
            return (Criteria) this;
        }

        public Criteria andEssayCategoryBetween(Integer value1, Integer value2) {
            addCriterion("essay_category between", value1, value2, "essayCategory");
            return (Criteria) this;
        }

        public Criteria andEssayCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("essay_category not between", value1, value2, "essayCategory");
            return (Criteria) this;
        }

        public Criteria andEssayGoodReviewIsNull() {
            addCriterion("essay_good_review is null");
            return (Criteria) this;
        }

        public Criteria andEssayGoodReviewIsNotNull() {
            addCriterion("essay_good_review is not null");
            return (Criteria) this;
        }

        public Criteria andEssayGoodReviewEqualTo(String value) {
            addCriterion("essay_good_review =", value, "essayGoodReview");
            return (Criteria) this;
        }

        public Criteria andEssayGoodReviewNotEqualTo(String value) {
            addCriterion("essay_good_review <>", value, "essayGoodReview");
            return (Criteria) this;
        }

        public Criteria andEssayGoodReviewGreaterThan(String value) {
            addCriterion("essay_good_review >", value, "essayGoodReview");
            return (Criteria) this;
        }

        public Criteria andEssayGoodReviewGreaterThanOrEqualTo(String value) {
            addCriterion("essay_good_review >=", value, "essayGoodReview");
            return (Criteria) this;
        }

        public Criteria andEssayGoodReviewLessThan(String value) {
            addCriterion("essay_good_review <", value, "essayGoodReview");
            return (Criteria) this;
        }

        public Criteria andEssayGoodReviewLessThanOrEqualTo(String value) {
            addCriterion("essay_good_review <=", value, "essayGoodReview");
            return (Criteria) this;
        }

        public Criteria andEssayGoodReviewLike(String value) {
            addCriterion("essay_good_review like", value, "essayGoodReview");
            return (Criteria) this;
        }

        public Criteria andEssayGoodReviewNotLike(String value) {
            addCriterion("essay_good_review not like", value, "essayGoodReview");
            return (Criteria) this;
        }

        public Criteria andEssayGoodReviewIn(List<String> values) {
            addCriterion("essay_good_review in", values, "essayGoodReview");
            return (Criteria) this;
        }

        public Criteria andEssayGoodReviewNotIn(List<String> values) {
            addCriterion("essay_good_review not in", values, "essayGoodReview");
            return (Criteria) this;
        }

        public Criteria andEssayGoodReviewBetween(String value1, String value2) {
            addCriterion("essay_good_review between", value1, value2, "essayGoodReview");
            return (Criteria) this;
        }

        public Criteria andEssayGoodReviewNotBetween(String value1, String value2) {
            addCriterion("essay_good_review not between", value1, value2, "essayGoodReview");
            return (Criteria) this;
        }

        public Criteria andEssayContentIsNull() {
            addCriterion("essay_content is null");
            return (Criteria) this;
        }

        public Criteria andEssayContentIsNotNull() {
            addCriterion("essay_content is not null");
            return (Criteria) this;
        }

        public Criteria andEssayContentEqualTo(String value) {
            addCriterion("essay_content =", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentNotEqualTo(String value) {
            addCriterion("essay_content <>", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentGreaterThan(String value) {
            addCriterion("essay_content >", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentGreaterThanOrEqualTo(String value) {
            addCriterion("essay_content >=", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentLessThan(String value) {
            addCriterion("essay_content <", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentLessThanOrEqualTo(String value) {
            addCriterion("essay_content <=", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentLike(String value) {
            addCriterion("essay_content like", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentNotLike(String value) {
            addCriterion("essay_content not like", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentIn(List<String> values) {
            addCriterion("essay_content in", values, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentNotIn(List<String> values) {
            addCriterion("essay_content not in", values, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentBetween(String value1, String value2) {
            addCriterion("essay_content between", value1, value2, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentNotBetween(String value1, String value2) {
            addCriterion("essay_content not between", value1, value2, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayStatusIsNull() {
            addCriterion("essay_status is null");
            return (Criteria) this;
        }

        public Criteria andEssayStatusIsNotNull() {
            addCriterion("essay_status is not null");
            return (Criteria) this;
        }

        public Criteria andEssayStatusEqualTo(Integer value) {
            addCriterion("essay_status =", value, "essayStatus");
            return (Criteria) this;
        }

        public Criteria andEssayStatusNotEqualTo(Integer value) {
            addCriterion("essay_status <>", value, "essayStatus");
            return (Criteria) this;
        }

        public Criteria andEssayStatusGreaterThan(Integer value) {
            addCriterion("essay_status >", value, "essayStatus");
            return (Criteria) this;
        }

        public Criteria andEssayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("essay_status >=", value, "essayStatus");
            return (Criteria) this;
        }

        public Criteria andEssayStatusLessThan(Integer value) {
            addCriterion("essay_status <", value, "essayStatus");
            return (Criteria) this;
        }

        public Criteria andEssayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("essay_status <=", value, "essayStatus");
            return (Criteria) this;
        }

        public Criteria andEssayStatusIn(List<Integer> values) {
            addCriterion("essay_status in", values, "essayStatus");
            return (Criteria) this;
        }

        public Criteria andEssayStatusNotIn(List<Integer> values) {
            addCriterion("essay_status not in", values, "essayStatus");
            return (Criteria) this;
        }

        public Criteria andEssayStatusBetween(Integer value1, Integer value2) {
            addCriterion("essay_status between", value1, value2, "essayStatus");
            return (Criteria) this;
        }

        public Criteria andEssayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("essay_status not between", value1, value2, "essayStatus");
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