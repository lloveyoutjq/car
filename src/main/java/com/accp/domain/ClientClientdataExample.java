package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientClientdataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientClientdataExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkMan is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkMan is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkMan =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkMan <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkMan >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkMan >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkMan <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkMan <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkMan like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkMan not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkMan in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkMan not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkMan between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkMan not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBorndateIsNull() {
            addCriterion("bornDate is null");
            return (Criteria) this;
        }

        public Criteria andBorndateIsNotNull() {
            addCriterion("bornDate is not null");
            return (Criteria) this;
        }

        public Criteria andBorndateEqualTo(Date value) {
            addCriterion("bornDate =", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateNotEqualTo(Date value) {
            addCriterion("bornDate <>", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateGreaterThan(Date value) {
            addCriterion("bornDate >", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateGreaterThanOrEqualTo(Date value) {
            addCriterion("bornDate >=", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateLessThan(Date value) {
            addCriterion("bornDate <", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateLessThanOrEqualTo(Date value) {
            addCriterion("bornDate <=", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateIn(List<Date> values) {
            addCriterion("bornDate in", values, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateNotIn(List<Date> values) {
            addCriterion("bornDate not in", values, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateBetween(Date value1, Date value2) {
            addCriterion("bornDate between", value1, value2, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateNotBetween(Date value1, Date value2) {
            addCriterion("bornDate not between", value1, value2, "borndate");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysIsNull() {
            addCriterion("paymentDays is null");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysIsNotNull() {
            addCriterion("paymentDays is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysEqualTo(Integer value) {
            addCriterion("paymentDays =", value, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysNotEqualTo(Integer value) {
            addCriterion("paymentDays <>", value, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysGreaterThan(Integer value) {
            addCriterion("paymentDays >", value, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentDays >=", value, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysLessThan(Integer value) {
            addCriterion("paymentDays <", value, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysLessThanOrEqualTo(Integer value) {
            addCriterion("paymentDays <=", value, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysIn(List<Integer> values) {
            addCriterion("paymentDays in", values, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysNotIn(List<Integer> values) {
            addCriterion("paymentDays not in", values, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysBetween(Integer value1, Integer value2) {
            addCriterion("paymentDays between", value1, value2, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentDays not between", value1, value2, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeIsNull() {
            addCriterion("paymentSize is null");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeIsNotNull() {
            addCriterion("paymentSize is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeEqualTo(Integer value) {
            addCriterion("paymentSize =", value, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeNotEqualTo(Integer value) {
            addCriterion("paymentSize <>", value, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeGreaterThan(Integer value) {
            addCriterion("paymentSize >", value, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentSize >=", value, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeLessThan(Integer value) {
            addCriterion("paymentSize <", value, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeLessThanOrEqualTo(Integer value) {
            addCriterion("paymentSize <=", value, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeIn(List<Integer> values) {
            addCriterion("paymentSize in", values, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeNotIn(List<Integer> values) {
            addCriterion("paymentSize not in", values, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeBetween(Integer value1, Integer value2) {
            addCriterion("paymentSize between", value1, value2, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentSize not between", value1, value2, "paymentsize");
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

        public Criteria andCounselornameIsNull() {
            addCriterion("counselorName is null");
            return (Criteria) this;
        }

        public Criteria andCounselornameIsNotNull() {
            addCriterion("counselorName is not null");
            return (Criteria) this;
        }

        public Criteria andCounselornameEqualTo(String value) {
            addCriterion("counselorName =", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameNotEqualTo(String value) {
            addCriterion("counselorName <>", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameGreaterThan(String value) {
            addCriterion("counselorName >", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameGreaterThanOrEqualTo(String value) {
            addCriterion("counselorName >=", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameLessThan(String value) {
            addCriterion("counselorName <", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameLessThanOrEqualTo(String value) {
            addCriterion("counselorName <=", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameLike(String value) {
            addCriterion("counselorName like", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameNotLike(String value) {
            addCriterion("counselorName not like", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameIn(List<String> values) {
            addCriterion("counselorName in", values, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameNotIn(List<String> values) {
            addCriterion("counselorName not in", values, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameBetween(String value1, String value2) {
            addCriterion("counselorName between", value1, value2, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameNotBetween(String value1, String value2) {
            addCriterion("counselorName not between", value1, value2, "counselorname");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
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

        public Criteria andTaxpayernumberIsNull() {
            addCriterion("taxpayerNumber is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberIsNotNull() {
            addCriterion("taxpayerNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberEqualTo(String value) {
            addCriterion("taxpayerNumber =", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberNotEqualTo(String value) {
            addCriterion("taxpayerNumber <>", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberGreaterThan(String value) {
            addCriterion("taxpayerNumber >", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayerNumber >=", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberLessThan(String value) {
            addCriterion("taxpayerNumber <", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberLessThanOrEqualTo(String value) {
            addCriterion("taxpayerNumber <=", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberLike(String value) {
            addCriterion("taxpayerNumber like", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberNotLike(String value) {
            addCriterion("taxpayerNumber not like", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberIn(List<String> values) {
            addCriterion("taxpayerNumber in", values, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberNotIn(List<String> values) {
            addCriterion("taxpayerNumber not in", values, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberBetween(String value1, String value2) {
            addCriterion("taxpayerNumber between", value1, value2, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberNotBetween(String value1, String value2) {
            addCriterion("taxpayerNumber not between", value1, value2, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andRegosterphoneIsNull() {
            addCriterion("regosterPhone is null");
            return (Criteria) this;
        }

        public Criteria andRegosterphoneIsNotNull() {
            addCriterion("regosterPhone is not null");
            return (Criteria) this;
        }

        public Criteria andRegosterphoneEqualTo(String value) {
            addCriterion("regosterPhone =", value, "regosterphone");
            return (Criteria) this;
        }

        public Criteria andRegosterphoneNotEqualTo(String value) {
            addCriterion("regosterPhone <>", value, "regosterphone");
            return (Criteria) this;
        }

        public Criteria andRegosterphoneGreaterThan(String value) {
            addCriterion("regosterPhone >", value, "regosterphone");
            return (Criteria) this;
        }

        public Criteria andRegosterphoneGreaterThanOrEqualTo(String value) {
            addCriterion("regosterPhone >=", value, "regosterphone");
            return (Criteria) this;
        }

        public Criteria andRegosterphoneLessThan(String value) {
            addCriterion("regosterPhone <", value, "regosterphone");
            return (Criteria) this;
        }

        public Criteria andRegosterphoneLessThanOrEqualTo(String value) {
            addCriterion("regosterPhone <=", value, "regosterphone");
            return (Criteria) this;
        }

        public Criteria andRegosterphoneLike(String value) {
            addCriterion("regosterPhone like", value, "regosterphone");
            return (Criteria) this;
        }

        public Criteria andRegosterphoneNotLike(String value) {
            addCriterion("regosterPhone not like", value, "regosterphone");
            return (Criteria) this;
        }

        public Criteria andRegosterphoneIn(List<String> values) {
            addCriterion("regosterPhone in", values, "regosterphone");
            return (Criteria) this;
        }

        public Criteria andRegosterphoneNotIn(List<String> values) {
            addCriterion("regosterPhone not in", values, "regosterphone");
            return (Criteria) this;
        }

        public Criteria andRegosterphoneBetween(String value1, String value2) {
            addCriterion("regosterPhone between", value1, value2, "regosterphone");
            return (Criteria) this;
        }

        public Criteria andRegosterphoneNotBetween(String value1, String value2) {
            addCriterion("regosterPhone not between", value1, value2, "regosterphone");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBanknumberIsNull() {
            addCriterion("bankNumber is null");
            return (Criteria) this;
        }

        public Criteria andBanknumberIsNotNull() {
            addCriterion("bankNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBanknumberEqualTo(String value) {
            addCriterion("bankNumber =", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotEqualTo(String value) {
            addCriterion("bankNumber <>", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberGreaterThan(String value) {
            addCriterion("bankNumber >", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberGreaterThanOrEqualTo(String value) {
            addCriterion("bankNumber >=", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLessThan(String value) {
            addCriterion("bankNumber <", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLessThanOrEqualTo(String value) {
            addCriterion("bankNumber <=", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLike(String value) {
            addCriterion("bankNumber like", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotLike(String value) {
            addCriterion("bankNumber not like", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberIn(List<String> values) {
            addCriterion("bankNumber in", values, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotIn(List<String> values) {
            addCriterion("bankNumber not in", values, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberBetween(String value1, String value2) {
            addCriterion("bankNumber between", value1, value2, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotBetween(String value1, String value2) {
            addCriterion("bankNumber not between", value1, value2, "banknumber");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressIsNull() {
            addCriterion("registerAddress is null");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressIsNotNull() {
            addCriterion("registerAddress is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressEqualTo(String value) {
            addCriterion("registerAddress =", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressNotEqualTo(String value) {
            addCriterion("registerAddress <>", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressGreaterThan(String value) {
            addCriterion("registerAddress >", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressGreaterThanOrEqualTo(String value) {
            addCriterion("registerAddress >=", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressLessThan(String value) {
            addCriterion("registerAddress <", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressLessThanOrEqualTo(String value) {
            addCriterion("registerAddress <=", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressLike(String value) {
            addCriterion("registerAddress like", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressNotLike(String value) {
            addCriterion("registerAddress not like", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressIn(List<String> values) {
            addCriterion("registerAddress in", values, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressNotIn(List<String> values) {
            addCriterion("registerAddress not in", values, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressBetween(String value1, String value2) {
            addCriterion("registerAddress between", value1, value2, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressNotBetween(String value1, String value2) {
            addCriterion("registerAddress not between", value1, value2, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRestIsNull() {
            addCriterion("rest is null");
            return (Criteria) this;
        }

        public Criteria andRestIsNotNull() {
            addCriterion("rest is not null");
            return (Criteria) this;
        }

        public Criteria andRestEqualTo(String value) {
            addCriterion("rest =", value, "rest");
            return (Criteria) this;
        }

        public Criteria andRestNotEqualTo(String value) {
            addCriterion("rest <>", value, "rest");
            return (Criteria) this;
        }

        public Criteria andRestGreaterThan(String value) {
            addCriterion("rest >", value, "rest");
            return (Criteria) this;
        }

        public Criteria andRestGreaterThanOrEqualTo(String value) {
            addCriterion("rest >=", value, "rest");
            return (Criteria) this;
        }

        public Criteria andRestLessThan(String value) {
            addCriterion("rest <", value, "rest");
            return (Criteria) this;
        }

        public Criteria andRestLessThanOrEqualTo(String value) {
            addCriterion("rest <=", value, "rest");
            return (Criteria) this;
        }

        public Criteria andRestLike(String value) {
            addCriterion("rest like", value, "rest");
            return (Criteria) this;
        }

        public Criteria andRestNotLike(String value) {
            addCriterion("rest not like", value, "rest");
            return (Criteria) this;
        }

        public Criteria andRestIn(List<String> values) {
            addCriterion("rest in", values, "rest");
            return (Criteria) this;
        }

        public Criteria andRestNotIn(List<String> values) {
            addCriterion("rest not in", values, "rest");
            return (Criteria) this;
        }

        public Criteria andRestBetween(String value1, String value2) {
            addCriterion("rest between", value1, value2, "rest");
            return (Criteria) this;
        }

        public Criteria andRestNotBetween(String value1, String value2) {
            addCriterion("rest not between", value1, value2, "rest");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
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

        public Criteria andDefault3IsNull() {
            addCriterion("default3 is null");
            return (Criteria) this;
        }

        public Criteria andDefault3IsNotNull() {
            addCriterion("default3 is not null");
            return (Criteria) this;
        }

        public Criteria andDefault3EqualTo(String value) {
            addCriterion("default3 =", value, "default3");
            return (Criteria) this;
        }

        public Criteria andDefault3NotEqualTo(String value) {
            addCriterion("default3 <>", value, "default3");
            return (Criteria) this;
        }

        public Criteria andDefault3GreaterThan(String value) {
            addCriterion("default3 >", value, "default3");
            return (Criteria) this;
        }

        public Criteria andDefault3GreaterThanOrEqualTo(String value) {
            addCriterion("default3 >=", value, "default3");
            return (Criteria) this;
        }

        public Criteria andDefault3LessThan(String value) {
            addCriterion("default3 <", value, "default3");
            return (Criteria) this;
        }

        public Criteria andDefault3LessThanOrEqualTo(String value) {
            addCriterion("default3 <=", value, "default3");
            return (Criteria) this;
        }

        public Criteria andDefault3Like(String value) {
            addCriterion("default3 like", value, "default3");
            return (Criteria) this;
        }

        public Criteria andDefault3NotLike(String value) {
            addCriterion("default3 not like", value, "default3");
            return (Criteria) this;
        }

        public Criteria andDefault3In(List<String> values) {
            addCriterion("default3 in", values, "default3");
            return (Criteria) this;
        }

        public Criteria andDefault3NotIn(List<String> values) {
            addCriterion("default3 not in", values, "default3");
            return (Criteria) this;
        }

        public Criteria andDefault3Between(String value1, String value2) {
            addCriterion("default3 between", value1, value2, "default3");
            return (Criteria) this;
        }

        public Criteria andDefault3NotBetween(String value1, String value2) {
            addCriterion("default3 not between", value1, value2, "default3");
            return (Criteria) this;
        }

        public Criteria andDefault4IsNull() {
            addCriterion("default4 is null");
            return (Criteria) this;
        }

        public Criteria andDefault4IsNotNull() {
            addCriterion("default4 is not null");
            return (Criteria) this;
        }

        public Criteria andDefault4EqualTo(String value) {
            addCriterion("default4 =", value, "default4");
            return (Criteria) this;
        }

        public Criteria andDefault4NotEqualTo(String value) {
            addCriterion("default4 <>", value, "default4");
            return (Criteria) this;
        }

        public Criteria andDefault4GreaterThan(String value) {
            addCriterion("default4 >", value, "default4");
            return (Criteria) this;
        }

        public Criteria andDefault4GreaterThanOrEqualTo(String value) {
            addCriterion("default4 >=", value, "default4");
            return (Criteria) this;
        }

        public Criteria andDefault4LessThan(String value) {
            addCriterion("default4 <", value, "default4");
            return (Criteria) this;
        }

        public Criteria andDefault4LessThanOrEqualTo(String value) {
            addCriterion("default4 <=", value, "default4");
            return (Criteria) this;
        }

        public Criteria andDefault4Like(String value) {
            addCriterion("default4 like", value, "default4");
            return (Criteria) this;
        }

        public Criteria andDefault4NotLike(String value) {
            addCriterion("default4 not like", value, "default4");
            return (Criteria) this;
        }

        public Criteria andDefault4In(List<String> values) {
            addCriterion("default4 in", values, "default4");
            return (Criteria) this;
        }

        public Criteria andDefault4NotIn(List<String> values) {
            addCriterion("default4 not in", values, "default4");
            return (Criteria) this;
        }

        public Criteria andDefault4Between(String value1, String value2) {
            addCriterion("default4 between", value1, value2, "default4");
            return (Criteria) this;
        }

        public Criteria andDefault4NotBetween(String value1, String value2) {
            addCriterion("default4 not between", value1, value2, "default4");
            return (Criteria) this;
        }

        public Criteria andDefault5IsNull() {
            addCriterion("default5 is null");
            return (Criteria) this;
        }

        public Criteria andDefault5IsNotNull() {
            addCriterion("default5 is not null");
            return (Criteria) this;
        }

        public Criteria andDefault5EqualTo(String value) {
            addCriterion("default5 =", value, "default5");
            return (Criteria) this;
        }

        public Criteria andDefault5NotEqualTo(String value) {
            addCriterion("default5 <>", value, "default5");
            return (Criteria) this;
        }

        public Criteria andDefault5GreaterThan(String value) {
            addCriterion("default5 >", value, "default5");
            return (Criteria) this;
        }

        public Criteria andDefault5GreaterThanOrEqualTo(String value) {
            addCriterion("default5 >=", value, "default5");
            return (Criteria) this;
        }

        public Criteria andDefault5LessThan(String value) {
            addCriterion("default5 <", value, "default5");
            return (Criteria) this;
        }

        public Criteria andDefault5LessThanOrEqualTo(String value) {
            addCriterion("default5 <=", value, "default5");
            return (Criteria) this;
        }

        public Criteria andDefault5Like(String value) {
            addCriterion("default5 like", value, "default5");
            return (Criteria) this;
        }

        public Criteria andDefault5NotLike(String value) {
            addCriterion("default5 not like", value, "default5");
            return (Criteria) this;
        }

        public Criteria andDefault5In(List<String> values) {
            addCriterion("default5 in", values, "default5");
            return (Criteria) this;
        }

        public Criteria andDefault5NotIn(List<String> values) {
            addCriterion("default5 not in", values, "default5");
            return (Criteria) this;
        }

        public Criteria andDefault5Between(String value1, String value2) {
            addCriterion("default5 between", value1, value2, "default5");
            return (Criteria) this;
        }

        public Criteria andDefault5NotBetween(String value1, String value2) {
            addCriterion("default5 not between", value1, value2, "default5");
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