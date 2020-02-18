package com.accp.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DataRepairItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataRepairItemsExample() {
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

        public Criteria andRescuerepairidIsNull() {
            addCriterion("rescueRepairId is null");
            return (Criteria) this;
        }

        public Criteria andRescuerepairidIsNotNull() {
            addCriterion("rescueRepairId is not null");
            return (Criteria) this;
        }

        public Criteria andRescuerepairidEqualTo(String value) {
            addCriterion("rescueRepairId =", value, "rescuerepairid");
            return (Criteria) this;
        }

        public Criteria andRescuerepairidNotEqualTo(String value) {
            addCriterion("rescueRepairId <>", value, "rescuerepairid");
            return (Criteria) this;
        }

        public Criteria andRescuerepairidGreaterThan(String value) {
            addCriterion("rescueRepairId >", value, "rescuerepairid");
            return (Criteria) this;
        }

        public Criteria andRescuerepairidGreaterThanOrEqualTo(String value) {
            addCriterion("rescueRepairId >=", value, "rescuerepairid");
            return (Criteria) this;
        }

        public Criteria andRescuerepairidLessThan(String value) {
            addCriterion("rescueRepairId <", value, "rescuerepairid");
            return (Criteria) this;
        }

        public Criteria andRescuerepairidLessThanOrEqualTo(String value) {
            addCriterion("rescueRepairId <=", value, "rescuerepairid");
            return (Criteria) this;
        }

        public Criteria andRescuerepairidLike(String value) {
            addCriterion("rescueRepairId like", value, "rescuerepairid");
            return (Criteria) this;
        }

        public Criteria andRescuerepairidNotLike(String value) {
            addCriterion("rescueRepairId not like", value, "rescuerepairid");
            return (Criteria) this;
        }

        public Criteria andRescuerepairidIn(List<String> values) {
            addCriterion("rescueRepairId in", values, "rescuerepairid");
            return (Criteria) this;
        }

        public Criteria andRescuerepairidNotIn(List<String> values) {
            addCriterion("rescueRepairId not in", values, "rescuerepairid");
            return (Criteria) this;
        }

        public Criteria andRescuerepairidBetween(String value1, String value2) {
            addCriterion("rescueRepairId between", value1, value2, "rescuerepairid");
            return (Criteria) this;
        }

        public Criteria andRescuerepairidNotBetween(String value1, String value2) {
            addCriterion("rescueRepairId not between", value1, value2, "rescuerepairid");
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

        public Criteria andPriceclassIsNull() {
            addCriterion("priceClass is null");
            return (Criteria) this;
        }

        public Criteria andPriceclassIsNotNull() {
            addCriterion("priceClass is not null");
            return (Criteria) this;
        }

        public Criteria andPriceclassEqualTo(String value) {
            addCriterion("priceClass =", value, "priceclass");
            return (Criteria) this;
        }

        public Criteria andPriceclassNotEqualTo(String value) {
            addCriterion("priceClass <>", value, "priceclass");
            return (Criteria) this;
        }

        public Criteria andPriceclassGreaterThan(String value) {
            addCriterion("priceClass >", value, "priceclass");
            return (Criteria) this;
        }

        public Criteria andPriceclassGreaterThanOrEqualTo(String value) {
            addCriterion("priceClass >=", value, "priceclass");
            return (Criteria) this;
        }

        public Criteria andPriceclassLessThan(String value) {
            addCriterion("priceClass <", value, "priceclass");
            return (Criteria) this;
        }

        public Criteria andPriceclassLessThanOrEqualTo(String value) {
            addCriterion("priceClass <=", value, "priceclass");
            return (Criteria) this;
        }

        public Criteria andPriceclassLike(String value) {
            addCriterion("priceClass like", value, "priceclass");
            return (Criteria) this;
        }

        public Criteria andPriceclassNotLike(String value) {
            addCriterion("priceClass not like", value, "priceclass");
            return (Criteria) this;
        }

        public Criteria andPriceclassIn(List<String> values) {
            addCriterion("priceClass in", values, "priceclass");
            return (Criteria) this;
        }

        public Criteria andPriceclassNotIn(List<String> values) {
            addCriterion("priceClass not in", values, "priceclass");
            return (Criteria) this;
        }

        public Criteria andPriceclassBetween(String value1, String value2) {
            addCriterion("priceClass between", value1, value2, "priceclass");
            return (Criteria) this;
        }

        public Criteria andPriceclassNotBetween(String value1, String value2) {
            addCriterion("priceClass not between", value1, value2, "priceclass");
            return (Criteria) this;
        }

        public Criteria andPreeofchargeforIsNull() {
            addCriterion("preeOfChargeFor is null");
            return (Criteria) this;
        }

        public Criteria andPreeofchargeforIsNotNull() {
            addCriterion("preeOfChargeFor is not null");
            return (Criteria) this;
        }

        public Criteria andPreeofchargeforEqualTo(String value) {
            addCriterion("preeOfChargeFor =", value, "preeofchargefor");
            return (Criteria) this;
        }

        public Criteria andPreeofchargeforNotEqualTo(String value) {
            addCriterion("preeOfChargeFor <>", value, "preeofchargefor");
            return (Criteria) this;
        }

        public Criteria andPreeofchargeforGreaterThan(String value) {
            addCriterion("preeOfChargeFor >", value, "preeofchargefor");
            return (Criteria) this;
        }

        public Criteria andPreeofchargeforGreaterThanOrEqualTo(String value) {
            addCriterion("preeOfChargeFor >=", value, "preeofchargefor");
            return (Criteria) this;
        }

        public Criteria andPreeofchargeforLessThan(String value) {
            addCriterion("preeOfChargeFor <", value, "preeofchargefor");
            return (Criteria) this;
        }

        public Criteria andPreeofchargeforLessThanOrEqualTo(String value) {
            addCriterion("preeOfChargeFor <=", value, "preeofchargefor");
            return (Criteria) this;
        }

        public Criteria andPreeofchargeforLike(String value) {
            addCriterion("preeOfChargeFor like", value, "preeofchargefor");
            return (Criteria) this;
        }

        public Criteria andPreeofchargeforNotLike(String value) {
            addCriterion("preeOfChargeFor not like", value, "preeofchargefor");
            return (Criteria) this;
        }

        public Criteria andPreeofchargeforIn(List<String> values) {
            addCriterion("preeOfChargeFor in", values, "preeofchargefor");
            return (Criteria) this;
        }

        public Criteria andPreeofchargeforNotIn(List<String> values) {
            addCriterion("preeOfChargeFor not in", values, "preeofchargefor");
            return (Criteria) this;
        }

        public Criteria andPreeofchargeforBetween(String value1, String value2) {
            addCriterion("preeOfChargeFor between", value1, value2, "preeofchargefor");
            return (Criteria) this;
        }

        public Criteria andPreeofchargeforNotBetween(String value1, String value2) {
            addCriterion("preeOfChargeFor not between", value1, value2, "preeofchargefor");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andBeforeThePreferentialIsNull() {
            addCriterion("before_the_preferential is null");
            return (Criteria) this;
        }

        public Criteria andBeforeThePreferentialIsNotNull() {
            addCriterion("before_the_preferential is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeThePreferentialEqualTo(BigDecimal value) {
            addCriterion("before_the_preferential =", value, "beforeThePreferential");
            return (Criteria) this;
        }

        public Criteria andBeforeThePreferentialNotEqualTo(BigDecimal value) {
            addCriterion("before_the_preferential <>", value, "beforeThePreferential");
            return (Criteria) this;
        }

        public Criteria andBeforeThePreferentialGreaterThan(BigDecimal value) {
            addCriterion("before_the_preferential >", value, "beforeThePreferential");
            return (Criteria) this;
        }

        public Criteria andBeforeThePreferentialGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("before_the_preferential >=", value, "beforeThePreferential");
            return (Criteria) this;
        }

        public Criteria andBeforeThePreferentialLessThan(BigDecimal value) {
            addCriterion("before_the_preferential <", value, "beforeThePreferential");
            return (Criteria) this;
        }

        public Criteria andBeforeThePreferentialLessThanOrEqualTo(BigDecimal value) {
            addCriterion("before_the_preferential <=", value, "beforeThePreferential");
            return (Criteria) this;
        }

        public Criteria andBeforeThePreferentialIn(List<BigDecimal> values) {
            addCriterion("before_the_preferential in", values, "beforeThePreferential");
            return (Criteria) this;
        }

        public Criteria andBeforeThePreferentialNotIn(List<BigDecimal> values) {
            addCriterion("before_the_preferential not in", values, "beforeThePreferential");
            return (Criteria) this;
        }

        public Criteria andBeforeThePreferentialBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_the_preferential between", value1, value2, "beforeThePreferential");
            return (Criteria) this;
        }

        public Criteria andBeforeThePreferentialNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_the_preferential not between", value1, value2, "beforeThePreferential");
            return (Criteria) this;
        }

        public Criteria andAfterThePreferentialIsNull() {
            addCriterion("after_the_preferential is null");
            return (Criteria) this;
        }

        public Criteria andAfterThePreferentialIsNotNull() {
            addCriterion("after_the_preferential is not null");
            return (Criteria) this;
        }

        public Criteria andAfterThePreferentialEqualTo(BigDecimal value) {
            addCriterion("after_the_preferential =", value, "afterThePreferential");
            return (Criteria) this;
        }

        public Criteria andAfterThePreferentialNotEqualTo(BigDecimal value) {
            addCriterion("after_the_preferential <>", value, "afterThePreferential");
            return (Criteria) this;
        }

        public Criteria andAfterThePreferentialGreaterThan(BigDecimal value) {
            addCriterion("after_the_preferential >", value, "afterThePreferential");
            return (Criteria) this;
        }

        public Criteria andAfterThePreferentialGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("after_the_preferential >=", value, "afterThePreferential");
            return (Criteria) this;
        }

        public Criteria andAfterThePreferentialLessThan(BigDecimal value) {
            addCriterion("after_the_preferential <", value, "afterThePreferential");
            return (Criteria) this;
        }

        public Criteria andAfterThePreferentialLessThanOrEqualTo(BigDecimal value) {
            addCriterion("after_the_preferential <=", value, "afterThePreferential");
            return (Criteria) this;
        }

        public Criteria andAfterThePreferentialIn(List<BigDecimal> values) {
            addCriterion("after_the_preferential in", values, "afterThePreferential");
            return (Criteria) this;
        }

        public Criteria andAfterThePreferentialNotIn(List<BigDecimal> values) {
            addCriterion("after_the_preferential not in", values, "afterThePreferential");
            return (Criteria) this;
        }

        public Criteria andAfterThePreferentialBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("after_the_preferential between", value1, value2, "afterThePreferential");
            return (Criteria) this;
        }

        public Criteria andAfterThePreferentialNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("after_the_preferential not between", value1, value2, "afterThePreferential");
            return (Criteria) this;
        }

        public Criteria andWorkordernumberIsNull() {
            addCriterion("workOrderNumber is null");
            return (Criteria) this;
        }

        public Criteria andWorkordernumberIsNotNull() {
            addCriterion("workOrderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWorkordernumberEqualTo(String value) {
            addCriterion("workOrderNumber =", value, "workordernumber");
            return (Criteria) this;
        }

        public Criteria andWorkordernumberNotEqualTo(String value) {
            addCriterion("workOrderNumber <>", value, "workordernumber");
            return (Criteria) this;
        }

        public Criteria andWorkordernumberGreaterThan(String value) {
            addCriterion("workOrderNumber >", value, "workordernumber");
            return (Criteria) this;
        }

        public Criteria andWorkordernumberGreaterThanOrEqualTo(String value) {
            addCriterion("workOrderNumber >=", value, "workordernumber");
            return (Criteria) this;
        }

        public Criteria andWorkordernumberLessThan(String value) {
            addCriterion("workOrderNumber <", value, "workordernumber");
            return (Criteria) this;
        }

        public Criteria andWorkordernumberLessThanOrEqualTo(String value) {
            addCriterion("workOrderNumber <=", value, "workordernumber");
            return (Criteria) this;
        }

        public Criteria andWorkordernumberLike(String value) {
            addCriterion("workOrderNumber like", value, "workordernumber");
            return (Criteria) this;
        }

        public Criteria andWorkordernumberNotLike(String value) {
            addCriterion("workOrderNumber not like", value, "workordernumber");
            return (Criteria) this;
        }

        public Criteria andWorkordernumberIn(List<String> values) {
            addCriterion("workOrderNumber in", values, "workordernumber");
            return (Criteria) this;
        }

        public Criteria andWorkordernumberNotIn(List<String> values) {
            addCriterion("workOrderNumber not in", values, "workordernumber");
            return (Criteria) this;
        }

        public Criteria andWorkordernumberBetween(String value1, String value2) {
            addCriterion("workOrderNumber between", value1, value2, "workordernumber");
            return (Criteria) this;
        }

        public Criteria andWorkordernumberNotBetween(String value1, String value2) {
            addCriterion("workOrderNumber not between", value1, value2, "workordernumber");
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

        public Criteria andStaffidIsNull() {
            addCriterion("staffId is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("staffId is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(Integer value) {
            addCriterion("staffId =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(Integer value) {
            addCriterion("staffId <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(Integer value) {
            addCriterion("staffId >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffId >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(Integer value) {
            addCriterion("staffId <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(Integer value) {
            addCriterion("staffId <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<Integer> values) {
            addCriterion("staffId in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<Integer> values) {
            addCriterion("staffId not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(Integer value1, Integer value2) {
            addCriterion("staffId between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(Integer value1, Integer value2) {
            addCriterion("staffId not between", value1, value2, "staffid");
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