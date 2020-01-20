package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PersonnelArtisanlevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonnelArtisanlevelExample() {
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

        public Criteria andArtisanlevelidIsNull() {
            addCriterion("artisanLevelId is null");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidIsNotNull() {
            addCriterion("artisanLevelId is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidEqualTo(Integer value) {
            addCriterion("artisanLevelId =", value, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidNotEqualTo(Integer value) {
            addCriterion("artisanLevelId <>", value, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidGreaterThan(Integer value) {
            addCriterion("artisanLevelId >", value, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("artisanLevelId >=", value, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidLessThan(Integer value) {
            addCriterion("artisanLevelId <", value, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidLessThanOrEqualTo(Integer value) {
            addCriterion("artisanLevelId <=", value, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidIn(List<Integer> values) {
            addCriterion("artisanLevelId in", values, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidNotIn(List<Integer> values) {
            addCriterion("artisanLevelId not in", values, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidBetween(Integer value1, Integer value2) {
            addCriterion("artisanLevelId between", value1, value2, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("artisanLevelId not between", value1, value2, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelnameIsNull() {
            addCriterion("artisanLevelName is null");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelnameIsNotNull() {
            addCriterion("artisanLevelName is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelnameEqualTo(String value) {
            addCriterion("artisanLevelName =", value, "artisanlevelname");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelnameNotEqualTo(String value) {
            addCriterion("artisanLevelName <>", value, "artisanlevelname");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelnameGreaterThan(String value) {
            addCriterion("artisanLevelName >", value, "artisanlevelname");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelnameGreaterThanOrEqualTo(String value) {
            addCriterion("artisanLevelName >=", value, "artisanlevelname");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelnameLessThan(String value) {
            addCriterion("artisanLevelName <", value, "artisanlevelname");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelnameLessThanOrEqualTo(String value) {
            addCriterion("artisanLevelName <=", value, "artisanlevelname");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelnameLike(String value) {
            addCriterion("artisanLevelName like", value, "artisanlevelname");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelnameNotLike(String value) {
            addCriterion("artisanLevelName not like", value, "artisanlevelname");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelnameIn(List<String> values) {
            addCriterion("artisanLevelName in", values, "artisanlevelname");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelnameNotIn(List<String> values) {
            addCriterion("artisanLevelName not in", values, "artisanlevelname");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelnameBetween(String value1, String value2) {
            addCriterion("artisanLevelName between", value1, value2, "artisanlevelname");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelnameNotBetween(String value1, String value2) {
            addCriterion("artisanLevelName not between", value1, value2, "artisanlevelname");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelweightIsNull() {
            addCriterion("artisanLevelWeight is null");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelweightIsNotNull() {
            addCriterion("artisanLevelWeight is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelweightEqualTo(String value) {
            addCriterion("artisanLevelWeight =", value, "artisanlevelweight");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelweightNotEqualTo(String value) {
            addCriterion("artisanLevelWeight <>", value, "artisanlevelweight");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelweightGreaterThan(String value) {
            addCriterion("artisanLevelWeight >", value, "artisanlevelweight");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelweightGreaterThanOrEqualTo(String value) {
            addCriterion("artisanLevelWeight >=", value, "artisanlevelweight");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelweightLessThan(String value) {
            addCriterion("artisanLevelWeight <", value, "artisanlevelweight");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelweightLessThanOrEqualTo(String value) {
            addCriterion("artisanLevelWeight <=", value, "artisanlevelweight");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelweightLike(String value) {
            addCriterion("artisanLevelWeight like", value, "artisanlevelweight");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelweightNotLike(String value) {
            addCriterion("artisanLevelWeight not like", value, "artisanlevelweight");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelweightIn(List<String> values) {
            addCriterion("artisanLevelWeight in", values, "artisanlevelweight");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelweightNotIn(List<String> values) {
            addCriterion("artisanLevelWeight not in", values, "artisanlevelweight");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelweightBetween(String value1, String value2) {
            addCriterion("artisanLevelWeight between", value1, value2, "artisanlevelweight");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelweightNotBetween(String value1, String value2) {
            addCriterion("artisanLevelWeight not between", value1, value2, "artisanlevelweight");
            return (Criteria) this;
        }

        public Criteria andDefaultIsNull() {
            addCriterion("default is null");
            return (Criteria) this;
        }

        public Criteria andDefaultIsNotNull() {
            addCriterion("default is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultEqualTo(String value) {
            addCriterion("default =", value, "default");
            return (Criteria) this;
        }

        public Criteria andDefaultNotEqualTo(String value) {
            addCriterion("default <>", value, "default");
            return (Criteria) this;
        }

        public Criteria andDefaultGreaterThan(String value) {
            addCriterion("default >", value, "default");
            return (Criteria) this;
        }

        public Criteria andDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("default >=", value, "default");
            return (Criteria) this;
        }

        public Criteria andDefaultLessThan(String value) {
            addCriterion("default <", value, "default");
            return (Criteria) this;
        }

        public Criteria andDefaultLessThanOrEqualTo(String value) {
            addCriterion("default <=", value, "default");
            return (Criteria) this;
        }

        public Criteria andDefaultLike(String value) {
            addCriterion("default like", value, "default");
            return (Criteria) this;
        }

        public Criteria andDefaultNotLike(String value) {
            addCriterion("default not like", value, "default");
            return (Criteria) this;
        }

        public Criteria andDefaultIn(List<String> values) {
            addCriterion("default in", values, "default");
            return (Criteria) this;
        }

        public Criteria andDefaultNotIn(List<String> values) {
            addCriterion("default not in", values, "default");
            return (Criteria) this;
        }

        public Criteria andDefaultBetween(String value1, String value2) {
            addCriterion("default between", value1, value2, "default");
            return (Criteria) this;
        }

        public Criteria andDefaultNotBetween(String value1, String value2) {
            addCriterion("default not between", value1, value2, "default");
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