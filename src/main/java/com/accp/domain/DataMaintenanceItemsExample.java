package com.accp.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DataMaintenanceItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataMaintenanceItemsExample() {
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

        public Criteria andItemsnameIsNull() {
            addCriterion("itemsName is null");
            return (Criteria) this;
        }

        public Criteria andItemsnameIsNotNull() {
            addCriterion("itemsName is not null");
            return (Criteria) this;
        }

        public Criteria andItemsnameEqualTo(String value) {
            addCriterion("itemsName =", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameNotEqualTo(String value) {
            addCriterion("itemsName <>", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameGreaterThan(String value) {
            addCriterion("itemsName >", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameGreaterThanOrEqualTo(String value) {
            addCriterion("itemsName >=", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameLessThan(String value) {
            addCriterion("itemsName <", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameLessThanOrEqualTo(String value) {
            addCriterion("itemsName <=", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameLike(String value) {
            addCriterion("itemsName like", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameNotLike(String value) {
            addCriterion("itemsName not like", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameIn(List<String> values) {
            addCriterion("itemsName in", values, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameNotIn(List<String> values) {
            addCriterion("itemsName not in", values, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameBetween(String value1, String value2) {
            addCriterion("itemsName between", value1, value2, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameNotBetween(String value1, String value2) {
            addCriterion("itemsName not between", value1, value2, "itemsname");
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

        public Criteria andNormalpriceIsNull() {
            addCriterion("normalPrice is null");
            return (Criteria) this;
        }

        public Criteria andNormalpriceIsNotNull() {
            addCriterion("normalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andNormalpriceEqualTo(Float value) {
            addCriterion("normalPrice =", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceNotEqualTo(Float value) {
            addCriterion("normalPrice <>", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceGreaterThan(Float value) {
            addCriterion("normalPrice >", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("normalPrice >=", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceLessThan(Float value) {
            addCriterion("normalPrice <", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceLessThanOrEqualTo(Float value) {
            addCriterion("normalPrice <=", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceIn(List<Float> values) {
            addCriterion("normalPrice in", values, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceNotIn(List<Float> values) {
            addCriterion("normalPrice not in", values, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceBetween(Float value1, Float value2) {
            addCriterion("normalPrice between", value1, value2, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceNotBetween(Float value1, Float value2) {
            addCriterion("normalPrice not between", value1, value2, "normalprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceIsNull() {
            addCriterion("memberPrice is null");
            return (Criteria) this;
        }

        public Criteria andMemberpriceIsNotNull() {
            addCriterion("memberPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMemberpriceEqualTo(Float value) {
            addCriterion("memberPrice =", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceNotEqualTo(Float value) {
            addCriterion("memberPrice <>", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceGreaterThan(Float value) {
            addCriterion("memberPrice >", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("memberPrice >=", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceLessThan(Float value) {
            addCriterion("memberPrice <", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceLessThanOrEqualTo(Float value) {
            addCriterion("memberPrice <=", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceIn(List<Float> values) {
            addCriterion("memberPrice in", values, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceNotIn(List<Float> values) {
            addCriterion("memberPrice not in", values, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceBetween(Float value1, Float value2) {
            addCriterion("memberPrice between", value1, value2, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceNotBetween(Float value1, Float value2) {
            addCriterion("memberPrice not between", value1, value2, "memberprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNull() {
            addCriterion("vipPrice is null");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNotNull() {
            addCriterion("vipPrice is not null");
            return (Criteria) this;
        }

        public Criteria andVippriceEqualTo(Float value) {
            addCriterion("vipPrice =", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotEqualTo(Float value) {
            addCriterion("vipPrice <>", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThan(Float value) {
            addCriterion("vipPrice >", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThanOrEqualTo(Float value) {
            addCriterion("vipPrice >=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThan(Float value) {
            addCriterion("vipPrice <", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThanOrEqualTo(Float value) {
            addCriterion("vipPrice <=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIn(List<Float> values) {
            addCriterion("vipPrice in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotIn(List<Float> values) {
            addCriterion("vipPrice not in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceBetween(Float value1, Float value2) {
            addCriterion("vipPrice between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotBetween(Float value1, Float value2) {
            addCriterion("vipPrice not between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceIsNull() {
            addCriterion("negotiatedPrice is null");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceIsNotNull() {
            addCriterion("negotiatedPrice is not null");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceEqualTo(Float value) {
            addCriterion("negotiatedPrice =", value, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceNotEqualTo(Float value) {
            addCriterion("negotiatedPrice <>", value, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceGreaterThan(Float value) {
            addCriterion("negotiatedPrice >", value, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("negotiatedPrice >=", value, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceLessThan(Float value) {
            addCriterion("negotiatedPrice <", value, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceLessThanOrEqualTo(Float value) {
            addCriterion("negotiatedPrice <=", value, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceIn(List<Float> values) {
            addCriterion("negotiatedPrice in", values, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceNotIn(List<Float> values) {
            addCriterion("negotiatedPrice not in", values, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceBetween(Float value1, Float value2) {
            addCriterion("negotiatedPrice between", value1, value2, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceNotBetween(Float value1, Float value2) {
            addCriterion("negotiatedPrice not between", value1, value2, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceIsNull() {
            addCriterion("claimPrice is null");
            return (Criteria) this;
        }

        public Criteria andClaimpriceIsNotNull() {
            addCriterion("claimPrice is not null");
            return (Criteria) this;
        }

        public Criteria andClaimpriceEqualTo(Float value) {
            addCriterion("claimPrice =", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceNotEqualTo(Float value) {
            addCriterion("claimPrice <>", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceGreaterThan(Float value) {
            addCriterion("claimPrice >", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("claimPrice >=", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceLessThan(Float value) {
            addCriterion("claimPrice <", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceLessThanOrEqualTo(Float value) {
            addCriterion("claimPrice <=", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceIn(List<Float> values) {
            addCriterion("claimPrice in", values, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceNotIn(List<Float> values) {
            addCriterion("claimPrice not in", values, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceBetween(Float value1, Float value2) {
            addCriterion("claimPrice between", value1, value2, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceNotBetween(Float value1, Float value2) {
            addCriterion("claimPrice not between", value1, value2, "claimprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIsNull() {
            addCriterion("insurancePrice is null");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIsNotNull() {
            addCriterion("insurancePrice is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceEqualTo(Float value) {
            addCriterion("insurancePrice =", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotEqualTo(Float value) {
            addCriterion("insurancePrice <>", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceGreaterThan(Float value) {
            addCriterion("insurancePrice >", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceGreaterThanOrEqualTo(Float value) {
            addCriterion("insurancePrice >=", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceLessThan(Float value) {
            addCriterion("insurancePrice <", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceLessThanOrEqualTo(Float value) {
            addCriterion("insurancePrice <=", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIn(List<Float> values) {
            addCriterion("insurancePrice in", values, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotIn(List<Float> values) {
            addCriterion("insurancePrice not in", values, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceBetween(Float value1, Float value2) {
            addCriterion("insurancePrice between", value1, value2, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotBetween(Float value1, Float value2) {
            addCriterion("insurancePrice not between", value1, value2, "insuranceprice");
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