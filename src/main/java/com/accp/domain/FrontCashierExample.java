package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontCashierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontCashierExample() {
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

        public Criteria andCashieridIsNull() {
            addCriterion("cashierId is null");
            return (Criteria) this;
        }

        public Criteria andCashieridIsNotNull() {
            addCriterion("cashierId is not null");
            return (Criteria) this;
        }

        public Criteria andCashieridEqualTo(Integer value) {
            addCriterion("cashierId =", value, "cashierid");
            return (Criteria) this;
        }

        public Criteria andCashieridNotEqualTo(Integer value) {
            addCriterion("cashierId <>", value, "cashierid");
            return (Criteria) this;
        }

        public Criteria andCashieridGreaterThan(Integer value) {
            addCriterion("cashierId >", value, "cashierid");
            return (Criteria) this;
        }

        public Criteria andCashieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("cashierId >=", value, "cashierid");
            return (Criteria) this;
        }

        public Criteria andCashieridLessThan(Integer value) {
            addCriterion("cashierId <", value, "cashierid");
            return (Criteria) this;
        }

        public Criteria andCashieridLessThanOrEqualTo(Integer value) {
            addCriterion("cashierId <=", value, "cashierid");
            return (Criteria) this;
        }

        public Criteria andCashieridIn(List<Integer> values) {
            addCriterion("cashierId in", values, "cashierid");
            return (Criteria) this;
        }

        public Criteria andCashieridNotIn(List<Integer> values) {
            addCriterion("cashierId not in", values, "cashierid");
            return (Criteria) this;
        }

        public Criteria andCashieridBetween(Integer value1, Integer value2) {
            addCriterion("cashierId between", value1, value2, "cashierid");
            return (Criteria) this;
        }

        public Criteria andCashieridNotBetween(Integer value1, Integer value2) {
            addCriterion("cashierId not between", value1, value2, "cashierid");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNull() {
            addCriterion("totalNum is null");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNotNull() {
            addCriterion("totalNum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalnumEqualTo(Float value) {
            addCriterion("totalNum =", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotEqualTo(Float value) {
            addCriterion("totalNum <>", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThan(Float value) {
            addCriterion("totalNum >", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThanOrEqualTo(Float value) {
            addCriterion("totalNum >=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThan(Float value) {
            addCriterion("totalNum <", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThanOrEqualTo(Float value) {
            addCriterion("totalNum <=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumIn(List<Float> values) {
            addCriterion("totalNum in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotIn(List<Float> values) {
            addCriterion("totalNum not in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumBetween(Float value1, Float value2) {
            addCriterion("totalNum between", value1, value2, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotBetween(Float value1, Float value2) {
            addCriterion("totalNum not between", value1, value2, "totalnum");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusIsNull() {
            addCriterion("settlementStatus is null");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusIsNotNull() {
            addCriterion("settlementStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusEqualTo(String value) {
            addCriterion("settlementStatus =", value, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusNotEqualTo(String value) {
            addCriterion("settlementStatus <>", value, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusGreaterThan(String value) {
            addCriterion("settlementStatus >", value, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusGreaterThanOrEqualTo(String value) {
            addCriterion("settlementStatus >=", value, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusLessThan(String value) {
            addCriterion("settlementStatus <", value, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusLessThanOrEqualTo(String value) {
            addCriterion("settlementStatus <=", value, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusLike(String value) {
            addCriterion("settlementStatus like", value, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusNotLike(String value) {
            addCriterion("settlementStatus not like", value, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusIn(List<String> values) {
            addCriterion("settlementStatus in", values, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusNotIn(List<String> values) {
            addCriterion("settlementStatus not in", values, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusBetween(String value1, String value2) {
            addCriterion("settlementStatus between", value1, value2, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andSettlementstatusNotBetween(String value1, String value2) {
            addCriterion("settlementStatus not between", value1, value2, "settlementstatus");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIsNull() {
            addCriterion("paymentType is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIsNotNull() {
            addCriterion("paymentType is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeEqualTo(String value) {
            addCriterion("paymentType =", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotEqualTo(String value) {
            addCriterion("paymentType <>", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThan(String value) {
            addCriterion("paymentType >", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("paymentType >=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThan(String value) {
            addCriterion("paymentType <", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThanOrEqualTo(String value) {
            addCriterion("paymentType <=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLike(String value) {
            addCriterion("paymentType like", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotLike(String value) {
            addCriterion("paymentType not like", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIn(List<String> values) {
            addCriterion("paymentType in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotIn(List<String> values) {
            addCriterion("paymentType not in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeBetween(String value1, String value2) {
            addCriterion("paymentType between", value1, value2, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotBetween(String value1, String value2) {
            addCriterion("paymentType not between", value1, value2, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIsNull() {
            addCriterion("invoiceId is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIsNotNull() {
            addCriterion("invoiceId is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceidEqualTo(Integer value) {
            addCriterion("invoiceId =", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotEqualTo(Integer value) {
            addCriterion("invoiceId <>", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidGreaterThan(Integer value) {
            addCriterion("invoiceId >", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoiceId >=", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLessThan(Integer value) {
            addCriterion("invoiceId <", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLessThanOrEqualTo(Integer value) {
            addCriterion("invoiceId <=", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIn(List<Integer> values) {
            addCriterion("invoiceId in", values, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotIn(List<Integer> values) {
            addCriterion("invoiceId not in", values, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidBetween(Integer value1, Integer value2) {
            addCriterion("invoiceId between", value1, value2, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotBetween(Integer value1, Integer value2) {
            addCriterion("invoiceId not between", value1, value2, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andCashiertimeIsNull() {
            addCriterion("cashierTime is null");
            return (Criteria) this;
        }

        public Criteria andCashiertimeIsNotNull() {
            addCriterion("cashierTime is not null");
            return (Criteria) this;
        }

        public Criteria andCashiertimeEqualTo(Date value) {
            addCriterion("cashierTime =", value, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeNotEqualTo(Date value) {
            addCriterion("cashierTime <>", value, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeGreaterThan(Date value) {
            addCriterion("cashierTime >", value, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cashierTime >=", value, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeLessThan(Date value) {
            addCriterion("cashierTime <", value, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeLessThanOrEqualTo(Date value) {
            addCriterion("cashierTime <=", value, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeIn(List<Date> values) {
            addCriterion("cashierTime in", values, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeNotIn(List<Date> values) {
            addCriterion("cashierTime not in", values, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeBetween(Date value1, Date value2) {
            addCriterion("cashierTime between", value1, value2, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeNotBetween(Date value1, Date value2) {
            addCriterion("cashierTime not between", value1, value2, "cashiertime");
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

        public Criteria andStaffidEqualTo(String value) {
            addCriterion("staffId =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(String value) {
            addCriterion("staffId <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(String value) {
            addCriterion("staffId >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(String value) {
            addCriterion("staffId >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(String value) {
            addCriterion("staffId <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(String value) {
            addCriterion("staffId <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLike(String value) {
            addCriterion("staffId like", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotLike(String value) {
            addCriterion("staffId not like", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<String> values) {
            addCriterion("staffId in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<String> values) {
            addCriterion("staffId not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(String value1, String value2) {
            addCriterion("staffId between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(String value1, String value2) {
            addCriterion("staffId not between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andOncreditIsNull() {
            addCriterion("onCredit is null");
            return (Criteria) this;
        }

        public Criteria andOncreditIsNotNull() {
            addCriterion("onCredit is not null");
            return (Criteria) this;
        }

        public Criteria andOncreditEqualTo(Float value) {
            addCriterion("onCredit =", value, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditNotEqualTo(Float value) {
            addCriterion("onCredit <>", value, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditGreaterThan(Float value) {
            addCriterion("onCredit >", value, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditGreaterThanOrEqualTo(Float value) {
            addCriterion("onCredit >=", value, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditLessThan(Float value) {
            addCriterion("onCredit <", value, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditLessThanOrEqualTo(Float value) {
            addCriterion("onCredit <=", value, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditIn(List<Float> values) {
            addCriterion("onCredit in", values, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditNotIn(List<Float> values) {
            addCriterion("onCredit not in", values, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditBetween(Float value1, Float value2) {
            addCriterion("onCredit between", value1, value2, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditNotBetween(Float value1, Float value2) {
            addCriterion("onCredit not between", value1, value2, "oncredit");
            return (Criteria) this;
        }

        public Criteria andClientidIsNull() {
            addCriterion("clientId is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("clientId is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(Integer value) {
            addCriterion("clientId =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(Integer value) {
            addCriterion("clientId <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(Integer value) {
            addCriterion("clientId >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clientId >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(Integer value) {
            addCriterion("clientId <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(Integer value) {
            addCriterion("clientId <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<Integer> values) {
            addCriterion("clientId in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<Integer> values) {
            addCriterion("clientId not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(Integer value1, Integer value2) {
            addCriterion("clientId between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(Integer value1, Integer value2) {
            addCriterion("clientId not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andChangeIsNull() {
            addCriterion("change is null");
            return (Criteria) this;
        }

        public Criteria andChangeIsNotNull() {
            addCriterion("change is not null");
            return (Criteria) this;
        }

        public Criteria andChangeEqualTo(Float value) {
            addCriterion("change =", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotEqualTo(Float value) {
            addCriterion("change <>", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeGreaterThan(Float value) {
            addCriterion("change >", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeGreaterThanOrEqualTo(Float value) {
            addCriterion("change >=", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeLessThan(Float value) {
            addCriterion("change <", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeLessThanOrEqualTo(Float value) {
            addCriterion("change <=", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeIn(List<Float> values) {
            addCriterion("change in", values, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotIn(List<Float> values) {
            addCriterion("change not in", values, "change");
            return (Criteria) this;
        }

        public Criteria andChangeBetween(Float value1, Float value2) {
            addCriterion("change between", value1, value2, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotBetween(Float value1, Float value2) {
            addCriterion("change not between", value1, value2, "change");
            return (Criteria) this;
        }

        public Criteria andVipbalanceIsNull() {
            addCriterion("vipBalance is null");
            return (Criteria) this;
        }

        public Criteria andVipbalanceIsNotNull() {
            addCriterion("vipBalance is not null");
            return (Criteria) this;
        }

        public Criteria andVipbalanceEqualTo(Float value) {
            addCriterion("vipBalance =", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceNotEqualTo(Float value) {
            addCriterion("vipBalance <>", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceGreaterThan(Float value) {
            addCriterion("vipBalance >", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("vipBalance >=", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceLessThan(Float value) {
            addCriterion("vipBalance <", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceLessThanOrEqualTo(Float value) {
            addCriterion("vipBalance <=", value, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceIn(List<Float> values) {
            addCriterion("vipBalance in", values, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceNotIn(List<Float> values) {
            addCriterion("vipBalance not in", values, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceBetween(Float value1, Float value2) {
            addCriterion("vipBalance between", value1, value2, "vipbalance");
            return (Criteria) this;
        }

        public Criteria andVipbalanceNotBetween(Float value1, Float value2) {
            addCriterion("vipBalance not between", value1, value2, "vipbalance");
            return (Criteria) this;
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