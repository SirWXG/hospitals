package com.hospital.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PatientsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientsExample() {
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

        public Criteria andPatientIdentityIsNull() {
            addCriterion("patient_identity is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityIsNotNull() {
            addCriterion("patient_identity is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityEqualTo(String value) {
            addCriterion("patient_identity =", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityNotEqualTo(String value) {
            addCriterion("patient_identity <>", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityGreaterThan(String value) {
            addCriterion("patient_identity >", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("patient_identity >=", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityLessThan(String value) {
            addCriterion("patient_identity <", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityLessThanOrEqualTo(String value) {
            addCriterion("patient_identity <=", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityLike(String value) {
            addCriterion("patient_identity like", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityNotLike(String value) {
            addCriterion("patient_identity not like", value, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityIn(List<String> values) {
            addCriterion("patient_identity in", values, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityNotIn(List<String> values) {
            addCriterion("patient_identity not in", values, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityBetween(String value1, String value2) {
            addCriterion("patient_identity between", value1, value2, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityNotBetween(String value1, String value2) {
            addCriterion("patient_identity not between", value1, value2, "patientIdentity");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("\" patient_name\" is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("\" patient_name\" is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("\" patient_name\" =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("\" patient_name\" <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("\" patient_name\" >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("\" patient_name\" >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("\" patient_name\" <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("\" patient_name\" <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("\" patient_name\" like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("\" patient_name\" not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("\" patient_name\" in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("\" patient_name\" not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("\" patient_name\" between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("\" patient_name\" not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientSexIsNull() {
            addCriterion("patient_sex is null");
            return (Criteria) this;
        }

        public Criteria andPatientSexIsNotNull() {
            addCriterion("patient_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPatientSexEqualTo(String value) {
            addCriterion("patient_sex =", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotEqualTo(String value) {
            addCriterion("patient_sex <>", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexGreaterThan(String value) {
            addCriterion("patient_sex >", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexGreaterThanOrEqualTo(String value) {
            addCriterion("patient_sex >=", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLessThan(String value) {
            addCriterion("patient_sex <", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLessThanOrEqualTo(String value) {
            addCriterion("patient_sex <=", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLike(String value) {
            addCriterion("patient_sex like", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotLike(String value) {
            addCriterion("patient_sex not like", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexIn(List<String> values) {
            addCriterion("patient_sex in", values, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotIn(List<String> values) {
            addCriterion("patient_sex not in", values, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexBetween(String value1, String value2) {
            addCriterion("patient_sex between", value1, value2, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotBetween(String value1, String value2) {
            addCriterion("patient_sex not between", value1, value2, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientEmpidIsNull() {
            addCriterion("patient_empid is null");
            return (Criteria) this;
        }

        public Criteria andPatientEmpidIsNotNull() {
            addCriterion("patient_empid is not null");
            return (Criteria) this;
        }

        public Criteria andPatientEmpidEqualTo(String value) {
            addCriterion("patient_empid =", value, "patientEmpid");
            return (Criteria) this;
        }

        public Criteria andPatientEmpidNotEqualTo(String value) {
            addCriterion("patient_empid <>", value, "patientEmpid");
            return (Criteria) this;
        }

        public Criteria andPatientEmpidGreaterThan(String value) {
            addCriterion("patient_empid >", value, "patientEmpid");
            return (Criteria) this;
        }

        public Criteria andPatientEmpidGreaterThanOrEqualTo(String value) {
            addCriterion("patient_empid >=", value, "patientEmpid");
            return (Criteria) this;
        }

        public Criteria andPatientEmpidLessThan(String value) {
            addCriterion("patient_empid <", value, "patientEmpid");
            return (Criteria) this;
        }

        public Criteria andPatientEmpidLessThanOrEqualTo(String value) {
            addCriterion("patient_empid <=", value, "patientEmpid");
            return (Criteria) this;
        }

        public Criteria andPatientEmpidLike(String value) {
            addCriterion("patient_empid like", value, "patientEmpid");
            return (Criteria) this;
        }

        public Criteria andPatientEmpidNotLike(String value) {
            addCriterion("patient_empid not like", value, "patientEmpid");
            return (Criteria) this;
        }

        public Criteria andPatientEmpidIn(List<String> values) {
            addCriterion("patient_empid in", values, "patientEmpid");
            return (Criteria) this;
        }

        public Criteria andPatientEmpidNotIn(List<String> values) {
            addCriterion("patient_empid not in", values, "patientEmpid");
            return (Criteria) this;
        }

        public Criteria andPatientEmpidBetween(String value1, String value2) {
            addCriterion("patient_empid between", value1, value2, "patientEmpid");
            return (Criteria) this;
        }

        public Criteria andPatientEmpidNotBetween(String value1, String value2) {
            addCriterion("patient_empid not between", value1, value2, "patientEmpid");
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