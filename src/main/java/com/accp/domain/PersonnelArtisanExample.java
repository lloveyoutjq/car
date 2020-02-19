package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonnelArtisanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonnelArtisanExample() {
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

        public Criteria andArtisanidIsNull() {
            addCriterion("artisanId is null");
            return (Criteria) this;
        }

        public Criteria andArtisanidIsNotNull() {
            addCriterion("artisanId is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanidEqualTo(Integer value) {
            addCriterion("artisanId =", value, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidNotEqualTo(Integer value) {
            addCriterion("artisanId <>", value, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidGreaterThan(Integer value) {
            addCriterion("artisanId >", value, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("artisanId >=", value, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidLessThan(Integer value) {
            addCriterion("artisanId <", value, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidLessThanOrEqualTo(Integer value) {
            addCriterion("artisanId <=", value, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidIn(List<Integer> values) {
            addCriterion("artisanId in", values, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidNotIn(List<Integer> values) {
            addCriterion("artisanId not in", values, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidBetween(Integer value1, Integer value2) {
            addCriterion("artisanId between", value1, value2, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisanidNotBetween(Integer value1, Integer value2) {
            addCriterion("artisanId not between", value1, value2, "artisanid");
            return (Criteria) this;
        }

        public Criteria andArtisannameIsNull() {
            addCriterion("artisanName is null");
            return (Criteria) this;
        }

        public Criteria andArtisannameIsNotNull() {
            addCriterion("artisanName is not null");
            return (Criteria) this;
        }

        public Criteria andArtisannameEqualTo(String value) {
            addCriterion("artisanName =", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameNotEqualTo(String value) {
            addCriterion("artisanName <>", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameGreaterThan(String value) {
            addCriterion("artisanName >", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameGreaterThanOrEqualTo(String value) {
            addCriterion("artisanName >=", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameLessThan(String value) {
            addCriterion("artisanName <", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameLessThanOrEqualTo(String value) {
            addCriterion("artisanName <=", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameLike(String value) {
            addCriterion("artisanName like", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameNotLike(String value) {
            addCriterion("artisanName not like", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameIn(List<String> values) {
            addCriterion("artisanName in", values, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameNotIn(List<String> values) {
            addCriterion("artisanName not in", values, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameBetween(String value1, String value2) {
            addCriterion("artisanName between", value1, value2, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameNotBetween(String value1, String value2) {
            addCriterion("artisanName not between", value1, value2, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisansexIsNull() {
            addCriterion("artisanSex is null");
            return (Criteria) this;
        }

        public Criteria andArtisansexIsNotNull() {
            addCriterion("artisanSex is not null");
            return (Criteria) this;
        }

        public Criteria andArtisansexEqualTo(String value) {
            addCriterion("artisanSex =", value, "artisansex");
            return (Criteria) this;
        }

        public Criteria andArtisansexNotEqualTo(String value) {
            addCriterion("artisanSex <>", value, "artisansex");
            return (Criteria) this;
        }

        public Criteria andArtisansexGreaterThan(String value) {
            addCriterion("artisanSex >", value, "artisansex");
            return (Criteria) this;
        }

        public Criteria andArtisansexGreaterThanOrEqualTo(String value) {
            addCriterion("artisanSex >=", value, "artisansex");
            return (Criteria) this;
        }

        public Criteria andArtisansexLessThan(String value) {
            addCriterion("artisanSex <", value, "artisansex");
            return (Criteria) this;
        }

        public Criteria andArtisansexLessThanOrEqualTo(String value) {
            addCriterion("artisanSex <=", value, "artisansex");
            return (Criteria) this;
        }

        public Criteria andArtisansexLike(String value) {
            addCriterion("artisanSex like", value, "artisansex");
            return (Criteria) this;
        }

        public Criteria andArtisansexNotLike(String value) {
            addCriterion("artisanSex not like", value, "artisansex");
            return (Criteria) this;
        }

        public Criteria andArtisansexIn(List<String> values) {
            addCriterion("artisanSex in", values, "artisansex");
            return (Criteria) this;
        }

        public Criteria andArtisansexNotIn(List<String> values) {
            addCriterion("artisanSex not in", values, "artisansex");
            return (Criteria) this;
        }

        public Criteria andArtisansexBetween(String value1, String value2) {
            addCriterion("artisanSex between", value1, value2, "artisansex");
            return (Criteria) this;
        }

        public Criteria andArtisansexNotBetween(String value1, String value2) {
            addCriterion("artisanSex not between", value1, value2, "artisansex");
            return (Criteria) this;
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

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
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

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("WeChat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("WeChat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("WeChat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("WeChat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("WeChat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("WeChat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("WeChat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("WeChat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("WeChat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("WeChat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("WeChat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("WeChat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("WeChat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("WeChat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andIdentitycardIsNull() {
            addCriterion("identityCard is null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardIsNotNull() {
            addCriterion("identityCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardEqualTo(String value) {
            addCriterion("identityCard =", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotEqualTo(String value) {
            addCriterion("identityCard <>", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardGreaterThan(String value) {
            addCriterion("identityCard >", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardGreaterThanOrEqualTo(String value) {
            addCriterion("identityCard >=", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardLessThan(String value) {
            addCriterion("identityCard <", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardLessThanOrEqualTo(String value) {
            addCriterion("identityCard <=", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardLike(String value) {
            addCriterion("identityCard like", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotLike(String value) {
            addCriterion("identityCard not like", value, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardIn(List<String> values) {
            addCriterion("identityCard in", values, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotIn(List<String> values) {
            addCriterion("identityCard not in", values, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardBetween(String value1, String value2) {
            addCriterion("identityCard between", value1, value2, "identitycard");
            return (Criteria) this;
        }

        public Criteria andIdentitycardNotBetween(String value1, String value2) {
            addCriterion("identityCard not between", value1, value2, "identitycard");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNull() {
            addCriterion("residence is null");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNotNull() {
            addCriterion("residence is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceEqualTo(String value) {
            addCriterion("residence =", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotEqualTo(String value) {
            addCriterion("residence <>", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThan(String value) {
            addCriterion("residence >", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThanOrEqualTo(String value) {
            addCriterion("residence >=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThan(String value) {
            addCriterion("residence <", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThanOrEqualTo(String value) {
            addCriterion("residence <=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLike(String value) {
            addCriterion("residence like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotLike(String value) {
            addCriterion("residence not like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceIn(List<String> values) {
            addCriterion("residence in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotIn(List<String> values) {
            addCriterion("residence not in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceBetween(String value1, String value2) {
            addCriterion("residence between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotBetween(String value1, String value2) {
            addCriterion("residence not between", value1, value2, "residence");
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

        public Criteria andBankaccountIsNull() {
            addCriterion("bankAccount is null");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNotNull() {
            addCriterion("bankAccount is not null");
            return (Criteria) this;
        }

        public Criteria andBankaccountEqualTo(String value) {
            addCriterion("bankAccount =", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotEqualTo(String value) {
            addCriterion("bankAccount <>", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThan(String value) {
            addCriterion("bankAccount >", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("bankAccount >=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThan(String value) {
            addCriterion("bankAccount <", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThanOrEqualTo(String value) {
            addCriterion("bankAccount <=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLike(String value) {
            addCriterion("bankAccount like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotLike(String value) {
            addCriterion("bankAccount not like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountIn(List<String> values) {
            addCriterion("bankAccount in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotIn(List<String> values) {
            addCriterion("bankAccount not in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountBetween(String value1, String value2) {
            addCriterion("bankAccount between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotBetween(String value1, String value2) {
            addCriterion("bankAccount not between", value1, value2, "bankaccount");
            return (Criteria) this;
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

        public Criteria andGroupleaderIsNull() {
            addCriterion("groupLeader is null");
            return (Criteria) this;
        }

        public Criteria andGroupleaderIsNotNull() {
            addCriterion("groupLeader is not null");
            return (Criteria) this;
        }

        public Criteria andGroupleaderEqualTo(Boolean value) {
            addCriterion("groupLeader =", value, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderNotEqualTo(Boolean value) {
            addCriterion("groupLeader <>", value, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderGreaterThan(Boolean value) {
            addCriterion("groupLeader >", value, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("groupLeader >=", value, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderLessThan(Boolean value) {
            addCriterion("groupLeader <", value, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderLessThanOrEqualTo(Boolean value) {
            addCriterion("groupLeader <=", value, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderIn(List<Boolean> values) {
            addCriterion("groupLeader in", values, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderNotIn(List<Boolean> values) {
            addCriterion("groupLeader not in", values, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderBetween(Boolean value1, Boolean value2) {
            addCriterion("groupLeader between", value1, value2, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("groupLeader not between", value1, value2, "groupleader");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeIsNull() {
            addCriterion("maintainType is null");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeIsNotNull() {
            addCriterion("maintainType is not null");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeEqualTo(String value) {
            addCriterion("maintainType =", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeNotEqualTo(String value) {
            addCriterion("maintainType <>", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeGreaterThan(String value) {
            addCriterion("maintainType >", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeGreaterThanOrEqualTo(String value) {
            addCriterion("maintainType >=", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeLessThan(String value) {
            addCriterion("maintainType <", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeLessThanOrEqualTo(String value) {
            addCriterion("maintainType <=", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeLike(String value) {
            addCriterion("maintainType like", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeNotLike(String value) {
            addCriterion("maintainType not like", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeIn(List<String> values) {
            addCriterion("maintainType in", values, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeNotIn(List<String> values) {
            addCriterion("maintainType not in", values, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeBetween(String value1, String value2) {
            addCriterion("maintainType between", value1, value2, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeNotBetween(String value1, String value2) {
            addCriterion("maintainType not between", value1, value2, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandIsNull() {
            addCriterion("maintainBrand is null");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandIsNotNull() {
            addCriterion("maintainBrand is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandEqualTo(String value) {
            addCriterion("maintainBrand =", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandNotEqualTo(String value) {
            addCriterion("maintainBrand <>", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandGreaterThan(String value) {
            addCriterion("maintainBrand >", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandGreaterThanOrEqualTo(String value) {
            addCriterion("maintainBrand >=", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandLessThan(String value) {
            addCriterion("maintainBrand <", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandLessThanOrEqualTo(String value) {
            addCriterion("maintainBrand <=", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandLike(String value) {
            addCriterion("maintainBrand like", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandNotLike(String value) {
            addCriterion("maintainBrand not like", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandIn(List<String> values) {
            addCriterion("maintainBrand in", values, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandNotIn(List<String> values) {
            addCriterion("maintainBrand not in", values, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandBetween(String value1, String value2) {
            addCriterion("maintainBrand between", value1, value2, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandNotBetween(String value1, String value2) {
            addCriterion("maintainBrand not between", value1, value2, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidIsNull() {
            addCriterion("jurisdictionId is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidIsNotNull() {
            addCriterion("jurisdictionId is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidEqualTo(Integer value) {
            addCriterion("jurisdictionId =", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidNotEqualTo(Integer value) {
            addCriterion("jurisdictionId <>", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidGreaterThan(Integer value) {
            addCriterion("jurisdictionId >", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jurisdictionId >=", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidLessThan(Integer value) {
            addCriterion("jurisdictionId <", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidLessThanOrEqualTo(Integer value) {
            addCriterion("jurisdictionId <=", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidIn(List<Integer> values) {
            addCriterion("jurisdictionId in", values, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidNotIn(List<Integer> values) {
            addCriterion("jurisdictionId not in", values, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidBetween(Integer value1, Integer value2) {
            addCriterion("jurisdictionId between", value1, value2, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidNotBetween(Integer value1, Integer value2) {
            addCriterion("jurisdictionId not between", value1, value2, "jurisdictionid");
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