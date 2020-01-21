package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DataCommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataCommodityExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andCartypeIsNull() {
            addCriterion("carType is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNotNull() {
            addCriterion("carType is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeEqualTo(String value) {
            addCriterion("carType =", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotEqualTo(String value) {
            addCriterion("carType <>", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThan(String value) {
            addCriterion("carType >", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("carType >=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThan(String value) {
            addCriterion("carType <", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThanOrEqualTo(String value) {
            addCriterion("carType <=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLike(String value) {
            addCriterion("carType like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotLike(String value) {
            addCriterion("carType not like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeIn(List<String> values) {
            addCriterion("carType in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotIn(List<String> values) {
            addCriterion("carType not in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeBetween(String value1, String value2) {
            addCriterion("carType between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotBetween(String value1, String value2) {
            addCriterion("carType not between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andCommditytypeidIsNull() {
            addCriterion("commdityTypeId is null");
            return (Criteria) this;
        }

        public Criteria andCommditytypeidIsNotNull() {
            addCriterion("commdityTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andCommditytypeidEqualTo(Integer value) {
            addCriterion("commdityTypeId =", value, "commditytypeid");
            return (Criteria) this;
        }

        public Criteria andCommditytypeidNotEqualTo(Integer value) {
            addCriterion("commdityTypeId <>", value, "commditytypeid");
            return (Criteria) this;
        }

        public Criteria andCommditytypeidGreaterThan(Integer value) {
            addCriterion("commdityTypeId >", value, "commditytypeid");
            return (Criteria) this;
        }

        public Criteria andCommditytypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commdityTypeId >=", value, "commditytypeid");
            return (Criteria) this;
        }

        public Criteria andCommditytypeidLessThan(Integer value) {
            addCriterion("commdityTypeId <", value, "commditytypeid");
            return (Criteria) this;
        }

        public Criteria andCommditytypeidLessThanOrEqualTo(Integer value) {
            addCriterion("commdityTypeId <=", value, "commditytypeid");
            return (Criteria) this;
        }

        public Criteria andCommditytypeidIn(List<Integer> values) {
            addCriterion("commdityTypeId in", values, "commditytypeid");
            return (Criteria) this;
        }

        public Criteria andCommditytypeidNotIn(List<Integer> values) {
            addCriterion("commdityTypeId not in", values, "commditytypeid");
            return (Criteria) this;
        }

        public Criteria andCommditytypeidBetween(Integer value1, Integer value2) {
            addCriterion("commdityTypeId between", value1, value2, "commditytypeid");
            return (Criteria) this;
        }

        public Criteria andCommditytypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("commdityTypeId not between", value1, value2, "commditytypeid");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(String value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(String value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(String value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(String value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(String value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLike(String value) {
            addCriterion("income like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotLike(String value) {
            addCriterion("income not like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<String> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<String> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(String value1, String value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(String value1, String value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andOriginalIsNull() {
            addCriterion("original is null");
            return (Criteria) this;
        }

        public Criteria andOriginalIsNotNull() {
            addCriterion("original is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalEqualTo(String value) {
            addCriterion("original =", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotEqualTo(String value) {
            addCriterion("original <>", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalGreaterThan(String value) {
            addCriterion("original >", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("original >=", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalLessThan(String value) {
            addCriterion("original <", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalLessThanOrEqualTo(String value) {
            addCriterion("original <=", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalLike(String value) {
            addCriterion("original like", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotLike(String value) {
            addCriterion("original not like", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalIn(List<String> values) {
            addCriterion("original in", values, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotIn(List<String> values) {
            addCriterion("original not in", values, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalBetween(String value1, String value2) {
            addCriterion("original between", value1, value2, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotBetween(String value1, String value2) {
            addCriterion("original not between", value1, value2, "original");
            return (Criteria) this;
        }

        public Criteria andCommoditygradeIsNull() {
            addCriterion("commodityGrade is null");
            return (Criteria) this;
        }

        public Criteria andCommoditygradeIsNotNull() {
            addCriterion("commodityGrade is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditygradeEqualTo(String value) {
            addCriterion("commodityGrade =", value, "commoditygrade");
            return (Criteria) this;
        }

        public Criteria andCommoditygradeNotEqualTo(String value) {
            addCriterion("commodityGrade <>", value, "commoditygrade");
            return (Criteria) this;
        }

        public Criteria andCommoditygradeGreaterThan(String value) {
            addCriterion("commodityGrade >", value, "commoditygrade");
            return (Criteria) this;
        }

        public Criteria andCommoditygradeGreaterThanOrEqualTo(String value) {
            addCriterion("commodityGrade >=", value, "commoditygrade");
            return (Criteria) this;
        }

        public Criteria andCommoditygradeLessThan(String value) {
            addCriterion("commodityGrade <", value, "commoditygrade");
            return (Criteria) this;
        }

        public Criteria andCommoditygradeLessThanOrEqualTo(String value) {
            addCriterion("commodityGrade <=", value, "commoditygrade");
            return (Criteria) this;
        }

        public Criteria andCommoditygradeLike(String value) {
            addCriterion("commodityGrade like", value, "commoditygrade");
            return (Criteria) this;
        }

        public Criteria andCommoditygradeNotLike(String value) {
            addCriterion("commodityGrade not like", value, "commoditygrade");
            return (Criteria) this;
        }

        public Criteria andCommoditygradeIn(List<String> values) {
            addCriterion("commodityGrade in", values, "commoditygrade");
            return (Criteria) this;
        }

        public Criteria andCommoditygradeNotIn(List<String> values) {
            addCriterion("commodityGrade not in", values, "commoditygrade");
            return (Criteria) this;
        }

        public Criteria andCommoditygradeBetween(String value1, String value2) {
            addCriterion("commodityGrade between", value1, value2, "commoditygrade");
            return (Criteria) this;
        }

        public Criteria andCommoditygradeNotBetween(String value1, String value2) {
            addCriterion("commodityGrade not between", value1, value2, "commoditygrade");
            return (Criteria) this;
        }

        public Criteria andCommodityplaceIsNull() {
            addCriterion("commodityPlace is null");
            return (Criteria) this;
        }

        public Criteria andCommodityplaceIsNotNull() {
            addCriterion("commodityPlace is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityplaceEqualTo(String value) {
            addCriterion("commodityPlace =", value, "commodityplace");
            return (Criteria) this;
        }

        public Criteria andCommodityplaceNotEqualTo(String value) {
            addCriterion("commodityPlace <>", value, "commodityplace");
            return (Criteria) this;
        }

        public Criteria andCommodityplaceGreaterThan(String value) {
            addCriterion("commodityPlace >", value, "commodityplace");
            return (Criteria) this;
        }

        public Criteria andCommodityplaceGreaterThanOrEqualTo(String value) {
            addCriterion("commodityPlace >=", value, "commodityplace");
            return (Criteria) this;
        }

        public Criteria andCommodityplaceLessThan(String value) {
            addCriterion("commodityPlace <", value, "commodityplace");
            return (Criteria) this;
        }

        public Criteria andCommodityplaceLessThanOrEqualTo(String value) {
            addCriterion("commodityPlace <=", value, "commodityplace");
            return (Criteria) this;
        }

        public Criteria andCommodityplaceLike(String value) {
            addCriterion("commodityPlace like", value, "commodityplace");
            return (Criteria) this;
        }

        public Criteria andCommodityplaceNotLike(String value) {
            addCriterion("commodityPlace not like", value, "commodityplace");
            return (Criteria) this;
        }

        public Criteria andCommodityplaceIn(List<String> values) {
            addCriterion("commodityPlace in", values, "commodityplace");
            return (Criteria) this;
        }

        public Criteria andCommodityplaceNotIn(List<String> values) {
            addCriterion("commodityPlace not in", values, "commodityplace");
            return (Criteria) this;
        }

        public Criteria andCommodityplaceBetween(String value1, String value2) {
            addCriterion("commodityPlace between", value1, value2, "commodityplace");
            return (Criteria) this;
        }

        public Criteria andCommodityplaceNotBetween(String value1, String value2) {
            addCriterion("commodityPlace not between", value1, value2, "commodityplace");
            return (Criteria) this;
        }

        public Criteria andFirmnameidIsNull() {
            addCriterion("firmNameId is null");
            return (Criteria) this;
        }

        public Criteria andFirmnameidIsNotNull() {
            addCriterion("firmNameId is not null");
            return (Criteria) this;
        }

        public Criteria andFirmnameidEqualTo(Integer value) {
            addCriterion("firmNameId =", value, "firmnameid");
            return (Criteria) this;
        }

        public Criteria andFirmnameidNotEqualTo(Integer value) {
            addCriterion("firmNameId <>", value, "firmnameid");
            return (Criteria) this;
        }

        public Criteria andFirmnameidGreaterThan(Integer value) {
            addCriterion("firmNameId >", value, "firmnameid");
            return (Criteria) this;
        }

        public Criteria andFirmnameidGreaterThanOrEqualTo(Integer value) {
            addCriterion("firmNameId >=", value, "firmnameid");
            return (Criteria) this;
        }

        public Criteria andFirmnameidLessThan(Integer value) {
            addCriterion("firmNameId <", value, "firmnameid");
            return (Criteria) this;
        }

        public Criteria andFirmnameidLessThanOrEqualTo(Integer value) {
            addCriterion("firmNameId <=", value, "firmnameid");
            return (Criteria) this;
        }

        public Criteria andFirmnameidIn(List<Integer> values) {
            addCriterion("firmNameId in", values, "firmnameid");
            return (Criteria) this;
        }

        public Criteria andFirmnameidNotIn(List<Integer> values) {
            addCriterion("firmNameId not in", values, "firmnameid");
            return (Criteria) this;
        }

        public Criteria andFirmnameidBetween(Integer value1, Integer value2) {
            addCriterion("firmNameId between", value1, value2, "firmnameid");
            return (Criteria) this;
        }

        public Criteria andFirmnameidNotBetween(Integer value1, Integer value2) {
            addCriterion("firmNameId not between", value1, value2, "firmnameid");
            return (Criteria) this;
        }

        public Criteria andFirmnumberIsNull() {
            addCriterion("firmNumber is null");
            return (Criteria) this;
        }

        public Criteria andFirmnumberIsNotNull() {
            addCriterion("firmNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFirmnumberEqualTo(String value) {
            addCriterion("firmNumber =", value, "firmnumber");
            return (Criteria) this;
        }

        public Criteria andFirmnumberNotEqualTo(String value) {
            addCriterion("firmNumber <>", value, "firmnumber");
            return (Criteria) this;
        }

        public Criteria andFirmnumberGreaterThan(String value) {
            addCriterion("firmNumber >", value, "firmnumber");
            return (Criteria) this;
        }

        public Criteria andFirmnumberGreaterThanOrEqualTo(String value) {
            addCriterion("firmNumber >=", value, "firmnumber");
            return (Criteria) this;
        }

        public Criteria andFirmnumberLessThan(String value) {
            addCriterion("firmNumber <", value, "firmnumber");
            return (Criteria) this;
        }

        public Criteria andFirmnumberLessThanOrEqualTo(String value) {
            addCriterion("firmNumber <=", value, "firmnumber");
            return (Criteria) this;
        }

        public Criteria andFirmnumberLike(String value) {
            addCriterion("firmNumber like", value, "firmnumber");
            return (Criteria) this;
        }

        public Criteria andFirmnumberNotLike(String value) {
            addCriterion("firmNumber not like", value, "firmnumber");
            return (Criteria) this;
        }

        public Criteria andFirmnumberIn(List<String> values) {
            addCriterion("firmNumber in", values, "firmnumber");
            return (Criteria) this;
        }

        public Criteria andFirmnumberNotIn(List<String> values) {
            addCriterion("firmNumber not in", values, "firmnumber");
            return (Criteria) this;
        }

        public Criteria andFirmnumberBetween(String value1, String value2) {
            addCriterion("firmNumber between", value1, value2, "firmnumber");
            return (Criteria) this;
        }

        public Criteria andFirmnumberNotBetween(String value1, String value2) {
            addCriterion("firmNumber not between", value1, value2, "firmnumber");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("barCode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barCode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barCode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barCode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barCode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barCode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barCode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barCode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barCode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barCode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barCode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barCode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barCode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barCode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(String value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(String value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(String value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(String value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(String value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLike(String value) {
            addCriterion("volume like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotLike(String value) {
            addCriterion("volume not like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<String> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<String> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(String value1, String value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(String value1, String value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andSuttleIsNull() {
            addCriterion("suttle is null");
            return (Criteria) this;
        }

        public Criteria andSuttleIsNotNull() {
            addCriterion("suttle is not null");
            return (Criteria) this;
        }

        public Criteria andSuttleEqualTo(String value) {
            addCriterion("suttle =", value, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleNotEqualTo(String value) {
            addCriterion("suttle <>", value, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleGreaterThan(String value) {
            addCriterion("suttle >", value, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleGreaterThanOrEqualTo(String value) {
            addCriterion("suttle >=", value, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleLessThan(String value) {
            addCriterion("suttle <", value, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleLessThanOrEqualTo(String value) {
            addCriterion("suttle <=", value, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleLike(String value) {
            addCriterion("suttle like", value, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleNotLike(String value) {
            addCriterion("suttle not like", value, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleIn(List<String> values) {
            addCriterion("suttle in", values, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleNotIn(List<String> values) {
            addCriterion("suttle not in", values, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleBetween(String value1, String value2) {
            addCriterion("suttle between", value1, value2, "suttle");
            return (Criteria) this;
        }

        public Criteria andSuttleNotBetween(String value1, String value2) {
            addCriterion("suttle not between", value1, value2, "suttle");
            return (Criteria) this;
        }

        public Criteria andPrimecostIsNull() {
            addCriterion("primeCost is null");
            return (Criteria) this;
        }

        public Criteria andPrimecostIsNotNull() {
            addCriterion("primeCost is not null");
            return (Criteria) this;
        }

        public Criteria andPrimecostEqualTo(Float value) {
            addCriterion("primeCost =", value, "primecost");
            return (Criteria) this;
        }

        public Criteria andPrimecostNotEqualTo(Float value) {
            addCriterion("primeCost <>", value, "primecost");
            return (Criteria) this;
        }

        public Criteria andPrimecostGreaterThan(Float value) {
            addCriterion("primeCost >", value, "primecost");
            return (Criteria) this;
        }

        public Criteria andPrimecostGreaterThanOrEqualTo(Float value) {
            addCriterion("primeCost >=", value, "primecost");
            return (Criteria) this;
        }

        public Criteria andPrimecostLessThan(Float value) {
            addCriterion("primeCost <", value, "primecost");
            return (Criteria) this;
        }

        public Criteria andPrimecostLessThanOrEqualTo(Float value) {
            addCriterion("primeCost <=", value, "primecost");
            return (Criteria) this;
        }

        public Criteria andPrimecostIn(List<Float> values) {
            addCriterion("primeCost in", values, "primecost");
            return (Criteria) this;
        }

        public Criteria andPrimecostNotIn(List<Float> values) {
            addCriterion("primeCost not in", values, "primecost");
            return (Criteria) this;
        }

        public Criteria andPrimecostBetween(Float value1, Float value2) {
            addCriterion("primeCost between", value1, value2, "primecost");
            return (Criteria) this;
        }

        public Criteria andPrimecostNotBetween(Float value1, Float value2) {
            addCriterion("primeCost not between", value1, value2, "primecost");
            return (Criteria) this;
        }

        public Criteria andSellwayIsNull() {
            addCriterion("sellWay is null");
            return (Criteria) this;
        }

        public Criteria andSellwayIsNotNull() {
            addCriterion("sellWay is not null");
            return (Criteria) this;
        }

        public Criteria andSellwayEqualTo(String value) {
            addCriterion("sellWay =", value, "sellway");
            return (Criteria) this;
        }

        public Criteria andSellwayNotEqualTo(String value) {
            addCriterion("sellWay <>", value, "sellway");
            return (Criteria) this;
        }

        public Criteria andSellwayGreaterThan(String value) {
            addCriterion("sellWay >", value, "sellway");
            return (Criteria) this;
        }

        public Criteria andSellwayGreaterThanOrEqualTo(String value) {
            addCriterion("sellWay >=", value, "sellway");
            return (Criteria) this;
        }

        public Criteria andSellwayLessThan(String value) {
            addCriterion("sellWay <", value, "sellway");
            return (Criteria) this;
        }

        public Criteria andSellwayLessThanOrEqualTo(String value) {
            addCriterion("sellWay <=", value, "sellway");
            return (Criteria) this;
        }

        public Criteria andSellwayLike(String value) {
            addCriterion("sellWay like", value, "sellway");
            return (Criteria) this;
        }

        public Criteria andSellwayNotLike(String value) {
            addCriterion("sellWay not like", value, "sellway");
            return (Criteria) this;
        }

        public Criteria andSellwayIn(List<String> values) {
            addCriterion("sellWay in", values, "sellway");
            return (Criteria) this;
        }

        public Criteria andSellwayNotIn(List<String> values) {
            addCriterion("sellWay not in", values, "sellway");
            return (Criteria) this;
        }

        public Criteria andSellwayBetween(String value1, String value2) {
            addCriterion("sellWay between", value1, value2, "sellway");
            return (Criteria) this;
        }

        public Criteria andSellwayNotBetween(String value1, String value2) {
            addCriterion("sellWay not between", value1, value2, "sellway");
            return (Criteria) this;
        }

        public Criteria andMarkuppercentageIsNull() {
            addCriterion("markupPercentage is null");
            return (Criteria) this;
        }

        public Criteria andMarkuppercentageIsNotNull() {
            addCriterion("markupPercentage is not null");
            return (Criteria) this;
        }

        public Criteria andMarkuppercentageEqualTo(Float value) {
            addCriterion("markupPercentage =", value, "markuppercentage");
            return (Criteria) this;
        }

        public Criteria andMarkuppercentageNotEqualTo(Float value) {
            addCriterion("markupPercentage <>", value, "markuppercentage");
            return (Criteria) this;
        }

        public Criteria andMarkuppercentageGreaterThan(Float value) {
            addCriterion("markupPercentage >", value, "markuppercentage");
            return (Criteria) this;
        }

        public Criteria andMarkuppercentageGreaterThanOrEqualTo(Float value) {
            addCriterion("markupPercentage >=", value, "markuppercentage");
            return (Criteria) this;
        }

        public Criteria andMarkuppercentageLessThan(Float value) {
            addCriterion("markupPercentage <", value, "markuppercentage");
            return (Criteria) this;
        }

        public Criteria andMarkuppercentageLessThanOrEqualTo(Float value) {
            addCriterion("markupPercentage <=", value, "markuppercentage");
            return (Criteria) this;
        }

        public Criteria andMarkuppercentageIn(List<Float> values) {
            addCriterion("markupPercentage in", values, "markuppercentage");
            return (Criteria) this;
        }

        public Criteria andMarkuppercentageNotIn(List<Float> values) {
            addCriterion("markupPercentage not in", values, "markuppercentage");
            return (Criteria) this;
        }

        public Criteria andMarkuppercentageBetween(Float value1, Float value2) {
            addCriterion("markupPercentage between", value1, value2, "markuppercentage");
            return (Criteria) this;
        }

        public Criteria andMarkuppercentageNotBetween(Float value1, Float value2) {
            addCriterion("markupPercentage not between", value1, value2, "markuppercentage");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("Code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("Code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("Code not between", value1, value2, "code");
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