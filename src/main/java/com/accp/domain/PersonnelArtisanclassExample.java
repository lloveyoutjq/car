package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PersonnelArtisanclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonnelArtisanclassExample() {
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

        public Criteria andArtisanclassidIsNull() {
            addCriterion("artisanClassId is null");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidIsNotNull() {
            addCriterion("artisanClassId is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidEqualTo(Integer value) {
            addCriterion("artisanClassId =", value, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidNotEqualTo(Integer value) {
            addCriterion("artisanClassId <>", value, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidGreaterThan(Integer value) {
            addCriterion("artisanClassId >", value, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("artisanClassId >=", value, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidLessThan(Integer value) {
            addCriterion("artisanClassId <", value, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidLessThanOrEqualTo(Integer value) {
            addCriterion("artisanClassId <=", value, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidIn(List<Integer> values) {
            addCriterion("artisanClassId in", values, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidNotIn(List<Integer> values) {
            addCriterion("artisanClassId not in", values, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidBetween(Integer value1, Integer value2) {
            addCriterion("artisanClassId between", value1, value2, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("artisanClassId not between", value1, value2, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassnameIsNull() {
            addCriterion("artisanClassName is null");
            return (Criteria) this;
        }

        public Criteria andArtisanclassnameIsNotNull() {
            addCriterion("artisanClassName is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanclassnameEqualTo(String value) {
            addCriterion("artisanClassName =", value, "artisanclassname");
            return (Criteria) this;
        }

        public Criteria andArtisanclassnameNotEqualTo(String value) {
            addCriterion("artisanClassName <>", value, "artisanclassname");
            return (Criteria) this;
        }

        public Criteria andArtisanclassnameGreaterThan(String value) {
            addCriterion("artisanClassName >", value, "artisanclassname");
            return (Criteria) this;
        }

        public Criteria andArtisanclassnameGreaterThanOrEqualTo(String value) {
            addCriterion("artisanClassName >=", value, "artisanclassname");
            return (Criteria) this;
        }

        public Criteria andArtisanclassnameLessThan(String value) {
            addCriterion("artisanClassName <", value, "artisanclassname");
            return (Criteria) this;
        }

        public Criteria andArtisanclassnameLessThanOrEqualTo(String value) {
            addCriterion("artisanClassName <=", value, "artisanclassname");
            return (Criteria) this;
        }

        public Criteria andArtisanclassnameLike(String value) {
            addCriterion("artisanClassName like", value, "artisanclassname");
            return (Criteria) this;
        }

        public Criteria andArtisanclassnameNotLike(String value) {
            addCriterion("artisanClassName not like", value, "artisanclassname");
            return (Criteria) this;
        }

        public Criteria andArtisanclassnameIn(List<String> values) {
            addCriterion("artisanClassName in", values, "artisanclassname");
            return (Criteria) this;
        }

        public Criteria andArtisanclassnameNotIn(List<String> values) {
            addCriterion("artisanClassName not in", values, "artisanclassname");
            return (Criteria) this;
        }

        public Criteria andArtisanclassnameBetween(String value1, String value2) {
            addCriterion("artisanClassName between", value1, value2, "artisanclassname");
            return (Criteria) this;
        }

        public Criteria andArtisanclassnameNotBetween(String value1, String value2) {
            addCriterion("artisanClassName not between", value1, value2, "artisanclassname");
            return (Criteria) this;
        }

        public Criteria andArtisanclassweightIsNull() {
            addCriterion("artisanClassWeight is null");
            return (Criteria) this;
        }

        public Criteria andArtisanclassweightIsNotNull() {
            addCriterion("artisanClassWeight is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanclassweightEqualTo(String value) {
            addCriterion("artisanClassWeight =", value, "artisanclassweight");
            return (Criteria) this;
        }

        public Criteria andArtisanclassweightNotEqualTo(String value) {
            addCriterion("artisanClassWeight <>", value, "artisanclassweight");
            return (Criteria) this;
        }

        public Criteria andArtisanclassweightGreaterThan(String value) {
            addCriterion("artisanClassWeight >", value, "artisanclassweight");
            return (Criteria) this;
        }

        public Criteria andArtisanclassweightGreaterThanOrEqualTo(String value) {
            addCriterion("artisanClassWeight >=", value, "artisanclassweight");
            return (Criteria) this;
        }

        public Criteria andArtisanclassweightLessThan(String value) {
            addCriterion("artisanClassWeight <", value, "artisanclassweight");
            return (Criteria) this;
        }

        public Criteria andArtisanclassweightLessThanOrEqualTo(String value) {
            addCriterion("artisanClassWeight <=", value, "artisanclassweight");
            return (Criteria) this;
        }

        public Criteria andArtisanclassweightLike(String value) {
            addCriterion("artisanClassWeight like", value, "artisanclassweight");
            return (Criteria) this;
        }

        public Criteria andArtisanclassweightNotLike(String value) {
            addCriterion("artisanClassWeight not like", value, "artisanclassweight");
            return (Criteria) this;
        }

        public Criteria andArtisanclassweightIn(List<String> values) {
            addCriterion("artisanClassWeight in", values, "artisanclassweight");
            return (Criteria) this;
        }

        public Criteria andArtisanclassweightNotIn(List<String> values) {
            addCriterion("artisanClassWeight not in", values, "artisanclassweight");
            return (Criteria) this;
        }

        public Criteria andArtisanclassweightBetween(String value1, String value2) {
            addCriterion("artisanClassWeight between", value1, value2, "artisanclassweight");
            return (Criteria) this;
        }

        public Criteria andArtisanclassweightNotBetween(String value1, String value2) {
            addCriterion("artisanClassWeight not between", value1, value2, "artisanclassweight");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteIsNull() {
            addCriterion("instationWhite is null");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteIsNotNull() {
            addCriterion("instationWhite is not null");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteEqualTo(String value) {
            addCriterion("instationWhite =", value, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteNotEqualTo(String value) {
            addCriterion("instationWhite <>", value, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteGreaterThan(String value) {
            addCriterion("instationWhite >", value, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteGreaterThanOrEqualTo(String value) {
            addCriterion("instationWhite >=", value, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteLessThan(String value) {
            addCriterion("instationWhite <", value, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteLessThanOrEqualTo(String value) {
            addCriterion("instationWhite <=", value, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteLike(String value) {
            addCriterion("instationWhite like", value, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteNotLike(String value) {
            addCriterion("instationWhite not like", value, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteIn(List<String> values) {
            addCriterion("instationWhite in", values, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteNotIn(List<String> values) {
            addCriterion("instationWhite not in", values, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteBetween(String value1, String value2) {
            addCriterion("instationWhite between", value1, value2, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteNotBetween(String value1, String value2) {
            addCriterion("instationWhite not between", value1, value2, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationblackIsNull() {
            addCriterion("instationBlack is null");
            return (Criteria) this;
        }

        public Criteria andInstationblackIsNotNull() {
            addCriterion("instationBlack is not null");
            return (Criteria) this;
        }

        public Criteria andInstationblackEqualTo(String value) {
            addCriterion("instationBlack =", value, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackNotEqualTo(String value) {
            addCriterion("instationBlack <>", value, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackGreaterThan(String value) {
            addCriterion("instationBlack >", value, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackGreaterThanOrEqualTo(String value) {
            addCriterion("instationBlack >=", value, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackLessThan(String value) {
            addCriterion("instationBlack <", value, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackLessThanOrEqualTo(String value) {
            addCriterion("instationBlack <=", value, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackLike(String value) {
            addCriterion("instationBlack like", value, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackNotLike(String value) {
            addCriterion("instationBlack not like", value, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackIn(List<String> values) {
            addCriterion("instationBlack in", values, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackNotIn(List<String> values) {
            addCriterion("instationBlack not in", values, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackBetween(String value1, String value2) {
            addCriterion("instationBlack between", value1, value2, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackNotBetween(String value1, String value2) {
            addCriterion("instationBlack not between", value1, value2, "instationblack");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteIsNull() {
            addCriterion("outsideWhite is null");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteIsNotNull() {
            addCriterion("outsideWhite is not null");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteEqualTo(String value) {
            addCriterion("outsideWhite =", value, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteNotEqualTo(String value) {
            addCriterion("outsideWhite <>", value, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteGreaterThan(String value) {
            addCriterion("outsideWhite >", value, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteGreaterThanOrEqualTo(String value) {
            addCriterion("outsideWhite >=", value, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteLessThan(String value) {
            addCriterion("outsideWhite <", value, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteLessThanOrEqualTo(String value) {
            addCriterion("outsideWhite <=", value, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteLike(String value) {
            addCriterion("outsideWhite like", value, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteNotLike(String value) {
            addCriterion("outsideWhite not like", value, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteIn(List<String> values) {
            addCriterion("outsideWhite in", values, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteNotIn(List<String> values) {
            addCriterion("outsideWhite not in", values, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteBetween(String value1, String value2) {
            addCriterion("outsideWhite between", value1, value2, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteNotBetween(String value1, String value2) {
            addCriterion("outsideWhite not between", value1, value2, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsideblackIsNull() {
            addCriterion("outsideBlack is null");
            return (Criteria) this;
        }

        public Criteria andOutsideblackIsNotNull() {
            addCriterion("outsideBlack is not null");
            return (Criteria) this;
        }

        public Criteria andOutsideblackEqualTo(String value) {
            addCriterion("outsideBlack =", value, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackNotEqualTo(String value) {
            addCriterion("outsideBlack <>", value, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackGreaterThan(String value) {
            addCriterion("outsideBlack >", value, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackGreaterThanOrEqualTo(String value) {
            addCriterion("outsideBlack >=", value, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackLessThan(String value) {
            addCriterion("outsideBlack <", value, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackLessThanOrEqualTo(String value) {
            addCriterion("outsideBlack <=", value, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackLike(String value) {
            addCriterion("outsideBlack like", value, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackNotLike(String value) {
            addCriterion("outsideBlack not like", value, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackIn(List<String> values) {
            addCriterion("outsideBlack in", values, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackNotIn(List<String> values) {
            addCriterion("outsideBlack not in", values, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackBetween(String value1, String value2) {
            addCriterion("outsideBlack between", value1, value2, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackNotBetween(String value1, String value2) {
            addCriterion("outsideBlack not between", value1, value2, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andWaywhiteIsNull() {
            addCriterion("wayWhite is null");
            return (Criteria) this;
        }

        public Criteria andWaywhiteIsNotNull() {
            addCriterion("wayWhite is not null");
            return (Criteria) this;
        }

        public Criteria andWaywhiteEqualTo(String value) {
            addCriterion("wayWhite =", value, "waywhite");
            return (Criteria) this;
        }

        public Criteria andWaywhiteNotEqualTo(String value) {
            addCriterion("wayWhite <>", value, "waywhite");
            return (Criteria) this;
        }

        public Criteria andWaywhiteGreaterThan(String value) {
            addCriterion("wayWhite >", value, "waywhite");
            return (Criteria) this;
        }

        public Criteria andWaywhiteGreaterThanOrEqualTo(String value) {
            addCriterion("wayWhite >=", value, "waywhite");
            return (Criteria) this;
        }

        public Criteria andWaywhiteLessThan(String value) {
            addCriterion("wayWhite <", value, "waywhite");
            return (Criteria) this;
        }

        public Criteria andWaywhiteLessThanOrEqualTo(String value) {
            addCriterion("wayWhite <=", value, "waywhite");
            return (Criteria) this;
        }

        public Criteria andWaywhiteLike(String value) {
            addCriterion("wayWhite like", value, "waywhite");
            return (Criteria) this;
        }

        public Criteria andWaywhiteNotLike(String value) {
            addCriterion("wayWhite not like", value, "waywhite");
            return (Criteria) this;
        }

        public Criteria andWaywhiteIn(List<String> values) {
            addCriterion("wayWhite in", values, "waywhite");
            return (Criteria) this;
        }

        public Criteria andWaywhiteNotIn(List<String> values) {
            addCriterion("wayWhite not in", values, "waywhite");
            return (Criteria) this;
        }

        public Criteria andWaywhiteBetween(String value1, String value2) {
            addCriterion("wayWhite between", value1, value2, "waywhite");
            return (Criteria) this;
        }

        public Criteria andWaywhiteNotBetween(String value1, String value2) {
            addCriterion("wayWhite not between", value1, value2, "waywhite");
            return (Criteria) this;
        }

        public Criteria andWayblackIsNull() {
            addCriterion("wayBlack is null");
            return (Criteria) this;
        }

        public Criteria andWayblackIsNotNull() {
            addCriterion("wayBlack is not null");
            return (Criteria) this;
        }

        public Criteria andWayblackEqualTo(String value) {
            addCriterion("wayBlack =", value, "wayblack");
            return (Criteria) this;
        }

        public Criteria andWayblackNotEqualTo(String value) {
            addCriterion("wayBlack <>", value, "wayblack");
            return (Criteria) this;
        }

        public Criteria andWayblackGreaterThan(String value) {
            addCriterion("wayBlack >", value, "wayblack");
            return (Criteria) this;
        }

        public Criteria andWayblackGreaterThanOrEqualTo(String value) {
            addCriterion("wayBlack >=", value, "wayblack");
            return (Criteria) this;
        }

        public Criteria andWayblackLessThan(String value) {
            addCriterion("wayBlack <", value, "wayblack");
            return (Criteria) this;
        }

        public Criteria andWayblackLessThanOrEqualTo(String value) {
            addCriterion("wayBlack <=", value, "wayblack");
            return (Criteria) this;
        }

        public Criteria andWayblackLike(String value) {
            addCriterion("wayBlack like", value, "wayblack");
            return (Criteria) this;
        }

        public Criteria andWayblackNotLike(String value) {
            addCriterion("wayBlack not like", value, "wayblack");
            return (Criteria) this;
        }

        public Criteria andWayblackIn(List<String> values) {
            addCriterion("wayBlack in", values, "wayblack");
            return (Criteria) this;
        }

        public Criteria andWayblackNotIn(List<String> values) {
            addCriterion("wayBlack not in", values, "wayblack");
            return (Criteria) this;
        }

        public Criteria andWayblackBetween(String value1, String value2) {
            addCriterion("wayBlack between", value1, value2, "wayblack");
            return (Criteria) this;
        }

        public Criteria andWayblackNotBetween(String value1, String value2) {
            addCriterion("wayBlack not between", value1, value2, "wayblack");
            return (Criteria) this;
        }

        public Criteria andOilcostIsNull() {
            addCriterion("oilCost is null");
            return (Criteria) this;
        }

        public Criteria andOilcostIsNotNull() {
            addCriterion("oilCost is not null");
            return (Criteria) this;
        }

        public Criteria andOilcostEqualTo(String value) {
            addCriterion("oilCost =", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostNotEqualTo(String value) {
            addCriterion("oilCost <>", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostGreaterThan(String value) {
            addCriterion("oilCost >", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostGreaterThanOrEqualTo(String value) {
            addCriterion("oilCost >=", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostLessThan(String value) {
            addCriterion("oilCost <", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostLessThanOrEqualTo(String value) {
            addCriterion("oilCost <=", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostLike(String value) {
            addCriterion("oilCost like", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostNotLike(String value) {
            addCriterion("oilCost not like", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostIn(List<String> values) {
            addCriterion("oilCost in", values, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostNotIn(List<String> values) {
            addCriterion("oilCost not in", values, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostBetween(String value1, String value2) {
            addCriterion("oilCost between", value1, value2, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostNotBetween(String value1, String value2) {
            addCriterion("oilCost not between", value1, value2, "oilcost");
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