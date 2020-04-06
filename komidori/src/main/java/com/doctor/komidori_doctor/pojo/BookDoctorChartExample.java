package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookDoctorChartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookDoctorChartExample() {
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

        public Criteria andBdocOrderIdIsNull() {
            addCriterion("bdoc_order_id is null");
            return (Criteria) this;
        }

        public Criteria andBdocOrderIdIsNotNull() {
            addCriterion("bdoc_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andBdocOrderIdEqualTo(Integer value) {
            addCriterion("bdoc_order_id =", value, "bdocOrderId");
            return (Criteria) this;
        }

        public Criteria andBdocOrderIdNotEqualTo(Integer value) {
            addCriterion("bdoc_order_id <>", value, "bdocOrderId");
            return (Criteria) this;
        }

        public Criteria andBdocOrderIdGreaterThan(Integer value) {
            addCriterion("bdoc_order_id >", value, "bdocOrderId");
            return (Criteria) this;
        }

        public Criteria andBdocOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bdoc_order_id >=", value, "bdocOrderId");
            return (Criteria) this;
        }

        public Criteria andBdocOrderIdLessThan(Integer value) {
            addCriterion("bdoc_order_id <", value, "bdocOrderId");
            return (Criteria) this;
        }

        public Criteria andBdocOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("bdoc_order_id <=", value, "bdocOrderId");
            return (Criteria) this;
        }

        public Criteria andBdocOrderIdIn(List<Integer> values) {
            addCriterion("bdoc_order_id in", values, "bdocOrderId");
            return (Criteria) this;
        }

        public Criteria andBdocOrderIdNotIn(List<Integer> values) {
            addCriterion("bdoc_order_id not in", values, "bdocOrderId");
            return (Criteria) this;
        }

        public Criteria andBdocOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("bdoc_order_id between", value1, value2, "bdocOrderId");
            return (Criteria) this;
        }

        public Criteria andBdocOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bdoc_order_id not between", value1, value2, "bdocOrderId");
            return (Criteria) this;
        }

        public Criteria andBdocMatIdIsNull() {
            addCriterion("bdoc_mat_id is null");
            return (Criteria) this;
        }

        public Criteria andBdocMatIdIsNotNull() {
            addCriterion("bdoc_mat_id is not null");
            return (Criteria) this;
        }

        public Criteria andBdocMatIdEqualTo(Integer value) {
            addCriterion("bdoc_mat_id =", value, "bdocMatId");
            return (Criteria) this;
        }

        public Criteria andBdocMatIdNotEqualTo(Integer value) {
            addCriterion("bdoc_mat_id <>", value, "bdocMatId");
            return (Criteria) this;
        }

        public Criteria andBdocMatIdGreaterThan(Integer value) {
            addCriterion("bdoc_mat_id >", value, "bdocMatId");
            return (Criteria) this;
        }

        public Criteria andBdocMatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bdoc_mat_id >=", value, "bdocMatId");
            return (Criteria) this;
        }

        public Criteria andBdocMatIdLessThan(Integer value) {
            addCriterion("bdoc_mat_id <", value, "bdocMatId");
            return (Criteria) this;
        }

        public Criteria andBdocMatIdLessThanOrEqualTo(Integer value) {
            addCriterion("bdoc_mat_id <=", value, "bdocMatId");
            return (Criteria) this;
        }

        public Criteria andBdocMatIdIn(List<Integer> values) {
            addCriterion("bdoc_mat_id in", values, "bdocMatId");
            return (Criteria) this;
        }

        public Criteria andBdocMatIdNotIn(List<Integer> values) {
            addCriterion("bdoc_mat_id not in", values, "bdocMatId");
            return (Criteria) this;
        }

        public Criteria andBdocMatIdBetween(Integer value1, Integer value2) {
            addCriterion("bdoc_mat_id between", value1, value2, "bdocMatId");
            return (Criteria) this;
        }

        public Criteria andBdocMatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bdoc_mat_id not between", value1, value2, "bdocMatId");
            return (Criteria) this;
        }

        public Criteria andBdocDocIdIsNull() {
            addCriterion("bdoc_doc_id is null");
            return (Criteria) this;
        }

        public Criteria andBdocDocIdIsNotNull() {
            addCriterion("bdoc_doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andBdocDocIdEqualTo(Integer value) {
            addCriterion("bdoc_doc_id =", value, "bdocDocId");
            return (Criteria) this;
        }

        public Criteria andBdocDocIdNotEqualTo(Integer value) {
            addCriterion("bdoc_doc_id <>", value, "bdocDocId");
            return (Criteria) this;
        }

        public Criteria andBdocDocIdGreaterThan(Integer value) {
            addCriterion("bdoc_doc_id >", value, "bdocDocId");
            return (Criteria) this;
        }

        public Criteria andBdocDocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bdoc_doc_id >=", value, "bdocDocId");
            return (Criteria) this;
        }

        public Criteria andBdocDocIdLessThan(Integer value) {
            addCriterion("bdoc_doc_id <", value, "bdocDocId");
            return (Criteria) this;
        }

        public Criteria andBdocDocIdLessThanOrEqualTo(Integer value) {
            addCriterion("bdoc_doc_id <=", value, "bdocDocId");
            return (Criteria) this;
        }

        public Criteria andBdocDocIdIn(List<Integer> values) {
            addCriterion("bdoc_doc_id in", values, "bdocDocId");
            return (Criteria) this;
        }

        public Criteria andBdocDocIdNotIn(List<Integer> values) {
            addCriterion("bdoc_doc_id not in", values, "bdocDocId");
            return (Criteria) this;
        }

        public Criteria andBdocDocIdBetween(Integer value1, Integer value2) {
            addCriterion("bdoc_doc_id between", value1, value2, "bdocDocId");
            return (Criteria) this;
        }

        public Criteria andBdocDocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bdoc_doc_id not between", value1, value2, "bdocDocId");
            return (Criteria) this;
        }

        public Criteria andBdocServiceDateIsNull() {
            addCriterion("bdoc_service_date is null");
            return (Criteria) this;
        }

        public Criteria andBdocServiceDateIsNotNull() {
            addCriterion("bdoc_service_date is not null");
            return (Criteria) this;
        }

        public Criteria andBdocServiceDateEqualTo(Date value) {
            addCriterion("bdoc_service_date =", value, "bdocServiceDate");
            return (Criteria) this;
        }

        public Criteria andBdocServiceDateNotEqualTo(Date value) {
            addCriterion("bdoc_service_date <>", value, "bdocServiceDate");
            return (Criteria) this;
        }

        public Criteria andBdocServiceDateGreaterThan(Date value) {
            addCriterion("bdoc_service_date >", value, "bdocServiceDate");
            return (Criteria) this;
        }

        public Criteria andBdocServiceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("bdoc_service_date >=", value, "bdocServiceDate");
            return (Criteria) this;
        }

        public Criteria andBdocServiceDateLessThan(Date value) {
            addCriterion("bdoc_service_date <", value, "bdocServiceDate");
            return (Criteria) this;
        }

        public Criteria andBdocServiceDateLessThanOrEqualTo(Date value) {
            addCriterion("bdoc_service_date <=", value, "bdocServiceDate");
            return (Criteria) this;
        }

        public Criteria andBdocServiceDateIn(List<Date> values) {
            addCriterion("bdoc_service_date in", values, "bdocServiceDate");
            return (Criteria) this;
        }

        public Criteria andBdocServiceDateNotIn(List<Date> values) {
            addCriterion("bdoc_service_date not in", values, "bdocServiceDate");
            return (Criteria) this;
        }

        public Criteria andBdocServiceDateBetween(Date value1, Date value2) {
            addCriterion("bdoc_service_date between", value1, value2, "bdocServiceDate");
            return (Criteria) this;
        }

        public Criteria andBdocServiceDateNotBetween(Date value1, Date value2) {
            addCriterion("bdoc_service_date not between", value1, value2, "bdocServiceDate");
            return (Criteria) this;
        }

        public Criteria andBdocBookDateIsNull() {
            addCriterion("bdoc_book_date is null");
            return (Criteria) this;
        }

        public Criteria andBdocBookDateIsNotNull() {
            addCriterion("bdoc_book_date is not null");
            return (Criteria) this;
        }

        public Criteria andBdocBookDateEqualTo(Date value) {
            addCriterion("bdoc_book_date =", value, "bdocBookDate");
            return (Criteria) this;
        }

        public Criteria andBdocBookDateNotEqualTo(Date value) {
            addCriterion("bdoc_book_date <>", value, "bdocBookDate");
            return (Criteria) this;
        }

        public Criteria andBdocBookDateGreaterThan(Date value) {
            addCriterion("bdoc_book_date >", value, "bdocBookDate");
            return (Criteria) this;
        }

        public Criteria andBdocBookDateGreaterThanOrEqualTo(Date value) {
            addCriterion("bdoc_book_date >=", value, "bdocBookDate");
            return (Criteria) this;
        }

        public Criteria andBdocBookDateLessThan(Date value) {
            addCriterion("bdoc_book_date <", value, "bdocBookDate");
            return (Criteria) this;
        }

        public Criteria andBdocBookDateLessThanOrEqualTo(Date value) {
            addCriterion("bdoc_book_date <=", value, "bdocBookDate");
            return (Criteria) this;
        }

        public Criteria andBdocBookDateIn(List<Date> values) {
            addCriterion("bdoc_book_date in", values, "bdocBookDate");
            return (Criteria) this;
        }

        public Criteria andBdocBookDateNotIn(List<Date> values) {
            addCriterion("bdoc_book_date not in", values, "bdocBookDate");
            return (Criteria) this;
        }

        public Criteria andBdocBookDateBetween(Date value1, Date value2) {
            addCriterion("bdoc_book_date between", value1, value2, "bdocBookDate");
            return (Criteria) this;
        }

        public Criteria andBdocBookDateNotBetween(Date value1, Date value2) {
            addCriterion("bdoc_book_date not between", value1, value2, "bdocBookDate");
            return (Criteria) this;
        }

        public Criteria andBdocAddrIsNull() {
            addCriterion("bdoc_addr is null");
            return (Criteria) this;
        }

        public Criteria andBdocAddrIsNotNull() {
            addCriterion("bdoc_addr is not null");
            return (Criteria) this;
        }

        public Criteria andBdocAddrEqualTo(String value) {
            addCriterion("bdoc_addr =", value, "bdocAddr");
            return (Criteria) this;
        }

        public Criteria andBdocAddrNotEqualTo(String value) {
            addCriterion("bdoc_addr <>", value, "bdocAddr");
            return (Criteria) this;
        }

        public Criteria andBdocAddrGreaterThan(String value) {
            addCriterion("bdoc_addr >", value, "bdocAddr");
            return (Criteria) this;
        }

        public Criteria andBdocAddrGreaterThanOrEqualTo(String value) {
            addCriterion("bdoc_addr >=", value, "bdocAddr");
            return (Criteria) this;
        }

        public Criteria andBdocAddrLessThan(String value) {
            addCriterion("bdoc_addr <", value, "bdocAddr");
            return (Criteria) this;
        }

        public Criteria andBdocAddrLessThanOrEqualTo(String value) {
            addCriterion("bdoc_addr <=", value, "bdocAddr");
            return (Criteria) this;
        }

        public Criteria andBdocAddrLike(String value) {
            addCriterion("bdoc_addr like", value, "bdocAddr");
            return (Criteria) this;
        }

        public Criteria andBdocAddrNotLike(String value) {
            addCriterion("bdoc_addr not like", value, "bdocAddr");
            return (Criteria) this;
        }

        public Criteria andBdocAddrIn(List<String> values) {
            addCriterion("bdoc_addr in", values, "bdocAddr");
            return (Criteria) this;
        }

        public Criteria andBdocAddrNotIn(List<String> values) {
            addCriterion("bdoc_addr not in", values, "bdocAddr");
            return (Criteria) this;
        }

        public Criteria andBdocAddrBetween(String value1, String value2) {
            addCriterion("bdoc_addr between", value1, value2, "bdocAddr");
            return (Criteria) this;
        }

        public Criteria andBdocAddrNotBetween(String value1, String value2) {
            addCriterion("bdoc_addr not between", value1, value2, "bdocAddr");
            return (Criteria) this;
        }

        public Criteria andBdocPriceIsNull() {
            addCriterion("bdoc_price is null");
            return (Criteria) this;
        }

        public Criteria andBdocPriceIsNotNull() {
            addCriterion("bdoc_price is not null");
            return (Criteria) this;
        }

        public Criteria andBdocPriceEqualTo(Float value) {
            addCriterion("bdoc_price =", value, "bdocPrice");
            return (Criteria) this;
        }

        public Criteria andBdocPriceNotEqualTo(Float value) {
            addCriterion("bdoc_price <>", value, "bdocPrice");
            return (Criteria) this;
        }

        public Criteria andBdocPriceGreaterThan(Float value) {
            addCriterion("bdoc_price >", value, "bdocPrice");
            return (Criteria) this;
        }

        public Criteria andBdocPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("bdoc_price >=", value, "bdocPrice");
            return (Criteria) this;
        }

        public Criteria andBdocPriceLessThan(Float value) {
            addCriterion("bdoc_price <", value, "bdocPrice");
            return (Criteria) this;
        }

        public Criteria andBdocPriceLessThanOrEqualTo(Float value) {
            addCriterion("bdoc_price <=", value, "bdocPrice");
            return (Criteria) this;
        }

        public Criteria andBdocPriceIn(List<Float> values) {
            addCriterion("bdoc_price in", values, "bdocPrice");
            return (Criteria) this;
        }

        public Criteria andBdocPriceNotIn(List<Float> values) {
            addCriterion("bdoc_price not in", values, "bdocPrice");
            return (Criteria) this;
        }

        public Criteria andBdocPriceBetween(Float value1, Float value2) {
            addCriterion("bdoc_price between", value1, value2, "bdocPrice");
            return (Criteria) this;
        }

        public Criteria andBdocPriceNotBetween(Float value1, Float value2) {
            addCriterion("bdoc_price not between", value1, value2, "bdocPrice");
            return (Criteria) this;
        }

        public Criteria andBdocRemarkIsNull() {
            addCriterion("bdoc_remark is null");
            return (Criteria) this;
        }

        public Criteria andBdocRemarkIsNotNull() {
            addCriterion("bdoc_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBdocRemarkEqualTo(String value) {
            addCriterion("bdoc_remark =", value, "bdocRemark");
            return (Criteria) this;
        }

        public Criteria andBdocRemarkNotEqualTo(String value) {
            addCriterion("bdoc_remark <>", value, "bdocRemark");
            return (Criteria) this;
        }

        public Criteria andBdocRemarkGreaterThan(String value) {
            addCriterion("bdoc_remark >", value, "bdocRemark");
            return (Criteria) this;
        }

        public Criteria andBdocRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("bdoc_remark >=", value, "bdocRemark");
            return (Criteria) this;
        }

        public Criteria andBdocRemarkLessThan(String value) {
            addCriterion("bdoc_remark <", value, "bdocRemark");
            return (Criteria) this;
        }

        public Criteria andBdocRemarkLessThanOrEqualTo(String value) {
            addCriterion("bdoc_remark <=", value, "bdocRemark");
            return (Criteria) this;
        }

        public Criteria andBdocRemarkLike(String value) {
            addCriterion("bdoc_remark like", value, "bdocRemark");
            return (Criteria) this;
        }

        public Criteria andBdocRemarkNotLike(String value) {
            addCriterion("bdoc_remark not like", value, "bdocRemark");
            return (Criteria) this;
        }

        public Criteria andBdocRemarkIn(List<String> values) {
            addCriterion("bdoc_remark in", values, "bdocRemark");
            return (Criteria) this;
        }

        public Criteria andBdocRemarkNotIn(List<String> values) {
            addCriterion("bdoc_remark not in", values, "bdocRemark");
            return (Criteria) this;
        }

        public Criteria andBdocRemarkBetween(String value1, String value2) {
            addCriterion("bdoc_remark between", value1, value2, "bdocRemark");
            return (Criteria) this;
        }

        public Criteria andBdocRemarkNotBetween(String value1, String value2) {
            addCriterion("bdoc_remark not between", value1, value2, "bdocRemark");
            return (Criteria) this;
        }

        public Criteria andBdocStatusIsNull() {
            addCriterion("bdoc_status is null");
            return (Criteria) this;
        }

        public Criteria andBdocStatusIsNotNull() {
            addCriterion("bdoc_status is not null");
            return (Criteria) this;
        }

        public Criteria andBdocStatusEqualTo(Integer value) {
            addCriterion("bdoc_status =", value, "bdocStatus");
            return (Criteria) this;
        }

        public Criteria andBdocStatusNotEqualTo(Integer value) {
            addCriterion("bdoc_status <>", value, "bdocStatus");
            return (Criteria) this;
        }

        public Criteria andBdocStatusGreaterThan(Integer value) {
            addCriterion("bdoc_status >", value, "bdocStatus");
            return (Criteria) this;
        }

        public Criteria andBdocStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("bdoc_status >=", value, "bdocStatus");
            return (Criteria) this;
        }

        public Criteria andBdocStatusLessThan(Integer value) {
            addCriterion("bdoc_status <", value, "bdocStatus");
            return (Criteria) this;
        }

        public Criteria andBdocStatusLessThanOrEqualTo(Integer value) {
            addCriterion("bdoc_status <=", value, "bdocStatus");
            return (Criteria) this;
        }

        public Criteria andBdocStatusIn(List<Integer> values) {
            addCriterion("bdoc_status in", values, "bdocStatus");
            return (Criteria) this;
        }

        public Criteria andBdocStatusNotIn(List<Integer> values) {
            addCriterion("bdoc_status not in", values, "bdocStatus");
            return (Criteria) this;
        }

        public Criteria andBdocStatusBetween(Integer value1, Integer value2) {
            addCriterion("bdoc_status between", value1, value2, "bdocStatus");
            return (Criteria) this;
        }

        public Criteria andBdocStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("bdoc_status not between", value1, value2, "bdocStatus");
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