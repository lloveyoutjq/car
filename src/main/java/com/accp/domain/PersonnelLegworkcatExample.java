package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PersonnelLegworkcatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonnelLegworkcatExample() {
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

        public Criteria andLegworkcatidIsNull() {
            addCriterion("legworkCatId is null");
            return (Criteria) this;
        }

        public Criteria andLegworkcatidIsNotNull() {
            addCriterion("legworkCatId is not null");
            return (Criteria) this;
        }

        public Criteria andLegworkcatidEqualTo(Integer value) {
            addCriterion("legworkCatId =", value, "legworkcatid");
            return (Criteria) this;
        }

        public Criteria andLegworkcatidNotEqualTo(Integer value) {
            addCriterion("legworkCatId <>", value, "legworkcatid");
            return (Criteria) this;
        }

        public Criteria andLegworkcatidGreaterThan(Integer value) {
            addCriterion("legworkCatId >", value, "legworkcatid");
            return (Criteria) this;
        }

        public Criteria andLegworkcatidGreaterThanOrEqualTo(Integer value) {
            addCriterion("legworkCatId >=", value, "legworkcatid");
            return (Criteria) this;
        }

        public Criteria andLegworkcatidLessThan(Integer value) {
            addCriterion("legworkCatId <", value, "legworkcatid");
            return (Criteria) this;
        }

        public Criteria andLegworkcatidLessThanOrEqualTo(Integer value) {
            addCriterion("legworkCatId <=", value, "legworkcatid");
            return (Criteria) this;
        }

        public Criteria andLegworkcatidIn(List<Integer> values) {
            addCriterion("legworkCatId in", values, "legworkcatid");
            return (Criteria) this;
        }

        public Criteria andLegworkcatidNotIn(List<Integer> values) {
            addCriterion("legworkCatId not in", values, "legworkcatid");
            return (Criteria) this;
        }

        public Criteria andLegworkcatidBetween(Integer value1, Integer value2) {
            addCriterion("legworkCatId between", value1, value2, "legworkcatid");
            return (Criteria) this;
        }

        public Criteria andLegworkcatidNotBetween(Integer value1, Integer value2) {
            addCriterion("legworkCatId not between", value1, value2, "legworkcatid");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberIsNull() {
            addCriterion("licensePlateNumber is null");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberIsNotNull() {
            addCriterion("licensePlateNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberEqualTo(String value) {
            addCriterion("licensePlateNumber =", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberNotEqualTo(String value) {
            addCriterion("licensePlateNumber <>", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberGreaterThan(String value) {
            addCriterion("licensePlateNumber >", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberGreaterThanOrEqualTo(String value) {
            addCriterion("licensePlateNumber >=", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberLessThan(String value) {
            addCriterion("licensePlateNumber <", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberLessThanOrEqualTo(String value) {
            addCriterion("licensePlateNumber <=", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberLike(String value) {
            addCriterion("licensePlateNumber like", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberNotLike(String value) {
            addCriterion("licensePlateNumber not like", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberIn(List<String> values) {
            addCriterion("licensePlateNumber in", values, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberNotIn(List<String> values) {
            addCriterion("licensePlateNumber not in", values, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberBetween(String value1, String value2) {
            addCriterion("licensePlateNumber between", value1, value2, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberNotBetween(String value1, String value2) {
            addCriterion("licensePlateNumber not between", value1, value2, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andMileageIsNull() {
            addCriterion("mileage is null");
            return (Criteria) this;
        }

        public Criteria andMileageIsNotNull() {
            addCriterion("mileage is not null");
            return (Criteria) this;
        }

        public Criteria andMileageEqualTo(String value) {
            addCriterion("mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(String value) {
            addCriterion("mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(String value) {
            addCriterion("mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(String value) {
            addCriterion("mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(String value) {
            addCriterion("mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(String value) {
            addCriterion("mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLike(String value) {
            addCriterion("mileage like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotLike(String value) {
            addCriterion("mileage not like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<String> values) {
            addCriterion("mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<String> values) {
            addCriterion("mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(String value1, String value2) {
            addCriterion("mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(String value1, String value2) {
            addCriterion("mileage not between", value1, value2, "mileage");
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