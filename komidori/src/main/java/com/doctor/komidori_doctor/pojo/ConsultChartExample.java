package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsultChartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsultChartExample() {
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

        public Criteria andConsultIdIsNull() {
            addCriterion("consult_id is null");
            return (Criteria) this;
        }

        public Criteria andConsultIdIsNotNull() {
            addCriterion("consult_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsultIdEqualTo(Integer value) {
            addCriterion("consult_id =", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdNotEqualTo(Integer value) {
            addCriterion("consult_id <>", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdGreaterThan(Integer value) {
            addCriterion("consult_id >", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("consult_id >=", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdLessThan(Integer value) {
            addCriterion("consult_id <", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdLessThanOrEqualTo(Integer value) {
            addCriterion("consult_id <=", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdIn(List<Integer> values) {
            addCriterion("consult_id in", values, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdNotIn(List<Integer> values) {
            addCriterion("consult_id not in", values, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdBetween(Integer value1, Integer value2) {
            addCriterion("consult_id between", value1, value2, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdNotBetween(Integer value1, Integer value2) {
            addCriterion("consult_id not between", value1, value2, "consultId");
            return (Criteria) this;
        }

        public Criteria andDocIdIsNull() {
            addCriterion("doc_id is null");
            return (Criteria) this;
        }

        public Criteria andDocIdIsNotNull() {
            addCriterion("doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andDocIdEqualTo(Integer value) {
            addCriterion("doc_id =", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotEqualTo(Integer value) {
            addCriterion("doc_id <>", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdGreaterThan(Integer value) {
            addCriterion("doc_id >", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doc_id >=", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLessThan(Integer value) {
            addCriterion("doc_id <", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLessThanOrEqualTo(Integer value) {
            addCriterion("doc_id <=", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdIn(List<Integer> values) {
            addCriterion("doc_id in", values, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotIn(List<Integer> values) {
            addCriterion("doc_id not in", values, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdBetween(Integer value1, Integer value2) {
            addCriterion("doc_id between", value1, value2, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doc_id not between", value1, value2, "docId");
            return (Criteria) this;
        }

        public Criteria andMatIdIsNull() {
            addCriterion("mat_id is null");
            return (Criteria) this;
        }

        public Criteria andMatIdIsNotNull() {
            addCriterion("mat_id is not null");
            return (Criteria) this;
        }

        public Criteria andMatIdEqualTo(Integer value) {
            addCriterion("mat_id =", value, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdNotEqualTo(Integer value) {
            addCriterion("mat_id <>", value, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdGreaterThan(Integer value) {
            addCriterion("mat_id >", value, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mat_id >=", value, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdLessThan(Integer value) {
            addCriterion("mat_id <", value, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdLessThanOrEqualTo(Integer value) {
            addCriterion("mat_id <=", value, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdIn(List<Integer> values) {
            addCriterion("mat_id in", values, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdNotIn(List<Integer> values) {
            addCriterion("mat_id not in", values, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdBetween(Integer value1, Integer value2) {
            addCriterion("mat_id between", value1, value2, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mat_id not between", value1, value2, "matId");
            return (Criteria) this;
        }

        public Criteria andConsultDateIsNull() {
            addCriterion("consult_date is null");
            return (Criteria) this;
        }

        public Criteria andConsultDateIsNotNull() {
            addCriterion("consult_date is not null");
            return (Criteria) this;
        }

        public Criteria andConsultDateEqualTo(Date value) {
            addCriterion("consult_date =", value, "consultDate");
            return (Criteria) this;
        }

        public Criteria andConsultDateNotEqualTo(Date value) {
            addCriterion("consult_date <>", value, "consultDate");
            return (Criteria) this;
        }

        public Criteria andConsultDateGreaterThan(Date value) {
            addCriterion("consult_date >", value, "consultDate");
            return (Criteria) this;
        }

        public Criteria andConsultDateGreaterThanOrEqualTo(Date value) {
            addCriterion("consult_date >=", value, "consultDate");
            return (Criteria) this;
        }

        public Criteria andConsultDateLessThan(Date value) {
            addCriterion("consult_date <", value, "consultDate");
            return (Criteria) this;
        }

        public Criteria andConsultDateLessThanOrEqualTo(Date value) {
            addCriterion("consult_date <=", value, "consultDate");
            return (Criteria) this;
        }

        public Criteria andConsultDateIn(List<Date> values) {
            addCriterion("consult_date in", values, "consultDate");
            return (Criteria) this;
        }

        public Criteria andConsultDateNotIn(List<Date> values) {
            addCriterion("consult_date not in", values, "consultDate");
            return (Criteria) this;
        }

        public Criteria andConsultDateBetween(Date value1, Date value2) {
            addCriterion("consult_date between", value1, value2, "consultDate");
            return (Criteria) this;
        }

        public Criteria andConsultDateNotBetween(Date value1, Date value2) {
            addCriterion("consult_date not between", value1, value2, "consultDate");
            return (Criteria) this;
        }

        public Criteria andConsultPriceIsNull() {
            addCriterion("consult_price is null");
            return (Criteria) this;
        }

        public Criteria andConsultPriceIsNotNull() {
            addCriterion("consult_price is not null");
            return (Criteria) this;
        }

        public Criteria andConsultPriceEqualTo(Float value) {
            addCriterion("consult_price =", value, "consultPrice");
            return (Criteria) this;
        }

        public Criteria andConsultPriceNotEqualTo(Float value) {
            addCriterion("consult_price <>", value, "consultPrice");
            return (Criteria) this;
        }

        public Criteria andConsultPriceGreaterThan(Float value) {
            addCriterion("consult_price >", value, "consultPrice");
            return (Criteria) this;
        }

        public Criteria andConsultPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("consult_price >=", value, "consultPrice");
            return (Criteria) this;
        }

        public Criteria andConsultPriceLessThan(Float value) {
            addCriterion("consult_price <", value, "consultPrice");
            return (Criteria) this;
        }

        public Criteria andConsultPriceLessThanOrEqualTo(Float value) {
            addCriterion("consult_price <=", value, "consultPrice");
            return (Criteria) this;
        }

        public Criteria andConsultPriceIn(List<Float> values) {
            addCriterion("consult_price in", values, "consultPrice");
            return (Criteria) this;
        }

        public Criteria andConsultPriceNotIn(List<Float> values) {
            addCriterion("consult_price not in", values, "consultPrice");
            return (Criteria) this;
        }

        public Criteria andConsultPriceBetween(Float value1, Float value2) {
            addCriterion("consult_price between", value1, value2, "consultPrice");
            return (Criteria) this;
        }

        public Criteria andConsultPriceNotBetween(Float value1, Float value2) {
            addCriterion("consult_price not between", value1, value2, "consultPrice");
            return (Criteria) this;
        }

        public Criteria andConsultContentIsNull() {
            addCriterion("consult_content is null");
            return (Criteria) this;
        }

        public Criteria andConsultContentIsNotNull() {
            addCriterion("consult_content is not null");
            return (Criteria) this;
        }

        public Criteria andConsultContentEqualTo(String value) {
            addCriterion("consult_content =", value, "consultContent");
            return (Criteria) this;
        }

        public Criteria andConsultContentNotEqualTo(String value) {
            addCriterion("consult_content <>", value, "consultContent");
            return (Criteria) this;
        }

        public Criteria andConsultContentGreaterThan(String value) {
            addCriterion("consult_content >", value, "consultContent");
            return (Criteria) this;
        }

        public Criteria andConsultContentGreaterThanOrEqualTo(String value) {
            addCriterion("consult_content >=", value, "consultContent");
            return (Criteria) this;
        }

        public Criteria andConsultContentLessThan(String value) {
            addCriterion("consult_content <", value, "consultContent");
            return (Criteria) this;
        }

        public Criteria andConsultContentLessThanOrEqualTo(String value) {
            addCriterion("consult_content <=", value, "consultContent");
            return (Criteria) this;
        }

        public Criteria andConsultContentLike(String value) {
            addCriterion("consult_content like", value, "consultContent");
            return (Criteria) this;
        }

        public Criteria andConsultContentNotLike(String value) {
            addCriterion("consult_content not like", value, "consultContent");
            return (Criteria) this;
        }

        public Criteria andConsultContentIn(List<String> values) {
            addCriterion("consult_content in", values, "consultContent");
            return (Criteria) this;
        }

        public Criteria andConsultContentNotIn(List<String> values) {
            addCriterion("consult_content not in", values, "consultContent");
            return (Criteria) this;
        }

        public Criteria andConsultContentBetween(String value1, String value2) {
            addCriterion("consult_content between", value1, value2, "consultContent");
            return (Criteria) this;
        }

        public Criteria andConsultContentNotBetween(String value1, String value2) {
            addCriterion("consult_content not between", value1, value2, "consultContent");
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