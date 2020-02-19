package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaintainCompletedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainCompletedExample() {
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

        public Criteria andEligibilityIsNull() {
            addCriterion("eligibility is null");
            return (Criteria) this;
        }

        public Criteria andEligibilityIsNotNull() {
            addCriterion("eligibility is not null");
            return (Criteria) this;
        }

        public Criteria andEligibilityEqualTo(Integer value) {
            addCriterion("eligibility =", value, "eligibility");
            return (Criteria) this;
        }

        public Criteria andEligibilityNotEqualTo(Integer value) {
            addCriterion("eligibility <>", value, "eligibility");
            return (Criteria) this;
        }

        public Criteria andEligibilityGreaterThan(Integer value) {
            addCriterion("eligibility >", value, "eligibility");
            return (Criteria) this;
        }

        public Criteria andEligibilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("eligibility >=", value, "eligibility");
            return (Criteria) this;
        }

        public Criteria andEligibilityLessThan(Integer value) {
            addCriterion("eligibility <", value, "eligibility");
            return (Criteria) this;
        }

        public Criteria andEligibilityLessThanOrEqualTo(Integer value) {
            addCriterion("eligibility <=", value, "eligibility");
            return (Criteria) this;
        }

        public Criteria andEligibilityIn(List<Integer> values) {
            addCriterion("eligibility in", values, "eligibility");
            return (Criteria) this;
        }

        public Criteria andEligibilityNotIn(List<Integer> values) {
            addCriterion("eligibility not in", values, "eligibility");
            return (Criteria) this;
        }

        public Criteria andEligibilityBetween(Integer value1, Integer value2) {
            addCriterion("eligibility between", value1, value2, "eligibility");
            return (Criteria) this;
        }

        public Criteria andEligibilityNotBetween(Integer value1, Integer value2) {
            addCriterion("eligibility not between", value1, value2, "eligibility");
            return (Criteria) this;
        }

        public Criteria andPredicttimeIsNull() {
            addCriterion("predictTime is null");
            return (Criteria) this;
        }

        public Criteria andPredicttimeIsNotNull() {
            addCriterion("predictTime is not null");
            return (Criteria) this;
        }

        public Criteria andPredicttimeEqualTo(Date value) {
            addCriterion("predictTime =", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeNotEqualTo(Date value) {
            addCriterion("predictTime <>", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeGreaterThan(Date value) {
            addCriterion("predictTime >", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("predictTime >=", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeLessThan(Date value) {
            addCriterion("predictTime <", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeLessThanOrEqualTo(Date value) {
            addCriterion("predictTime <=", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeIn(List<Date> values) {
            addCriterion("predictTime in", values, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeNotIn(List<Date> values) {
            addCriterion("predictTime not in", values, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeBetween(Date value1, Date value2) {
            addCriterion("predictTime between", value1, value2, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeNotBetween(Date value1, Date value2) {
            addCriterion("predictTime not between", value1, value2, "predicttime");
            return (Criteria) this;
        }

        public Criteria andNowtimeIsNull() {
            addCriterion("nowTime is null");
            return (Criteria) this;
        }

        public Criteria andNowtimeIsNotNull() {
            addCriterion("nowTime is not null");
            return (Criteria) this;
        }

        public Criteria andNowtimeEqualTo(Date value) {
            addCriterion("nowTime =", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeNotEqualTo(Date value) {
            addCriterion("nowTime <>", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeGreaterThan(Date value) {
            addCriterion("nowTime >", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nowTime >=", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeLessThan(Date value) {
            addCriterion("nowTime <", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeLessThanOrEqualTo(Date value) {
            addCriterion("nowTime <=", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeIn(List<Date> values) {
            addCriterion("nowTime in", values, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeNotIn(List<Date> values) {
            addCriterion("nowTime not in", values, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeBetween(Date value1, Date value2) {
            addCriterion("nowTime between", value1, value2, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeNotBetween(Date value1, Date value2) {
            addCriterion("nowTime not between", value1, value2, "nowtime");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNull() {
            addCriterion("workId is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("workId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(Integer value) {
            addCriterion("workId =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(Integer value) {
            addCriterion("workId <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(Integer value) {
            addCriterion("workId >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("workId >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(Integer value) {
            addCriterion("workId <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(Integer value) {
            addCriterion("workId <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<Integer> values) {
            addCriterion("workId in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<Integer> values) {
            addCriterion("workId not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(Integer value1, Integer value2) {
            addCriterion("workId between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(Integer value1, Integer value2) {
            addCriterion("workId not between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andDutyidIsNull() {
            addCriterion("dutyId is null");
            return (Criteria) this;
        }

        public Criteria andDutyidIsNotNull() {
            addCriterion("dutyId is not null");
            return (Criteria) this;
        }

        public Criteria andDutyidEqualTo(Integer value) {
            addCriterion("dutyId =", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotEqualTo(Integer value) {
            addCriterion("dutyId <>", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidGreaterThan(Integer value) {
            addCriterion("dutyId >", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dutyId >=", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLessThan(Integer value) {
            addCriterion("dutyId <", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLessThanOrEqualTo(Integer value) {
            addCriterion("dutyId <=", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidIn(List<Integer> values) {
            addCriterion("dutyId in", values, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotIn(List<Integer> values) {
            addCriterion("dutyId not in", values, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidBetween(Integer value1, Integer value2) {
            addCriterion("dutyId between", value1, value2, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotBetween(Integer value1, Integer value2) {
            addCriterion("dutyId not between", value1, value2, "dutyid");
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

        public Criteria andMaintenanceidIsNull() {
            addCriterion("maintenanceId is null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceidIsNotNull() {
            addCriterion("maintenanceId is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceidEqualTo(Integer value) {
            addCriterion("maintenanceId =", value, "maintenanceid");
            return (Criteria) this;
        }

        public Criteria andMaintenanceidNotEqualTo(Integer value) {
            addCriterion("maintenanceId <>", value, "maintenanceid");
            return (Criteria) this;
        }

        public Criteria andMaintenanceidGreaterThan(Integer value) {
            addCriterion("maintenanceId >", value, "maintenanceid");
            return (Criteria) this;
        }

        public Criteria andMaintenanceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("maintenanceId >=", value, "maintenanceid");
            return (Criteria) this;
        }

        public Criteria andMaintenanceidLessThan(Integer value) {
            addCriterion("maintenanceId <", value, "maintenanceid");
            return (Criteria) this;
        }

        public Criteria andMaintenanceidLessThanOrEqualTo(Integer value) {
            addCriterion("maintenanceId <=", value, "maintenanceid");
            return (Criteria) this;
        }

        public Criteria andMaintenanceidIn(List<Integer> values) {
            addCriterion("maintenanceId in", values, "maintenanceid");
            return (Criteria) this;
        }

        public Criteria andMaintenanceidNotIn(List<Integer> values) {
            addCriterion("maintenanceId not in", values, "maintenanceid");
            return (Criteria) this;
        }

        public Criteria andMaintenanceidBetween(Integer value1, Integer value2) {
            addCriterion("maintenanceId between", value1, value2, "maintenanceid");
            return (Criteria) this;
        }

        public Criteria andMaintenanceidNotBetween(Integer value1, Integer value2) {
            addCriterion("maintenanceId not between", value1, value2, "maintenanceid");
            return (Criteria) this;
        }

        public Criteria andReworkcountIsNull() {
            addCriterion("reworkCount is null");
            return (Criteria) this;
        }

        public Criteria andReworkcountIsNotNull() {
            addCriterion("reworkCount is not null");
            return (Criteria) this;
        }

        public Criteria andReworkcountEqualTo(Integer value) {
            addCriterion("reworkCount =", value, "reworkcount");
            return (Criteria) this;
        }

        public Criteria andReworkcountNotEqualTo(Integer value) {
            addCriterion("reworkCount <>", value, "reworkcount");
            return (Criteria) this;
        }

        public Criteria andReworkcountGreaterThan(Integer value) {
            addCriterion("reworkCount >", value, "reworkcount");
            return (Criteria) this;
        }

        public Criteria andReworkcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("reworkCount >=", value, "reworkcount");
            return (Criteria) this;
        }

        public Criteria andReworkcountLessThan(Integer value) {
            addCriterion("reworkCount <", value, "reworkcount");
            return (Criteria) this;
        }

        public Criteria andReworkcountLessThanOrEqualTo(Integer value) {
            addCriterion("reworkCount <=", value, "reworkcount");
            return (Criteria) this;
        }

        public Criteria andReworkcountIn(List<Integer> values) {
            addCriterion("reworkCount in", values, "reworkcount");
            return (Criteria) this;
        }

        public Criteria andReworkcountNotIn(List<Integer> values) {
            addCriterion("reworkCount not in", values, "reworkcount");
            return (Criteria) this;
        }

        public Criteria andReworkcountBetween(Integer value1, Integer value2) {
            addCriterion("reworkCount between", value1, value2, "reworkcount");
            return (Criteria) this;
        }

        public Criteria andReworkcountNotBetween(Integer value1, Integer value2) {
            addCriterion("reworkCount not between", value1, value2, "reworkcount");
            return (Criteria) this;
        }

        public Criteria andReasonforreworkIsNull() {
            addCriterion("reasonforRework is null");
            return (Criteria) this;
        }

        public Criteria andReasonforreworkIsNotNull() {
            addCriterion("reasonforRework is not null");
            return (Criteria) this;
        }

        public Criteria andReasonforreworkEqualTo(String value) {
            addCriterion("reasonforRework =", value, "reasonforrework");
            return (Criteria) this;
        }

        public Criteria andReasonforreworkNotEqualTo(String value) {
            addCriterion("reasonforRework <>", value, "reasonforrework");
            return (Criteria) this;
        }

        public Criteria andReasonforreworkGreaterThan(String value) {
            addCriterion("reasonforRework >", value, "reasonforrework");
            return (Criteria) this;
        }

        public Criteria andReasonforreworkGreaterThanOrEqualTo(String value) {
            addCriterion("reasonforRework >=", value, "reasonforrework");
            return (Criteria) this;
        }

        public Criteria andReasonforreworkLessThan(String value) {
            addCriterion("reasonforRework <", value, "reasonforrework");
            return (Criteria) this;
        }

        public Criteria andReasonforreworkLessThanOrEqualTo(String value) {
            addCriterion("reasonforRework <=", value, "reasonforrework");
            return (Criteria) this;
        }

        public Criteria andReasonforreworkLike(String value) {
            addCriterion("reasonforRework like", value, "reasonforrework");
            return (Criteria) this;
        }

        public Criteria andReasonforreworkNotLike(String value) {
            addCriterion("reasonforRework not like", value, "reasonforrework");
            return (Criteria) this;
        }

        public Criteria andReasonforreworkIn(List<String> values) {
            addCriterion("reasonforRework in", values, "reasonforrework");
            return (Criteria) this;
        }

        public Criteria andReasonforreworkNotIn(List<String> values) {
            addCriterion("reasonforRework not in", values, "reasonforrework");
            return (Criteria) this;
        }

        public Criteria andReasonforreworkBetween(String value1, String value2) {
            addCriterion("reasonforRework between", value1, value2, "reasonforrework");
            return (Criteria) this;
        }

        public Criteria andReasonforreworkNotBetween(String value1, String value2) {
            addCriterion("reasonforRework not between", value1, value2, "reasonforrework");
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