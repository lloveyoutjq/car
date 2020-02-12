package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientCarinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientCarinfoExample() {
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

        public Criteria andCarnumberIsNull() {
            addCriterion("carNumber is null");
            return (Criteria) this;
        }

        public Criteria andCarnumberIsNotNull() {
            addCriterion("carNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCarnumberEqualTo(String value) {
            addCriterion("carNumber =", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotEqualTo(String value) {
            addCriterion("carNumber <>", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberGreaterThan(String value) {
            addCriterion("carNumber >", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberGreaterThanOrEqualTo(String value) {
            addCriterion("carNumber >=", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLessThan(String value) {
            addCriterion("carNumber <", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLessThanOrEqualTo(String value) {
            addCriterion("carNumber <=", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLike(String value) {
            addCriterion("carNumber like", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotLike(String value) {
            addCriterion("carNumber not like", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberIn(List<String> values) {
            addCriterion("carNumber in", values, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotIn(List<String> values) {
            addCriterion("carNumber not in", values, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberBetween(String value1, String value2) {
            addCriterion("carNumber between", value1, value2, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotBetween(String value1, String value2) {
            addCriterion("carNumber not between", value1, value2, "carnumber");
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

        public Criteria andCaridIsNull() {
            addCriterion("carId is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carId is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(Integer value) {
            addCriterion("carId =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(Integer value) {
            addCriterion("carId <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(Integer value) {
            addCriterion("carId >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("carId >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(Integer value) {
            addCriterion("carId <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(Integer value) {
            addCriterion("carId <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<Integer> values) {
            addCriterion("carId in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<Integer> values) {
            addCriterion("carId not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(Integer value1, Integer value2) {
            addCriterion("carId between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(Integer value1, Integer value2) {
            addCriterion("carId not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCarerIsNull() {
            addCriterion("carer is null");
            return (Criteria) this;
        }

        public Criteria andCarerIsNotNull() {
            addCriterion("carer is not null");
            return (Criteria) this;
        }

        public Criteria andCarerEqualTo(String value) {
            addCriterion("carer =", value, "carer");
            return (Criteria) this;
        }

        public Criteria andCarerNotEqualTo(String value) {
            addCriterion("carer <>", value, "carer");
            return (Criteria) this;
        }

        public Criteria andCarerGreaterThan(String value) {
            addCriterion("carer >", value, "carer");
            return (Criteria) this;
        }

        public Criteria andCarerGreaterThanOrEqualTo(String value) {
            addCriterion("carer >=", value, "carer");
            return (Criteria) this;
        }

        public Criteria andCarerLessThan(String value) {
            addCriterion("carer <", value, "carer");
            return (Criteria) this;
        }

        public Criteria andCarerLessThanOrEqualTo(String value) {
            addCriterion("carer <=", value, "carer");
            return (Criteria) this;
        }

        public Criteria andCarerLike(String value) {
            addCriterion("carer like", value, "carer");
            return (Criteria) this;
        }

        public Criteria andCarerNotLike(String value) {
            addCriterion("carer not like", value, "carer");
            return (Criteria) this;
        }

        public Criteria andCarerIn(List<String> values) {
            addCriterion("carer in", values, "carer");
            return (Criteria) this;
        }

        public Criteria andCarerNotIn(List<String> values) {
            addCriterion("carer not in", values, "carer");
            return (Criteria) this;
        }

        public Criteria andCarerBetween(String value1, String value2) {
            addCriterion("carer between", value1, value2, "carer");
            return (Criteria) this;
        }

        public Criteria andCarerNotBetween(String value1, String value2) {
            addCriterion("carer not between", value1, value2, "carer");
            return (Criteria) this;
        }

        public Criteria andCarerphoneIsNull() {
            addCriterion("carerPhone is null");
            return (Criteria) this;
        }

        public Criteria andCarerphoneIsNotNull() {
            addCriterion("carerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCarerphoneEqualTo(String value) {
            addCriterion("carerPhone =", value, "carerphone");
            return (Criteria) this;
        }

        public Criteria andCarerphoneNotEqualTo(String value) {
            addCriterion("carerPhone <>", value, "carerphone");
            return (Criteria) this;
        }

        public Criteria andCarerphoneGreaterThan(String value) {
            addCriterion("carerPhone >", value, "carerphone");
            return (Criteria) this;
        }

        public Criteria andCarerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("carerPhone >=", value, "carerphone");
            return (Criteria) this;
        }

        public Criteria andCarerphoneLessThan(String value) {
            addCriterion("carerPhone <", value, "carerphone");
            return (Criteria) this;
        }

        public Criteria andCarerphoneLessThanOrEqualTo(String value) {
            addCriterion("carerPhone <=", value, "carerphone");
            return (Criteria) this;
        }

        public Criteria andCarerphoneLike(String value) {
            addCriterion("carerPhone like", value, "carerphone");
            return (Criteria) this;
        }

        public Criteria andCarerphoneNotLike(String value) {
            addCriterion("carerPhone not like", value, "carerphone");
            return (Criteria) this;
        }

        public Criteria andCarerphoneIn(List<String> values) {
            addCriterion("carerPhone in", values, "carerphone");
            return (Criteria) this;
        }

        public Criteria andCarerphoneNotIn(List<String> values) {
            addCriterion("carerPhone not in", values, "carerphone");
            return (Criteria) this;
        }

        public Criteria andCarerphoneBetween(String value1, String value2) {
            addCriterion("carerPhone between", value1, value2, "carerphone");
            return (Criteria) this;
        }

        public Criteria andCarerphoneNotBetween(String value1, String value2) {
            addCriterion("carerPhone not between", value1, value2, "carerphone");
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

        public Criteria andAffiliationIsNull() {
            addCriterion("affiliation is null");
            return (Criteria) this;
        }

        public Criteria andAffiliationIsNotNull() {
            addCriterion("affiliation is not null");
            return (Criteria) this;
        }

        public Criteria andAffiliationEqualTo(String value) {
            addCriterion("affiliation =", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationNotEqualTo(String value) {
            addCriterion("affiliation <>", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationGreaterThan(String value) {
            addCriterion("affiliation >", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationGreaterThanOrEqualTo(String value) {
            addCriterion("affiliation >=", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationLessThan(String value) {
            addCriterion("affiliation <", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationLessThanOrEqualTo(String value) {
            addCriterion("affiliation <=", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationLike(String value) {
            addCriterion("affiliation like", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationNotLike(String value) {
            addCriterion("affiliation not like", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationIn(List<String> values) {
            addCriterion("affiliation in", values, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationNotIn(List<String> values) {
            addCriterion("affiliation not in", values, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationBetween(String value1, String value2) {
            addCriterion("affiliation between", value1, value2, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationNotBetween(String value1, String value2) {
            addCriterion("affiliation not between", value1, value2, "affiliation");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceIsNull() {
            addCriterion("drivingLicence is null");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceIsNotNull() {
            addCriterion("drivingLicence is not null");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceEqualTo(Date value) {
            addCriterion("drivingLicence =", value, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceNotEqualTo(Date value) {
            addCriterion("drivingLicence <>", value, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceGreaterThan(Date value) {
            addCriterion("drivingLicence >", value, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceGreaterThanOrEqualTo(Date value) {
            addCriterion("drivingLicence >=", value, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceLessThan(Date value) {
            addCriterion("drivingLicence <", value, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceLessThanOrEqualTo(Date value) {
            addCriterion("drivingLicence <=", value, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceIn(List<Date> values) {
            addCriterion("drivingLicence in", values, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceNotIn(List<Date> values) {
            addCriterion("drivingLicence not in", values, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceBetween(Date value1, Date value2) {
            addCriterion("drivingLicence between", value1, value2, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenceNotBetween(Date value1, Date value2) {
            addCriterion("drivingLicence not between", value1, value2, "drivinglicence");
            return (Criteria) this;
        }

        public Criteria andFramenumberIsNull() {
            addCriterion("frameNumber is null");
            return (Criteria) this;
        }

        public Criteria andFramenumberIsNotNull() {
            addCriterion("frameNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFramenumberEqualTo(String value) {
            addCriterion("frameNumber =", value, "framenumber");
            return (Criteria) this;
        }

        public Criteria andFramenumberNotEqualTo(String value) {
            addCriterion("frameNumber <>", value, "framenumber");
            return (Criteria) this;
        }

        public Criteria andFramenumberGreaterThan(String value) {
            addCriterion("frameNumber >", value, "framenumber");
            return (Criteria) this;
        }

        public Criteria andFramenumberGreaterThanOrEqualTo(String value) {
            addCriterion("frameNumber >=", value, "framenumber");
            return (Criteria) this;
        }

        public Criteria andFramenumberLessThan(String value) {
            addCriterion("frameNumber <", value, "framenumber");
            return (Criteria) this;
        }

        public Criteria andFramenumberLessThanOrEqualTo(String value) {
            addCriterion("frameNumber <=", value, "framenumber");
            return (Criteria) this;
        }

        public Criteria andFramenumberLike(String value) {
            addCriterion("frameNumber like", value, "framenumber");
            return (Criteria) this;
        }

        public Criteria andFramenumberNotLike(String value) {
            addCriterion("frameNumber not like", value, "framenumber");
            return (Criteria) this;
        }

        public Criteria andFramenumberIn(List<String> values) {
            addCriterion("frameNumber in", values, "framenumber");
            return (Criteria) this;
        }

        public Criteria andFramenumberNotIn(List<String> values) {
            addCriterion("frameNumber not in", values, "framenumber");
            return (Criteria) this;
        }

        public Criteria andFramenumberBetween(String value1, String value2) {
            addCriterion("frameNumber between", value1, value2, "framenumber");
            return (Criteria) this;
        }

        public Criteria andFramenumberNotBetween(String value1, String value2) {
            addCriterion("frameNumber not between", value1, value2, "framenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberIsNull() {
            addCriterion("engineNumber is null");
            return (Criteria) this;
        }

        public Criteria andEnginenumberIsNotNull() {
            addCriterion("engineNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEnginenumberEqualTo(String value) {
            addCriterion("engineNumber =", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberNotEqualTo(String value) {
            addCriterion("engineNumber <>", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberGreaterThan(String value) {
            addCriterion("engineNumber >", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberGreaterThanOrEqualTo(String value) {
            addCriterion("engineNumber >=", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberLessThan(String value) {
            addCriterion("engineNumber <", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberLessThanOrEqualTo(String value) {
            addCriterion("engineNumber <=", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberLike(String value) {
            addCriterion("engineNumber like", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberNotLike(String value) {
            addCriterion("engineNumber not like", value, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberIn(List<String> values) {
            addCriterion("engineNumber in", values, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberNotIn(List<String> values) {
            addCriterion("engineNumber not in", values, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberBetween(String value1, String value2) {
            addCriterion("engineNumber between", value1, value2, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andEnginenumberNotBetween(String value1, String value2) {
            addCriterion("engineNumber not between", value1, value2, "enginenumber");
            return (Criteria) this;
        }

        public Criteria andYearpriceIsNull() {
            addCriterion("yearPrice is null");
            return (Criteria) this;
        }

        public Criteria andYearpriceIsNotNull() {
            addCriterion("yearPrice is not null");
            return (Criteria) this;
        }

        public Criteria andYearpriceEqualTo(Float value) {
            addCriterion("yearPrice =", value, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceNotEqualTo(Float value) {
            addCriterion("yearPrice <>", value, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceGreaterThan(Float value) {
            addCriterion("yearPrice >", value, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("yearPrice >=", value, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceLessThan(Float value) {
            addCriterion("yearPrice <", value, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceLessThanOrEqualTo(Float value) {
            addCriterion("yearPrice <=", value, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceIn(List<Float> values) {
            addCriterion("yearPrice in", values, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceNotIn(List<Float> values) {
            addCriterion("yearPrice not in", values, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceBetween(Float value1, Float value2) {
            addCriterion("yearPrice between", value1, value2, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceNotBetween(Float value1, Float value2) {
            addCriterion("yearPrice not between", value1, value2, "yearprice");
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

        public Criteria andBuydateIsNull() {
            addCriterion("buyDate is null");
            return (Criteria) this;
        }

        public Criteria andBuydateIsNotNull() {
            addCriterion("buyDate is not null");
            return (Criteria) this;
        }

        public Criteria andBuydateEqualTo(Date value) {
            addCriterion("buyDate =", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotEqualTo(Date value) {
            addCriterion("buyDate <>", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateGreaterThan(Date value) {
            addCriterion("buyDate >", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateGreaterThanOrEqualTo(Date value) {
            addCriterion("buyDate >=", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateLessThan(Date value) {
            addCriterion("buyDate <", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateLessThanOrEqualTo(Date value) {
            addCriterion("buyDate <=", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateIn(List<Date> values) {
            addCriterion("buyDate in", values, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotIn(List<Date> values) {
            addCriterion("buyDate not in", values, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateBetween(Date value1, Date value2) {
            addCriterion("buyDate between", value1, value2, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotBetween(Date value1, Date value2) {
            addCriterion("buyDate not between", value1, value2, "buydate");
            return (Criteria) this;
        }

        public Criteria andDutydateIsNull() {
            addCriterion("dutyDate is null");
            return (Criteria) this;
        }

        public Criteria andDutydateIsNotNull() {
            addCriterion("dutyDate is not null");
            return (Criteria) this;
        }

        public Criteria andDutydateEqualTo(Date value) {
            addCriterion("dutyDate =", value, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateNotEqualTo(Date value) {
            addCriterion("dutyDate <>", value, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateGreaterThan(Date value) {
            addCriterion("dutyDate >", value, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateGreaterThanOrEqualTo(Date value) {
            addCriterion("dutyDate >=", value, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateLessThan(Date value) {
            addCriterion("dutyDate <", value, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateLessThanOrEqualTo(Date value) {
            addCriterion("dutyDate <=", value, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateIn(List<Date> values) {
            addCriterion("dutyDate in", values, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateNotIn(List<Date> values) {
            addCriterion("dutyDate not in", values, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateBetween(Date value1, Date value2) {
            addCriterion("dutyDate between", value1, value2, "dutydate");
            return (Criteria) this;
        }

        public Criteria andDutydateNotBetween(Date value1, Date value2) {
            addCriterion("dutyDate not between", value1, value2, "dutydate");
            return (Criteria) this;
        }

        public Criteria andCarcheckdateIsNull() {
            addCriterion("carcheckDate is null");
            return (Criteria) this;
        }

        public Criteria andCarcheckdateIsNotNull() {
            addCriterion("carcheckDate is not null");
            return (Criteria) this;
        }

        public Criteria andCarcheckdateEqualTo(Date value) {
            addCriterion("carcheckDate =", value, "carcheckdate");
            return (Criteria) this;
        }

        public Criteria andCarcheckdateNotEqualTo(Date value) {
            addCriterion("carcheckDate <>", value, "carcheckdate");
            return (Criteria) this;
        }

        public Criteria andCarcheckdateGreaterThan(Date value) {
            addCriterion("carcheckDate >", value, "carcheckdate");
            return (Criteria) this;
        }

        public Criteria andCarcheckdateGreaterThanOrEqualTo(Date value) {
            addCriterion("carcheckDate >=", value, "carcheckdate");
            return (Criteria) this;
        }

        public Criteria andCarcheckdateLessThan(Date value) {
            addCriterion("carcheckDate <", value, "carcheckdate");
            return (Criteria) this;
        }

        public Criteria andCarcheckdateLessThanOrEqualTo(Date value) {
            addCriterion("carcheckDate <=", value, "carcheckdate");
            return (Criteria) this;
        }

        public Criteria andCarcheckdateIn(List<Date> values) {
            addCriterion("carcheckDate in", values, "carcheckdate");
            return (Criteria) this;
        }

        public Criteria andCarcheckdateNotIn(List<Date> values) {
            addCriterion("carcheckDate not in", values, "carcheckdate");
            return (Criteria) this;
        }

        public Criteria andCarcheckdateBetween(Date value1, Date value2) {
            addCriterion("carcheckDate between", value1, value2, "carcheckdate");
            return (Criteria) this;
        }

        public Criteria andCarcheckdateNotBetween(Date value1, Date value2) {
            addCriterion("carcheckDate not between", value1, value2, "carcheckdate");
            return (Criteria) this;
        }

        public Criteria andFueloiltypeIsNull() {
            addCriterion("fuelOilType is null");
            return (Criteria) this;
        }

        public Criteria andFueloiltypeIsNotNull() {
            addCriterion("fuelOilType is not null");
            return (Criteria) this;
        }

        public Criteria andFueloiltypeEqualTo(String value) {
            addCriterion("fuelOilType =", value, "fueloiltype");
            return (Criteria) this;
        }

        public Criteria andFueloiltypeNotEqualTo(String value) {
            addCriterion("fuelOilType <>", value, "fueloiltype");
            return (Criteria) this;
        }

        public Criteria andFueloiltypeGreaterThan(String value) {
            addCriterion("fuelOilType >", value, "fueloiltype");
            return (Criteria) this;
        }

        public Criteria andFueloiltypeGreaterThanOrEqualTo(String value) {
            addCriterion("fuelOilType >=", value, "fueloiltype");
            return (Criteria) this;
        }

        public Criteria andFueloiltypeLessThan(String value) {
            addCriterion("fuelOilType <", value, "fueloiltype");
            return (Criteria) this;
        }

        public Criteria andFueloiltypeLessThanOrEqualTo(String value) {
            addCriterion("fuelOilType <=", value, "fueloiltype");
            return (Criteria) this;
        }

        public Criteria andFueloiltypeLike(String value) {
            addCriterion("fuelOilType like", value, "fueloiltype");
            return (Criteria) this;
        }

        public Criteria andFueloiltypeNotLike(String value) {
            addCriterion("fuelOilType not like", value, "fueloiltype");
            return (Criteria) this;
        }

        public Criteria andFueloiltypeIn(List<String> values) {
            addCriterion("fuelOilType in", values, "fueloiltype");
            return (Criteria) this;
        }

        public Criteria andFueloiltypeNotIn(List<String> values) {
            addCriterion("fuelOilType not in", values, "fueloiltype");
            return (Criteria) this;
        }

        public Criteria andFueloiltypeBetween(String value1, String value2) {
            addCriterion("fuelOilType between", value1, value2, "fueloiltype");
            return (Criteria) this;
        }

        public Criteria andFueloiltypeNotBetween(String value1, String value2) {
            addCriterion("fuelOilType not between", value1, value2, "fueloiltype");
            return (Criteria) this;
        }

        public Criteria andCarseriesIsNull() {
            addCriterion("carSeries is null");
            return (Criteria) this;
        }

        public Criteria andCarseriesIsNotNull() {
            addCriterion("carSeries is not null");
            return (Criteria) this;
        }

        public Criteria andCarseriesEqualTo(String value) {
            addCriterion("carSeries =", value, "carseries");
            return (Criteria) this;
        }

        public Criteria andCarseriesNotEqualTo(String value) {
            addCriterion("carSeries <>", value, "carseries");
            return (Criteria) this;
        }

        public Criteria andCarseriesGreaterThan(String value) {
            addCriterion("carSeries >", value, "carseries");
            return (Criteria) this;
        }

        public Criteria andCarseriesGreaterThanOrEqualTo(String value) {
            addCriterion("carSeries >=", value, "carseries");
            return (Criteria) this;
        }

        public Criteria andCarseriesLessThan(String value) {
            addCriterion("carSeries <", value, "carseries");
            return (Criteria) this;
        }

        public Criteria andCarseriesLessThanOrEqualTo(String value) {
            addCriterion("carSeries <=", value, "carseries");
            return (Criteria) this;
        }

        public Criteria andCarseriesLike(String value) {
            addCriterion("carSeries like", value, "carseries");
            return (Criteria) this;
        }

        public Criteria andCarseriesNotLike(String value) {
            addCriterion("carSeries not like", value, "carseries");
            return (Criteria) this;
        }

        public Criteria andCarseriesIn(List<String> values) {
            addCriterion("carSeries in", values, "carseries");
            return (Criteria) this;
        }

        public Criteria andCarseriesNotIn(List<String> values) {
            addCriterion("carSeries not in", values, "carseries");
            return (Criteria) this;
        }

        public Criteria andCarseriesBetween(String value1, String value2) {
            addCriterion("carSeries between", value1, value2, "carseries");
            return (Criteria) this;
        }

        public Criteria andCarseriesNotBetween(String value1, String value2) {
            addCriterion("carSeries not between", value1, value2, "carseries");
            return (Criteria) this;
        }

        public Criteria andJqinsuranceIsNull() {
            addCriterion("jqinsurance is null");
            return (Criteria) this;
        }

        public Criteria andJqinsuranceIsNotNull() {
            addCriterion("jqinsurance is not null");
            return (Criteria) this;
        }

        public Criteria andJqinsuranceEqualTo(String value) {
            addCriterion("jqinsurance =", value, "jqinsurance");
            return (Criteria) this;
        }

        public Criteria andJqinsuranceNotEqualTo(String value) {
            addCriterion("jqinsurance <>", value, "jqinsurance");
            return (Criteria) this;
        }

        public Criteria andJqinsuranceGreaterThan(String value) {
            addCriterion("jqinsurance >", value, "jqinsurance");
            return (Criteria) this;
        }

        public Criteria andJqinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("jqinsurance >=", value, "jqinsurance");
            return (Criteria) this;
        }

        public Criteria andJqinsuranceLessThan(String value) {
            addCriterion("jqinsurance <", value, "jqinsurance");
            return (Criteria) this;
        }

        public Criteria andJqinsuranceLessThanOrEqualTo(String value) {
            addCriterion("jqinsurance <=", value, "jqinsurance");
            return (Criteria) this;
        }

        public Criteria andJqinsuranceLike(String value) {
            addCriterion("jqinsurance like", value, "jqinsurance");
            return (Criteria) this;
        }

        public Criteria andJqinsuranceNotLike(String value) {
            addCriterion("jqinsurance not like", value, "jqinsurance");
            return (Criteria) this;
        }

        public Criteria andJqinsuranceIn(List<String> values) {
            addCriterion("jqinsurance in", values, "jqinsurance");
            return (Criteria) this;
        }

        public Criteria andJqinsuranceNotIn(List<String> values) {
            addCriterion("jqinsurance not in", values, "jqinsurance");
            return (Criteria) this;
        }

        public Criteria andJqinsuranceBetween(String value1, String value2) {
            addCriterion("jqinsurance between", value1, value2, "jqinsurance");
            return (Criteria) this;
        }

        public Criteria andJqinsuranceNotBetween(String value1, String value2) {
            addCriterion("jqinsurance not between", value1, value2, "jqinsurance");
            return (Criteria) this;
        }

        public Criteria andJqinsurancedateIsNull() {
            addCriterion("jqinsuranceDate is null");
            return (Criteria) this;
        }

        public Criteria andJqinsurancedateIsNotNull() {
            addCriterion("jqinsuranceDate is not null");
            return (Criteria) this;
        }

        public Criteria andJqinsurancedateEqualTo(Date value) {
            addCriterion("jqinsuranceDate =", value, "jqinsurancedate");
            return (Criteria) this;
        }

        public Criteria andJqinsurancedateNotEqualTo(Date value) {
            addCriterion("jqinsuranceDate <>", value, "jqinsurancedate");
            return (Criteria) this;
        }

        public Criteria andJqinsurancedateGreaterThan(Date value) {
            addCriterion("jqinsuranceDate >", value, "jqinsurancedate");
            return (Criteria) this;
        }

        public Criteria andJqinsurancedateGreaterThanOrEqualTo(Date value) {
            addCriterion("jqinsuranceDate >=", value, "jqinsurancedate");
            return (Criteria) this;
        }

        public Criteria andJqinsurancedateLessThan(Date value) {
            addCriterion("jqinsuranceDate <", value, "jqinsurancedate");
            return (Criteria) this;
        }

        public Criteria andJqinsurancedateLessThanOrEqualTo(Date value) {
            addCriterion("jqinsuranceDate <=", value, "jqinsurancedate");
            return (Criteria) this;
        }

        public Criteria andJqinsurancedateIn(List<Date> values) {
            addCriterion("jqinsuranceDate in", values, "jqinsurancedate");
            return (Criteria) this;
        }

        public Criteria andJqinsurancedateNotIn(List<Date> values) {
            addCriterion("jqinsuranceDate not in", values, "jqinsurancedate");
            return (Criteria) this;
        }

        public Criteria andJqinsurancedateBetween(Date value1, Date value2) {
            addCriterion("jqinsuranceDate between", value1, value2, "jqinsurancedate");
            return (Criteria) this;
        }

        public Criteria andJqinsurancedateNotBetween(Date value1, Date value2) {
            addCriterion("jqinsuranceDate not between", value1, value2, "jqinsurancedate");
            return (Criteria) this;
        }

        public Criteria andSyinsuranceIsNull() {
            addCriterion("syinsurance is null");
            return (Criteria) this;
        }

        public Criteria andSyinsuranceIsNotNull() {
            addCriterion("syinsurance is not null");
            return (Criteria) this;
        }

        public Criteria andSyinsuranceEqualTo(String value) {
            addCriterion("syinsurance =", value, "syinsurance");
            return (Criteria) this;
        }

        public Criteria andSyinsuranceNotEqualTo(String value) {
            addCriterion("syinsurance <>", value, "syinsurance");
            return (Criteria) this;
        }

        public Criteria andSyinsuranceGreaterThan(String value) {
            addCriterion("syinsurance >", value, "syinsurance");
            return (Criteria) this;
        }

        public Criteria andSyinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("syinsurance >=", value, "syinsurance");
            return (Criteria) this;
        }

        public Criteria andSyinsuranceLessThan(String value) {
            addCriterion("syinsurance <", value, "syinsurance");
            return (Criteria) this;
        }

        public Criteria andSyinsuranceLessThanOrEqualTo(String value) {
            addCriterion("syinsurance <=", value, "syinsurance");
            return (Criteria) this;
        }

        public Criteria andSyinsuranceLike(String value) {
            addCriterion("syinsurance like", value, "syinsurance");
            return (Criteria) this;
        }

        public Criteria andSyinsuranceNotLike(String value) {
            addCriterion("syinsurance not like", value, "syinsurance");
            return (Criteria) this;
        }

        public Criteria andSyinsuranceIn(List<String> values) {
            addCriterion("syinsurance in", values, "syinsurance");
            return (Criteria) this;
        }

        public Criteria andSyinsuranceNotIn(List<String> values) {
            addCriterion("syinsurance not in", values, "syinsurance");
            return (Criteria) this;
        }

        public Criteria andSyinsuranceBetween(String value1, String value2) {
            addCriterion("syinsurance between", value1, value2, "syinsurance");
            return (Criteria) this;
        }

        public Criteria andSyinsuranceNotBetween(String value1, String value2) {
            addCriterion("syinsurance not between", value1, value2, "syinsurance");
            return (Criteria) this;
        }

        public Criteria andSyinsurancedateIsNull() {
            addCriterion("syinsuranceDate is null");
            return (Criteria) this;
        }

        public Criteria andSyinsurancedateIsNotNull() {
            addCriterion("syinsuranceDate is not null");
            return (Criteria) this;
        }

        public Criteria andSyinsurancedateEqualTo(Date value) {
            addCriterion("syinsuranceDate =", value, "syinsurancedate");
            return (Criteria) this;
        }

        public Criteria andSyinsurancedateNotEqualTo(Date value) {
            addCriterion("syinsuranceDate <>", value, "syinsurancedate");
            return (Criteria) this;
        }

        public Criteria andSyinsurancedateGreaterThan(Date value) {
            addCriterion("syinsuranceDate >", value, "syinsurancedate");
            return (Criteria) this;
        }

        public Criteria andSyinsurancedateGreaterThanOrEqualTo(Date value) {
            addCriterion("syinsuranceDate >=", value, "syinsurancedate");
            return (Criteria) this;
        }

        public Criteria andSyinsurancedateLessThan(Date value) {
            addCriterion("syinsuranceDate <", value, "syinsurancedate");
            return (Criteria) this;
        }

        public Criteria andSyinsurancedateLessThanOrEqualTo(Date value) {
            addCriterion("syinsuranceDate <=", value, "syinsurancedate");
            return (Criteria) this;
        }

        public Criteria andSyinsurancedateIn(List<Date> values) {
            addCriterion("syinsuranceDate in", values, "syinsurancedate");
            return (Criteria) this;
        }

        public Criteria andSyinsurancedateNotIn(List<Date> values) {
            addCriterion("syinsuranceDate not in", values, "syinsurancedate");
            return (Criteria) this;
        }

        public Criteria andSyinsurancedateBetween(Date value1, Date value2) {
            addCriterion("syinsuranceDate between", value1, value2, "syinsurancedate");
            return (Criteria) this;
        }

        public Criteria andSyinsurancedateNotBetween(Date value1, Date value2) {
            addCriterion("syinsuranceDate not between", value1, value2, "syinsurancedate");
            return (Criteria) this;
        }

        public Criteria andMaintainIsNull() {
            addCriterion("maintain is null");
            return (Criteria) this;
        }

        public Criteria andMaintainIsNotNull() {
            addCriterion("maintain is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainEqualTo(String value) {
            addCriterion("maintain =", value, "maintain");
            return (Criteria) this;
        }

        public Criteria andMaintainNotEqualTo(String value) {
            addCriterion("maintain <>", value, "maintain");
            return (Criteria) this;
        }

        public Criteria andMaintainGreaterThan(String value) {
            addCriterion("maintain >", value, "maintain");
            return (Criteria) this;
        }

        public Criteria andMaintainGreaterThanOrEqualTo(String value) {
            addCriterion("maintain >=", value, "maintain");
            return (Criteria) this;
        }

        public Criteria andMaintainLessThan(String value) {
            addCriterion("maintain <", value, "maintain");
            return (Criteria) this;
        }

        public Criteria andMaintainLessThanOrEqualTo(String value) {
            addCriterion("maintain <=", value, "maintain");
            return (Criteria) this;
        }

        public Criteria andMaintainLike(String value) {
            addCriterion("maintain like", value, "maintain");
            return (Criteria) this;
        }

        public Criteria andMaintainNotLike(String value) {
            addCriterion("maintain not like", value, "maintain");
            return (Criteria) this;
        }

        public Criteria andMaintainIn(List<String> values) {
            addCriterion("maintain in", values, "maintain");
            return (Criteria) this;
        }

        public Criteria andMaintainNotIn(List<String> values) {
            addCriterion("maintain not in", values, "maintain");
            return (Criteria) this;
        }

        public Criteria andMaintainBetween(String value1, String value2) {
            addCriterion("maintain between", value1, value2, "maintain");
            return (Criteria) this;
        }

        public Criteria andMaintainNotBetween(String value1, String value2) {
            addCriterion("maintain not between", value1, value2, "maintain");
            return (Criteria) this;
        }

        public Criteria andMaintaindateIsNull() {
            addCriterion("maintainDate is null");
            return (Criteria) this;
        }

        public Criteria andMaintaindateIsNotNull() {
            addCriterion("maintainDate is not null");
            return (Criteria) this;
        }

        public Criteria andMaintaindateEqualTo(Date value) {
            addCriterion("maintainDate =", value, "maintaindate");
            return (Criteria) this;
        }

        public Criteria andMaintaindateNotEqualTo(Date value) {
            addCriterion("maintainDate <>", value, "maintaindate");
            return (Criteria) this;
        }

        public Criteria andMaintaindateGreaterThan(Date value) {
            addCriterion("maintainDate >", value, "maintaindate");
            return (Criteria) this;
        }

        public Criteria andMaintaindateGreaterThanOrEqualTo(Date value) {
            addCriterion("maintainDate >=", value, "maintaindate");
            return (Criteria) this;
        }

        public Criteria andMaintaindateLessThan(Date value) {
            addCriterion("maintainDate <", value, "maintaindate");
            return (Criteria) this;
        }

        public Criteria andMaintaindateLessThanOrEqualTo(Date value) {
            addCriterion("maintainDate <=", value, "maintaindate");
            return (Criteria) this;
        }

        public Criteria andMaintaindateIn(List<Date> values) {
            addCriterion("maintainDate in", values, "maintaindate");
            return (Criteria) this;
        }

        public Criteria andMaintaindateNotIn(List<Date> values) {
            addCriterion("maintainDate not in", values, "maintaindate");
            return (Criteria) this;
        }

        public Criteria andMaintaindateBetween(Date value1, Date value2) {
            addCriterion("maintainDate between", value1, value2, "maintaindate");
            return (Criteria) this;
        }

        public Criteria andMaintaindateNotBetween(Date value1, Date value2) {
            addCriterion("maintainDate not between", value1, value2, "maintaindate");
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