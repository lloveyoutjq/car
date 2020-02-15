package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaintainMaintenanceRegistrationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainMaintenanceRegistrationExample() {
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

        public Criteria andCarinfoidIsNull() {
            addCriterion("carinfoId is null");
            return (Criteria) this;
        }

        public Criteria andCarinfoidIsNotNull() {
            addCriterion("carinfoId is not null");
            return (Criteria) this;
        }

        public Criteria andCarinfoidEqualTo(Integer value) {
            addCriterion("carinfoId =", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotEqualTo(Integer value) {
            addCriterion("carinfoId <>", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidGreaterThan(Integer value) {
            addCriterion("carinfoId >", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("carinfoId >=", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidLessThan(Integer value) {
            addCriterion("carinfoId <", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("carinfoId <=", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidIn(List<Integer> values) {
            addCriterion("carinfoId in", values, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotIn(List<Integer> values) {
            addCriterion("carinfoId not in", values, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidBetween(Integer value1, Integer value2) {
            addCriterion("carinfoId between", value1, value2, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("carinfoId not between", value1, value2, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andMaintainnameIsNull() {
            addCriterion("maintainName is null");
            return (Criteria) this;
        }

        public Criteria andMaintainnameIsNotNull() {
            addCriterion("maintainName is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainnameEqualTo(String value) {
            addCriterion("maintainName =", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameNotEqualTo(String value) {
            addCriterion("maintainName <>", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameGreaterThan(String value) {
            addCriterion("maintainName >", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameGreaterThanOrEqualTo(String value) {
            addCriterion("maintainName >=", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameLessThan(String value) {
            addCriterion("maintainName <", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameLessThanOrEqualTo(String value) {
            addCriterion("maintainName <=", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameLike(String value) {
            addCriterion("maintainName like", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameNotLike(String value) {
            addCriterion("maintainName not like", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameIn(List<String> values) {
            addCriterion("maintainName in", values, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameNotIn(List<String> values) {
            addCriterion("maintainName not in", values, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameBetween(String value1, String value2) {
            addCriterion("maintainName between", value1, value2, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameNotBetween(String value1, String value2) {
            addCriterion("maintainName not between", value1, value2, "maintainname");
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

        public Criteria andMileageEqualTo(Float value) {
            addCriterion("mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(Float value) {
            addCriterion("mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(Float value) {
            addCriterion("mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(Float value) {
            addCriterion("mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(Float value) {
            addCriterion("mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(Float value) {
            addCriterion("mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<Float> values) {
            addCriterion("mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<Float> values) {
            addCriterion("mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(Float value1, Float value2) {
            addCriterion("mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(Float value1, Float value2) {
            addCriterion("mileage not between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileagedateIsNull() {
            addCriterion("mileageDate is null");
            return (Criteria) this;
        }

        public Criteria andMileagedateIsNotNull() {
            addCriterion("mileageDate is not null");
            return (Criteria) this;
        }

        public Criteria andMileagedateEqualTo(Date value) {
            addCriterion("mileageDate =", value, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateNotEqualTo(Date value) {
            addCriterion("mileageDate <>", value, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateGreaterThan(Date value) {
            addCriterion("mileageDate >", value, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateGreaterThanOrEqualTo(Date value) {
            addCriterion("mileageDate >=", value, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateLessThan(Date value) {
            addCriterion("mileageDate <", value, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateLessThanOrEqualTo(Date value) {
            addCriterion("mileageDate <=", value, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateIn(List<Date> values) {
            addCriterion("mileageDate in", values, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateNotIn(List<Date> values) {
            addCriterion("mileageDate not in", values, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateBetween(Date value1, Date value2) {
            addCriterion("mileageDate between", value1, value2, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateNotBetween(Date value1, Date value2) {
            addCriterion("mileageDate not between", value1, value2, "mileagedate");
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

        public Criteria andRealmileageIsNull() {
            addCriterion("realMileage is null");
            return (Criteria) this;
        }

        public Criteria andRealmileageIsNotNull() {
            addCriterion("realMileage is not null");
            return (Criteria) this;
        }

        public Criteria andRealmileageEqualTo(Integer value) {
            addCriterion("realMileage =", value, "realmileage");
            return (Criteria) this;
        }

        public Criteria andRealmileageNotEqualTo(Integer value) {
            addCriterion("realMileage <>", value, "realmileage");
            return (Criteria) this;
        }

        public Criteria andRealmileageGreaterThan(Integer value) {
            addCriterion("realMileage >", value, "realmileage");
            return (Criteria) this;
        }

        public Criteria andRealmileageGreaterThanOrEqualTo(Integer value) {
            addCriterion("realMileage >=", value, "realmileage");
            return (Criteria) this;
        }

        public Criteria andRealmileageLessThan(Integer value) {
            addCriterion("realMileage <", value, "realmileage");
            return (Criteria) this;
        }

        public Criteria andRealmileageLessThanOrEqualTo(Integer value) {
            addCriterion("realMileage <=", value, "realmileage");
            return (Criteria) this;
        }

        public Criteria andRealmileageIn(List<Integer> values) {
            addCriterion("realMileage in", values, "realmileage");
            return (Criteria) this;
        }

        public Criteria andRealmileageNotIn(List<Integer> values) {
            addCriterion("realMileage not in", values, "realmileage");
            return (Criteria) this;
        }

        public Criteria andRealmileageBetween(Integer value1, Integer value2) {
            addCriterion("realMileage between", value1, value2, "realmileage");
            return (Criteria) this;
        }

        public Criteria andRealmileageNotBetween(Integer value1, Integer value2) {
            addCriterion("realMileage not between", value1, value2, "realmileage");
            return (Criteria) this;
        }

        public Criteria andRealmileagedateIsNull() {
            addCriterion("realMileageDate is null");
            return (Criteria) this;
        }

        public Criteria andRealmileagedateIsNotNull() {
            addCriterion("realMileageDate is not null");
            return (Criteria) this;
        }

        public Criteria andRealmileagedateEqualTo(Date value) {
            addCriterion("realMileageDate =", value, "realmileagedate");
            return (Criteria) this;
        }

        public Criteria andRealmileagedateNotEqualTo(Date value) {
            addCriterion("realMileageDate <>", value, "realmileagedate");
            return (Criteria) this;
        }

        public Criteria andRealmileagedateGreaterThan(Date value) {
            addCriterion("realMileageDate >", value, "realmileagedate");
            return (Criteria) this;
        }

        public Criteria andRealmileagedateGreaterThanOrEqualTo(Date value) {
            addCriterion("realMileageDate >=", value, "realmileagedate");
            return (Criteria) this;
        }

        public Criteria andRealmileagedateLessThan(Date value) {
            addCriterion("realMileageDate <", value, "realmileagedate");
            return (Criteria) this;
        }

        public Criteria andRealmileagedateLessThanOrEqualTo(Date value) {
            addCriterion("realMileageDate <=", value, "realmileagedate");
            return (Criteria) this;
        }

        public Criteria andRealmileagedateIn(List<Date> values) {
            addCriterion("realMileageDate in", values, "realmileagedate");
            return (Criteria) this;
        }

        public Criteria andRealmileagedateNotIn(List<Date> values) {
            addCriterion("realMileageDate not in", values, "realmileagedate");
            return (Criteria) this;
        }

        public Criteria andRealmileagedateBetween(Date value1, Date value2) {
            addCriterion("realMileageDate between", value1, value2, "realmileagedate");
            return (Criteria) this;
        }

        public Criteria andRealmileagedateNotBetween(Date value1, Date value2) {
            addCriterion("realMileageDate not between", value1, value2, "realmileagedate");
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