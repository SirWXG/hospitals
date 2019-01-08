package com.bank.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DepositExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepositExample() {
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

        public Criteria andDepositIdIsNull() {
            addCriterion("DEPOSIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepositIdIsNotNull() {
            addCriterion("DEPOSIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepositIdEqualTo(Integer value) {
            addCriterion("DEPOSIT_ID =", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdNotEqualTo(Integer value) {
            addCriterion("DEPOSIT_ID <>", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdGreaterThan(Integer value) {
            addCriterion("DEPOSIT_ID >", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPOSIT_ID >=", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdLessThan(Integer value) {
            addCriterion("DEPOSIT_ID <", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdLessThanOrEqualTo(Integer value) {
            addCriterion("DEPOSIT_ID <=", value, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdIn(List<Integer> values) {
            addCriterion("DEPOSIT_ID in", values, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdNotIn(List<Integer> values) {
            addCriterion("DEPOSIT_ID not in", values, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdBetween(Integer value1, Integer value2) {
            addCriterion("DEPOSIT_ID between", value1, value2, "depositId");
            return (Criteria) this;
        }

        public Criteria andDepositIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPOSIT_ID not between", value1, value2, "depositId");
            return (Criteria) this;
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

        public Criteria andDepositAmountIsNull() {
            addCriterion("DEPOSIT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNotNull() {
            addCriterion("DEPOSIT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountEqualTo(Float value) {
            addCriterion("DEPOSIT_AMOUNT =", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotEqualTo(Float value) {
            addCriterion("DEPOSIT_AMOUNT <>", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThan(Float value) {
            addCriterion("DEPOSIT_AMOUNT >", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("DEPOSIT_AMOUNT >=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThan(Float value) {
            addCriterion("DEPOSIT_AMOUNT <", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThanOrEqualTo(Float value) {
            addCriterion("DEPOSIT_AMOUNT <=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIn(List<Float> values) {
            addCriterion("DEPOSIT_AMOUNT in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotIn(List<Float> values) {
            addCriterion("DEPOSIT_AMOUNT not in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountBetween(Float value1, Float value2) {
            addCriterion("DEPOSIT_AMOUNT between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotBetween(Float value1, Float value2) {
            addCriterion("DEPOSIT_AMOUNT not between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositTermIsNull() {
            addCriterion("DEPOSIT_TERM is null");
            return (Criteria) this;
        }

        public Criteria andDepositTermIsNotNull() {
            addCriterion("DEPOSIT_TERM is not null");
            return (Criteria) this;
        }

        public Criteria andDepositTermEqualTo(Integer value) {
            addCriterion("DEPOSIT_TERM =", value, "depositTerm");
            return (Criteria) this;
        }

        public Criteria andDepositTermNotEqualTo(Integer value) {
            addCriterion("DEPOSIT_TERM <>", value, "depositTerm");
            return (Criteria) this;
        }

        public Criteria andDepositTermGreaterThan(Integer value) {
            addCriterion("DEPOSIT_TERM >", value, "depositTerm");
            return (Criteria) this;
        }

        public Criteria andDepositTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPOSIT_TERM >=", value, "depositTerm");
            return (Criteria) this;
        }

        public Criteria andDepositTermLessThan(Integer value) {
            addCriterion("DEPOSIT_TERM <", value, "depositTerm");
            return (Criteria) this;
        }

        public Criteria andDepositTermLessThanOrEqualTo(Integer value) {
            addCriterion("DEPOSIT_TERM <=", value, "depositTerm");
            return (Criteria) this;
        }

        public Criteria andDepositTermIn(List<Integer> values) {
            addCriterion("DEPOSIT_TERM in", values, "depositTerm");
            return (Criteria) this;
        }

        public Criteria andDepositTermNotIn(List<Integer> values) {
            addCriterion("DEPOSIT_TERM not in", values, "depositTerm");
            return (Criteria) this;
        }

        public Criteria andDepositTermBetween(Integer value1, Integer value2) {
            addCriterion("DEPOSIT_TERM between", value1, value2, "depositTerm");
            return (Criteria) this;
        }

        public Criteria andDepositTermNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPOSIT_TERM not between", value1, value2, "depositTerm");
            return (Criteria) this;
        }

        public Criteria andDepositRateIsNull() {
            addCriterion("DEPOSIT_RATE is null");
            return (Criteria) this;
        }

        public Criteria andDepositRateIsNotNull() {
            addCriterion("DEPOSIT_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andDepositRateEqualTo(Float value) {
            addCriterion("DEPOSIT_RATE =", value, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateNotEqualTo(Float value) {
            addCriterion("DEPOSIT_RATE <>", value, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateGreaterThan(Float value) {
            addCriterion("DEPOSIT_RATE >", value, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateGreaterThanOrEqualTo(Float value) {
            addCriterion("DEPOSIT_RATE >=", value, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateLessThan(Float value) {
            addCriterion("DEPOSIT_RATE <", value, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateLessThanOrEqualTo(Float value) {
            addCriterion("DEPOSIT_RATE <=", value, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateIn(List<Float> values) {
            addCriterion("DEPOSIT_RATE in", values, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateNotIn(List<Float> values) {
            addCriterion("DEPOSIT_RATE not in", values, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateBetween(Float value1, Float value2) {
            addCriterion("DEPOSIT_RATE between", value1, value2, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositRateNotBetween(Float value1, Float value2) {
            addCriterion("DEPOSIT_RATE not between", value1, value2, "depositRate");
            return (Criteria) this;
        }

        public Criteria andDepositDateIsNull() {
            addCriterion("DEPOSIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDepositDateIsNotNull() {
            addCriterion("DEPOSIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDepositDateEqualTo(Date value) {
            addCriterionForJDBCDate("DEPOSIT_DATE =", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DEPOSIT_DATE <>", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateGreaterThan(Date value) {
            addCriterionForJDBCDate("DEPOSIT_DATE >", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEPOSIT_DATE >=", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateLessThan(Date value) {
            addCriterionForJDBCDate("DEPOSIT_DATE <", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEPOSIT_DATE <=", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateIn(List<Date> values) {
            addCriterionForJDBCDate("DEPOSIT_DATE in", values, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DEPOSIT_DATE not in", values, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEPOSIT_DATE between", value1, value2, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEPOSIT_DATE not between", value1, value2, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositBankIdIsNull() {
            addCriterion("DEPOSIT_BANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepositBankIdIsNotNull() {
            addCriterion("DEPOSIT_BANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepositBankIdEqualTo(Integer value) {
            addCriterion("DEPOSIT_BANK_ID =", value, "depositBankId");
            return (Criteria) this;
        }

        public Criteria andDepositBankIdNotEqualTo(Integer value) {
            addCriterion("DEPOSIT_BANK_ID <>", value, "depositBankId");
            return (Criteria) this;
        }

        public Criteria andDepositBankIdGreaterThan(Integer value) {
            addCriterion("DEPOSIT_BANK_ID >", value, "depositBankId");
            return (Criteria) this;
        }

        public Criteria andDepositBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPOSIT_BANK_ID >=", value, "depositBankId");
            return (Criteria) this;
        }

        public Criteria andDepositBankIdLessThan(Integer value) {
            addCriterion("DEPOSIT_BANK_ID <", value, "depositBankId");
            return (Criteria) this;
        }

        public Criteria andDepositBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("DEPOSIT_BANK_ID <=", value, "depositBankId");
            return (Criteria) this;
        }

        public Criteria andDepositBankIdIn(List<Integer> values) {
            addCriterion("DEPOSIT_BANK_ID in", values, "depositBankId");
            return (Criteria) this;
        }

        public Criteria andDepositBankIdNotIn(List<Integer> values) {
            addCriterion("DEPOSIT_BANK_ID not in", values, "depositBankId");
            return (Criteria) this;
        }

        public Criteria andDepositBankIdBetween(Integer value1, Integer value2) {
            addCriterion("DEPOSIT_BANK_ID between", value1, value2, "depositBankId");
            return (Criteria) this;
        }

        public Criteria andDepositBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPOSIT_BANK_ID not between", value1, value2, "depositBankId");
            return (Criteria) this;
        }

        public Criteria andDepositOtherIsNull() {
            addCriterion("DEPOSIT_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andDepositOtherIsNotNull() {
            addCriterion("DEPOSIT_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andDepositOtherEqualTo(String value) {
            addCriterion("DEPOSIT_OTHER =", value, "depositOther");
            return (Criteria) this;
        }

        public Criteria andDepositOtherNotEqualTo(String value) {
            addCriterion("DEPOSIT_OTHER <>", value, "depositOther");
            return (Criteria) this;
        }

        public Criteria andDepositOtherGreaterThan(String value) {
            addCriterion("DEPOSIT_OTHER >", value, "depositOther");
            return (Criteria) this;
        }

        public Criteria andDepositOtherGreaterThanOrEqualTo(String value) {
            addCriterion("DEPOSIT_OTHER >=", value, "depositOther");
            return (Criteria) this;
        }

        public Criteria andDepositOtherLessThan(String value) {
            addCriterion("DEPOSIT_OTHER <", value, "depositOther");
            return (Criteria) this;
        }

        public Criteria andDepositOtherLessThanOrEqualTo(String value) {
            addCriterion("DEPOSIT_OTHER <=", value, "depositOther");
            return (Criteria) this;
        }

        public Criteria andDepositOtherLike(String value) {
            addCriterion("DEPOSIT_OTHER like", value, "depositOther");
            return (Criteria) this;
        }

        public Criteria andDepositOtherNotLike(String value) {
            addCriterion("DEPOSIT_OTHER not like", value, "depositOther");
            return (Criteria) this;
        }

        public Criteria andDepositOtherIn(List<String> values) {
            addCriterion("DEPOSIT_OTHER in", values, "depositOther");
            return (Criteria) this;
        }

        public Criteria andDepositOtherNotIn(List<String> values) {
            addCriterion("DEPOSIT_OTHER not in", values, "depositOther");
            return (Criteria) this;
        }

        public Criteria andDepositOtherBetween(String value1, String value2) {
            addCriterion("DEPOSIT_OTHER between", value1, value2, "depositOther");
            return (Criteria) this;
        }

        public Criteria andDepositOtherNotBetween(String value1, String value2) {
            addCriterion("DEPOSIT_OTHER not between", value1, value2, "depositOther");
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