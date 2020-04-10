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

        public Criteria andEmailFromIdEqualTo(String value) {
            addCriterion("email_from_id =", value, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdNotEqualTo(String value) {
            addCriterion("email_from_id <>", value, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdGreaterThan(String value) {
            addCriterion("email_from_id >", value, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdGreaterThanOrEqualTo(String value) {
            addCriterion("email_from_id >=", value, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdLessThan(String value) {
            addCriterion("email_from_id <", value, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdLessThanOrEqualTo(String value) {
            addCriterion("email_from_id <=", value, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdLike(String value) {
            addCriterion("email_from_id like", value, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdNotLike(String value) {
            addCriterion("email_from_id not like", value, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdIn(List<String> values) {
            addCriterion("email_from_id in", values, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdNotIn(List<String> values) {
            addCriterion("email_from_id not in", values, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdBetween(String value1, String value2) {
            addCriterion("email_from_id between", value1, value2, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailFromIdNotBetween(String value1, String value2) {
            addCriterion("email_from_id not between", value1, value2, "emailFromId");
            return (Criteria) this;
        }

        public Criteria andEmailToDocIdIsNull() {
            addCriterion("email_to_doc_id is null");
            return (Criteria) this;
        }

        public Criteria andEmailToDocIdIsNotNull() {
            addCriterion("email_to_doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmailToDocIdEqualTo(Integer value) {
            addCriterion("email_to_doc_id =", value, "emailToDocId");
            return (Criteria) this;
        }

        public Criteria andEmailToDocIdNotEqualTo(Integer value) {
            addCriterion("email_to_doc_id <>", value, "emailToDocId");
            return (Criteria) this;
        }

        public Criteria andEmailToDocIdGreaterThan(Integer value) {
            addCriterion("email_to_doc_id >", value, "emailToDocId");
            return (Criteria) this;
        }

        public Criteria andEmailToDocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_to_doc_id >=", value, "emailToDocId");
            return (Criteria) this;
        }

        public Criteria andEmailToDocIdLessThan(Integer value) {
            addCriterion("email_to_doc_id <", value, "emailToDocId");
            return (Criteria) this;
        }

        public Criteria andEmailToDocIdLessThanOrEqualTo(Integer value) {
            addCriterion("email_to_doc_id <=", value, "emailToDocId");
            return (Criteria) this;
        }

        public Criteria andEmailToDocIdIn(List<Integer> values) {
            addCriterion("email_to_doc_id in", values, "emailToDocId");
            return (Criteria) this;
        }

        public Criteria andEmailToDocIdNotIn(List<Integer> values) {
            addCriterion("email_to_doc_id not in", values, "emailToDocId");
            return (Criteria) this;
        }

        public Criteria andEmailToDocIdBetween(Integer value1, Integer value2) {
            addCriterion("email_to_doc_id between", value1, value2, "emailToDocId");
            return (Criteria) this;
        }

        public Criteria andEmailToDocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("email_to_doc_id not between", value1, value2, "emailToDocId");
            return (Criteria) this;
        }

        public Criteria andEmailContentIsNull() {
            addCriterion("email_content is null");
            return (Criteria) this;
        }

        public Criteria andEmailContentIsNotNull() {
            addCriterion("email_content is not null");
            return (Criteria) this;
        }

        public Criteria andEmailContentEqualTo(String value) {
            addCriterion("email_content =", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotEqualTo(String value) {
            addCriterion("email_content <>", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentGreaterThan(String value) {
            addCriterion("email_content >", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentGreaterThanOrEqualTo(String value) {
            addCriterion("email_content >=", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentLessThan(String value) {
            addCriterion("email_content <", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentLessThanOrEqualTo(String value) {
            addCriterion("email_content <=", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentLike(String value) {
            addCriterion("email_content like", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotLike(String value) {
            addCriterion("email_content not like", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentIn(List<String> values) {
            addCriterion("email_content in", values, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotIn(List<String> values) {
            addCriterion("email_content not in", values, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentBetween(String value1, String value2) {
            addCriterion("email_content between", value1, value2, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotBetween(String value1, String value2) {
            addCriterion("email_content not between", value1, value2, "emailContent");
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

        public Criteria andEmailToMadIdIsNull() {
            addCriterion("email_to_mad_id is null");
            return (Criteria) this;
        }

        public Criteria andEmailToMadIdIsNotNull() {
            addCriterion("email_to_mad_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmailToMadIdEqualTo(Integer value) {
            addCriterion("email_to_mad_id =", value, "emailToMadId");
            return (Criteria) this;
        }

        public Criteria andEmailToMadIdNotEqualTo(Integer value) {
            addCriterion("email_to_mad_id <>", value, "emailToMadId");
            return (Criteria) this;
        }

        public Criteria andEmailToMadIdGreaterThan(Integer value) {
            addCriterion("email_to_mad_id >", value, "emailToMadId");
            return (Criteria) this;
        }

        public Criteria andEmailToMadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_to_mad_id >=", value, "emailToMadId");
            return (Criteria) this;
        }

        public Criteria andEmailToMadIdLessThan(Integer value) {
            addCriterion("email_to_mad_id <", value, "emailToMadId");
            return (Criteria) this;
        }

        public Criteria andEmailToMadIdLessThanOrEqualTo(Integer value) {
            addCriterion("email_to_mad_id <=", value, "emailToMadId");
            return (Criteria) this;
        }

        public Criteria andEmailToMadIdIn(List<Integer> values) {
            addCriterion("email_to_mad_id in", values, "emailToMadId");
            return (Criteria) this;
        }

        public Criteria andEmailToMadIdNotIn(List<Integer> values) {
            addCriterion("email_to_mad_id not in", values, "emailToMadId");
            return (Criteria) this;
        }

        public Criteria andEmailToMadIdBetween(Integer value1, Integer value2) {
            addCriterion("email_to_mad_id between", value1, value2, "emailToMadId");
            return (Criteria) this;
        }

        public Criteria andEmailToMadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("email_to_mad_id not between", value1, value2, "emailToMadId");
            return (Criteria) this;
        }

        public Criteria andEmailToAdminIdIsNull() {
            addCriterion("email_to_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andEmailToAdminIdIsNotNull() {
            addCriterion("email_to_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmailToAdminIdEqualTo(Integer value) {
            addCriterion("email_to_admin_id =", value, "emailToAdminId");
            return (Criteria) this;
        }

        public Criteria andEmailToAdminIdNotEqualTo(Integer value) {
            addCriterion("email_to_admin_id <>", value, "emailToAdminId");
            return (Criteria) this;
        }

        public Criteria andEmailToAdminIdGreaterThan(Integer value) {
            addCriterion("email_to_admin_id >", value, "emailToAdminId");
            return (Criteria) this;
        }

        public Criteria andEmailToAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_to_admin_id >=", value, "emailToAdminId");
            return (Criteria) this;
        }

        public Criteria andEmailToAdminIdLessThan(Integer value) {
            addCriterion("email_to_admin_id <", value, "emailToAdminId");
            return (Criteria) this;
        }

        public Criteria andEmailToAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("email_to_admin_id <=", value, "emailToAdminId");
            return (Criteria) this;
        }

        public Criteria andEmailToAdminIdIn(List<Integer> values) {
            addCriterion("email_to_admin_id in", values, "emailToAdminId");
            return (Criteria) this;
        }

        public Criteria andEmailToAdminIdNotIn(List<Integer> values) {
            addCriterion("email_to_admin_id not in", values, "emailToAdminId");
            return (Criteria) this;
        }

        public Criteria andEmailToAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("email_to_admin_id between", value1, value2, "emailToAdminId");
            return (Criteria) this;
        }

        public Criteria andEmailToAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("email_to_admin_id not between", value1, value2, "emailToAdminId");
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