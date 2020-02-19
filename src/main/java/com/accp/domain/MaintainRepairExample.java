package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaintainRepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainRepairExample() {
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andCarinfoidIsNull() {
            addCriterion("carInfoId is null");
            return (Criteria) this;
        }

        public Criteria andCarinfoidIsNotNull() {
            addCriterion("carInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andCarinfoidEqualTo(Integer value) {
            addCriterion("carInfoId =", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotEqualTo(Integer value) {
            addCriterion("carInfoId <>", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidGreaterThan(Integer value) {
            addCriterion("carInfoId >", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("carInfoId >=", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidLessThan(Integer value) {
            addCriterion("carInfoId <", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("carInfoId <=", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidIn(List<Integer> values) {
            addCriterion("carInfoId in", values, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotIn(List<Integer> values) {
            addCriterion("carInfoId not in", values, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidBetween(Integer value1, Integer value2) {
            addCriterion("carInfoId between", value1, value2, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("carInfoId not between", value1, value2, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCounseloridIsNull() {
            addCriterion("counselorId is null");
            return (Criteria) this;
        }

        public Criteria andCounseloridIsNotNull() {
            addCriterion("counselorId is not null");
            return (Criteria) this;
        }

        public Criteria andCounseloridEqualTo(Integer value) {
            addCriterion("counselorId =", value, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridNotEqualTo(Integer value) {
            addCriterion("counselorId <>", value, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridGreaterThan(Integer value) {
            addCriterion("counselorId >", value, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridGreaterThanOrEqualTo(Integer value) {
            addCriterion("counselorId >=", value, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridLessThan(Integer value) {
            addCriterion("counselorId <", value, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridLessThanOrEqualTo(Integer value) {
            addCriterion("counselorId <=", value, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridIn(List<Integer> values) {
            addCriterion("counselorId in", values, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridNotIn(List<Integer> values) {
            addCriterion("counselorId not in", values, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridBetween(Integer value1, Integer value2) {
            addCriterion("counselorId between", value1, value2, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridNotBetween(Integer value1, Integer value2) {
            addCriterion("counselorId not between", value1, value2, "counselorid");
            return (Criteria) this;
        }

        public Criteria andOilIsNull() {
            addCriterion("oil is null");
            return (Criteria) this;
        }

        public Criteria andOilIsNotNull() {
            addCriterion("oil is not null");
            return (Criteria) this;
        }

        public Criteria andOilEqualTo(String value) {
            addCriterion("oil =", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilNotEqualTo(String value) {
            addCriterion("oil <>", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilGreaterThan(String value) {
            addCriterion("oil >", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilGreaterThanOrEqualTo(String value) {
            addCriterion("oil >=", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilLessThan(String value) {
            addCriterion("oil <", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilLessThanOrEqualTo(String value) {
            addCriterion("oil <=", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilLike(String value) {
            addCriterion("oil like", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilNotLike(String value) {
            addCriterion("oil not like", value, "oil");
            return (Criteria) this;
        }

        public Criteria andOilIn(List<String> values) {
            addCriterion("oil in", values, "oil");
            return (Criteria) this;
        }

        public Criteria andOilNotIn(List<String> values) {
            addCriterion("oil not in", values, "oil");
            return (Criteria) this;
        }

        public Criteria andOilBetween(String value1, String value2) {
            addCriterion("oil between", value1, value2, "oil");
            return (Criteria) this;
        }

        public Criteria andOilNotBetween(String value1, String value2) {
            addCriterion("oil not between", value1, value2, "oil");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNull() {
            addCriterion("workTime is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("workTime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(String value) {
            addCriterion("workTime =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(String value) {
            addCriterion("workTime <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(String value) {
            addCriterion("workTime >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(String value) {
            addCriterion("workTime >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(String value) {
            addCriterion("workTime <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(String value) {
            addCriterion("workTime <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLike(String value) {
            addCriterion("workTime like", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotLike(String value) {
            addCriterion("workTime not like", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<String> values) {
            addCriterion("workTime in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<String> values) {
            addCriterion("workTime not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(String value1, String value2) {
            addCriterion("workTime between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(String value1, String value2) {
            addCriterion("workTime not between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andGetmanIsNull() {
            addCriterion("getMan is null");
            return (Criteria) this;
        }

        public Criteria andGetmanIsNotNull() {
            addCriterion("getMan is not null");
            return (Criteria) this;
        }

        public Criteria andGetmanEqualTo(String value) {
            addCriterion("getMan =", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanNotEqualTo(String value) {
            addCriterion("getMan <>", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanGreaterThan(String value) {
            addCriterion("getMan >", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanGreaterThanOrEqualTo(String value) {
            addCriterion("getMan >=", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanLessThan(String value) {
            addCriterion("getMan <", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanLessThanOrEqualTo(String value) {
            addCriterion("getMan <=", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanLike(String value) {
            addCriterion("getMan like", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanNotLike(String value) {
            addCriterion("getMan not like", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanIn(List<String> values) {
            addCriterion("getMan in", values, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanNotIn(List<String> values) {
            addCriterion("getMan not in", values, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanBetween(String value1, String value2) {
            addCriterion("getMan between", value1, value2, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanNotBetween(String value1, String value2) {
            addCriterion("getMan not between", value1, value2, "getman");
            return (Criteria) this;
        }

        public Criteria andOverworkdateIsNull() {
            addCriterion("overWorkDate is null");
            return (Criteria) this;
        }

        public Criteria andOverworkdateIsNotNull() {
            addCriterion("overWorkDate is not null");
            return (Criteria) this;
        }

        public Criteria andOverworkdateEqualTo(Date value) {
            addCriterion("overWorkDate =", value, "overworkdate");
            return (Criteria) this;
        }

        public Criteria andOverworkdateNotEqualTo(Date value) {
            addCriterion("overWorkDate <>", value, "overworkdate");
            return (Criteria) this;
        }

        public Criteria andOverworkdateGreaterThan(Date value) {
            addCriterion("overWorkDate >", value, "overworkdate");
            return (Criteria) this;
        }

        public Criteria andOverworkdateGreaterThanOrEqualTo(Date value) {
            addCriterion("overWorkDate >=", value, "overworkdate");
            return (Criteria) this;
        }

        public Criteria andOverworkdateLessThan(Date value) {
            addCriterion("overWorkDate <", value, "overworkdate");
            return (Criteria) this;
        }

        public Criteria andOverworkdateLessThanOrEqualTo(Date value) {
            addCriterion("overWorkDate <=", value, "overworkdate");
            return (Criteria) this;
        }

        public Criteria andOverworkdateIn(List<Date> values) {
            addCriterion("overWorkDate in", values, "overworkdate");
            return (Criteria) this;
        }

        public Criteria andOverworkdateNotIn(List<Date> values) {
            addCriterion("overWorkDate not in", values, "overworkdate");
            return (Criteria) this;
        }

        public Criteria andOverworkdateBetween(Date value1, Date value2) {
            addCriterion("overWorkDate between", value1, value2, "overworkdate");
            return (Criteria) this;
        }

        public Criteria andOverworkdateNotBetween(Date value1, Date value2) {
            addCriterion("overWorkDate not between", value1, value2, "overworkdate");
            return (Criteria) this;
        }

        public Criteria andSetterIsNull() {
            addCriterion("setter is null");
            return (Criteria) this;
        }

        public Criteria andSetterIsNotNull() {
            addCriterion("setter is not null");
            return (Criteria) this;
        }

        public Criteria andSetterEqualTo(String value) {
            addCriterion("setter =", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterNotEqualTo(String value) {
            addCriterion("setter <>", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterGreaterThan(String value) {
            addCriterion("setter >", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterGreaterThanOrEqualTo(String value) {
            addCriterion("setter >=", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterLessThan(String value) {
            addCriterion("setter <", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterLessThanOrEqualTo(String value) {
            addCriterion("setter <=", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterLike(String value) {
            addCriterion("setter like", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterNotLike(String value) {
            addCriterion("setter not like", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterIn(List<String> values) {
            addCriterion("setter in", values, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterNotIn(List<String> values) {
            addCriterion("setter not in", values, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterBetween(String value1, String value2) {
            addCriterion("setter between", value1, value2, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterNotBetween(String value1, String value2) {
            addCriterion("setter not between", value1, value2, "setter");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andBeforeIsNull() {
            addCriterion("before is null");
            return (Criteria) this;
        }

        public Criteria andBeforeIsNotNull() {
            addCriterion("before is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeEqualTo(Date value) {
            addCriterion("before =", value, "before");
            return (Criteria) this;
        }

        public Criteria andBeforeNotEqualTo(Date value) {
            addCriterion("before <>", value, "before");
            return (Criteria) this;
        }

        public Criteria andBeforeGreaterThan(Date value) {
            addCriterion("before >", value, "before");
            return (Criteria) this;
        }

        public Criteria andBeforeGreaterThanOrEqualTo(Date value) {
            addCriterion("before >=", value, "before");
            return (Criteria) this;
        }

        public Criteria andBeforeLessThan(Date value) {
            addCriterion("before <", value, "before");
            return (Criteria) this;
        }

        public Criteria andBeforeLessThanOrEqualTo(Date value) {
            addCriterion("before <=", value, "before");
            return (Criteria) this;
        }

        public Criteria andBeforeIn(List<Date> values) {
            addCriterion("before in", values, "before");
            return (Criteria) this;
        }

        public Criteria andBeforeNotIn(List<Date> values) {
            addCriterion("before not in", values, "before");
            return (Criteria) this;
        }

        public Criteria andBeforeBetween(Date value1, Date value2) {
            addCriterion("before between", value1, value2, "before");
            return (Criteria) this;
        }

        public Criteria andBeforeNotBetween(Date value1, Date value2) {
            addCriterion("before not between", value1, value2, "before");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andItemidIsNull() {
            addCriterion("itemId is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("itemId is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(Integer value) {
            addCriterion("itemId =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(Integer value) {
            addCriterion("itemId <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(Integer value) {
            addCriterion("itemId >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemId >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(Integer value) {
            addCriterion("itemId <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(Integer value) {
            addCriterion("itemId <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<Integer> values) {
            addCriterion("itemId in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<Integer> values) {
            addCriterion("itemId not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(Integer value1, Integer value2) {
            addCriterion("itemId between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(Integer value1, Integer value2) {
            addCriterion("itemId not between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andFaultIsNull() {
            addCriterion("fault is null");
            return (Criteria) this;
        }

        public Criteria andFaultIsNotNull() {
            addCriterion("fault is not null");
            return (Criteria) this;
        }

        public Criteria andFaultEqualTo(String value) {
            addCriterion("fault =", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultNotEqualTo(String value) {
            addCriterion("fault <>", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultGreaterThan(String value) {
            addCriterion("fault >", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultGreaterThanOrEqualTo(String value) {
            addCriterion("fault >=", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultLessThan(String value) {
            addCriterion("fault <", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultLessThanOrEqualTo(String value) {
            addCriterion("fault <=", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultLike(String value) {
            addCriterion("fault like", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultNotLike(String value) {
            addCriterion("fault not like", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultIn(List<String> values) {
            addCriterion("fault in", values, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultNotIn(List<String> values) {
            addCriterion("fault not in", values, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultBetween(String value1, String value2) {
            addCriterion("fault between", value1, value2, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultNotBetween(String value1, String value2) {
            addCriterion("fault not between", value1, value2, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultresultIsNull() {
            addCriterion("faultResult is null");
            return (Criteria) this;
        }

        public Criteria andFaultresultIsNotNull() {
            addCriterion("faultResult is not null");
            return (Criteria) this;
        }

        public Criteria andFaultresultEqualTo(String value) {
            addCriterion("faultResult =", value, "faultresult");
            return (Criteria) this;
        }

        public Criteria andFaultresultNotEqualTo(String value) {
            addCriterion("faultResult <>", value, "faultresult");
            return (Criteria) this;
        }

        public Criteria andFaultresultGreaterThan(String value) {
            addCriterion("faultResult >", value, "faultresult");
            return (Criteria) this;
        }

        public Criteria andFaultresultGreaterThanOrEqualTo(String value) {
            addCriterion("faultResult >=", value, "faultresult");
            return (Criteria) this;
        }

        public Criteria andFaultresultLessThan(String value) {
            addCriterion("faultResult <", value, "faultresult");
            return (Criteria) this;
        }

        public Criteria andFaultresultLessThanOrEqualTo(String value) {
            addCriterion("faultResult <=", value, "faultresult");
            return (Criteria) this;
        }

        public Criteria andFaultresultLike(String value) {
            addCriterion("faultResult like", value, "faultresult");
            return (Criteria) this;
        }

        public Criteria andFaultresultNotLike(String value) {
            addCriterion("faultResult not like", value, "faultresult");
            return (Criteria) this;
        }

        public Criteria andFaultresultIn(List<String> values) {
            addCriterion("faultResult in", values, "faultresult");
            return (Criteria) this;
        }

        public Criteria andFaultresultNotIn(List<String> values) {
            addCriterion("faultResult not in", values, "faultresult");
            return (Criteria) this;
        }

        public Criteria andFaultresultBetween(String value1, String value2) {
            addCriterion("faultResult between", value1, value2, "faultresult");
            return (Criteria) this;
        }

        public Criteria andFaultresultNotBetween(String value1, String value2) {
            addCriterion("faultResult not between", value1, value2, "faultresult");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNull() {
            addCriterion("teamId is null");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNotNull() {
            addCriterion("teamId is not null");
            return (Criteria) this;
        }

        public Criteria andTeamidEqualTo(Integer value) {
            addCriterion("teamId =", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotEqualTo(Integer value) {
            addCriterion("teamId <>", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThan(Integer value) {
            addCriterion("teamId >", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("teamId >=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThan(Integer value) {
            addCriterion("teamId <", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThanOrEqualTo(Integer value) {
            addCriterion("teamId <=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidIn(List<Integer> values) {
            addCriterion("teamId in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotIn(List<Integer> values) {
            addCriterion("teamId not in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidBetween(Integer value1, Integer value2) {
            addCriterion("teamId between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotBetween(Integer value1, Integer value2) {
            addCriterion("teamId not between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDefault1IsNull() {
            addCriterion("default1 is null");
            return (Criteria) this;
        }

        public Criteria andDefault1IsNotNull() {
            addCriterion("default1 is not null");
            return (Criteria) this;
        }

        public Criteria andDefault1EqualTo(String value) {
            addCriterion("default1 =", value, "default1");
            return (Criteria) this;
        }

        public Criteria andDefault1NotEqualTo(String value) {
            addCriterion("default1 <>", value, "default1");
            return (Criteria) this;
        }

        public Criteria andDefault1GreaterThan(String value) {
            addCriterion("default1 >", value, "default1");
            return (Criteria) this;
        }

        public Criteria andDefault1GreaterThanOrEqualTo(String value) {
            addCriterion("default1 >=", value, "default1");
            return (Criteria) this;
        }

        public Criteria andDefault1LessThan(String value) {
            addCriterion("default1 <", value, "default1");
            return (Criteria) this;
        }

        public Criteria andDefault1LessThanOrEqualTo(String value) {
            addCriterion("default1 <=", value, "default1");
            return (Criteria) this;
        }

        public Criteria andDefault1Like(String value) {
            addCriterion("default1 like", value, "default1");
            return (Criteria) this;
        }

        public Criteria andDefault1NotLike(String value) {
            addCriterion("default1 not like", value, "default1");
            return (Criteria) this;
        }

        public Criteria andDefault1In(List<String> values) {
            addCriterion("default1 in", values, "default1");
            return (Criteria) this;
        }

        public Criteria andDefault1NotIn(List<String> values) {
            addCriterion("default1 not in", values, "default1");
            return (Criteria) this;
        }

        public Criteria andDefault1Between(String value1, String value2) {
            addCriterion("default1 between", value1, value2, "default1");
            return (Criteria) this;
        }

        public Criteria andDefault1NotBetween(String value1, String value2) {
            addCriterion("default1 not between", value1, value2, "default1");
            return (Criteria) this;
        }

        public Criteria andDefault2IsNull() {
            addCriterion("default2 is null");
            return (Criteria) this;
        }

        public Criteria andDefault2IsNotNull() {
            addCriterion("default2 is not null");
            return (Criteria) this;
        }

        public Criteria andDefault2EqualTo(String value) {
            addCriterion("default2 =", value, "default2");
            return (Criteria) this;
        }

        public Criteria andDefault2NotEqualTo(String value) {
            addCriterion("default2 <>", value, "default2");
            return (Criteria) this;
        }

        public Criteria andDefault2GreaterThan(String value) {
            addCriterion("default2 >", value, "default2");
            return (Criteria) this;
        }

        public Criteria andDefault2GreaterThanOrEqualTo(String value) {
            addCriterion("default2 >=", value, "default2");
            return (Criteria) this;
        }

        public Criteria andDefault2LessThan(String value) {
            addCriterion("default2 <", value, "default2");
            return (Criteria) this;
        }

        public Criteria andDefault2LessThanOrEqualTo(String value) {
            addCriterion("default2 <=", value, "default2");
            return (Criteria) this;
        }

        public Criteria andDefault2Like(String value) {
            addCriterion("default2 like", value, "default2");
            return (Criteria) this;
        }

        public Criteria andDefault2NotLike(String value) {
            addCriterion("default2 not like", value, "default2");
            return (Criteria) this;
        }

        public Criteria andDefault2In(List<String> values) {
            addCriterion("default2 in", values, "default2");
            return (Criteria) this;
        }

        public Criteria andDefault2NotIn(List<String> values) {
            addCriterion("default2 not in", values, "default2");
            return (Criteria) this;
        }

        public Criteria andDefault2Between(String value1, String value2) {
            addCriterion("default2 between", value1, value2, "default2");
            return (Criteria) this;
        }

        public Criteria andDefault2NotBetween(String value1, String value2) {
            addCriterion("default2 not between", value1, value2, "default2");
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