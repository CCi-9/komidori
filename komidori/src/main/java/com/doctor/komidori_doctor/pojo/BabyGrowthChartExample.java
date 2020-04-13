package com.doctor.komidori_doctor.pojo;

import java.util.ArrayList;
import java.util.List;

public class BabyGrowthChartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BabyGrowthChartExample() {
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

        public Criteria andBabyGrowthIdIsNull() {
            addCriterion("baby_growth_id is null");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthIdIsNotNull() {
            addCriterion("baby_growth_id is not null");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthIdEqualTo(Integer value) {
            addCriterion("baby_growth_id =", value, "babyGrowthId");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthIdNotEqualTo(Integer value) {
            addCriterion("baby_growth_id <>", value, "babyGrowthId");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthIdGreaterThan(Integer value) {
            addCriterion("baby_growth_id >", value, "babyGrowthId");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("baby_growth_id >=", value, "babyGrowthId");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthIdLessThan(Integer value) {
            addCriterion("baby_growth_id <", value, "babyGrowthId");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthIdLessThanOrEqualTo(Integer value) {
            addCriterion("baby_growth_id <=", value, "babyGrowthId");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthIdIn(List<Integer> values) {
            addCriterion("baby_growth_id in", values, "babyGrowthId");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthIdNotIn(List<Integer> values) {
            addCriterion("baby_growth_id not in", values, "babyGrowthId");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthIdBetween(Integer value1, Integer value2) {
            addCriterion("baby_growth_id between", value1, value2, "babyGrowthId");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthIdNotBetween(Integer value1, Integer value2) {
            addCriterion("baby_growth_id not between", value1, value2, "babyGrowthId");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthDateIsNull() {
            addCriterion("baby_growth_date is null");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthDateIsNotNull() {
            addCriterion("baby_growth_date is not null");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthDateEqualTo(String value) {
            addCriterion("baby_growth_date =", value, "babyGrowthDate");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthDateNotEqualTo(String value) {
            addCriterion("baby_growth_date <>", value, "babyGrowthDate");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthDateGreaterThan(String value) {
            addCriterion("baby_growth_date >", value, "babyGrowthDate");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthDateGreaterThanOrEqualTo(String value) {
            addCriterion("baby_growth_date >=", value, "babyGrowthDate");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthDateLessThan(String value) {
            addCriterion("baby_growth_date <", value, "babyGrowthDate");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthDateLessThanOrEqualTo(String value) {
            addCriterion("baby_growth_date <=", value, "babyGrowthDate");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthDateLike(String value) {
            addCriterion("baby_growth_date like", value, "babyGrowthDate");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthDateNotLike(String value) {
            addCriterion("baby_growth_date not like", value, "babyGrowthDate");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthDateIn(List<String> values) {
            addCriterion("baby_growth_date in", values, "babyGrowthDate");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthDateNotIn(List<String> values) {
            addCriterion("baby_growth_date not in", values, "babyGrowthDate");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthDateBetween(String value1, String value2) {
            addCriterion("baby_growth_date between", value1, value2, "babyGrowthDate");
            return (Criteria) this;
        }

        public Criteria andBabyGrowthDateNotBetween(String value1, String value2) {
            addCriterion("baby_growth_date not between", value1, value2, "babyGrowthDate");
            return (Criteria) this;
        }

        public Criteria andBpdIsNull() {
            addCriterion("BPD is null");
            return (Criteria) this;
        }

        public Criteria andBpdIsNotNull() {
            addCriterion("BPD is not null");
            return (Criteria) this;
        }

        public Criteria andBpdEqualTo(Float value) {
            addCriterion("BPD =", value, "bpd");
            return (Criteria) this;
        }

        public Criteria andBpdNotEqualTo(Float value) {
            addCriterion("BPD <>", value, "bpd");
            return (Criteria) this;
        }

        public Criteria andBpdGreaterThan(Float value) {
            addCriterion("BPD >", value, "bpd");
            return (Criteria) this;
        }

        public Criteria andBpdGreaterThanOrEqualTo(Float value) {
            addCriterion("BPD >=", value, "bpd");
            return (Criteria) this;
        }

        public Criteria andBpdLessThan(Float value) {
            addCriterion("BPD <", value, "bpd");
            return (Criteria) this;
        }

        public Criteria andBpdLessThanOrEqualTo(Float value) {
            addCriterion("BPD <=", value, "bpd");
            return (Criteria) this;
        }

        public Criteria andBpdIn(List<Float> values) {
            addCriterion("BPD in", values, "bpd");
            return (Criteria) this;
        }

        public Criteria andBpdNotIn(List<Float> values) {
            addCriterion("BPD not in", values, "bpd");
            return (Criteria) this;
        }

        public Criteria andBpdBetween(Float value1, Float value2) {
            addCriterion("BPD between", value1, value2, "bpd");
            return (Criteria) this;
        }

        public Criteria andBpdNotBetween(Float value1, Float value2) {
            addCriterion("BPD not between", value1, value2, "bpd");
            return (Criteria) this;
        }

        public Criteria andAcIsNull() {
            addCriterion("AC is null");
            return (Criteria) this;
        }

        public Criteria andAcIsNotNull() {
            addCriterion("AC is not null");
            return (Criteria) this;
        }

        public Criteria andAcEqualTo(Float value) {
            addCriterion("AC =", value, "ac");
            return (Criteria) this;
        }

        public Criteria andAcNotEqualTo(Float value) {
            addCriterion("AC <>", value, "ac");
            return (Criteria) this;
        }

        public Criteria andAcGreaterThan(Float value) {
            addCriterion("AC >", value, "ac");
            return (Criteria) this;
        }

        public Criteria andAcGreaterThanOrEqualTo(Float value) {
            addCriterion("AC >=", value, "ac");
            return (Criteria) this;
        }

        public Criteria andAcLessThan(Float value) {
            addCriterion("AC <", value, "ac");
            return (Criteria) this;
        }

        public Criteria andAcLessThanOrEqualTo(Float value) {
            addCriterion("AC <=", value, "ac");
            return (Criteria) this;
        }

        public Criteria andAcIn(List<Float> values) {
            addCriterion("AC in", values, "ac");
            return (Criteria) this;
        }

        public Criteria andAcNotIn(List<Float> values) {
            addCriterion("AC not in", values, "ac");
            return (Criteria) this;
        }

        public Criteria andAcBetween(Float value1, Float value2) {
            addCriterion("AC between", value1, value2, "ac");
            return (Criteria) this;
        }

        public Criteria andAcNotBetween(Float value1, Float value2) {
            addCriterion("AC not between", value1, value2, "ac");
            return (Criteria) this;
        }

        public Criteria andFlIsNull() {
            addCriterion("FL is null");
            return (Criteria) this;
        }

        public Criteria andFlIsNotNull() {
            addCriterion("FL is not null");
            return (Criteria) this;
        }

        public Criteria andFlEqualTo(Float value) {
            addCriterion("FL =", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotEqualTo(Float value) {
            addCriterion("FL <>", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlGreaterThan(Float value) {
            addCriterion("FL >", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlGreaterThanOrEqualTo(Float value) {
            addCriterion("FL >=", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlLessThan(Float value) {
            addCriterion("FL <", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlLessThanOrEqualTo(Float value) {
            addCriterion("FL <=", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlIn(List<Float> values) {
            addCriterion("FL in", values, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotIn(List<Float> values) {
            addCriterion("FL not in", values, "fl");
            return (Criteria) this;
        }

        public Criteria andFlBetween(Float value1, Float value2) {
            addCriterion("FL between", value1, value2, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotBetween(Float value1, Float value2) {
            addCriterion("FL not between", value1, value2, "fl");
            return (Criteria) this;
        }

        public Criteria andMinweightIsNull() {
            addCriterion("minweight is null");
            return (Criteria) this;
        }

        public Criteria andMinweightIsNotNull() {
            addCriterion("minweight is not null");
            return (Criteria) this;
        }

        public Criteria andMinweightEqualTo(Float value) {
            addCriterion("minweight =", value, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightNotEqualTo(Float value) {
            addCriterion("minweight <>", value, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightGreaterThan(Float value) {
            addCriterion("minweight >", value, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightGreaterThanOrEqualTo(Float value) {
            addCriterion("minweight >=", value, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightLessThan(Float value) {
            addCriterion("minweight <", value, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightLessThanOrEqualTo(Float value) {
            addCriterion("minweight <=", value, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightIn(List<Float> values) {
            addCriterion("minweight in", values, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightNotIn(List<Float> values) {
            addCriterion("minweight not in", values, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightBetween(Float value1, Float value2) {
            addCriterion("minweight between", value1, value2, "minweight");
            return (Criteria) this;
        }

        public Criteria andMinweightNotBetween(Float value1, Float value2) {
            addCriterion("minweight not between", value1, value2, "minweight");
            return (Criteria) this;
        }

        public Criteria andMaxwightIsNull() {
            addCriterion("maxwight is null");
            return (Criteria) this;
        }

        public Criteria andMaxwightIsNotNull() {
            addCriterion("maxwight is not null");
            return (Criteria) this;
        }

        public Criteria andMaxwightEqualTo(Float value) {
            addCriterion("maxwight =", value, "maxwight");
            return (Criteria) this;
        }

        public Criteria andMaxwightNotEqualTo(Float value) {
            addCriterion("maxwight <>", value, "maxwight");
            return (Criteria) this;
        }

        public Criteria andMaxwightGreaterThan(Float value) {
            addCriterion("maxwight >", value, "maxwight");
            return (Criteria) this;
        }

        public Criteria andMaxwightGreaterThanOrEqualTo(Float value) {
            addCriterion("maxwight >=", value, "maxwight");
            return (Criteria) this;
        }

        public Criteria andMaxwightLessThan(Float value) {
            addCriterion("maxwight <", value, "maxwight");
            return (Criteria) this;
        }

        public Criteria andMaxwightLessThanOrEqualTo(Float value) {
            addCriterion("maxwight <=", value, "maxwight");
            return (Criteria) this;
        }

        public Criteria andMaxwightIn(List<Float> values) {
            addCriterion("maxwight in", values, "maxwight");
            return (Criteria) this;
        }

        public Criteria andMaxwightNotIn(List<Float> values) {
            addCriterion("maxwight not in", values, "maxwight");
            return (Criteria) this;
        }

        public Criteria andMaxwightBetween(Float value1, Float value2) {
            addCriterion("maxwight between", value1, value2, "maxwight");
            return (Criteria) this;
        }

        public Criteria andMaxwightNotBetween(Float value1, Float value2) {
            addCriterion("maxwight not between", value1, value2, "maxwight");
            return (Criteria) this;
        }

        public Criteria andBpdRangeIsNull() {
            addCriterion("BPD_range is null");
            return (Criteria) this;
        }

        public Criteria andBpdRangeIsNotNull() {
            addCriterion("BPD_range is not null");
            return (Criteria) this;
        }

        public Criteria andBpdRangeEqualTo(Float value) {
            addCriterion("BPD_range =", value, "bpdRange");
            return (Criteria) this;
        }

        public Criteria andBpdRangeNotEqualTo(Float value) {
            addCriterion("BPD_range <>", value, "bpdRange");
            return (Criteria) this;
        }

        public Criteria andBpdRangeGreaterThan(Float value) {
            addCriterion("BPD_range >", value, "bpdRange");
            return (Criteria) this;
        }

        public Criteria andBpdRangeGreaterThanOrEqualTo(Float value) {
            addCriterion("BPD_range >=", value, "bpdRange");
            return (Criteria) this;
        }

        public Criteria andBpdRangeLessThan(Float value) {
            addCriterion("BPD_range <", value, "bpdRange");
            return (Criteria) this;
        }

        public Criteria andBpdRangeLessThanOrEqualTo(Float value) {
            addCriterion("BPD_range <=", value, "bpdRange");
            return (Criteria) this;
        }

        public Criteria andBpdRangeIn(List<Float> values) {
            addCriterion("BPD_range in", values, "bpdRange");
            return (Criteria) this;
        }

        public Criteria andBpdRangeNotIn(List<Float> values) {
            addCriterion("BPD_range not in", values, "bpdRange");
            return (Criteria) this;
        }

        public Criteria andBpdRangeBetween(Float value1, Float value2) {
            addCriterion("BPD_range between", value1, value2, "bpdRange");
            return (Criteria) this;
        }

        public Criteria andBpdRangeNotBetween(Float value1, Float value2) {
            addCriterion("BPD_range not between", value1, value2, "bpdRange");
            return (Criteria) this;
        }

        public Criteria andAcRangeIsNull() {
            addCriterion("AC_range is null");
            return (Criteria) this;
        }

        public Criteria andAcRangeIsNotNull() {
            addCriterion("AC_range is not null");
            return (Criteria) this;
        }

        public Criteria andAcRangeEqualTo(Float value) {
            addCriterion("AC_range =", value, "acRange");
            return (Criteria) this;
        }

        public Criteria andAcRangeNotEqualTo(Float value) {
            addCriterion("AC_range <>", value, "acRange");
            return (Criteria) this;
        }

        public Criteria andAcRangeGreaterThan(Float value) {
            addCriterion("AC_range >", value, "acRange");
            return (Criteria) this;
        }

        public Criteria andAcRangeGreaterThanOrEqualTo(Float value) {
            addCriterion("AC_range >=", value, "acRange");
            return (Criteria) this;
        }

        public Criteria andAcRangeLessThan(Float value) {
            addCriterion("AC_range <", value, "acRange");
            return (Criteria) this;
        }

        public Criteria andAcRangeLessThanOrEqualTo(Float value) {
            addCriterion("AC_range <=", value, "acRange");
            return (Criteria) this;
        }

        public Criteria andAcRangeIn(List<Float> values) {
            addCriterion("AC_range in", values, "acRange");
            return (Criteria) this;
        }

        public Criteria andAcRangeNotIn(List<Float> values) {
            addCriterion("AC_range not in", values, "acRange");
            return (Criteria) this;
        }

        public Criteria andAcRangeBetween(Float value1, Float value2) {
            addCriterion("AC_range between", value1, value2, "acRange");
            return (Criteria) this;
        }

        public Criteria andAcRangeNotBetween(Float value1, Float value2) {
            addCriterion("AC_range not between", value1, value2, "acRange");
            return (Criteria) this;
        }

        public Criteria andFlRangeIsNull() {
            addCriterion("FL_range is null");
            return (Criteria) this;
        }

        public Criteria andFlRangeIsNotNull() {
            addCriterion("FL_range is not null");
            return (Criteria) this;
        }

        public Criteria andFlRangeEqualTo(Float value) {
            addCriterion("FL_range =", value, "flRange");
            return (Criteria) this;
        }

        public Criteria andFlRangeNotEqualTo(Float value) {
            addCriterion("FL_range <>", value, "flRange");
            return (Criteria) this;
        }

        public Criteria andFlRangeGreaterThan(Float value) {
            addCriterion("FL_range >", value, "flRange");
            return (Criteria) this;
        }

        public Criteria andFlRangeGreaterThanOrEqualTo(Float value) {
            addCriterion("FL_range >=", value, "flRange");
            return (Criteria) this;
        }

        public Criteria andFlRangeLessThan(Float value) {
            addCriterion("FL_range <", value, "flRange");
            return (Criteria) this;
        }

        public Criteria andFlRangeLessThanOrEqualTo(Float value) {
            addCriterion("FL_range <=", value, "flRange");
            return (Criteria) this;
        }

        public Criteria andFlRangeIn(List<Float> values) {
            addCriterion("FL_range in", values, "flRange");
            return (Criteria) this;
        }

        public Criteria andFlRangeNotIn(List<Float> values) {
            addCriterion("FL_range not in", values, "flRange");
            return (Criteria) this;
        }

        public Criteria andFlRangeBetween(Float value1, Float value2) {
            addCriterion("FL_range between", value1, value2, "flRange");
            return (Criteria) this;
        }

        public Criteria andFlRangeNotBetween(Float value1, Float value2) {
            addCriterion("FL_range not between", value1, value2, "flRange");
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