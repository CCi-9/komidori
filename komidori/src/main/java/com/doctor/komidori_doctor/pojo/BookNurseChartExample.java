package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BookNurseChartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookNurseChartExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBnurseOrderIdIsNull() {
            addCriterion("bnurse_order_id is null");
            return (Criteria) this;
        }

        public Criteria andBnurseOrderIdIsNotNull() {
            addCriterion("bnurse_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andBnurseOrderIdEqualTo(Integer value) {
            addCriterion("bnurse_order_id =", value, "bnurseOrderId");
            return (Criteria) this;
        }

        public Criteria andBnurseOrderIdNotEqualTo(Integer value) {
            addCriterion("bnurse_order_id <>", value, "bnurseOrderId");
            return (Criteria) this;
        }

        public Criteria andBnurseOrderIdGreaterThan(Integer value) {
            addCriterion("bnurse_order_id >", value, "bnurseOrderId");
            return (Criteria) this;
        }

        public Criteria andBnurseOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bnurse_order_id >=", value, "bnurseOrderId");
            return (Criteria) this;
        }

        public Criteria andBnurseOrderIdLessThan(Integer value) {
            addCriterion("bnurse_order_id <", value, "bnurseOrderId");
            return (Criteria) this;
        }

        public Criteria andBnurseOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("bnurse_order_id <=", value, "bnurseOrderId");
            return (Criteria) this;
        }

        public Criteria andBnurseOrderIdIn(List<Integer> values) {
            addCriterion("bnurse_order_id in", values, "bnurseOrderId");
            return (Criteria) this;
        }

        public Criteria andBnurseOrderIdNotIn(List<Integer> values) {
            addCriterion("bnurse_order_id not in", values, "bnurseOrderId");
            return (Criteria) this;
        }

        public Criteria andBnurseOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("bnurse_order_id between", value1, value2, "bnurseOrderId");
            return (Criteria) this;
        }

        public Criteria andBnurseOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bnurse_order_id not between", value1, value2, "bnurseOrderId");
            return (Criteria) this;
        }

        public Criteria andBnurseNurseIdIsNull() {
            addCriterion("bnurse_nurse_id is null");
            return (Criteria) this;
        }

        public Criteria andBnurseNurseIdIsNotNull() {
            addCriterion("bnurse_nurse_id is not null");
            return (Criteria) this;
        }

        public Criteria andBnurseNurseIdEqualTo(Integer value) {
            addCriterion("bnurse_nurse_id =", value, "bnurseNurseId");
            return (Criteria) this;
        }

        public Criteria andBnurseNurseIdNotEqualTo(Integer value) {
            addCriterion("bnurse_nurse_id <>", value, "bnurseNurseId");
            return (Criteria) this;
        }

        public Criteria andBnurseNurseIdGreaterThan(Integer value) {
            addCriterion("bnurse_nurse_id >", value, "bnurseNurseId");
            return (Criteria) this;
        }

        public Criteria andBnurseNurseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bnurse_nurse_id >=", value, "bnurseNurseId");
            return (Criteria) this;
        }

        public Criteria andBnurseNurseIdLessThan(Integer value) {
            addCriterion("bnurse_nurse_id <", value, "bnurseNurseId");
            return (Criteria) this;
        }

        public Criteria andBnurseNurseIdLessThanOrEqualTo(Integer value) {
            addCriterion("bnurse_nurse_id <=", value, "bnurseNurseId");
            return (Criteria) this;
        }

        public Criteria andBnurseNurseIdIn(List<Integer> values) {
            addCriterion("bnurse_nurse_id in", values, "bnurseNurseId");
            return (Criteria) this;
        }

        public Criteria andBnurseNurseIdNotIn(List<Integer> values) {
            addCriterion("bnurse_nurse_id not in", values, "bnurseNurseId");
            return (Criteria) this;
        }

        public Criteria andBnurseNurseIdBetween(Integer value1, Integer value2) {
            addCriterion("bnurse_nurse_id between", value1, value2, "bnurseNurseId");
            return (Criteria) this;
        }

        public Criteria andBnurseNurseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bnurse_nurse_id not between", value1, value2, "bnurseNurseId");
            return (Criteria) this;
        }

        public Criteria andBnurseMatIdIsNull() {
            addCriterion("bnurse_mat_id is null");
            return (Criteria) this;
        }

        public Criteria andBnurseMatIdIsNotNull() {
            addCriterion("bnurse_mat_id is not null");
            return (Criteria) this;
        }

        public Criteria andBnurseMatIdEqualTo(Integer value) {
            addCriterion("bnurse_mat_id =", value, "bnurseMatId");
            return (Criteria) this;
        }

        public Criteria andBnurseMatIdNotEqualTo(Integer value) {
            addCriterion("bnurse_mat_id <>", value, "bnurseMatId");
            return (Criteria) this;
        }

        public Criteria andBnurseMatIdGreaterThan(Integer value) {
            addCriterion("bnurse_mat_id >", value, "bnurseMatId");
            return (Criteria) this;
        }

        public Criteria andBnurseMatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bnurse_mat_id >=", value, "bnurseMatId");
            return (Criteria) this;
        }

        public Criteria andBnurseMatIdLessThan(Integer value) {
            addCriterion("bnurse_mat_id <", value, "bnurseMatId");
            return (Criteria) this;
        }

        public Criteria andBnurseMatIdLessThanOrEqualTo(Integer value) {
            addCriterion("bnurse_mat_id <=", value, "bnurseMatId");
            return (Criteria) this;
        }

        public Criteria andBnurseMatIdIn(List<Integer> values) {
            addCriterion("bnurse_mat_id in", values, "bnurseMatId");
            return (Criteria) this;
        }

        public Criteria andBnurseMatIdNotIn(List<Integer> values) {
            addCriterion("bnurse_mat_id not in", values, "bnurseMatId");
            return (Criteria) this;
        }

        public Criteria andBnurseMatIdBetween(Integer value1, Integer value2) {
            addCriterion("bnurse_mat_id between", value1, value2, "bnurseMatId");
            return (Criteria) this;
        }

        public Criteria andBnurseMatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bnurse_mat_id not between", value1, value2, "bnurseMatId");
            return (Criteria) this;
        }

        public Criteria andBnurseStartDateIsNull() {
            addCriterion("bnurse_start_date is null");
            return (Criteria) this;
        }

        public Criteria andBnurseStartDateIsNotNull() {
            addCriterion("bnurse_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andBnurseStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("bnurse_start_date =", value, "bnurseStartDate");
            return (Criteria) this;
        }

        public Criteria andBnurseStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("bnurse_start_date <>", value, "bnurseStartDate");
            return (Criteria) this;
        }

        public Criteria andBnurseStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("bnurse_start_date >", value, "bnurseStartDate");
            return (Criteria) this;
        }

        public Criteria andBnurseStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bnurse_start_date >=", value, "bnurseStartDate");
            return (Criteria) this;
        }

        public Criteria andBnurseStartDateLessThan(Date value) {
            addCriterionForJDBCDate("bnurse_start_date <", value, "bnurseStartDate");
            return (Criteria) this;
        }

        public Criteria andBnurseStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bnurse_start_date <=", value, "bnurseStartDate");
            return (Criteria) this;
        }

        public Criteria andBnurseStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("bnurse_start_date in", values, "bnurseStartDate");
            return (Criteria) this;
        }

        public Criteria andBnurseStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("bnurse_start_date not in", values, "bnurseStartDate");
            return (Criteria) this;
        }

        public Criteria andBnurseStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bnurse_start_date between", value1, value2, "bnurseStartDate");
            return (Criteria) this;
        }

        public Criteria andBnurseStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bnurse_start_date not between", value1, value2, "bnurseStartDate");
            return (Criteria) this;
        }

        public Criteria andBnurseEndDateIsNull() {
            addCriterion("bnurse_end_date is null");
            return (Criteria) this;
        }

        public Criteria andBnurseEndDateIsNotNull() {
            addCriterion("bnurse_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andBnurseEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("bnurse_end_date =", value, "bnurseEndDate");
            return (Criteria) this;
        }

        public Criteria andBnurseEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("bnurse_end_date <>", value, "bnurseEndDate");
            return (Criteria) this;
        }

        public Criteria andBnurseEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("bnurse_end_date >", value, "bnurseEndDate");
            return (Criteria) this;
        }

        public Criteria andBnurseEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bnurse_end_date >=", value, "bnurseEndDate");
            return (Criteria) this;
        }

        public Criteria andBnurseEndDateLessThan(Date value) {
            addCriterionForJDBCDate("bnurse_end_date <", value, "bnurseEndDate");
            return (Criteria) this;
        }

        public Criteria andBnurseEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bnurse_end_date <=", value, "bnurseEndDate");
            return (Criteria) this;
        }

        public Criteria andBnurseEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("bnurse_end_date in", values, "bnurseEndDate");
            return (Criteria) this;
        }

        public Criteria andBnurseEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("bnurse_end_date not in", values, "bnurseEndDate");
            return (Criteria) this;
        }

        public Criteria andBnurseEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bnurse_end_date between", value1, value2, "bnurseEndDate");
            return (Criteria) this;
        }

        public Criteria andBnurseEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bnurse_end_date not between", value1, value2, "bnurseEndDate");
            return (Criteria) this;
        }

        public Criteria andBnursePriceIsNull() {
            addCriterion("bnurse_price is null");
            return (Criteria) this;
        }

        public Criteria andBnursePriceIsNotNull() {
            addCriterion("bnurse_price is not null");
            return (Criteria) this;
        }

        public Criteria andBnursePriceEqualTo(Float value) {
            addCriterion("bnurse_price =", value, "bnursePrice");
            return (Criteria) this;
        }

        public Criteria andBnursePriceNotEqualTo(Float value) {
            addCriterion("bnurse_price <>", value, "bnursePrice");
            return (Criteria) this;
        }

        public Criteria andBnursePriceGreaterThan(Float value) {
            addCriterion("bnurse_price >", value, "bnursePrice");
            return (Criteria) this;
        }

        public Criteria andBnursePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("bnurse_price >=", value, "bnursePrice");
            return (Criteria) this;
        }

        public Criteria andBnursePriceLessThan(Float value) {
            addCriterion("bnurse_price <", value, "bnursePrice");
            return (Criteria) this;
        }

        public Criteria andBnursePriceLessThanOrEqualTo(Float value) {
            addCriterion("bnurse_price <=", value, "bnursePrice");
            return (Criteria) this;
        }

        public Criteria andBnursePriceIn(List<Float> values) {
            addCriterion("bnurse_price in", values, "bnursePrice");
            return (Criteria) this;
        }

        public Criteria andBnursePriceNotIn(List<Float> values) {
            addCriterion("bnurse_price not in", values, "bnursePrice");
            return (Criteria) this;
        }

        public Criteria andBnursePriceBetween(Float value1, Float value2) {
            addCriterion("bnurse_price between", value1, value2, "bnursePrice");
            return (Criteria) this;
        }

        public Criteria andBnursePriceNotBetween(Float value1, Float value2) {
            addCriterion("bnurse_price not between", value1, value2, "bnursePrice");
            return (Criteria) this;
        }

        public Criteria andBnurseAddrIsNull() {
            addCriterion("bnurse_addr is null");
            return (Criteria) this;
        }

        public Criteria andBnurseAddrIsNotNull() {
            addCriterion("bnurse_addr is not null");
            return (Criteria) this;
        }

        public Criteria andBnurseAddrEqualTo(String value) {
            addCriterion("bnurse_addr =", value, "bnurseAddr");
            return (Criteria) this;
        }

        public Criteria andBnurseAddrNotEqualTo(String value) {
            addCriterion("bnurse_addr <>", value, "bnurseAddr");
            return (Criteria) this;
        }

        public Criteria andBnurseAddrGreaterThan(String value) {
            addCriterion("bnurse_addr >", value, "bnurseAddr");
            return (Criteria) this;
        }

        public Criteria andBnurseAddrGreaterThanOrEqualTo(String value) {
            addCriterion("bnurse_addr >=", value, "bnurseAddr");
            return (Criteria) this;
        }

        public Criteria andBnurseAddrLessThan(String value) {
            addCriterion("bnurse_addr <", value, "bnurseAddr");
            return (Criteria) this;
        }

        public Criteria andBnurseAddrLessThanOrEqualTo(String value) {
            addCriterion("bnurse_addr <=", value, "bnurseAddr");
            return (Criteria) this;
        }

        public Criteria andBnurseAddrLike(String value) {
            addCriterion("bnurse_addr like", value, "bnurseAddr");
            return (Criteria) this;
        }

        public Criteria andBnurseAddrNotLike(String value) {
            addCriterion("bnurse_addr not like", value, "bnurseAddr");
            return (Criteria) this;
        }

        public Criteria andBnurseAddrIn(List<String> values) {
            addCriterion("bnurse_addr in", values, "bnurseAddr");
            return (Criteria) this;
        }

        public Criteria andBnurseAddrNotIn(List<String> values) {
            addCriterion("bnurse_addr not in", values, "bnurseAddr");
            return (Criteria) this;
        }

        public Criteria andBnurseAddrBetween(String value1, String value2) {
            addCriterion("bnurse_addr between", value1, value2, "bnurseAddr");
            return (Criteria) this;
        }

        public Criteria andBnurseAddrNotBetween(String value1, String value2) {
            addCriterion("bnurse_addr not between", value1, value2, "bnurseAddr");
            return (Criteria) this;
        }

        public Criteria andBnurseStatusIsNull() {
            addCriterion("bnurse_status is null");
            return (Criteria) this;
        }

        public Criteria andBnurseStatusIsNotNull() {
            addCriterion("bnurse_status is not null");
            return (Criteria) this;
        }

        public Criteria andBnurseStatusEqualTo(Integer value) {
            addCriterion("bnurse_status =", value, "bnurseStatus");
            return (Criteria) this;
        }

        public Criteria andBnurseStatusNotEqualTo(Integer value) {
            addCriterion("bnurse_status <>", value, "bnurseStatus");
            return (Criteria) this;
        }

        public Criteria andBnurseStatusGreaterThan(Integer value) {
            addCriterion("bnurse_status >", value, "bnurseStatus");
            return (Criteria) this;
        }

        public Criteria andBnurseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("bnurse_status >=", value, "bnurseStatus");
            return (Criteria) this;
        }

        public Criteria andBnurseStatusLessThan(Integer value) {
            addCriterion("bnurse_status <", value, "bnurseStatus");
            return (Criteria) this;
        }

        public Criteria andBnurseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("bnurse_status <=", value, "bnurseStatus");
            return (Criteria) this;
        }

        public Criteria andBnurseStatusIn(List<Integer> values) {
            addCriterion("bnurse_status in", values, "bnurseStatus");
            return (Criteria) this;
        }

        public Criteria andBnurseStatusNotIn(List<Integer> values) {
            addCriterion("bnurse_status not in", values, "bnurseStatus");
            return (Criteria) this;
        }

        public Criteria andBnurseStatusBetween(Integer value1, Integer value2) {
            addCriterion("bnurse_status between", value1, value2, "bnurseStatus");
            return (Criteria) this;
        }

        public Criteria andBnurseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("bnurse_status not between", value1, value2, "bnurseStatus");
            return (Criteria) this;
        }

        public Criteria andBnurseRemarkIsNull() {
            addCriterion("bnurse_remark is null");
            return (Criteria) this;
        }

        public Criteria andBnurseRemarkIsNotNull() {
            addCriterion("bnurse_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBnurseRemarkEqualTo(String value) {
            addCriterion("bnurse_remark =", value, "bnurseRemark");
            return (Criteria) this;
        }

        public Criteria andBnurseRemarkNotEqualTo(String value) {
            addCriterion("bnurse_remark <>", value, "bnurseRemark");
            return (Criteria) this;
        }

        public Criteria andBnurseRemarkGreaterThan(String value) {
            addCriterion("bnurse_remark >", value, "bnurseRemark");
            return (Criteria) this;
        }

        public Criteria andBnurseRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("bnurse_remark >=", value, "bnurseRemark");
            return (Criteria) this;
        }

        public Criteria andBnurseRemarkLessThan(String value) {
            addCriterion("bnurse_remark <", value, "bnurseRemark");
            return (Criteria) this;
        }

        public Criteria andBnurseRemarkLessThanOrEqualTo(String value) {
            addCriterion("bnurse_remark <=", value, "bnurseRemark");
            return (Criteria) this;
        }

        public Criteria andBnurseRemarkLike(String value) {
            addCriterion("bnurse_remark like", value, "bnurseRemark");
            return (Criteria) this;
        }

        public Criteria andBnurseRemarkNotLike(String value) {
            addCriterion("bnurse_remark not like", value, "bnurseRemark");
            return (Criteria) this;
        }

        public Criteria andBnurseRemarkIn(List<String> values) {
            addCriterion("bnurse_remark in", values, "bnurseRemark");
            return (Criteria) this;
        }

        public Criteria andBnurseRemarkNotIn(List<String> values) {
            addCriterion("bnurse_remark not in", values, "bnurseRemark");
            return (Criteria) this;
        }

        public Criteria andBnurseRemarkBetween(String value1, String value2) {
            addCriterion("bnurse_remark between", value1, value2, "bnurseRemark");
            return (Criteria) this;
        }

        public Criteria andBnurseRemarkNotBetween(String value1, String value2) {
            addCriterion("bnurse_remark not between", value1, value2, "bnurseRemark");
            return (Criteria) this;
        }

        public Criteria andBnurseDateIsNull() {
            addCriterion("bnurse_date is null");
            return (Criteria) this;
        }

        public Criteria andBnurseDateIsNotNull() {
            addCriterion("bnurse_date is not null");
            return (Criteria) this;
        }

        public Criteria andBnurseDateEqualTo(Date value) {
            addCriterion("bnurse_date =", value, "bnurseDate");
            return (Criteria) this;
        }

        public Criteria andBnurseDateNotEqualTo(Date value) {
            addCriterion("bnurse_date <>", value, "bnurseDate");
            return (Criteria) this;
        }

        public Criteria andBnurseDateGreaterThan(Date value) {
            addCriterion("bnurse_date >", value, "bnurseDate");
            return (Criteria) this;
        }

        public Criteria andBnurseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("bnurse_date >=", value, "bnurseDate");
            return (Criteria) this;
        }

        public Criteria andBnurseDateLessThan(Date value) {
            addCriterion("bnurse_date <", value, "bnurseDate");
            return (Criteria) this;
        }

        public Criteria andBnurseDateLessThanOrEqualTo(Date value) {
            addCriterion("bnurse_date <=", value, "bnurseDate");
            return (Criteria) this;
        }

        public Criteria andBnurseDateIn(List<Date> values) {
            addCriterion("bnurse_date in", values, "bnurseDate");
            return (Criteria) this;
        }

        public Criteria andBnurseDateNotIn(List<Date> values) {
            addCriterion("bnurse_date not in", values, "bnurseDate");
            return (Criteria) this;
        }

        public Criteria andBnurseDateBetween(Date value1, Date value2) {
            addCriterion("bnurse_date between", value1, value2, "bnurseDate");
            return (Criteria) this;
        }

        public Criteria andBnurseDateNotBetween(Date value1, Date value2) {
            addCriterion("bnurse_date not between", value1, value2, "bnurseDate");
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