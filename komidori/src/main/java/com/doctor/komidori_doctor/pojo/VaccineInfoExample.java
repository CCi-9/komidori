package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.List;

public class VaccineInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VaccineInfoExample() {
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

        public Criteria andVaccineIdIsNull() {
            addCriterion("vaccine_id is null");
            return (Criteria) this;
        }

        public Criteria andVaccineIdIsNotNull() {
            addCriterion("vaccine_id is not null");
            return (Criteria) this;
        }

        public Criteria andVaccineIdEqualTo(Integer value) {
            addCriterion("vaccine_id =", value, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdNotEqualTo(Integer value) {
            addCriterion("vaccine_id <>", value, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdGreaterThan(Integer value) {
            addCriterion("vaccine_id >", value, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vaccine_id >=", value, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdLessThan(Integer value) {
            addCriterion("vaccine_id <", value, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdLessThanOrEqualTo(Integer value) {
            addCriterion("vaccine_id <=", value, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdIn(List<Integer> values) {
            addCriterion("vaccine_id in", values, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdNotIn(List<Integer> values) {
            addCriterion("vaccine_id not in", values, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdBetween(Integer value1, Integer value2) {
            addCriterion("vaccine_id between", value1, value2, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vaccine_id not between", value1, value2, "vaccineId");
            return (Criteria) this;
        }

        public Criteria andVaccineNameIsNull() {
            addCriterion("vaccine_name is null");
            return (Criteria) this;
        }

        public Criteria andVaccineNameIsNotNull() {
            addCriterion("vaccine_name is not null");
            return (Criteria) this;
        }

        public Criteria andVaccineNameEqualTo(String value) {
            addCriterion("vaccine_name =", value, "vaccineName");
            return (Criteria) this;
        }

        public Criteria andVaccineNameNotEqualTo(String value) {
            addCriterion("vaccine_name <>", value, "vaccineName");
            return (Criteria) this;
        }

        public Criteria andVaccineNameGreaterThan(String value) {
            addCriterion("vaccine_name >", value, "vaccineName");
            return (Criteria) this;
        }

        public Criteria andVaccineNameGreaterThanOrEqualTo(String value) {
            addCriterion("vaccine_name >=", value, "vaccineName");
            return (Criteria) this;
        }

        public Criteria andVaccineNameLessThan(String value) {
            addCriterion("vaccine_name <", value, "vaccineName");
            return (Criteria) this;
        }

        public Criteria andVaccineNameLessThanOrEqualTo(String value) {
            addCriterion("vaccine_name <=", value, "vaccineName");
            return (Criteria) this;
        }

        public Criteria andVaccineNameLike(String value) {
            addCriterion("vaccine_name like", value, "vaccineName");
            return (Criteria) this;
        }

        public Criteria andVaccineNameNotLike(String value) {
            addCriterion("vaccine_name not like", value, "vaccineName");
            return (Criteria) this;
        }

        public Criteria andVaccineNameIn(List<String> values) {
            addCriterion("vaccine_name in", values, "vaccineName");
            return (Criteria) this;
        }

        public Criteria andVaccineNameNotIn(List<String> values) {
            addCriterion("vaccine_name not in", values, "vaccineName");
            return (Criteria) this;
        }

        public Criteria andVaccineNameBetween(String value1, String value2) {
            addCriterion("vaccine_name between", value1, value2, "vaccineName");
            return (Criteria) this;
        }

        public Criteria andVaccineNameNotBetween(String value1, String value2) {
            addCriterion("vaccine_name not between", value1, value2, "vaccineName");
            return (Criteria) this;
        }

        public Criteria andVaccineFitDateIsNull() {
            addCriterion("vaccine_fit_date is null");
            return (Criteria) this;
        }

        public Criteria andVaccineFitDateIsNotNull() {
            addCriterion("vaccine_fit_date is not null");
            return (Criteria) this;
        }

        public Criteria andVaccineFitDateEqualTo(String value) {
            addCriterion("vaccine_fit_date =", value, "vaccineFitDate");
            return (Criteria) this;
        }

        public Criteria andVaccineFitDateNotEqualTo(String value) {
            addCriterion("vaccine_fit_date <>", value, "vaccineFitDate");
            return (Criteria) this;
        }

        public Criteria andVaccineFitDateGreaterThan(String value) {
            addCriterion("vaccine_fit_date >", value, "vaccineFitDate");
            return (Criteria) this;
        }

        public Criteria andVaccineFitDateGreaterThanOrEqualTo(String value) {
            addCriterion("vaccine_fit_date >=", value, "vaccineFitDate");
            return (Criteria) this;
        }

        public Criteria andVaccineFitDateLessThan(String value) {
            addCriterion("vaccine_fit_date <", value, "vaccineFitDate");
            return (Criteria) this;
        }

        public Criteria andVaccineFitDateLessThanOrEqualTo(String value) {
            addCriterion("vaccine_fit_date <=", value, "vaccineFitDate");
            return (Criteria) this;
        }

        public Criteria andVaccineFitDateLike(String value) {
            addCriterion("vaccine_fit_date like", value, "vaccineFitDate");
            return (Criteria) this;
        }

        public Criteria andVaccineFitDateNotLike(String value) {
            addCriterion("vaccine_fit_date not like", value, "vaccineFitDate");
            return (Criteria) this;
        }

        public Criteria andVaccineFitDateIn(List<String> values) {
            addCriterion("vaccine_fit_date in", values, "vaccineFitDate");
            return (Criteria) this;
        }

        public Criteria andVaccineFitDateNotIn(List<String> values) {
            addCriterion("vaccine_fit_date not in", values, "vaccineFitDate");
            return (Criteria) this;
        }

        public Criteria andVaccineFitDateBetween(String value1, String value2) {
            addCriterion("vaccine_fit_date between", value1, value2, "vaccineFitDate");
            return (Criteria) this;
        }

        public Criteria andVaccineFitDateNotBetween(String value1, String value2) {
            addCriterion("vaccine_fit_date not between", value1, value2, "vaccineFitDate");
            return (Criteria) this;
        }

        public Criteria andVaccineIntroduceIsNull() {
            addCriterion("vaccine_introduce is null");
            return (Criteria) this;
        }

        public Criteria andVaccineIntroduceIsNotNull() {
            addCriterion("vaccine_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andVaccineIntroduceEqualTo(String value) {
            addCriterion("vaccine_introduce =", value, "vaccineIntroduce");
            return (Criteria) this;
        }

        public Criteria andVaccineIntroduceNotEqualTo(String value) {
            addCriterion("vaccine_introduce <>", value, "vaccineIntroduce");
            return (Criteria) this;
        }

        public Criteria andVaccineIntroduceGreaterThan(String value) {
            addCriterion("vaccine_introduce >", value, "vaccineIntroduce");
            return (Criteria) this;
        }

        public Criteria andVaccineIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("vaccine_introduce >=", value, "vaccineIntroduce");
            return (Criteria) this;
        }

        public Criteria andVaccineIntroduceLessThan(String value) {
            addCriterion("vaccine_introduce <", value, "vaccineIntroduce");
            return (Criteria) this;
        }

        public Criteria andVaccineIntroduceLessThanOrEqualTo(String value) {
            addCriterion("vaccine_introduce <=", value, "vaccineIntroduce");
            return (Criteria) this;
        }

        public Criteria andVaccineIntroduceLike(String value) {
            addCriterion("vaccine_introduce like", value, "vaccineIntroduce");
            return (Criteria) this;
        }

        public Criteria andVaccineIntroduceNotLike(String value) {
            addCriterion("vaccine_introduce not like", value, "vaccineIntroduce");
            return (Criteria) this;
        }

        public Criteria andVaccineIntroduceIn(List<String> values) {
            addCriterion("vaccine_introduce in", values, "vaccineIntroduce");
            return (Criteria) this;
        }

        public Criteria andVaccineIntroduceNotIn(List<String> values) {
            addCriterion("vaccine_introduce not in", values, "vaccineIntroduce");
            return (Criteria) this;
        }

        public Criteria andVaccineIntroduceBetween(String value1, String value2) {
            addCriterion("vaccine_introduce between", value1, value2, "vaccineIntroduce");
            return (Criteria) this;
        }

        public Criteria andVaccineIntroduceNotBetween(String value1, String value2) {
            addCriterion("vaccine_introduce not between", value1, value2, "vaccineIntroduce");
            return (Criteria) this;
        }

        public Criteria andVaccinePreventionIsNull() {
            addCriterion("vaccine_prevention is null");
            return (Criteria) this;
        }

        public Criteria andVaccinePreventionIsNotNull() {
            addCriterion("vaccine_prevention is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinePreventionEqualTo(String value) {
            addCriterion("vaccine_prevention =", value, "vaccinePrevention");
            return (Criteria) this;
        }

        public Criteria andVaccinePreventionNotEqualTo(String value) {
            addCriterion("vaccine_prevention <>", value, "vaccinePrevention");
            return (Criteria) this;
        }

        public Criteria andVaccinePreventionGreaterThan(String value) {
            addCriterion("vaccine_prevention >", value, "vaccinePrevention");
            return (Criteria) this;
        }

        public Criteria andVaccinePreventionGreaterThanOrEqualTo(String value) {
            addCriterion("vaccine_prevention >=", value, "vaccinePrevention");
            return (Criteria) this;
        }

        public Criteria andVaccinePreventionLessThan(String value) {
            addCriterion("vaccine_prevention <", value, "vaccinePrevention");
            return (Criteria) this;
        }

        public Criteria andVaccinePreventionLessThanOrEqualTo(String value) {
            addCriterion("vaccine_prevention <=", value, "vaccinePrevention");
            return (Criteria) this;
        }

        public Criteria andVaccinePreventionLike(String value) {
            addCriterion("vaccine_prevention like", value, "vaccinePrevention");
            return (Criteria) this;
        }

        public Criteria andVaccinePreventionNotLike(String value) {
            addCriterion("vaccine_prevention not like", value, "vaccinePrevention");
            return (Criteria) this;
        }

        public Criteria andVaccinePreventionIn(List<String> values) {
            addCriterion("vaccine_prevention in", values, "vaccinePrevention");
            return (Criteria) this;
        }

        public Criteria andVaccinePreventionNotIn(List<String> values) {
            addCriterion("vaccine_prevention not in", values, "vaccinePrevention");
            return (Criteria) this;
        }

        public Criteria andVaccinePreventionBetween(String value1, String value2) {
            addCriterion("vaccine_prevention between", value1, value2, "vaccinePrevention");
            return (Criteria) this;
        }

        public Criteria andVaccinePreventionNotBetween(String value1, String value2) {
            addCriterion("vaccine_prevention not between", value1, value2, "vaccinePrevention");
            return (Criteria) this;
        }

        public Criteria andVaccineImmunityIsNull() {
            addCriterion("vaccine_immunity is null");
            return (Criteria) this;
        }

        public Criteria andVaccineImmunityIsNotNull() {
            addCriterion("vaccine_immunity is not null");
            return (Criteria) this;
        }

        public Criteria andVaccineImmunityEqualTo(String value) {
            addCriterion("vaccine_immunity =", value, "vaccineImmunity");
            return (Criteria) this;
        }

        public Criteria andVaccineImmunityNotEqualTo(String value) {
            addCriterion("vaccine_immunity <>", value, "vaccineImmunity");
            return (Criteria) this;
        }

        public Criteria andVaccineImmunityGreaterThan(String value) {
            addCriterion("vaccine_immunity >", value, "vaccineImmunity");
            return (Criteria) this;
        }

        public Criteria andVaccineImmunityGreaterThanOrEqualTo(String value) {
            addCriterion("vaccine_immunity >=", value, "vaccineImmunity");
            return (Criteria) this;
        }

        public Criteria andVaccineImmunityLessThan(String value) {
            addCriterion("vaccine_immunity <", value, "vaccineImmunity");
            return (Criteria) this;
        }

        public Criteria andVaccineImmunityLessThanOrEqualTo(String value) {
            addCriterion("vaccine_immunity <=", value, "vaccineImmunity");
            return (Criteria) this;
        }

        public Criteria andVaccineImmunityLike(String value) {
            addCriterion("vaccine_immunity like", value, "vaccineImmunity");
            return (Criteria) this;
        }

        public Criteria andVaccineImmunityNotLike(String value) {
            addCriterion("vaccine_immunity not like", value, "vaccineImmunity");
            return (Criteria) this;
        }

        public Criteria andVaccineImmunityIn(List<String> values) {
            addCriterion("vaccine_immunity in", values, "vaccineImmunity");
            return (Criteria) this;
        }

        public Criteria andVaccineImmunityNotIn(List<String> values) {
            addCriterion("vaccine_immunity not in", values, "vaccineImmunity");
            return (Criteria) this;
        }

        public Criteria andVaccineImmunityBetween(String value1, String value2) {
            addCriterion("vaccine_immunity between", value1, value2, "vaccineImmunity");
            return (Criteria) this;
        }

        public Criteria andVaccineImmunityNotBetween(String value1, String value2) {
            addCriterion("vaccine_immunity not between", value1, value2, "vaccineImmunity");
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