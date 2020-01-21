package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DataCarbrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataCarbrandExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCarbrandnameIsNull() {
            addCriterion("carBrandName is null");
            return (Criteria) this;
        }

        public Criteria andCarbrandnameIsNotNull() {
            addCriterion("carBrandName is not null");
            return (Criteria) this;
        }

        public Criteria andCarbrandnameEqualTo(String value) {
            addCriterion("carBrandName =", value, "carbrandname");
            return (Criteria) this;
        }

        public Criteria andCarbrandnameNotEqualTo(String value) {
            addCriterion("carBrandName <>", value, "carbrandname");
            return (Criteria) this;
        }

        public Criteria andCarbrandnameGreaterThan(String value) {
            addCriterion("carBrandName >", value, "carbrandname");
            return (Criteria) this;
        }

        public Criteria andCarbrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("carBrandName >=", value, "carbrandname");
            return (Criteria) this;
        }

        public Criteria andCarbrandnameLessThan(String value) {
            addCriterion("carBrandName <", value, "carbrandname");
            return (Criteria) this;
        }

        public Criteria andCarbrandnameLessThanOrEqualTo(String value) {
            addCriterion("carBrandName <=", value, "carbrandname");
            return (Criteria) this;
        }

        public Criteria andCarbrandnameLike(String value) {
            addCriterion("carBrandName like", value, "carbrandname");
            return (Criteria) this;
        }

        public Criteria andCarbrandnameNotLike(String value) {
            addCriterion("carBrandName not like", value, "carbrandname");
            return (Criteria) this;
        }

        public Criteria andCarbrandnameIn(List<String> values) {
            addCriterion("carBrandName in", values, "carbrandname");
            return (Criteria) this;
        }

        public Criteria andCarbrandnameNotIn(List<String> values) {
            addCriterion("carBrandName not in", values, "carbrandname");
            return (Criteria) this;
        }

        public Criteria andCarbrandnameBetween(String value1, String value2) {
            addCriterion("carBrandName between", value1, value2, "carbrandname");
            return (Criteria) this;
        }

        public Criteria andCarbrandnameNotBetween(String value1, String value2) {
            addCriterion("carBrandName not between", value1, value2, "carbrandname");
            return (Criteria) this;
        }

        public Criteria andFirstletterIsNull() {
            addCriterion("firstLetter is null");
            return (Criteria) this;
        }

        public Criteria andFirstletterIsNotNull() {
            addCriterion("firstLetter is not null");
            return (Criteria) this;
        }

        public Criteria andFirstletterEqualTo(String value) {
            addCriterion("firstLetter =", value, "firstletter");
            return (Criteria) this;
        }

        public Criteria andFirstletterNotEqualTo(String value) {
            addCriterion("firstLetter <>", value, "firstletter");
            return (Criteria) this;
        }

        public Criteria andFirstletterGreaterThan(String value) {
            addCriterion("firstLetter >", value, "firstletter");
            return (Criteria) this;
        }

        public Criteria andFirstletterGreaterThanOrEqualTo(String value) {
            addCriterion("firstLetter >=", value, "firstletter");
            return (Criteria) this;
        }

        public Criteria andFirstletterLessThan(String value) {
            addCriterion("firstLetter <", value, "firstletter");
            return (Criteria) this;
        }

        public Criteria andFirstletterLessThanOrEqualTo(String value) {
            addCriterion("firstLetter <=", value, "firstletter");
            return (Criteria) this;
        }

        public Criteria andFirstletterLike(String value) {
            addCriterion("firstLetter like", value, "firstletter");
            return (Criteria) this;
        }

        public Criteria andFirstletterNotLike(String value) {
            addCriterion("firstLetter not like", value, "firstletter");
            return (Criteria) this;
        }

        public Criteria andFirstletterIn(List<String> values) {
            addCriterion("firstLetter in", values, "firstletter");
            return (Criteria) this;
        }

        public Criteria andFirstletterNotIn(List<String> values) {
            addCriterion("firstLetter not in", values, "firstletter");
            return (Criteria) this;
        }

        public Criteria andFirstletterBetween(String value1, String value2) {
            addCriterion("firstLetter between", value1, value2, "firstletter");
            return (Criteria) this;
        }

        public Criteria andFirstletterNotBetween(String value1, String value2) {
            addCriterion("firstLetter not between", value1, value2, "firstletter");
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

        public Criteria andDefailt2IsNull() {
            addCriterion("defailt2 is null");
            return (Criteria) this;
        }

        public Criteria andDefailt2IsNotNull() {
            addCriterion("defailt2 is not null");
            return (Criteria) this;
        }

        public Criteria andDefailt2EqualTo(String value) {
            addCriterion("defailt2 =", value, "defailt2");
            return (Criteria) this;
        }

        public Criteria andDefailt2NotEqualTo(String value) {
            addCriterion("defailt2 <>", value, "defailt2");
            return (Criteria) this;
        }

        public Criteria andDefailt2GreaterThan(String value) {
            addCriterion("defailt2 >", value, "defailt2");
            return (Criteria) this;
        }

        public Criteria andDefailt2GreaterThanOrEqualTo(String value) {
            addCriterion("defailt2 >=", value, "defailt2");
            return (Criteria) this;
        }

        public Criteria andDefailt2LessThan(String value) {
            addCriterion("defailt2 <", value, "defailt2");
            return (Criteria) this;
        }

        public Criteria andDefailt2LessThanOrEqualTo(String value) {
            addCriterion("defailt2 <=", value, "defailt2");
            return (Criteria) this;
        }

        public Criteria andDefailt2Like(String value) {
            addCriterion("defailt2 like", value, "defailt2");
            return (Criteria) this;
        }

        public Criteria andDefailt2NotLike(String value) {
            addCriterion("defailt2 not like", value, "defailt2");
            return (Criteria) this;
        }

        public Criteria andDefailt2In(List<String> values) {
            addCriterion("defailt2 in", values, "defailt2");
            return (Criteria) this;
        }

        public Criteria andDefailt2NotIn(List<String> values) {
            addCriterion("defailt2 not in", values, "defailt2");
            return (Criteria) this;
        }

        public Criteria andDefailt2Between(String value1, String value2) {
            addCriterion("defailt2 between", value1, value2, "defailt2");
            return (Criteria) this;
        }

        public Criteria andDefailt2NotBetween(String value1, String value2) {
            addCriterion("defailt2 not between", value1, value2, "defailt2");
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