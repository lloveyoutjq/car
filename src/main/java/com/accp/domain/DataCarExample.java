package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DataCarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataCarExample() {
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

        public Criteria andCartypenameIsNull() {
            addCriterion("carTypeName is null");
            return (Criteria) this;
        }

        public Criteria andCartypenameIsNotNull() {
            addCriterion("carTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andCartypenameEqualTo(String value) {
            addCriterion("carTypeName =", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameNotEqualTo(String value) {
            addCriterion("carTypeName <>", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameGreaterThan(String value) {
            addCriterion("carTypeName >", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameGreaterThanOrEqualTo(String value) {
            addCriterion("carTypeName >=", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameLessThan(String value) {
            addCriterion("carTypeName <", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameLessThanOrEqualTo(String value) {
            addCriterion("carTypeName <=", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameLike(String value) {
            addCriterion("carTypeName like", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameNotLike(String value) {
            addCriterion("carTypeName not like", value, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameIn(List<String> values) {
            addCriterion("carTypeName in", values, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameNotIn(List<String> values) {
            addCriterion("carTypeName not in", values, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameBetween(String value1, String value2) {
            addCriterion("carTypeName between", value1, value2, "cartypename");
            return (Criteria) this;
        }

        public Criteria andCartypenameNotBetween(String value1, String value2) {
            addCriterion("carTypeName not between", value1, value2, "cartypename");
            return (Criteria) this;
        }

        public Criteria andEngineidIsNull() {
            addCriterion("engineId is null");
            return (Criteria) this;
        }

        public Criteria andEngineidIsNotNull() {
            addCriterion("engineId is not null");
            return (Criteria) this;
        }

        public Criteria andEngineidEqualTo(Integer value) {
            addCriterion("engineId =", value, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidNotEqualTo(Integer value) {
            addCriterion("engineId <>", value, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidGreaterThan(Integer value) {
            addCriterion("engineId >", value, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("engineId >=", value, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidLessThan(Integer value) {
            addCriterion("engineId <", value, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidLessThanOrEqualTo(Integer value) {
            addCriterion("engineId <=", value, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidIn(List<Integer> values) {
            addCriterion("engineId in", values, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidNotIn(List<Integer> values) {
            addCriterion("engineId not in", values, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidBetween(Integer value1, Integer value2) {
            addCriterion("engineId between", value1, value2, "engineid");
            return (Criteria) this;
        }

        public Criteria andEngineidNotBetween(Integer value1, Integer value2) {
            addCriterion("engineId not between", value1, value2, "engineid");
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

        public Criteria andCaryearpriceIsNull() {
            addCriterion("carYearPrice is null");
            return (Criteria) this;
        }

        public Criteria andCaryearpriceIsNotNull() {
            addCriterion("carYearPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCaryearpriceEqualTo(Float value) {
            addCriterion("carYearPrice =", value, "caryearprice");
            return (Criteria) this;
        }

        public Criteria andCaryearpriceNotEqualTo(Float value) {
            addCriterion("carYearPrice <>", value, "caryearprice");
            return (Criteria) this;
        }

        public Criteria andCaryearpriceGreaterThan(Float value) {
            addCriterion("carYearPrice >", value, "caryearprice");
            return (Criteria) this;
        }

        public Criteria andCaryearpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("carYearPrice >=", value, "caryearprice");
            return (Criteria) this;
        }

        public Criteria andCaryearpriceLessThan(Float value) {
            addCriterion("carYearPrice <", value, "caryearprice");
            return (Criteria) this;
        }

        public Criteria andCaryearpriceLessThanOrEqualTo(Float value) {
            addCriterion("carYearPrice <=", value, "caryearprice");
            return (Criteria) this;
        }

        public Criteria andCaryearpriceIn(List<Float> values) {
            addCriterion("carYearPrice in", values, "caryearprice");
            return (Criteria) this;
        }

        public Criteria andCaryearpriceNotIn(List<Float> values) {
            addCriterion("carYearPrice not in", values, "caryearprice");
            return (Criteria) this;
        }

        public Criteria andCaryearpriceBetween(Float value1, Float value2) {
            addCriterion("carYearPrice between", value1, value2, "caryearprice");
            return (Criteria) this;
        }

        public Criteria andCaryearpriceNotBetween(Float value1, Float value2) {
            addCriterion("carYearPrice not between", value1, value2, "caryearprice");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(String value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(String value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(String value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(String value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(String value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(String value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLike(String value) {
            addCriterion("power like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotLike(String value) {
            addCriterion("power not like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<String> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<String> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(String value1, String value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(String value1, String value2) {
            addCriterion("power not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andImportordomesticIsNull() {
            addCriterion("importOrdomestic is null");
            return (Criteria) this;
        }

        public Criteria andImportordomesticIsNotNull() {
            addCriterion("importOrdomestic is not null");
            return (Criteria) this;
        }

        public Criteria andImportordomesticEqualTo(String value) {
            addCriterion("importOrdomestic =", value, "importordomestic");
            return (Criteria) this;
        }

        public Criteria andImportordomesticNotEqualTo(String value) {
            addCriterion("importOrdomestic <>", value, "importordomestic");
            return (Criteria) this;
        }

        public Criteria andImportordomesticGreaterThan(String value) {
            addCriterion("importOrdomestic >", value, "importordomestic");
            return (Criteria) this;
        }

        public Criteria andImportordomesticGreaterThanOrEqualTo(String value) {
            addCriterion("importOrdomestic >=", value, "importordomestic");
            return (Criteria) this;
        }

        public Criteria andImportordomesticLessThan(String value) {
            addCriterion("importOrdomestic <", value, "importordomestic");
            return (Criteria) this;
        }

        public Criteria andImportordomesticLessThanOrEqualTo(String value) {
            addCriterion("importOrdomestic <=", value, "importordomestic");
            return (Criteria) this;
        }

        public Criteria andImportordomesticLike(String value) {
            addCriterion("importOrdomestic like", value, "importordomestic");
            return (Criteria) this;
        }

        public Criteria andImportordomesticNotLike(String value) {
            addCriterion("importOrdomestic not like", value, "importordomestic");
            return (Criteria) this;
        }

        public Criteria andImportordomesticIn(List<String> values) {
            addCriterion("importOrdomestic in", values, "importordomestic");
            return (Criteria) this;
        }

        public Criteria andImportordomesticNotIn(List<String> values) {
            addCriterion("importOrdomestic not in", values, "importordomestic");
            return (Criteria) this;
        }

        public Criteria andImportordomesticBetween(String value1, String value2) {
            addCriterion("importOrdomestic between", value1, value2, "importordomestic");
            return (Criteria) this;
        }

        public Criteria andImportordomesticNotBetween(String value1, String value2) {
            addCriterion("importOrdomestic not between", value1, value2, "importordomestic");
            return (Criteria) this;
        }

        public Criteria andFuellabelIsNull() {
            addCriterion("fuelLabel is null");
            return (Criteria) this;
        }

        public Criteria andFuellabelIsNotNull() {
            addCriterion("fuelLabel is not null");
            return (Criteria) this;
        }

        public Criteria andFuellabelEqualTo(String value) {
            addCriterion("fuelLabel =", value, "fuellabel");
            return (Criteria) this;
        }

        public Criteria andFuellabelNotEqualTo(String value) {
            addCriterion("fuelLabel <>", value, "fuellabel");
            return (Criteria) this;
        }

        public Criteria andFuellabelGreaterThan(String value) {
            addCriterion("fuelLabel >", value, "fuellabel");
            return (Criteria) this;
        }

        public Criteria andFuellabelGreaterThanOrEqualTo(String value) {
            addCriterion("fuelLabel >=", value, "fuellabel");
            return (Criteria) this;
        }

        public Criteria andFuellabelLessThan(String value) {
            addCriterion("fuelLabel <", value, "fuellabel");
            return (Criteria) this;
        }

        public Criteria andFuellabelLessThanOrEqualTo(String value) {
            addCriterion("fuelLabel <=", value, "fuellabel");
            return (Criteria) this;
        }

        public Criteria andFuellabelLike(String value) {
            addCriterion("fuelLabel like", value, "fuellabel");
            return (Criteria) this;
        }

        public Criteria andFuellabelNotLike(String value) {
            addCriterion("fuelLabel not like", value, "fuellabel");
            return (Criteria) this;
        }

        public Criteria andFuellabelIn(List<String> values) {
            addCriterion("fuelLabel in", values, "fuellabel");
            return (Criteria) this;
        }

        public Criteria andFuellabelNotIn(List<String> values) {
            addCriterion("fuelLabel not in", values, "fuellabel");
            return (Criteria) this;
        }

        public Criteria andFuellabelBetween(String value1, String value2) {
            addCriterion("fuelLabel between", value1, value2, "fuellabel");
            return (Criteria) this;
        }

        public Criteria andFuellabelNotBetween(String value1, String value2) {
            addCriterion("fuelLabel not between", value1, value2, "fuellabel");
            return (Criteria) this;
        }

        public Criteria andCarryingIsNull() {
            addCriterion("carrying is null");
            return (Criteria) this;
        }

        public Criteria andCarryingIsNotNull() {
            addCriterion("carrying is not null");
            return (Criteria) this;
        }

        public Criteria andCarryingEqualTo(String value) {
            addCriterion("carrying =", value, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingNotEqualTo(String value) {
            addCriterion("carrying <>", value, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingGreaterThan(String value) {
            addCriterion("carrying >", value, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingGreaterThanOrEqualTo(String value) {
            addCriterion("carrying >=", value, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingLessThan(String value) {
            addCriterion("carrying <", value, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingLessThanOrEqualTo(String value) {
            addCriterion("carrying <=", value, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingLike(String value) {
            addCriterion("carrying like", value, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingNotLike(String value) {
            addCriterion("carrying not like", value, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingIn(List<String> values) {
            addCriterion("carrying in", values, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingNotIn(List<String> values) {
            addCriterion("carrying not in", values, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingBetween(String value1, String value2) {
            addCriterion("carrying between", value1, value2, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingNotBetween(String value1, String value2) {
            addCriterion("carrying not between", value1, value2, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarbrandidIsNull() {
            addCriterion("carBrandId is null");
            return (Criteria) this;
        }

        public Criteria andCarbrandidIsNotNull() {
            addCriterion("carBrandId is not null");
            return (Criteria) this;
        }

        public Criteria andCarbrandidEqualTo(Integer value) {
            addCriterion("carBrandId =", value, "carbrandid");
            return (Criteria) this;
        }

        public Criteria andCarbrandidNotEqualTo(Integer value) {
            addCriterion("carBrandId <>", value, "carbrandid");
            return (Criteria) this;
        }

        public Criteria andCarbrandidGreaterThan(Integer value) {
            addCriterion("carBrandId >", value, "carbrandid");
            return (Criteria) this;
        }

        public Criteria andCarbrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("carBrandId >=", value, "carbrandid");
            return (Criteria) this;
        }

        public Criteria andCarbrandidLessThan(Integer value) {
            addCriterion("carBrandId <", value, "carbrandid");
            return (Criteria) this;
        }

        public Criteria andCarbrandidLessThanOrEqualTo(Integer value) {
            addCriterion("carBrandId <=", value, "carbrandid");
            return (Criteria) this;
        }

        public Criteria andCarbrandidIn(List<Integer> values) {
            addCriterion("carBrandId in", values, "carbrandid");
            return (Criteria) this;
        }

        public Criteria andCarbrandidNotIn(List<Integer> values) {
            addCriterion("carBrandId not in", values, "carbrandid");
            return (Criteria) this;
        }

        public Criteria andCarbrandidBetween(Integer value1, Integer value2) {
            addCriterion("carBrandId between", value1, value2, "carbrandid");
            return (Criteria) this;
        }

        public Criteria andCarbrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("carBrandId not between", value1, value2, "carbrandid");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
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