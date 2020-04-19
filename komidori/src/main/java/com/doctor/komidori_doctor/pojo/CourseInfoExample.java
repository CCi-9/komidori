package com.doctor.komidori_doctor.pojo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Component
public class CourseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseInfoExample() {
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

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNull() {
            addCriterion("course_type is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNotNull() {
            addCriterion("course_type is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeEqualTo(Integer value) {
            addCriterion("course_type =", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotEqualTo(Integer value) {
            addCriterion("course_type <>", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThan(Integer value) {
            addCriterion("course_type >", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_type >=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThan(Integer value) {
            addCriterion("course_type <", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("course_type <=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIn(List<Integer> values) {
            addCriterion("course_type in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotIn(List<Integer> values) {
            addCriterion("course_type not in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeBetween(Integer value1, Integer value2) {
            addCriterion("course_type between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("course_type not between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseDocIdIsNull() {
            addCriterion("course_doc_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseDocIdIsNotNull() {
            addCriterion("course_doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDocIdEqualTo(Integer value) {
            addCriterion("course_doc_id =", value, "courseDocId");
            return (Criteria) this;
        }

        public Criteria andCourseDocIdNotEqualTo(Integer value) {
            addCriterion("course_doc_id <>", value, "courseDocId");
            return (Criteria) this;
        }

        public Criteria andCourseDocIdGreaterThan(Integer value) {
            addCriterion("course_doc_id >", value, "courseDocId");
            return (Criteria) this;
        }

        public Criteria andCourseDocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_doc_id >=", value, "courseDocId");
            return (Criteria) this;
        }

        public Criteria andCourseDocIdLessThan(Integer value) {
            addCriterion("course_doc_id <", value, "courseDocId");
            return (Criteria) this;
        }

        public Criteria andCourseDocIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_doc_id <=", value, "courseDocId");
            return (Criteria) this;
        }

        public Criteria andCourseDocIdIn(List<Integer> values) {
            addCriterion("course_doc_id in", values, "courseDocId");
            return (Criteria) this;
        }

        public Criteria andCourseDocIdNotIn(List<Integer> values) {
            addCriterion("course_doc_id not in", values, "courseDocId");
            return (Criteria) this;
        }

        public Criteria andCourseDocIdBetween(Integer value1, Integer value2) {
            addCriterion("course_doc_id between", value1, value2, "courseDocId");
            return (Criteria) this;
        }

        public Criteria andCourseDocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_doc_id not between", value1, value2, "courseDocId");
            return (Criteria) this;
        }

        public Criteria andCourseClassIdIsNull() {
            addCriterion("course_class_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseClassIdIsNotNull() {
            addCriterion("course_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseClassIdEqualTo(Integer value) {
            addCriterion("course_class_id =", value, "courseClassId");
            return (Criteria) this;
        }

        public Criteria andCourseClassIdNotEqualTo(Integer value) {
            addCriterion("course_class_id <>", value, "courseClassId");
            return (Criteria) this;
        }

        public Criteria andCourseClassIdGreaterThan(Integer value) {
            addCriterion("course_class_id >", value, "courseClassId");
            return (Criteria) this;
        }

        public Criteria andCourseClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_class_id >=", value, "courseClassId");
            return (Criteria) this;
        }

        public Criteria andCourseClassIdLessThan(Integer value) {
            addCriterion("course_class_id <", value, "courseClassId");
            return (Criteria) this;
        }

        public Criteria andCourseClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_class_id <=", value, "courseClassId");
            return (Criteria) this;
        }

        public Criteria andCourseClassIdIn(List<Integer> values) {
            addCriterion("course_class_id in", values, "courseClassId");
            return (Criteria) this;
        }

        public Criteria andCourseClassIdNotIn(List<Integer> values) {
            addCriterion("course_class_id not in", values, "courseClassId");
            return (Criteria) this;
        }

        public Criteria andCourseClassIdBetween(Integer value1, Integer value2) {
            addCriterion("course_class_id between", value1, value2, "courseClassId");
            return (Criteria) this;
        }

        public Criteria andCourseClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_class_id not between", value1, value2, "courseClassId");
            return (Criteria) this;
        }

        public Criteria andCourseDateIsNull() {
            addCriterion("course_date is null");
            return (Criteria) this;
        }

        public Criteria andCourseDateIsNotNull() {
            addCriterion("course_date is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDateEqualTo(Date value) {
            addCriterion("course_date =", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotEqualTo(Date value) {
            addCriterion("course_date <>", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateGreaterThan(Date value) {
            addCriterion("course_date >", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("course_date >=", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateLessThan(Date value) {
            addCriterion("course_date <", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateLessThanOrEqualTo(Date value) {
            addCriterion("course_date <=", value, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateIn(List<Date> values) {
            addCriterion("course_date in", values, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotIn(List<Date> values) {
            addCriterion("course_date not in", values, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateBetween(Date value1, Date value2) {
            addCriterion("course_date between", value1, value2, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseDateNotBetween(Date value1, Date value2) {
            addCriterion("course_date not between", value1, value2, "courseDate");
            return (Criteria) this;
        }

        public Criteria andCourseGoodReviewIsNull() {
            addCriterion("course_good_review is null");
            return (Criteria) this;
        }

        public Criteria andCourseGoodReviewIsNotNull() {
            addCriterion("course_good_review is not null");
            return (Criteria) this;
        }

        public Criteria andCourseGoodReviewEqualTo(Integer value) {
            addCriterion("course_good_review =", value, "courseGoodReview");
            return (Criteria) this;
        }

        public Criteria andCourseGoodReviewNotEqualTo(Integer value) {
            addCriterion("course_good_review <>", value, "courseGoodReview");
            return (Criteria) this;
        }

        public Criteria andCourseGoodReviewGreaterThan(Integer value) {
            addCriterion("course_good_review >", value, "courseGoodReview");
            return (Criteria) this;
        }

        public Criteria andCourseGoodReviewGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_good_review >=", value, "courseGoodReview");
            return (Criteria) this;
        }

        public Criteria andCourseGoodReviewLessThan(Integer value) {
            addCriterion("course_good_review <", value, "courseGoodReview");
            return (Criteria) this;
        }

        public Criteria andCourseGoodReviewLessThanOrEqualTo(Integer value) {
            addCriterion("course_good_review <=", value, "courseGoodReview");
            return (Criteria) this;
        }

        public Criteria andCourseGoodReviewIn(List<Integer> values) {
            addCriterion("course_good_review in", values, "courseGoodReview");
            return (Criteria) this;
        }

        public Criteria andCourseGoodReviewNotIn(List<Integer> values) {
            addCriterion("course_good_review not in", values, "courseGoodReview");
            return (Criteria) this;
        }

        public Criteria andCourseGoodReviewBetween(Integer value1, Integer value2) {
            addCriterion("course_good_review between", value1, value2, "courseGoodReview");
            return (Criteria) this;
        }

        public Criteria andCourseGoodReviewNotBetween(Integer value1, Integer value2) {
            addCriterion("course_good_review not between", value1, value2, "courseGoodReview");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIsNull() {
            addCriterion("course_price is null");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIsNotNull() {
            addCriterion("course_price is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePriceEqualTo(Float value) {
            addCriterion("course_price =", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotEqualTo(Float value) {
            addCriterion("course_price <>", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceGreaterThan(Float value) {
            addCriterion("course_price >", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("course_price >=", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceLessThan(Float value) {
            addCriterion("course_price <", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceLessThanOrEqualTo(Float value) {
            addCriterion("course_price <=", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIn(List<Float> values) {
            addCriterion("course_price in", values, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotIn(List<Float> values) {
            addCriterion("course_price not in", values, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceBetween(Float value1, Float value2) {
            addCriterion("course_price between", value1, value2, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotBetween(Float value1, Float value2) {
            addCriterion("course_price not between", value1, value2, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCourseImgIsNull() {
            addCriterion("course_img is null");
            return (Criteria) this;
        }

        public Criteria andCourseImgIsNotNull() {
            addCriterion("course_img is not null");
            return (Criteria) this;
        }

        public Criteria andCourseImgEqualTo(String value) {
            addCriterion("course_img =", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgNotEqualTo(String value) {
            addCriterion("course_img <>", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgGreaterThan(String value) {
            addCriterion("course_img >", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgGreaterThanOrEqualTo(String value) {
            addCriterion("course_img >=", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgLessThan(String value) {
            addCriterion("course_img <", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgLessThanOrEqualTo(String value) {
            addCriterion("course_img <=", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgLike(String value) {
            addCriterion("course_img like", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgNotLike(String value) {
            addCriterion("course_img not like", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgIn(List<String> values) {
            addCriterion("course_img in", values, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgNotIn(List<String> values) {
            addCriterion("course_img not in", values, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgBetween(String value1, String value2) {
            addCriterion("course_img between", value1, value2, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgNotBetween(String value1, String value2) {
            addCriterion("course_img not between", value1, value2, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseTitleIsNull() {
            addCriterion("course_title is null");
            return (Criteria) this;
        }

        public Criteria andCourseTitleIsNotNull() {
            addCriterion("course_title is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTitleEqualTo(String value) {
            addCriterion("course_title =", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotEqualTo(String value) {
            addCriterion("course_title <>", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleGreaterThan(String value) {
            addCriterion("course_title >", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleGreaterThanOrEqualTo(String value) {
            addCriterion("course_title >=", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleLessThan(String value) {
            addCriterion("course_title <", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleLessThanOrEqualTo(String value) {
            addCriterion("course_title <=", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleLike(String value) {
            addCriterion("course_title like", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotLike(String value) {
            addCriterion("course_title not like", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleIn(List<String> values) {
            addCriterion("course_title in", values, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotIn(List<String> values) {
            addCriterion("course_title not in", values, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleBetween(String value1, String value2) {
            addCriterion("course_title between", value1, value2, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotBetween(String value1, String value2) {
            addCriterion("course_title not between", value1, value2, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseContentIsNull() {
            addCriterion("course_content is null");
            return (Criteria) this;
        }

        public Criteria andCourseContentIsNotNull() {
            addCriterion("course_content is not null");
            return (Criteria) this;
        }

        public Criteria andCourseContentEqualTo(String value) {
            addCriterion("course_content =", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentNotEqualTo(String value) {
            addCriterion("course_content <>", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentGreaterThan(String value) {
            addCriterion("course_content >", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentGreaterThanOrEqualTo(String value) {
            addCriterion("course_content >=", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentLessThan(String value) {
            addCriterion("course_content <", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentLessThanOrEqualTo(String value) {
            addCriterion("course_content <=", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentLike(String value) {
            addCriterion("course_content like", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentNotLike(String value) {
            addCriterion("course_content not like", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentIn(List<String> values) {
            addCriterion("course_content in", values, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentNotIn(List<String> values) {
            addCriterion("course_content not in", values, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentBetween(String value1, String value2) {
            addCriterion("course_content between", value1, value2, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentNotBetween(String value1, String value2) {
            addCriterion("course_content not between", value1, value2, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionIsNull() {
            addCriterion("course_introduction is null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionIsNotNull() {
            addCriterion("course_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionEqualTo(String value) {
            addCriterion("course_introduction =", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotEqualTo(String value) {
            addCriterion("course_introduction <>", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionGreaterThan(String value) {
            addCriterion("course_introduction >", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("course_introduction >=", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionLessThan(String value) {
            addCriterion("course_introduction <", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionLessThanOrEqualTo(String value) {
            addCriterion("course_introduction <=", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionLike(String value) {
            addCriterion("course_introduction like", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotLike(String value) {
            addCriterion("course_introduction not like", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionIn(List<String> values) {
            addCriterion("course_introduction in", values, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotIn(List<String> values) {
            addCriterion("course_introduction not in", values, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionBetween(String value1, String value2) {
            addCriterion("course_introduction between", value1, value2, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotBetween(String value1, String value2) {
            addCriterion("course_introduction not between", value1, value2, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseStatusIsNull() {
            addCriterion("course_status is null");
            return (Criteria) this;
        }

        public Criteria andCourseStatusIsNotNull() {
            addCriterion("course_status is not null");
            return (Criteria) this;
        }

        public Criteria andCourseStatusEqualTo(Integer value) {
            addCriterion("course_status =", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusNotEqualTo(Integer value) {
            addCriterion("course_status <>", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusGreaterThan(Integer value) {
            addCriterion("course_status >", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_status >=", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusLessThan(Integer value) {
            addCriterion("course_status <", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("course_status <=", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusIn(List<Integer> values) {
            addCriterion("course_status in", values, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusNotIn(List<Integer> values) {
            addCriterion("course_status not in", values, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusBetween(Integer value1, Integer value2) {
            addCriterion("course_status between", value1, value2, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("course_status not between", value1, value2, "courseStatus");
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