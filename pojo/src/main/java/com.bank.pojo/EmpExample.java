package com.bank.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("EMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("EMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("EMP_ID =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("EMP_ID <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("EMP_ID >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMP_ID >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("EMP_ID <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("EMP_ID <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("EMP_ID in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("EMP_ID not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("EMP_ID between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EMP_ID not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("EMP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("EMP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("EMP_NAME =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("EMP_NAME <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("EMP_NAME >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_NAME >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("EMP_NAME <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("EMP_NAME <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("EMP_NAME like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("EMP_NAME not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("EMP_NAME in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("EMP_NAME not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("EMP_NAME between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("EMP_NAME not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIsNull() {
            addCriterion("EMP_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIsNotNull() {
            addCriterion("EMP_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordEqualTo(String value) {
            addCriterion("EMP_PASSWORD =", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotEqualTo(String value) {
            addCriterion("EMP_PASSWORD <>", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordGreaterThan(String value) {
            addCriterion("EMP_PASSWORD >", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_PASSWORD >=", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLessThan(String value) {
            addCriterion("EMP_PASSWORD <", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLessThanOrEqualTo(String value) {
            addCriterion("EMP_PASSWORD <=", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLike(String value) {
            addCriterion("EMP_PASSWORD like", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotLike(String value) {
            addCriterion("EMP_PASSWORD not like", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIn(List<String> values) {
            addCriterion("EMP_PASSWORD in", values, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotIn(List<String> values) {
            addCriterion("EMP_PASSWORD not in", values, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordBetween(String value1, String value2) {
            addCriterion("EMP_PASSWORD between", value1, value2, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotBetween(String value1, String value2) {
            addCriterion("EMP_PASSWORD not between", value1, value2, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNull() {
            addCriterion("EMP_SEX is null");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNotNull() {
            addCriterion("EMP_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSexEqualTo(String value) {
            addCriterion("EMP_SEX =", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotEqualTo(String value) {
            addCriterion("EMP_SEX <>", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThan(String value) {
            addCriterion("EMP_SEX >", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_SEX >=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThan(String value) {
            addCriterion("EMP_SEX <", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThanOrEqualTo(String value) {
            addCriterion("EMP_SEX <=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLike(String value) {
            addCriterion("EMP_SEX like", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotLike(String value) {
            addCriterion("EMP_SEX not like", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexIn(List<String> values) {
            addCriterion("EMP_SEX in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotIn(List<String> values) {
            addCriterion("EMP_SEX not in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexBetween(String value1, String value2) {
            addCriterion("EMP_SEX between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotBetween(String value1, String value2) {
            addCriterion("EMP_SEX not between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpBirthIsNull() {
            addCriterion("EMP_BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andEmpBirthIsNotNull() {
            addCriterion("EMP_BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andEmpBirthEqualTo(Date value) {
            addCriterionForJDBCDate("EMP_BIRTH =", value, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("EMP_BIRTH <>", value, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("EMP_BIRTH >", value, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EMP_BIRTH >=", value, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthLessThan(Date value) {
            addCriterionForJDBCDate("EMP_BIRTH <", value, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EMP_BIRTH <=", value, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthIn(List<Date> values) {
            addCriterionForJDBCDate("EMP_BIRTH in", values, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("EMP_BIRTH not in", values, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EMP_BIRTH between", value1, value2, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EMP_BIRTH not between", value1, value2, "empBirth");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateIsNull() {
            addCriterion("EMP_HIREDATE is null");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateIsNotNull() {
            addCriterion("EMP_HIREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateEqualTo(Date value) {
            addCriterionForJDBCDate("EMP_HIREDATE =", value, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EMP_HIREDATE <>", value, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateGreaterThan(Date value) {
            addCriterionForJDBCDate("EMP_HIREDATE >", value, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EMP_HIREDATE >=", value, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateLessThan(Date value) {
            addCriterionForJDBCDate("EMP_HIREDATE <", value, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EMP_HIREDATE <=", value, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateIn(List<Date> values) {
            addCriterionForJDBCDate("EMP_HIREDATE in", values, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EMP_HIREDATE not in", values, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EMP_HIREDATE between", value1, value2, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpHiredateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EMP_HIREDATE not between", value1, value2, "empHiredate");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityIsNull() {
            addCriterion("EMP_IDENTITY is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityIsNotNull() {
            addCriterion("EMP_IDENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityEqualTo(String value) {
            addCriterion("EMP_IDENTITY =", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNotEqualTo(String value) {
            addCriterion("EMP_IDENTITY <>", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityGreaterThan(String value) {
            addCriterion("EMP_IDENTITY >", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_IDENTITY >=", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityLessThan(String value) {
            addCriterion("EMP_IDENTITY <", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityLessThanOrEqualTo(String value) {
            addCriterion("EMP_IDENTITY <=", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityLike(String value) {
            addCriterion("EMP_IDENTITY like", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNotLike(String value) {
            addCriterion("EMP_IDENTITY not like", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityIn(List<String> values) {
            addCriterion("EMP_IDENTITY in", values, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNotIn(List<String> values) {
            addCriterion("EMP_IDENTITY not in", values, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityBetween(String value1, String value2) {
            addCriterion("EMP_IDENTITY between", value1, value2, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNotBetween(String value1, String value2) {
            addCriterion("EMP_IDENTITY not between", value1, value2, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIsNull() {
            addCriterion("EMP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIsNotNull() {
            addCriterion("EMP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andEmpAddressEqualTo(String value) {
            addCriterion("EMP_ADDRESS =", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotEqualTo(String value) {
            addCriterion("EMP_ADDRESS <>", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressGreaterThan(String value) {
            addCriterion("EMP_ADDRESS >", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_ADDRESS >=", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLessThan(String value) {
            addCriterion("EMP_ADDRESS <", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLessThanOrEqualTo(String value) {
            addCriterion("EMP_ADDRESS <=", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLike(String value) {
            addCriterion("EMP_ADDRESS like", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotLike(String value) {
            addCriterion("EMP_ADDRESS not like", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIn(List<String> values) {
            addCriterion("EMP_ADDRESS in", values, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotIn(List<String> values) {
            addCriterion("EMP_ADDRESS not in", values, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressBetween(String value1, String value2) {
            addCriterion("EMP_ADDRESS between", value1, value2, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotBetween(String value1, String value2) {
            addCriterion("EMP_ADDRESS not between", value1, value2, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNull() {
            addCriterion("EMP_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNotNull() {
            addCriterion("EMP_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneEqualTo(String value) {
            addCriterion("EMP_PHONE =", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotEqualTo(String value) {
            addCriterion("EMP_PHONE <>", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThan(String value) {
            addCriterion("EMP_PHONE >", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_PHONE >=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThan(String value) {
            addCriterion("EMP_PHONE <", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThanOrEqualTo(String value) {
            addCriterion("EMP_PHONE <=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLike(String value) {
            addCriterion("EMP_PHONE like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotLike(String value) {
            addCriterion("EMP_PHONE not like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIn(List<String> values) {
            addCriterion("EMP_PHONE in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotIn(List<String> values) {
            addCriterion("EMP_PHONE not in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneBetween(String value1, String value2) {
            addCriterion("EMP_PHONE between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotBetween(String value1, String value2) {
            addCriterion("EMP_PHONE not between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIsNull() {
            addCriterion("EMP_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIsNotNull() {
            addCriterion("EMP_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmpEmailEqualTo(String value) {
            addCriterion("EMP_EMAIL =", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotEqualTo(String value) {
            addCriterion("EMP_EMAIL <>", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailGreaterThan(String value) {
            addCriterion("EMP_EMAIL >", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_EMAIL >=", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLessThan(String value) {
            addCriterion("EMP_EMAIL <", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLessThanOrEqualTo(String value) {
            addCriterion("EMP_EMAIL <=", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLike(String value) {
            addCriterion("EMP_EMAIL like", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotLike(String value) {
            addCriterion("EMP_EMAIL not like", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIn(List<String> values) {
            addCriterion("EMP_EMAIL in", values, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotIn(List<String> values) {
            addCriterion("EMP_EMAIL not in", values, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailBetween(String value1, String value2) {
            addCriterion("EMP_EMAIL between", value1, value2, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotBetween(String value1, String value2) {
            addCriterion("EMP_EMAIL not between", value1, value2, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryIsNull() {
            addCriterion("EMP_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryIsNotNull() {
            addCriterion("EMP_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryEqualTo(Float value) {
            addCriterion("EMP_SALARY =", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryNotEqualTo(Float value) {
            addCriterion("EMP_SALARY <>", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryGreaterThan(Float value) {
            addCriterion("EMP_SALARY >", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryGreaterThanOrEqualTo(Float value) {
            addCriterion("EMP_SALARY >=", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryLessThan(Float value) {
            addCriterion("EMP_SALARY <", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryLessThanOrEqualTo(Float value) {
            addCriterion("EMP_SALARY <=", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryIn(List<Float> values) {
            addCriterion("EMP_SALARY in", values, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryNotIn(List<Float> values) {
            addCriterion("EMP_SALARY not in", values, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryBetween(Float value1, Float value2) {
            addCriterion("EMP_SALARY between", value1, value2, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryNotBetween(Float value1, Float value2) {
            addCriterion("EMP_SALARY not between", value1, value2, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpBankIdIsNull() {
            addCriterion("EMP_BANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmpBankIdIsNotNull() {
            addCriterion("EMP_BANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpBankIdEqualTo(Integer value) {
            addCriterion("EMP_BANK_ID =", value, "empBankId");
            return (Criteria) this;
        }

        public Criteria andEmpBankIdNotEqualTo(Integer value) {
            addCriterion("EMP_BANK_ID <>", value, "empBankId");
            return (Criteria) this;
        }

        public Criteria andEmpBankIdGreaterThan(Integer value) {
            addCriterion("EMP_BANK_ID >", value, "empBankId");
            return (Criteria) this;
        }

        public Criteria andEmpBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMP_BANK_ID >=", value, "empBankId");
            return (Criteria) this;
        }

        public Criteria andEmpBankIdLessThan(Integer value) {
            addCriterion("EMP_BANK_ID <", value, "empBankId");
            return (Criteria) this;
        }

        public Criteria andEmpBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("EMP_BANK_ID <=", value, "empBankId");
            return (Criteria) this;
        }

        public Criteria andEmpBankIdIn(List<Integer> values) {
            addCriterion("EMP_BANK_ID in", values, "empBankId");
            return (Criteria) this;
        }

        public Criteria andEmpBankIdNotIn(List<Integer> values) {
            addCriterion("EMP_BANK_ID not in", values, "empBankId");
            return (Criteria) this;
        }

        public Criteria andEmpBankIdBetween(Integer value1, Integer value2) {
            addCriterion("EMP_BANK_ID between", value1, value2, "empBankId");
            return (Criteria) this;
        }

        public Criteria andEmpBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EMP_BANK_ID not between", value1, value2, "empBankId");
            return (Criteria) this;
        }

        public Criteria andEmpOther1IsNull() {
            addCriterion("EMP_OTHER1 is null");
            return (Criteria) this;
        }

        public Criteria andEmpOther1IsNotNull() {
            addCriterion("EMP_OTHER1 is not null");
            return (Criteria) this;
        }

        public Criteria andEmpOther1EqualTo(String value) {
            addCriterion("EMP_OTHER1 =", value, "empOther1");
            return (Criteria) this;
        }

        public Criteria andEmpOther1NotEqualTo(String value) {
            addCriterion("EMP_OTHER1 <>", value, "empOther1");
            return (Criteria) this;
        }

        public Criteria andEmpOther1GreaterThan(String value) {
            addCriterion("EMP_OTHER1 >", value, "empOther1");
            return (Criteria) this;
        }

        public Criteria andEmpOther1GreaterThanOrEqualTo(String value) {
            addCriterion("EMP_OTHER1 >=", value, "empOther1");
            return (Criteria) this;
        }

        public Criteria andEmpOther1LessThan(String value) {
            addCriterion("EMP_OTHER1 <", value, "empOther1");
            return (Criteria) this;
        }

        public Criteria andEmpOther1LessThanOrEqualTo(String value) {
            addCriterion("EMP_OTHER1 <=", value, "empOther1");
            return (Criteria) this;
        }

        public Criteria andEmpOther1Like(String value) {
            addCriterion("EMP_OTHER1 like", value, "empOther1");
            return (Criteria) this;
        }

        public Criteria andEmpOther1NotLike(String value) {
            addCriterion("EMP_OTHER1 not like", value, "empOther1");
            return (Criteria) this;
        }

        public Criteria andEmpOther1In(List<String> values) {
            addCriterion("EMP_OTHER1 in", values, "empOther1");
            return (Criteria) this;
        }

        public Criteria andEmpOther1NotIn(List<String> values) {
            addCriterion("EMP_OTHER1 not in", values, "empOther1");
            return (Criteria) this;
        }

        public Criteria andEmpOther1Between(String value1, String value2) {
            addCriterion("EMP_OTHER1 between", value1, value2, "empOther1");
            return (Criteria) this;
        }

        public Criteria andEmpOther1NotBetween(String value1, String value2) {
            addCriterion("EMP_OTHER1 not between", value1, value2, "empOther1");
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