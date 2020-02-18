package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonnelStaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonnelStaffExample() {
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

        public Criteria andStaffnameIsNull() {
            addCriterion("staffName is null");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNotNull() {
            addCriterion("staffName is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnameEqualTo(String value) {
            addCriterion("staffName =", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotEqualTo(String value) {
            addCriterion("staffName <>", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThan(String value) {
            addCriterion("staffName >", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThanOrEqualTo(String value) {
            addCriterion("staffName >=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThan(String value) {
            addCriterion("staffName <", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThanOrEqualTo(String value) {
            addCriterion("staffName <=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLike(String value) {
            addCriterion("staffName like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotLike(String value) {
            addCriterion("staffName not like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameIn(List<String> values) {
            addCriterion("staffName in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotIn(List<String> values) {
            addCriterion("staffName not in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameBetween(String value1, String value2) {
            addCriterion("staffName between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotBetween(String value1, String value2) {
            addCriterion("staffName not between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andStaffaccountIsNull() {
            addCriterion("staffAccount is null");
            return (Criteria) this;
        }

        public Criteria andStaffaccountIsNotNull() {
            addCriterion("staffAccount is not null");
            return (Criteria) this;
        }

        public Criteria andStaffaccountEqualTo(String value) {
            addCriterion("staffAccount =", value, "staffaccount");
            return (Criteria) this;
        }

        public Criteria andStaffaccountNotEqualTo(String value) {
            addCriterion("staffAccount <>", value, "staffaccount");
            return (Criteria) this;
        }

        public Criteria andStaffaccountGreaterThan(String value) {
            addCriterion("staffAccount >", value, "staffaccount");
            return (Criteria) this;
        }

        public Criteria andStaffaccountGreaterThanOrEqualTo(String value) {
            addCriterion("staffAccount >=", value, "staffaccount");
            return (Criteria) this;
        }

        public Criteria andStaffaccountLessThan(String value) {
            addCriterion("staffAccount <", value, "staffaccount");
            return (Criteria) this;
        }

        public Criteria andStaffaccountLessThanOrEqualTo(String value) {
            addCriterion("staffAccount <=", value, "staffaccount");
            return (Criteria) this;
        }

        public Criteria andStaffaccountLike(String value) {
            addCriterion("staffAccount like", value, "staffaccount");
            return (Criteria) this;
        }

        public Criteria andStaffaccountNotLike(String value) {
            addCriterion("staffAccount not like", value, "staffaccount");
            return (Criteria) this;
        }

        public Criteria andStaffaccountIn(List<String> values) {
            addCriterion("staffAccount in", values, "staffaccount");
            return (Criteria) this;
        }

        public Criteria andStaffaccountNotIn(List<String> values) {
            addCriterion("staffAccount not in", values, "staffaccount");
            return (Criteria) this;
        }

        public Criteria andStaffaccountBetween(String value1, String value2) {
            addCriterion("staffAccount between", value1, value2, "staffaccount");
            return (Criteria) this;
        }

        public Criteria andStaffaccountNotBetween(String value1, String value2) {
            addCriterion("staffAccount not between", value1, value2, "staffaccount");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentId is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(String value) {
            addCriterion("departmentId =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(String value) {
            addCriterion("departmentId <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(String value) {
            addCriterion("departmentId >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("departmentId >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(String value) {
            addCriterion("departmentId <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(String value) {
            addCriterion("departmentId <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLike(String value) {
            addCriterion("departmentId like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotLike(String value) {
            addCriterion("departmentId not like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<String> values) {
            addCriterion("departmentId in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<String> values) {
            addCriterion("departmentId not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(String value1, String value2) {
            addCriterion("departmentId between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(String value1, String value2) {
            addCriterion("departmentId not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andPhysicalconditionIsNull() {
            addCriterion("physicalCondition is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalconditionIsNotNull() {
            addCriterion("physicalCondition is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalconditionEqualTo(String value) {
            addCriterion("physicalCondition =", value, "physicalcondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalconditionNotEqualTo(String value) {
            addCriterion("physicalCondition <>", value, "physicalcondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalconditionGreaterThan(String value) {
            addCriterion("physicalCondition >", value, "physicalcondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalconditionGreaterThanOrEqualTo(String value) {
            addCriterion("physicalCondition >=", value, "physicalcondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalconditionLessThan(String value) {
            addCriterion("physicalCondition <", value, "physicalcondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalconditionLessThanOrEqualTo(String value) {
            addCriterion("physicalCondition <=", value, "physicalcondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalconditionLike(String value) {
            addCriterion("physicalCondition like", value, "physicalcondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalconditionNotLike(String value) {
            addCriterion("physicalCondition not like", value, "physicalcondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalconditionIn(List<String> values) {
            addCriterion("physicalCondition in", values, "physicalcondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalconditionNotIn(List<String> values) {
            addCriterion("physicalCondition not in", values, "physicalcondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalconditionBetween(String value1, String value2) {
            addCriterion("physicalCondition between", value1, value2, "physicalcondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalconditionNotBetween(String value1, String value2) {
            addCriterion("physicalCondition not between", value1, value2, "physicalcondition");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("height like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("height not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNull() {
            addCriterion("nativePlace is null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNotNull() {
            addCriterion("nativePlace is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceEqualTo(String value) {
            addCriterion("nativePlace =", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotEqualTo(String value) {
            addCriterion("nativePlace <>", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThan(String value) {
            addCriterion("nativePlace >", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("nativePlace >=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThan(String value) {
            addCriterion("nativePlace <", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("nativePlace <=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLike(String value) {
            addCriterion("nativePlace like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotLike(String value) {
            addCriterion("nativePlace not like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIn(List<String> values) {
            addCriterion("nativePlace in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotIn(List<String> values) {
            addCriterion("nativePlace not in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceBetween(String value1, String value2) {
            addCriterion("nativePlace between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotBetween(String value1, String value2) {
            addCriterion("nativePlace not between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNull() {
            addCriterion("maritalStatus is null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNotNull() {
            addCriterion("maritalStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusEqualTo(String value) {
            addCriterion("maritalStatus =", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotEqualTo(String value) {
            addCriterion("maritalStatus <>", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThan(String value) {
            addCriterion("maritalStatus >", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("maritalStatus >=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThan(String value) {
            addCriterion("maritalStatus <", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThanOrEqualTo(String value) {
            addCriterion("maritalStatus <=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLike(String value) {
            addCriterion("maritalStatus like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotLike(String value) {
            addCriterion("maritalStatus not like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIn(List<String> values) {
            addCriterion("maritalStatus in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotIn(List<String> values) {
            addCriterion("maritalStatus not in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusBetween(String value1, String value2) {
            addCriterion("maritalStatus between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotBetween(String value1, String value2) {
            addCriterion("maritalStatus not between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIsNull() {
            addCriterion("educationBackground is null");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIsNotNull() {
            addCriterion("educationBackground is not null");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundEqualTo(String value) {
            addCriterion("educationBackground =", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundNotEqualTo(String value) {
            addCriterion("educationBackground <>", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundGreaterThan(String value) {
            addCriterion("educationBackground >", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("educationBackground >=", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundLessThan(String value) {
            addCriterion("educationBackground <", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundLessThanOrEqualTo(String value) {
            addCriterion("educationBackground <=", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundLike(String value) {
            addCriterion("educationBackground like", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundNotLike(String value) {
            addCriterion("educationBackground not like", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIn(List<String> values) {
            addCriterion("educationBackground in", values, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundNotIn(List<String> values) {
            addCriterion("educationBackground not in", values, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundBetween(String value1, String value2) {
            addCriterion("educationBackground between", value1, value2, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundNotBetween(String value1, String value2) {
            addCriterion("educationBackground not between", value1, value2, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andProfessionalqualificationIsNull() {
            addCriterion("professionalQualification is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalqualificationIsNotNull() {
            addCriterion("professionalQualification is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalqualificationEqualTo(String value) {
            addCriterion("professionalQualification =", value, "professionalqualification");
            return (Criteria) this;
        }

        public Criteria andProfessionalqualificationNotEqualTo(String value) {
            addCriterion("professionalQualification <>", value, "professionalqualification");
            return (Criteria) this;
        }

        public Criteria andProfessionalqualificationGreaterThan(String value) {
            addCriterion("professionalQualification >", value, "professionalqualification");
            return (Criteria) this;
        }

        public Criteria andProfessionalqualificationGreaterThanOrEqualTo(String value) {
            addCriterion("professionalQualification >=", value, "professionalqualification");
            return (Criteria) this;
        }

        public Criteria andProfessionalqualificationLessThan(String value) {
            addCriterion("professionalQualification <", value, "professionalqualification");
            return (Criteria) this;
        }

        public Criteria andProfessionalqualificationLessThanOrEqualTo(String value) {
            addCriterion("professionalQualification <=", value, "professionalqualification");
            return (Criteria) this;
        }

        public Criteria andProfessionalqualificationLike(String value) {
            addCriterion("professionalQualification like", value, "professionalqualification");
            return (Criteria) this;
        }

        public Criteria andProfessionalqualificationNotLike(String value) {
            addCriterion("professionalQualification not like", value, "professionalqualification");
            return (Criteria) this;
        }

        public Criteria andProfessionalqualificationIn(List<String> values) {
            addCriterion("professionalQualification in", values, "professionalqualification");
            return (Criteria) this;
        }

        public Criteria andProfessionalqualificationNotIn(List<String> values) {
            addCriterion("professionalQualification not in", values, "professionalqualification");
            return (Criteria) this;
        }

        public Criteria andProfessionalqualificationBetween(String value1, String value2) {
            addCriterion("professionalQualification between", value1, value2, "professionalqualification");
            return (Criteria) this;
        }

        public Criteria andProfessionalqualificationNotBetween(String value1, String value2) {
            addCriterion("professionalQualification not between", value1, value2, "professionalqualification");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNull() {
            addCriterion("property is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNotNull() {
            addCriterion("property is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEqualTo(String value) {
            addCriterion("property =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(String value) {
            addCriterion("property <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(String value) {
            addCriterion("property >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("property >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(String value) {
            addCriterion("property <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(String value) {
            addCriterion("property <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLike(String value) {
            addCriterion("property like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotLike(String value) {
            addCriterion("property not like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<String> values) {
            addCriterion("property in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<String> values) {
            addCriterion("property not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(String value1, String value2) {
            addCriterion("property between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(String value1, String value2) {
            addCriterion("property not between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstrengthIsNull() {
            addCriterion("authorizedStrength is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstrengthIsNotNull() {
            addCriterion("authorizedStrength is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstrengthEqualTo(String value) {
            addCriterion("authorizedStrength =", value, "authorizedstrength");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstrengthNotEqualTo(String value) {
            addCriterion("authorizedStrength <>", value, "authorizedstrength");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstrengthGreaterThan(String value) {
            addCriterion("authorizedStrength >", value, "authorizedstrength");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstrengthGreaterThanOrEqualTo(String value) {
            addCriterion("authorizedStrength >=", value, "authorizedstrength");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstrengthLessThan(String value) {
            addCriterion("authorizedStrength <", value, "authorizedstrength");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstrengthLessThanOrEqualTo(String value) {
            addCriterion("authorizedStrength <=", value, "authorizedstrength");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstrengthLike(String value) {
            addCriterion("authorizedStrength like", value, "authorizedstrength");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstrengthNotLike(String value) {
            addCriterion("authorizedStrength not like", value, "authorizedstrength");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstrengthIn(List<String> values) {
            addCriterion("authorizedStrength in", values, "authorizedstrength");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstrengthNotIn(List<String> values) {
            addCriterion("authorizedStrength not in", values, "authorizedstrength");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstrengthBetween(String value1, String value2) {
            addCriterion("authorizedStrength between", value1, value2, "authorizedstrength");
            return (Criteria) this;
        }

        public Criteria andAuthorizedstrengthNotBetween(String value1, String value2) {
            addCriterion("authorizedStrength not between", value1, value2, "authorizedstrength");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNull() {
            addCriterion("idCardNo is null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNotNull() {
            addCriterion("idCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoEqualTo(String value) {
            addCriterion("idCardNo =", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotEqualTo(String value) {
            addCriterion("idCardNo <>", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThan(String value) {
            addCriterion("idCardNo >", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("idCardNo >=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThan(String value) {
            addCriterion("idCardNo <", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThanOrEqualTo(String value) {
            addCriterion("idCardNo <=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLike(String value) {
            addCriterion("idCardNo like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotLike(String value) {
            addCriterion("idCardNo not like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIn(List<String> values) {
            addCriterion("idCardNo in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotIn(List<String> values) {
            addCriterion("idCardNo not in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoBetween(String value1, String value2) {
            addCriterion("idCardNo between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotBetween(String value1, String value2) {
            addCriterion("idCardNo not between", value1, value2, "idcardno");
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

        public Criteria andPresentaddressIsNull() {
            addCriterion("presentAddress is null");
            return (Criteria) this;
        }

        public Criteria andPresentaddressIsNotNull() {
            addCriterion("presentAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPresentaddressEqualTo(String value) {
            addCriterion("presentAddress =", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressNotEqualTo(String value) {
            addCriterion("presentAddress <>", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressGreaterThan(String value) {
            addCriterion("presentAddress >", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressGreaterThanOrEqualTo(String value) {
            addCriterion("presentAddress >=", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressLessThan(String value) {
            addCriterion("presentAddress <", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressLessThanOrEqualTo(String value) {
            addCriterion("presentAddress <=", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressLike(String value) {
            addCriterion("presentAddress like", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressNotLike(String value) {
            addCriterion("presentAddress not like", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressIn(List<String> values) {
            addCriterion("presentAddress in", values, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressNotIn(List<String> values) {
            addCriterion("presentAddress not in", values, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressBetween(String value1, String value2) {
            addCriterion("presentAddress between", value1, value2, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressNotBetween(String value1, String value2) {
            addCriterion("presentAddress not between", value1, value2, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNull() {
            addCriterion("contactNumber is null");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNotNull() {
            addCriterion("contactNumber is not null");
            return (Criteria) this;
        }

        public Criteria andContactnumberEqualTo(String value) {
            addCriterion("contactNumber =", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotEqualTo(String value) {
            addCriterion("contactNumber <>", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThan(String value) {
            addCriterion("contactNumber >", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThanOrEqualTo(String value) {
            addCriterion("contactNumber >=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThan(String value) {
            addCriterion("contactNumber <", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThanOrEqualTo(String value) {
            addCriterion("contactNumber <=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLike(String value) {
            addCriterion("contactNumber like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotLike(String value) {
            addCriterion("contactNumber not like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberIn(List<String> values) {
            addCriterion("contactNumber in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotIn(List<String> values) {
            addCriterion("contactNumber not in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberBetween(String value1, String value2) {
            addCriterion("contactNumber between", value1, value2, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotBetween(String value1, String value2) {
            addCriterion("contactNumber not between", value1, value2, "contactnumber");
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAuthcodeIsNull() {
            addCriterion("authCode is null");
            return (Criteria) this;
        }

        public Criteria andAuthcodeIsNotNull() {
            addCriterion("authCode is not null");
            return (Criteria) this;
        }

        public Criteria andAuthcodeEqualTo(String value) {
            addCriterion("authCode =", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeNotEqualTo(String value) {
            addCriterion("authCode <>", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeGreaterThan(String value) {
            addCriterion("authCode >", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeGreaterThanOrEqualTo(String value) {
            addCriterion("authCode >=", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeLessThan(String value) {
            addCriterion("authCode <", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeLessThanOrEqualTo(String value) {
            addCriterion("authCode <=", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeLike(String value) {
            addCriterion("authCode like", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeNotLike(String value) {
            addCriterion("authCode not like", value, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeIn(List<String> values) {
            addCriterion("authCode in", values, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeNotIn(List<String> values) {
            addCriterion("authCode not in", values, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeBetween(String value1, String value2) {
            addCriterion("authCode between", value1, value2, "authcode");
            return (Criteria) this;
        }

        public Criteria andAuthcodeNotBetween(String value1, String value2) {
            addCriterion("authCode not between", value1, value2, "authcode");
            return (Criteria) this;
        }

        public Criteria andPastcodedateIsNull() {
            addCriterion("pastCodeDate is null");
            return (Criteria) this;
        }

        public Criteria andPastcodedateIsNotNull() {
            addCriterion("pastCodeDate is not null");
            return (Criteria) this;
        }

        public Criteria andPastcodedateEqualTo(Date value) {
            addCriterion("pastCodeDate =", value, "pastcodedate");
            return (Criteria) this;
        }

        public Criteria andPastcodedateNotEqualTo(Date value) {
            addCriterion("pastCodeDate <>", value, "pastcodedate");
            return (Criteria) this;
        }

        public Criteria andPastcodedateGreaterThan(Date value) {
            addCriterion("pastCodeDate >", value, "pastcodedate");
            return (Criteria) this;
        }

        public Criteria andPastcodedateGreaterThanOrEqualTo(Date value) {
            addCriterion("pastCodeDate >=", value, "pastcodedate");
            return (Criteria) this;
        }

        public Criteria andPastcodedateLessThan(Date value) {
            addCriterion("pastCodeDate <", value, "pastcodedate");
            return (Criteria) this;
        }

        public Criteria andPastcodedateLessThanOrEqualTo(Date value) {
            addCriterion("pastCodeDate <=", value, "pastcodedate");
            return (Criteria) this;
        }

        public Criteria andPastcodedateIn(List<Date> values) {
            addCriterion("pastCodeDate in", values, "pastcodedate");
            return (Criteria) this;
        }

        public Criteria andPastcodedateNotIn(List<Date> values) {
            addCriterion("pastCodeDate not in", values, "pastcodedate");
            return (Criteria) this;
        }

        public Criteria andPastcodedateBetween(Date value1, Date value2) {
            addCriterion("pastCodeDate between", value1, value2, "pastcodedate");
            return (Criteria) this;
        }

        public Criteria andPastcodedateNotBetween(Date value1, Date value2) {
            addCriterion("pastCodeDate not between", value1, value2, "pastcodedate");
            return (Criteria) this;
        }

        public Criteria andDepositbankIsNull() {
            addCriterion("depositBank is null");
            return (Criteria) this;
        }

        public Criteria andDepositbankIsNotNull() {
            addCriterion("depositBank is not null");
            return (Criteria) this;
        }

        public Criteria andDepositbankEqualTo(String value) {
            addCriterion("depositBank =", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotEqualTo(String value) {
            addCriterion("depositBank <>", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankGreaterThan(String value) {
            addCriterion("depositBank >", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankGreaterThanOrEqualTo(String value) {
            addCriterion("depositBank >=", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankLessThan(String value) {
            addCriterion("depositBank <", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankLessThanOrEqualTo(String value) {
            addCriterion("depositBank <=", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankLike(String value) {
            addCriterion("depositBank like", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotLike(String value) {
            addCriterion("depositBank not like", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankIn(List<String> values) {
            addCriterion("depositBank in", values, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotIn(List<String> values) {
            addCriterion("depositBank not in", values, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankBetween(String value1, String value2) {
            addCriterion("depositBank between", value1, value2, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotBetween(String value1, String value2) {
            addCriterion("depositBank not between", value1, value2, "depositbank");
            return (Criteria) this;
        }

        public Criteria andBanaccountIsNull() {
            addCriterion("banAccount is null");
            return (Criteria) this;
        }

        public Criteria andBanaccountIsNotNull() {
            addCriterion("banAccount is not null");
            return (Criteria) this;
        }

        public Criteria andBanaccountEqualTo(String value) {
            addCriterion("banAccount =", value, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountNotEqualTo(String value) {
            addCriterion("banAccount <>", value, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountGreaterThan(String value) {
            addCriterion("banAccount >", value, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountGreaterThanOrEqualTo(String value) {
            addCriterion("banAccount >=", value, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountLessThan(String value) {
            addCriterion("banAccount <", value, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountLessThanOrEqualTo(String value) {
            addCriterion("banAccount <=", value, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountLike(String value) {
            addCriterion("banAccount like", value, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountNotLike(String value) {
            addCriterion("banAccount not like", value, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountIn(List<String> values) {
            addCriterion("banAccount in", values, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountNotIn(List<String> values) {
            addCriterion("banAccount not in", values, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountBetween(String value1, String value2) {
            addCriterion("banAccount between", value1, value2, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountNotBetween(String value1, String value2) {
            addCriterion("banAccount not between", value1, value2, "banaccount");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactIsNull() {
            addCriterion("emergencyContact is null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactIsNotNull() {
            addCriterion("emergencyContact is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactEqualTo(String value) {
            addCriterion("emergencyContact =", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotEqualTo(String value) {
            addCriterion("emergencyContact <>", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactGreaterThan(String value) {
            addCriterion("emergencyContact >", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactGreaterThanOrEqualTo(String value) {
            addCriterion("emergencyContact >=", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactLessThan(String value) {
            addCriterion("emergencyContact <", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactLessThanOrEqualTo(String value) {
            addCriterion("emergencyContact <=", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactLike(String value) {
            addCriterion("emergencyContact like", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotLike(String value) {
            addCriterion("emergencyContact not like", value, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactIn(List<String> values) {
            addCriterion("emergencyContact in", values, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotIn(List<String> values) {
            addCriterion("emergencyContact not in", values, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactBetween(String value1, String value2) {
            addCriterion("emergencyContact between", value1, value2, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactNotBetween(String value1, String value2) {
            addCriterion("emergencyContact not between", value1, value2, "emergencycontact");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneIsNull() {
            addCriterion("emergencyPhone is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneIsNotNull() {
            addCriterion("emergencyPhone is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneEqualTo(String value) {
            addCriterion("emergencyPhone =", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneNotEqualTo(String value) {
            addCriterion("emergencyPhone <>", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneGreaterThan(String value) {
            addCriterion("emergencyPhone >", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("emergencyPhone >=", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneLessThan(String value) {
            addCriterion("emergencyPhone <", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneLessThanOrEqualTo(String value) {
            addCriterion("emergencyPhone <=", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneLike(String value) {
            addCriterion("emergencyPhone like", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneNotLike(String value) {
            addCriterion("emergencyPhone not like", value, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneIn(List<String> values) {
            addCriterion("emergencyPhone in", values, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneNotIn(List<String> values) {
            addCriterion("emergencyPhone not in", values, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneBetween(String value1, String value2) {
            addCriterion("emergencyPhone between", value1, value2, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andEmergencyphoneNotBetween(String value1, String value2) {
            addCriterion("emergencyPhone not between", value1, value2, "emergencyphone");
            return (Criteria) this;
        }

        public Criteria andDateonboardIsNull() {
            addCriterion("dateOnBoard is null");
            return (Criteria) this;
        }

        public Criteria andDateonboardIsNotNull() {
            addCriterion("dateOnBoard is not null");
            return (Criteria) this;
        }

        public Criteria andDateonboardEqualTo(Date value) {
            addCriterion("dateOnBoard =", value, "dateonboard");
            return (Criteria) this;
        }

        public Criteria andDateonboardNotEqualTo(Date value) {
            addCriterion("dateOnBoard <>", value, "dateonboard");
            return (Criteria) this;
        }

        public Criteria andDateonboardGreaterThan(Date value) {
            addCriterion("dateOnBoard >", value, "dateonboard");
            return (Criteria) this;
        }

        public Criteria andDateonboardGreaterThanOrEqualTo(Date value) {
            addCriterion("dateOnBoard >=", value, "dateonboard");
            return (Criteria) this;
        }

        public Criteria andDateonboardLessThan(Date value) {
            addCriterion("dateOnBoard <", value, "dateonboard");
            return (Criteria) this;
        }

        public Criteria andDateonboardLessThanOrEqualTo(Date value) {
            addCriterion("dateOnBoard <=", value, "dateonboard");
            return (Criteria) this;
        }

        public Criteria andDateonboardIn(List<Date> values) {
            addCriterion("dateOnBoard in", values, "dateonboard");
            return (Criteria) this;
        }

        public Criteria andDateonboardNotIn(List<Date> values) {
            addCriterion("dateOnBoard not in", values, "dateonboard");
            return (Criteria) this;
        }

        public Criteria andDateonboardBetween(Date value1, Date value2) {
            addCriterion("dateOnBoard between", value1, value2, "dateonboard");
            return (Criteria) this;
        }

        public Criteria andDateonboardNotBetween(Date value1, Date value2) {
            addCriterion("dateOnBoard not between", value1, value2, "dateonboard");
            return (Criteria) this;
        }

        public Criteria andThetrialdueIsNull() {
            addCriterion("theTrialDue is null");
            return (Criteria) this;
        }

        public Criteria andThetrialdueIsNotNull() {
            addCriterion("theTrialDue is not null");
            return (Criteria) this;
        }

        public Criteria andThetrialdueEqualTo(Date value) {
            addCriterion("theTrialDue =", value, "thetrialdue");
            return (Criteria) this;
        }

        public Criteria andThetrialdueNotEqualTo(Date value) {
            addCriterion("theTrialDue <>", value, "thetrialdue");
            return (Criteria) this;
        }

        public Criteria andThetrialdueGreaterThan(Date value) {
            addCriterion("theTrialDue >", value, "thetrialdue");
            return (Criteria) this;
        }

        public Criteria andThetrialdueGreaterThanOrEqualTo(Date value) {
            addCriterion("theTrialDue >=", value, "thetrialdue");
            return (Criteria) this;
        }

        public Criteria andThetrialdueLessThan(Date value) {
            addCriterion("theTrialDue <", value, "thetrialdue");
            return (Criteria) this;
        }

        public Criteria andThetrialdueLessThanOrEqualTo(Date value) {
            addCriterion("theTrialDue <=", value, "thetrialdue");
            return (Criteria) this;
        }

        public Criteria andThetrialdueIn(List<Date> values) {
            addCriterion("theTrialDue in", values, "thetrialdue");
            return (Criteria) this;
        }

        public Criteria andThetrialdueNotIn(List<Date> values) {
            addCriterion("theTrialDue not in", values, "thetrialdue");
            return (Criteria) this;
        }

        public Criteria andThetrialdueBetween(Date value1, Date value2) {
            addCriterion("theTrialDue between", value1, value2, "thetrialdue");
            return (Criteria) this;
        }

        public Criteria andThetrialdueNotBetween(Date value1, Date value2) {
            addCriterion("theTrialDue not between", value1, value2, "thetrialdue");
            return (Criteria) this;
        }

        public Criteria andBirthdaydateIsNull() {
            addCriterion("BirthdayDate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdaydateIsNotNull() {
            addCriterion("BirthdayDate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdaydateEqualTo(Date value) {
            addCriterion("BirthdayDate =", value, "birthdaydate");
            return (Criteria) this;
        }

        public Criteria andBirthdaydateNotEqualTo(Date value) {
            addCriterion("BirthdayDate <>", value, "birthdaydate");
            return (Criteria) this;
        }

        public Criteria andBirthdaydateGreaterThan(Date value) {
            addCriterion("BirthdayDate >", value, "birthdaydate");
            return (Criteria) this;
        }

        public Criteria andBirthdaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("BirthdayDate >=", value, "birthdaydate");
            return (Criteria) this;
        }

        public Criteria andBirthdaydateLessThan(Date value) {
            addCriterion("BirthdayDate <", value, "birthdaydate");
            return (Criteria) this;
        }

        public Criteria andBirthdaydateLessThanOrEqualTo(Date value) {
            addCriterion("BirthdayDate <=", value, "birthdaydate");
            return (Criteria) this;
        }

        public Criteria andBirthdaydateIn(List<Date> values) {
            addCriterion("BirthdayDate in", values, "birthdaydate");
            return (Criteria) this;
        }

        public Criteria andBirthdaydateNotIn(List<Date> values) {
            addCriterion("BirthdayDate not in", values, "birthdaydate");
            return (Criteria) this;
        }

        public Criteria andBirthdaydateBetween(Date value1, Date value2) {
            addCriterion("BirthdayDate between", value1, value2, "birthdaydate");
            return (Criteria) this;
        }

        public Criteria andBirthdaydateNotBetween(Date value1, Date value2) {
            addCriterion("BirthdayDate not between", value1, value2, "birthdaydate");
            return (Criteria) this;
        }

        public Criteria andContractstartIsNull() {
            addCriterion("contractStart is null");
            return (Criteria) this;
        }

        public Criteria andContractstartIsNotNull() {
            addCriterion("contractStart is not null");
            return (Criteria) this;
        }

        public Criteria andContractstartEqualTo(Date value) {
            addCriterion("contractStart =", value, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartNotEqualTo(Date value) {
            addCriterion("contractStart <>", value, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartGreaterThan(Date value) {
            addCriterion("contractStart >", value, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartGreaterThanOrEqualTo(Date value) {
            addCriterion("contractStart >=", value, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartLessThan(Date value) {
            addCriterion("contractStart <", value, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartLessThanOrEqualTo(Date value) {
            addCriterion("contractStart <=", value, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartIn(List<Date> values) {
            addCriterion("contractStart in", values, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartNotIn(List<Date> values) {
            addCriterion("contractStart not in", values, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartBetween(Date value1, Date value2) {
            addCriterion("contractStart between", value1, value2, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartNotBetween(Date value1, Date value2) {
            addCriterion("contractStart not between", value1, value2, "contractstart");
            return (Criteria) this;
        }

        public Criteria andAgreementendsIsNull() {
            addCriterion("agreementEnds is null");
            return (Criteria) this;
        }

        public Criteria andAgreementendsIsNotNull() {
            addCriterion("agreementEnds is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementendsEqualTo(Date value) {
            addCriterion("agreementEnds =", value, "agreementends");
            return (Criteria) this;
        }

        public Criteria andAgreementendsNotEqualTo(Date value) {
            addCriterion("agreementEnds <>", value, "agreementends");
            return (Criteria) this;
        }

        public Criteria andAgreementendsGreaterThan(Date value) {
            addCriterion("agreementEnds >", value, "agreementends");
            return (Criteria) this;
        }

        public Criteria andAgreementendsGreaterThanOrEqualTo(Date value) {
            addCriterion("agreementEnds >=", value, "agreementends");
            return (Criteria) this;
        }

        public Criteria andAgreementendsLessThan(Date value) {
            addCriterion("agreementEnds <", value, "agreementends");
            return (Criteria) this;
        }

        public Criteria andAgreementendsLessThanOrEqualTo(Date value) {
            addCriterion("agreementEnds <=", value, "agreementends");
            return (Criteria) this;
        }

        public Criteria andAgreementendsIn(List<Date> values) {
            addCriterion("agreementEnds in", values, "agreementends");
            return (Criteria) this;
        }

        public Criteria andAgreementendsNotIn(List<Date> values) {
            addCriterion("agreementEnds not in", values, "agreementends");
            return (Criteria) this;
        }

        public Criteria andAgreementendsBetween(Date value1, Date value2) {
            addCriterion("agreementEnds between", value1, value2, "agreementends");
            return (Criteria) this;
        }

        public Criteria andAgreementendsNotBetween(Date value1, Date value2) {
            addCriterion("agreementEnds not between", value1, value2, "agreementends");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNull() {
            addCriterion("cardNumber is null");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNotNull() {
            addCriterion("cardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumberEqualTo(String value) {
            addCriterion("cardNumber =", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotEqualTo(String value) {
            addCriterion("cardNumber <>", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThan(String value) {
            addCriterion("cardNumber >", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("cardNumber >=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThan(String value) {
            addCriterion("cardNumber <", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThanOrEqualTo(String value) {
            addCriterion("cardNumber <=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLike(String value) {
            addCriterion("cardNumber like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotLike(String value) {
            addCriterion("cardNumber not like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberIn(List<String> values) {
            addCriterion("cardNumber in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotIn(List<String> values) {
            addCriterion("cardNumber not in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberBetween(String value1, String value2) {
            addCriterion("cardNumber between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotBetween(String value1, String value2) {
            addCriterion("cardNumber not between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andInternalcardnoIsNull() {
            addCriterion("internalCardNo is null");
            return (Criteria) this;
        }

        public Criteria andInternalcardnoIsNotNull() {
            addCriterion("internalCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andInternalcardnoEqualTo(String value) {
            addCriterion("internalCardNo =", value, "internalcardno");
            return (Criteria) this;
        }

        public Criteria andInternalcardnoNotEqualTo(String value) {
            addCriterion("internalCardNo <>", value, "internalcardno");
            return (Criteria) this;
        }

        public Criteria andInternalcardnoGreaterThan(String value) {
            addCriterion("internalCardNo >", value, "internalcardno");
            return (Criteria) this;
        }

        public Criteria andInternalcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("internalCardNo >=", value, "internalcardno");
            return (Criteria) this;
        }

        public Criteria andInternalcardnoLessThan(String value) {
            addCriterion("internalCardNo <", value, "internalcardno");
            return (Criteria) this;
        }

        public Criteria andInternalcardnoLessThanOrEqualTo(String value) {
            addCriterion("internalCardNo <=", value, "internalcardno");
            return (Criteria) this;
        }

        public Criteria andInternalcardnoLike(String value) {
            addCriterion("internalCardNo like", value, "internalcardno");
            return (Criteria) this;
        }

        public Criteria andInternalcardnoNotLike(String value) {
            addCriterion("internalCardNo not like", value, "internalcardno");
            return (Criteria) this;
        }

        public Criteria andInternalcardnoIn(List<String> values) {
            addCriterion("internalCardNo in", values, "internalcardno");
            return (Criteria) this;
        }

        public Criteria andInternalcardnoNotIn(List<String> values) {
            addCriterion("internalCardNo not in", values, "internalcardno");
            return (Criteria) this;
        }

        public Criteria andInternalcardnoBetween(String value1, String value2) {
            addCriterion("internalCardNo between", value1, value2, "internalcardno");
            return (Criteria) this;
        }

        public Criteria andInternalcardnoNotBetween(String value1, String value2) {
            addCriterion("internalCardNo not between", value1, value2, "internalcardno");
            return (Criteria) this;
        }

        public Criteria andReferrerIsNull() {
            addCriterion("referrer is null");
            return (Criteria) this;
        }

        public Criteria andReferrerIsNotNull() {
            addCriterion("referrer is not null");
            return (Criteria) this;
        }

        public Criteria andReferrerEqualTo(String value) {
            addCriterion("referrer =", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotEqualTo(String value) {
            addCriterion("referrer <>", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerGreaterThan(String value) {
            addCriterion("referrer >", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerGreaterThanOrEqualTo(String value) {
            addCriterion("referrer >=", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLessThan(String value) {
            addCriterion("referrer <", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLessThanOrEqualTo(String value) {
            addCriterion("referrer <=", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLike(String value) {
            addCriterion("referrer like", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotLike(String value) {
            addCriterion("referrer not like", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerIn(List<String> values) {
            addCriterion("referrer in", values, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotIn(List<String> values) {
            addCriterion("referrer not in", values, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerBetween(String value1, String value2) {
            addCriterion("referrer between", value1, value2, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotBetween(String value1, String value2) {
            addCriterion("referrer not between", value1, value2, "referrer");
            return (Criteria) this;
        }

        public Criteria andWholeorderdiscountrightIsNull() {
            addCriterion("wholeOrderDiscountRight is null");
            return (Criteria) this;
        }

        public Criteria andWholeorderdiscountrightIsNotNull() {
            addCriterion("wholeOrderDiscountRight is not null");
            return (Criteria) this;
        }

        public Criteria andWholeorderdiscountrightEqualTo(String value) {
            addCriterion("wholeOrderDiscountRight =", value, "wholeorderdiscountright");
            return (Criteria) this;
        }

        public Criteria andWholeorderdiscountrightNotEqualTo(String value) {
            addCriterion("wholeOrderDiscountRight <>", value, "wholeorderdiscountright");
            return (Criteria) this;
        }

        public Criteria andWholeorderdiscountrightGreaterThan(String value) {
            addCriterion("wholeOrderDiscountRight >", value, "wholeorderdiscountright");
            return (Criteria) this;
        }

        public Criteria andWholeorderdiscountrightGreaterThanOrEqualTo(String value) {
            addCriterion("wholeOrderDiscountRight >=", value, "wholeorderdiscountright");
            return (Criteria) this;
        }

        public Criteria andWholeorderdiscountrightLessThan(String value) {
            addCriterion("wholeOrderDiscountRight <", value, "wholeorderdiscountright");
            return (Criteria) this;
        }

        public Criteria andWholeorderdiscountrightLessThanOrEqualTo(String value) {
            addCriterion("wholeOrderDiscountRight <=", value, "wholeorderdiscountright");
            return (Criteria) this;
        }

        public Criteria andWholeorderdiscountrightLike(String value) {
            addCriterion("wholeOrderDiscountRight like", value, "wholeorderdiscountright");
            return (Criteria) this;
        }

        public Criteria andWholeorderdiscountrightNotLike(String value) {
            addCriterion("wholeOrderDiscountRight not like", value, "wholeorderdiscountright");
            return (Criteria) this;
        }

        public Criteria andWholeorderdiscountrightIn(List<String> values) {
            addCriterion("wholeOrderDiscountRight in", values, "wholeorderdiscountright");
            return (Criteria) this;
        }

        public Criteria andWholeorderdiscountrightNotIn(List<String> values) {
            addCriterion("wholeOrderDiscountRight not in", values, "wholeorderdiscountright");
            return (Criteria) this;
        }

        public Criteria andWholeorderdiscountrightBetween(String value1, String value2) {
            addCriterion("wholeOrderDiscountRight between", value1, value2, "wholeorderdiscountright");
            return (Criteria) this;
        }

        public Criteria andWholeorderdiscountrightNotBetween(String value1, String value2) {
            addCriterion("wholeOrderDiscountRight not between", value1, value2, "wholeorderdiscountright");
            return (Criteria) this;
        }

        public Criteria andTimediscountrightIsNull() {
            addCriterion("timeDiscountRight is null");
            return (Criteria) this;
        }

        public Criteria andTimediscountrightIsNotNull() {
            addCriterion("timeDiscountRight is not null");
            return (Criteria) this;
        }

        public Criteria andTimediscountrightEqualTo(String value) {
            addCriterion("timeDiscountRight =", value, "timediscountright");
            return (Criteria) this;
        }

        public Criteria andTimediscountrightNotEqualTo(String value) {
            addCriterion("timeDiscountRight <>", value, "timediscountright");
            return (Criteria) this;
        }

        public Criteria andTimediscountrightGreaterThan(String value) {
            addCriterion("timeDiscountRight >", value, "timediscountright");
            return (Criteria) this;
        }

        public Criteria andTimediscountrightGreaterThanOrEqualTo(String value) {
            addCriterion("timeDiscountRight >=", value, "timediscountright");
            return (Criteria) this;
        }

        public Criteria andTimediscountrightLessThan(String value) {
            addCriterion("timeDiscountRight <", value, "timediscountright");
            return (Criteria) this;
        }

        public Criteria andTimediscountrightLessThanOrEqualTo(String value) {
            addCriterion("timeDiscountRight <=", value, "timediscountright");
            return (Criteria) this;
        }

        public Criteria andTimediscountrightLike(String value) {
            addCriterion("timeDiscountRight like", value, "timediscountright");
            return (Criteria) this;
        }

        public Criteria andTimediscountrightNotLike(String value) {
            addCriterion("timeDiscountRight not like", value, "timediscountright");
            return (Criteria) this;
        }

        public Criteria andTimediscountrightIn(List<String> values) {
            addCriterion("timeDiscountRight in", values, "timediscountright");
            return (Criteria) this;
        }

        public Criteria andTimediscountrightNotIn(List<String> values) {
            addCriterion("timeDiscountRight not in", values, "timediscountright");
            return (Criteria) this;
        }

        public Criteria andTimediscountrightBetween(String value1, String value2) {
            addCriterion("timeDiscountRight between", value1, value2, "timediscountright");
            return (Criteria) this;
        }

        public Criteria andTimediscountrightNotBetween(String value1, String value2) {
            addCriterion("timeDiscountRight not between", value1, value2, "timediscountright");
            return (Criteria) this;
        }

        public Criteria andRighttodiscountIsNull() {
            addCriterion("rightToDiscount is null");
            return (Criteria) this;
        }

        public Criteria andRighttodiscountIsNotNull() {
            addCriterion("rightToDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andRighttodiscountEqualTo(String value) {
            addCriterion("rightToDiscount =", value, "righttodiscount");
            return (Criteria) this;
        }

        public Criteria andRighttodiscountNotEqualTo(String value) {
            addCriterion("rightToDiscount <>", value, "righttodiscount");
            return (Criteria) this;
        }

        public Criteria andRighttodiscountGreaterThan(String value) {
            addCriterion("rightToDiscount >", value, "righttodiscount");
            return (Criteria) this;
        }

        public Criteria andRighttodiscountGreaterThanOrEqualTo(String value) {
            addCriterion("rightToDiscount >=", value, "righttodiscount");
            return (Criteria) this;
        }

        public Criteria andRighttodiscountLessThan(String value) {
            addCriterion("rightToDiscount <", value, "righttodiscount");
            return (Criteria) this;
        }

        public Criteria andRighttodiscountLessThanOrEqualTo(String value) {
            addCriterion("rightToDiscount <=", value, "righttodiscount");
            return (Criteria) this;
        }

        public Criteria andRighttodiscountLike(String value) {
            addCriterion("rightToDiscount like", value, "righttodiscount");
            return (Criteria) this;
        }

        public Criteria andRighttodiscountNotLike(String value) {
            addCriterion("rightToDiscount not like", value, "righttodiscount");
            return (Criteria) this;
        }

        public Criteria andRighttodiscountIn(List<String> values) {
            addCriterion("rightToDiscount in", values, "righttodiscount");
            return (Criteria) this;
        }

        public Criteria andRighttodiscountNotIn(List<String> values) {
            addCriterion("rightToDiscount not in", values, "righttodiscount");
            return (Criteria) this;
        }

        public Criteria andRighttodiscountBetween(String value1, String value2) {
            addCriterion("rightToDiscount between", value1, value2, "righttodiscount");
            return (Criteria) this;
        }

        public Criteria andRighttodiscountNotBetween(String value1, String value2) {
            addCriterion("rightToDiscount not between", value1, value2, "righttodiscount");
            return (Criteria) this;
        }

        public Criteria andRightofreliefIsNull() {
            addCriterion("rightOfRelief is null");
            return (Criteria) this;
        }

        public Criteria andRightofreliefIsNotNull() {
            addCriterion("rightOfRelief is not null");
            return (Criteria) this;
        }

        public Criteria andRightofreliefEqualTo(String value) {
            addCriterion("rightOfRelief =", value, "rightofrelief");
            return (Criteria) this;
        }

        public Criteria andRightofreliefNotEqualTo(String value) {
            addCriterion("rightOfRelief <>", value, "rightofrelief");
            return (Criteria) this;
        }

        public Criteria andRightofreliefGreaterThan(String value) {
            addCriterion("rightOfRelief >", value, "rightofrelief");
            return (Criteria) this;
        }

        public Criteria andRightofreliefGreaterThanOrEqualTo(String value) {
            addCriterion("rightOfRelief >=", value, "rightofrelief");
            return (Criteria) this;
        }

        public Criteria andRightofreliefLessThan(String value) {
            addCriterion("rightOfRelief <", value, "rightofrelief");
            return (Criteria) this;
        }

        public Criteria andRightofreliefLessThanOrEqualTo(String value) {
            addCriterion("rightOfRelief <=", value, "rightofrelief");
            return (Criteria) this;
        }

        public Criteria andRightofreliefLike(String value) {
            addCriterion("rightOfRelief like", value, "rightofrelief");
            return (Criteria) this;
        }

        public Criteria andRightofreliefNotLike(String value) {
            addCriterion("rightOfRelief not like", value, "rightofrelief");
            return (Criteria) this;
        }

        public Criteria andRightofreliefIn(List<String> values) {
            addCriterion("rightOfRelief in", values, "rightofrelief");
            return (Criteria) this;
        }

        public Criteria andRightofreliefNotIn(List<String> values) {
            addCriterion("rightOfRelief not in", values, "rightofrelief");
            return (Criteria) this;
        }

        public Criteria andRightofreliefBetween(String value1, String value2) {
            addCriterion("rightOfRelief between", value1, value2, "rightofrelief");
            return (Criteria) this;
        }

        public Criteria andRightofreliefNotBetween(String value1, String value2) {
            addCriterion("rightOfRelief not between", value1, value2, "rightofrelief");
            return (Criteria) this;
        }

        public Criteria andJobresumeIsNull() {
            addCriterion("jobResume is null");
            return (Criteria) this;
        }

        public Criteria andJobresumeIsNotNull() {
            addCriterion("jobResume is not null");
            return (Criteria) this;
        }

        public Criteria andJobresumeEqualTo(String value) {
            addCriterion("jobResume =", value, "jobresume");
            return (Criteria) this;
        }

        public Criteria andJobresumeNotEqualTo(String value) {
            addCriterion("jobResume <>", value, "jobresume");
            return (Criteria) this;
        }

        public Criteria andJobresumeGreaterThan(String value) {
            addCriterion("jobResume >", value, "jobresume");
            return (Criteria) this;
        }

        public Criteria andJobresumeGreaterThanOrEqualTo(String value) {
            addCriterion("jobResume >=", value, "jobresume");
            return (Criteria) this;
        }

        public Criteria andJobresumeLessThan(String value) {
            addCriterion("jobResume <", value, "jobresume");
            return (Criteria) this;
        }

        public Criteria andJobresumeLessThanOrEqualTo(String value) {
            addCriterion("jobResume <=", value, "jobresume");
            return (Criteria) this;
        }

        public Criteria andJobresumeLike(String value) {
            addCriterion("jobResume like", value, "jobresume");
            return (Criteria) this;
        }

        public Criteria andJobresumeNotLike(String value) {
            addCriterion("jobResume not like", value, "jobresume");
            return (Criteria) this;
        }

        public Criteria andJobresumeIn(List<String> values) {
            addCriterion("jobResume in", values, "jobresume");
            return (Criteria) this;
        }

        public Criteria andJobresumeNotIn(List<String> values) {
            addCriterion("jobResume not in", values, "jobresume");
            return (Criteria) this;
        }

        public Criteria andJobresumeBetween(String value1, String value2) {
            addCriterion("jobResume between", value1, value2, "jobresume");
            return (Criteria) this;
        }

        public Criteria andJobresumeNotBetween(String value1, String value2) {
            addCriterion("jobResume not between", value1, value2, "jobresume");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceIsNull() {
            addCriterion("educationExperience is null");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceIsNotNull() {
            addCriterion("educationExperience is not null");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceEqualTo(String value) {
            addCriterion("educationExperience =", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceNotEqualTo(String value) {
            addCriterion("educationExperience <>", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceGreaterThan(String value) {
            addCriterion("educationExperience >", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("educationExperience >=", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceLessThan(String value) {
            addCriterion("educationExperience <", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceLessThanOrEqualTo(String value) {
            addCriterion("educationExperience <=", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceLike(String value) {
            addCriterion("educationExperience like", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceNotLike(String value) {
            addCriterion("educationExperience not like", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceIn(List<String> values) {
            addCriterion("educationExperience in", values, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceNotIn(List<String> values) {
            addCriterion("educationExperience not in", values, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceBetween(String value1, String value2) {
            addCriterion("educationExperience between", value1, value2, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceNotBetween(String value1, String value2) {
            addCriterion("educationExperience not between", value1, value2, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andMemberoffamilyIsNull() {
            addCriterion("memberOfFamily is null");
            return (Criteria) this;
        }

        public Criteria andMemberoffamilyIsNotNull() {
            addCriterion("memberOfFamily is not null");
            return (Criteria) this;
        }

        public Criteria andMemberoffamilyEqualTo(String value) {
            addCriterion("memberOfFamily =", value, "memberoffamily");
            return (Criteria) this;
        }

        public Criteria andMemberoffamilyNotEqualTo(String value) {
            addCriterion("memberOfFamily <>", value, "memberoffamily");
            return (Criteria) this;
        }

        public Criteria andMemberoffamilyGreaterThan(String value) {
            addCriterion("memberOfFamily >", value, "memberoffamily");
            return (Criteria) this;
        }

        public Criteria andMemberoffamilyGreaterThanOrEqualTo(String value) {
            addCriterion("memberOfFamily >=", value, "memberoffamily");
            return (Criteria) this;
        }

        public Criteria andMemberoffamilyLessThan(String value) {
            addCriterion("memberOfFamily <", value, "memberoffamily");
            return (Criteria) this;
        }

        public Criteria andMemberoffamilyLessThanOrEqualTo(String value) {
            addCriterion("memberOfFamily <=", value, "memberoffamily");
            return (Criteria) this;
        }

        public Criteria andMemberoffamilyLike(String value) {
            addCriterion("memberOfFamily like", value, "memberoffamily");
            return (Criteria) this;
        }

        public Criteria andMemberoffamilyNotLike(String value) {
            addCriterion("memberOfFamily not like", value, "memberoffamily");
            return (Criteria) this;
        }

        public Criteria andMemberoffamilyIn(List<String> values) {
            addCriterion("memberOfFamily in", values, "memberoffamily");
            return (Criteria) this;
        }

        public Criteria andMemberoffamilyNotIn(List<String> values) {
            addCriterion("memberOfFamily not in", values, "memberoffamily");
            return (Criteria) this;
        }

        public Criteria andMemberoffamilyBetween(String value1, String value2) {
            addCriterion("memberOfFamily between", value1, value2, "memberoffamily");
            return (Criteria) this;
        }

        public Criteria andMemberoffamilyNotBetween(String value1, String value2) {
            addCriterion("memberOfFamily not between", value1, value2, "memberoffamily");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryrecordsIsNull() {
            addCriterion("disciplinaryRecords is null");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryrecordsIsNotNull() {
            addCriterion("disciplinaryRecords is not null");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryrecordsEqualTo(String value) {
            addCriterion("disciplinaryRecords =", value, "disciplinaryrecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryrecordsNotEqualTo(String value) {
            addCriterion("disciplinaryRecords <>", value, "disciplinaryrecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryrecordsGreaterThan(String value) {
            addCriterion("disciplinaryRecords >", value, "disciplinaryrecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryrecordsGreaterThanOrEqualTo(String value) {
            addCriterion("disciplinaryRecords >=", value, "disciplinaryrecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryrecordsLessThan(String value) {
            addCriterion("disciplinaryRecords <", value, "disciplinaryrecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryrecordsLessThanOrEqualTo(String value) {
            addCriterion("disciplinaryRecords <=", value, "disciplinaryrecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryrecordsLike(String value) {
            addCriterion("disciplinaryRecords like", value, "disciplinaryrecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryrecordsNotLike(String value) {
            addCriterion("disciplinaryRecords not like", value, "disciplinaryrecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryrecordsIn(List<String> values) {
            addCriterion("disciplinaryRecords in", values, "disciplinaryrecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryrecordsNotIn(List<String> values) {
            addCriterion("disciplinaryRecords not in", values, "disciplinaryrecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryrecordsBetween(String value1, String value2) {
            addCriterion("disciplinaryRecords between", value1, value2, "disciplinaryrecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryrecordsNotBetween(String value1, String value2) {
            addCriterion("disciplinaryRecords not between", value1, value2, "disciplinaryrecords");
            return (Criteria) this;
        }

        public Criteria andEmploymentadviceIsNull() {
            addCriterion("employmentAdvice is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentadviceIsNotNull() {
            addCriterion("employmentAdvice is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentadviceEqualTo(String value) {
            addCriterion("employmentAdvice =", value, "employmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentadviceNotEqualTo(String value) {
            addCriterion("employmentAdvice <>", value, "employmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentadviceGreaterThan(String value) {
            addCriterion("employmentAdvice >", value, "employmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentadviceGreaterThanOrEqualTo(String value) {
            addCriterion("employmentAdvice >=", value, "employmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentadviceLessThan(String value) {
            addCriterion("employmentAdvice <", value, "employmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentadviceLessThanOrEqualTo(String value) {
            addCriterion("employmentAdvice <=", value, "employmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentadviceLike(String value) {
            addCriterion("employmentAdvice like", value, "employmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentadviceNotLike(String value) {
            addCriterion("employmentAdvice not like", value, "employmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentadviceIn(List<String> values) {
            addCriterion("employmentAdvice in", values, "employmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentadviceNotIn(List<String> values) {
            addCriterion("employmentAdvice not in", values, "employmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentadviceBetween(String value1, String value2) {
            addCriterion("employmentAdvice between", value1, value2, "employmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentadviceNotBetween(String value1, String value2) {
            addCriterion("employmentAdvice not between", value1, value2, "employmentadvice");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("roleId is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleId is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("roleId =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("roleId <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("roleId >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleId >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("roleId <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleId <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("roleId in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("roleId not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("roleId between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleId not between", value1, value2, "roleid");
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