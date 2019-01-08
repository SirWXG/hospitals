package com.bank.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("REAL_NAME =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("REAL_NAME <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("REAL_NAME >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_NAME >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("REAL_NAME <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("REAL_NAME <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("REAL_NAME like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("REAL_NAME not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("REAL_NAME in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("REAL_NAME not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("REAL_NAME between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("REAL_NAME not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andCustomerIdentityIsNull() {
            addCriterion("CUSTOMER_IDENTITY is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdentityIsNotNull() {
            addCriterion("CUSTOMER_IDENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdentityEqualTo(String value) {
            addCriterion("CUSTOMER_IDENTITY =", value, "customerIdentity");
            return (Criteria) this;
        }

        public Criteria andCustomerIdentityNotEqualTo(String value) {
            addCriterion("CUSTOMER_IDENTITY <>", value, "customerIdentity");
            return (Criteria) this;
        }

        public Criteria andCustomerIdentityGreaterThan(String value) {
            addCriterion("CUSTOMER_IDENTITY >", value, "customerIdentity");
            return (Criteria) this;
        }

        public Criteria andCustomerIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_IDENTITY >=", value, "customerIdentity");
            return (Criteria) this;
        }

        public Criteria andCustomerIdentityLessThan(String value) {
            addCriterion("CUSTOMER_IDENTITY <", value, "customerIdentity");
            return (Criteria) this;
        }

        public Criteria andCustomerIdentityLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_IDENTITY <=", value, "customerIdentity");
            return (Criteria) this;
        }

        public Criteria andCustomerIdentityLike(String value) {
            addCriterion("CUSTOMER_IDENTITY like", value, "customerIdentity");
            return (Criteria) this;
        }

        public Criteria andCustomerIdentityNotLike(String value) {
            addCriterion("CUSTOMER_IDENTITY not like", value, "customerIdentity");
            return (Criteria) this;
        }

        public Criteria andCustomerIdentityIn(List<String> values) {
            addCriterion("CUSTOMER_IDENTITY in", values, "customerIdentity");
            return (Criteria) this;
        }

        public Criteria andCustomerIdentityNotIn(List<String> values) {
            addCriterion("CUSTOMER_IDENTITY not in", values, "customerIdentity");
            return (Criteria) this;
        }

        public Criteria andCustomerIdentityBetween(String value1, String value2) {
            addCriterion("CUSTOMER_IDENTITY between", value1, value2, "customerIdentity");
            return (Criteria) this;
        }

        public Criteria andCustomerIdentityNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_IDENTITY not between", value1, value2, "customerIdentity");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNull() {
            addCriterion("CUSTOMER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNotNull() {
            addCriterion("CUSTOMER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS =", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS <>", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThan(String value) {
            addCriterion("CUSTOMER_ADDRESS >", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS >=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThan(String value) {
            addCriterion("CUSTOMER_ADDRESS <", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS <=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLike(String value) {
            addCriterion("CUSTOMER_ADDRESS like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotLike(String value) {
            addCriterion("CUSTOMER_ADDRESS not like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIn(List<String> values) {
            addCriterion("CUSTOMER_ADDRESS in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotIn(List<String> values) {
            addCriterion("CUSTOMER_ADDRESS not in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ADDRESS between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ADDRESS not between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("CUSTOMER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("CUSTOMER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("CUSTOMER_PHONE =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("CUSTOMER_PHONE <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("CUSTOMER_PHONE >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PHONE >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("CUSTOMER_PHONE <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PHONE <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("CUSTOMER_PHONE like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("CUSTOMER_PHONE not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("CUSTOMER_PHONE in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("CUSTOMER_PHONE not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PHONE between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PHONE not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIsNull() {
            addCriterion("CUSTOMER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIsNotNull() {
            addCriterion("CUSTOMER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordEqualTo(String value) {
            addCriterion("CUSTOMER_PASSWORD =", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotEqualTo(String value) {
            addCriterion("CUSTOMER_PASSWORD <>", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordGreaterThan(String value) {
            addCriterion("CUSTOMER_PASSWORD >", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PASSWORD >=", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLessThan(String value) {
            addCriterion("CUSTOMER_PASSWORD <", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PASSWORD <=", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLike(String value) {
            addCriterion("CUSTOMER_PASSWORD like", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotLike(String value) {
            addCriterion("CUSTOMER_PASSWORD not like", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIn(List<String> values) {
            addCriterion("CUSTOMER_PASSWORD in", values, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotIn(List<String> values) {
            addCriterion("CUSTOMER_PASSWORD not in", values, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PASSWORD between", value1, value2, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PASSWORD not between", value1, value2, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNull() {
            addCriterion("CUSTOMER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNotNull() {
            addCriterion("CUSTOMER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexEqualTo(String value) {
            addCriterion("CUSTOMER_SEX =", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotEqualTo(String value) {
            addCriterion("CUSTOMER_SEX <>", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThan(String value) {
            addCriterion("CUSTOMER_SEX >", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_SEX >=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThan(String value) {
            addCriterion("CUSTOMER_SEX <", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_SEX <=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLike(String value) {
            addCriterion("CUSTOMER_SEX like", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotLike(String value) {
            addCriterion("CUSTOMER_SEX not like", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIn(List<String> values) {
            addCriterion("CUSTOMER_SEX in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotIn(List<String> values) {
            addCriterion("CUSTOMER_SEX not in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexBetween(String value1, String value2) {
            addCriterion("CUSTOMER_SEX between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_SEX not between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthIsNull() {
            addCriterion("CUSTOMER_BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthIsNotNull() {
            addCriterion("CUSTOMER_BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthEqualTo(Date value) {
            addCriterionForJDBCDate("CUSTOMER_BIRTH =", value, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("CUSTOMER_BIRTH <>", value, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("CUSTOMER_BIRTH >", value, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CUSTOMER_BIRTH >=", value, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthLessThan(Date value) {
            addCriterionForJDBCDate("CUSTOMER_BIRTH <", value, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CUSTOMER_BIRTH <=", value, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthIn(List<Date> values) {
            addCriterionForJDBCDate("CUSTOMER_BIRTH in", values, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("CUSTOMER_BIRTH not in", values, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CUSTOMER_BIRTH between", value1, value2, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CUSTOMER_BIRTH not between", value1, value2, "customerBirth");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIsNull() {
            addCriterion("CUSTOMER_CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIsNotNull() {
            addCriterion("CUSTOMER_CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditEqualTo(Integer value) {
            addCriterion("CUSTOMER_CREDIT =", value, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditNotEqualTo(Integer value) {
            addCriterion("CUSTOMER_CREDIT <>", value, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditGreaterThan(Integer value) {
            addCriterion("CUSTOMER_CREDIT >", value, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_CREDIT >=", value, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditLessThan(Integer value) {
            addCriterion("CUSTOMER_CREDIT <", value, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_CREDIT <=", value, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditIn(List<Integer> values) {
            addCriterion("CUSTOMER_CREDIT in", values, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditNotIn(List<Integer> values) {
            addCriterion("CUSTOMER_CREDIT not in", values, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_CREDIT between", value1, value2, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_CREDIT not between", value1, value2, "customerCredit");
            return (Criteria) this;
        }

        public Criteria andCustomerOther1IsNull() {
            addCriterion("CUSTOMER_OTHER1 is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOther1IsNotNull() {
            addCriterion("CUSTOMER_OTHER1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOther1EqualTo(String value) {
            addCriterion("CUSTOMER_OTHER1 =", value, "customerOther1");
            return (Criteria) this;
        }

        public Criteria andCustomerOther1NotEqualTo(String value) {
            addCriterion("CUSTOMER_OTHER1 <>", value, "customerOther1");
            return (Criteria) this;
        }

        public Criteria andCustomerOther1GreaterThan(String value) {
            addCriterion("CUSTOMER_OTHER1 >", value, "customerOther1");
            return (Criteria) this;
        }

        public Criteria andCustomerOther1GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_OTHER1 >=", value, "customerOther1");
            return (Criteria) this;
        }

        public Criteria andCustomerOther1LessThan(String value) {
            addCriterion("CUSTOMER_OTHER1 <", value, "customerOther1");
            return (Criteria) this;
        }

        public Criteria andCustomerOther1LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_OTHER1 <=", value, "customerOther1");
            return (Criteria) this;
        }

        public Criteria andCustomerOther1Like(String value) {
            addCriterion("CUSTOMER_OTHER1 like", value, "customerOther1");
            return (Criteria) this;
        }

        public Criteria andCustomerOther1NotLike(String value) {
            addCriterion("CUSTOMER_OTHER1 not like", value, "customerOther1");
            return (Criteria) this;
        }

        public Criteria andCustomerOther1In(List<String> values) {
            addCriterion("CUSTOMER_OTHER1 in", values, "customerOther1");
            return (Criteria) this;
        }

        public Criteria andCustomerOther1NotIn(List<String> values) {
            addCriterion("CUSTOMER_OTHER1 not in", values, "customerOther1");
            return (Criteria) this;
        }

        public Criteria andCustomerOther1Between(String value1, String value2) {
            addCriterion("CUSTOMER_OTHER1 between", value1, value2, "customerOther1");
            return (Criteria) this;
        }

        public Criteria andCustomerOther1NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_OTHER1 not between", value1, value2, "customerOther1");
            return (Criteria) this;
        }

        public Criteria andCustomerOther2IsNull() {
            addCriterion("CUSTOMER_OTHER2 is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOther2IsNotNull() {
            addCriterion("CUSTOMER_OTHER2 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOther2EqualTo(String value) {
            addCriterion("CUSTOMER_OTHER2 =", value, "customerOther2");
            return (Criteria) this;
        }

        public Criteria andCustomerOther2NotEqualTo(String value) {
            addCriterion("CUSTOMER_OTHER2 <>", value, "customerOther2");
            return (Criteria) this;
        }

        public Criteria andCustomerOther2GreaterThan(String value) {
            addCriterion("CUSTOMER_OTHER2 >", value, "customerOther2");
            return (Criteria) this;
        }

        public Criteria andCustomerOther2GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_OTHER2 >=", value, "customerOther2");
            return (Criteria) this;
        }

        public Criteria andCustomerOther2LessThan(String value) {
            addCriterion("CUSTOMER_OTHER2 <", value, "customerOther2");
            return (Criteria) this;
        }

        public Criteria andCustomerOther2LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_OTHER2 <=", value, "customerOther2");
            return (Criteria) this;
        }

        public Criteria andCustomerOther2Like(String value) {
            addCriterion("CUSTOMER_OTHER2 like", value, "customerOther2");
            return (Criteria) this;
        }

        public Criteria andCustomerOther2NotLike(String value) {
            addCriterion("CUSTOMER_OTHER2 not like", value, "customerOther2");
            return (Criteria) this;
        }

        public Criteria andCustomerOther2In(List<String> values) {
            addCriterion("CUSTOMER_OTHER2 in", values, "customerOther2");
            return (Criteria) this;
        }

        public Criteria andCustomerOther2NotIn(List<String> values) {
            addCriterion("CUSTOMER_OTHER2 not in", values, "customerOther2");
            return (Criteria) this;
        }

        public Criteria andCustomerOther2Between(String value1, String value2) {
            addCriterion("CUSTOMER_OTHER2 between", value1, value2, "customerOther2");
            return (Criteria) this;
        }

        public Criteria andCustomerOther2NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_OTHER2 not between", value1, value2, "customerOther2");
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