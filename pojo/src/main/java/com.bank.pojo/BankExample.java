package com.bank.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankExample() {
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

        public Criteria andBankIdIsNull() {
            addCriterion("BANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("BANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(Integer value) {
            addCriterion("BANK_ID =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(Integer value) {
            addCriterion("BANK_ID <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(Integer value) {
            addCriterion("BANK_ID >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANK_ID >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(Integer value) {
            addCriterion("BANK_ID <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("BANK_ID <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<Integer> values) {
            addCriterion("BANK_ID in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<Integer> values) {
            addCriterion("BANK_ID not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(Integer value1, Integer value2) {
            addCriterion("BANK_ID between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BANK_ID not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNull() {
            addCriterion("BANK_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNotNull() {
            addCriterion("BANK_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBankAddressEqualTo(String value) {
            addCriterion("BANK_ADDRESS =", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotEqualTo(String value) {
            addCriterion("BANK_ADDRESS <>", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThan(String value) {
            addCriterion("BANK_ADDRESS >", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ADDRESS >=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThan(String value) {
            addCriterion("BANK_ADDRESS <", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThanOrEqualTo(String value) {
            addCriterion("BANK_ADDRESS <=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLike(String value) {
            addCriterion("BANK_ADDRESS like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotLike(String value) {
            addCriterion("BANK_ADDRESS not like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressIn(List<String> values) {
            addCriterion("BANK_ADDRESS in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotIn(List<String> values) {
            addCriterion("BANK_ADDRESS not in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressBetween(String value1, String value2) {
            addCriterion("BANK_ADDRESS between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotBetween(String value1, String value2) {
            addCriterion("BANK_ADDRESS not between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankTelIsNull() {
            addCriterion("BANK_TEL is null");
            return (Criteria) this;
        }

        public Criteria andBankTelIsNotNull() {
            addCriterion("BANK_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andBankTelEqualTo(String value) {
            addCriterion("BANK_TEL =", value, "bankTel");
            return (Criteria) this;
        }

        public Criteria andBankTelNotEqualTo(String value) {
            addCriterion("BANK_TEL <>", value, "bankTel");
            return (Criteria) this;
        }

        public Criteria andBankTelGreaterThan(String value) {
            addCriterion("BANK_TEL >", value, "bankTel");
            return (Criteria) this;
        }

        public Criteria andBankTelGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_TEL >=", value, "bankTel");
            return (Criteria) this;
        }

        public Criteria andBankTelLessThan(String value) {
            addCriterion("BANK_TEL <", value, "bankTel");
            return (Criteria) this;
        }

        public Criteria andBankTelLessThanOrEqualTo(String value) {
            addCriterion("BANK_TEL <=", value, "bankTel");
            return (Criteria) this;
        }

        public Criteria andBankTelLike(String value) {
            addCriterion("BANK_TEL like", value, "bankTel");
            return (Criteria) this;
        }

        public Criteria andBankTelNotLike(String value) {
            addCriterion("BANK_TEL not like", value, "bankTel");
            return (Criteria) this;
        }

        public Criteria andBankTelIn(List<String> values) {
            addCriterion("BANK_TEL in", values, "bankTel");
            return (Criteria) this;
        }

        public Criteria andBankTelNotIn(List<String> values) {
            addCriterion("BANK_TEL not in", values, "bankTel");
            return (Criteria) this;
        }

        public Criteria andBankTelBetween(String value1, String value2) {
            addCriterion("BANK_TEL between", value1, value2, "bankTel");
            return (Criteria) this;
        }

        public Criteria andBankTelNotBetween(String value1, String value2) {
            addCriterion("BANK_TEL not between", value1, value2, "bankTel");
            return (Criteria) this;
        }

        public Criteria andBankLoanLimitIsNull() {
            addCriterion("BANK_LOAN_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andBankLoanLimitIsNotNull() {
            addCriterion("BANK_LOAN_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andBankLoanLimitEqualTo(Double value) {
            addCriterion("BANK_LOAN_LIMIT =", value, "bankLoanLimit");
            return (Criteria) this;
        }

        public Criteria andBankLoanLimitNotEqualTo(Double value) {
            addCriterion("BANK_LOAN_LIMIT <>", value, "bankLoanLimit");
            return (Criteria) this;
        }

        public Criteria andBankLoanLimitGreaterThan(Double value) {
            addCriterion("BANK_LOAN_LIMIT >", value, "bankLoanLimit");
            return (Criteria) this;
        }

        public Criteria andBankLoanLimitGreaterThanOrEqualTo(Double value) {
            addCriterion("BANK_LOAN_LIMIT >=", value, "bankLoanLimit");
            return (Criteria) this;
        }

        public Criteria andBankLoanLimitLessThan(Double value) {
            addCriterion("BANK_LOAN_LIMIT <", value, "bankLoanLimit");
            return (Criteria) this;
        }

        public Criteria andBankLoanLimitLessThanOrEqualTo(Double value) {
            addCriterion("BANK_LOAN_LIMIT <=", value, "bankLoanLimit");
            return (Criteria) this;
        }

        public Criteria andBankLoanLimitIn(List<Double> values) {
            addCriterion("BANK_LOAN_LIMIT in", values, "bankLoanLimit");
            return (Criteria) this;
        }

        public Criteria andBankLoanLimitNotIn(List<Double> values) {
            addCriterion("BANK_LOAN_LIMIT not in", values, "bankLoanLimit");
            return (Criteria) this;
        }

        public Criteria andBankLoanLimitBetween(Double value1, Double value2) {
            addCriterion("BANK_LOAN_LIMIT between", value1, value2, "bankLoanLimit");
            return (Criteria) this;
        }

        public Criteria andBankLoanLimitNotBetween(Double value1, Double value2) {
            addCriterion("BANK_LOAN_LIMIT not between", value1, value2, "bankLoanLimit");
            return (Criteria) this;
        }

        public Criteria andBankOther1IsNull() {
            addCriterion("BANK_OTHER1 is null");
            return (Criteria) this;
        }

        public Criteria andBankOther1IsNotNull() {
            addCriterion("BANK_OTHER1 is not null");
            return (Criteria) this;
        }

        public Criteria andBankOther1EqualTo(String value) {
            addCriterion("BANK_OTHER1 =", value, "bankOther1");
            return (Criteria) this;
        }

        public Criteria andBankOther1NotEqualTo(String value) {
            addCriterion("BANK_OTHER1 <>", value, "bankOther1");
            return (Criteria) this;
        }

        public Criteria andBankOther1GreaterThan(String value) {
            addCriterion("BANK_OTHER1 >", value, "bankOther1");
            return (Criteria) this;
        }

        public Criteria andBankOther1GreaterThanOrEqualTo(String value) {
            addCriterion("BANK_OTHER1 >=", value, "bankOther1");
            return (Criteria) this;
        }

        public Criteria andBankOther1LessThan(String value) {
            addCriterion("BANK_OTHER1 <", value, "bankOther1");
            return (Criteria) this;
        }

        public Criteria andBankOther1LessThanOrEqualTo(String value) {
            addCriterion("BANK_OTHER1 <=", value, "bankOther1");
            return (Criteria) this;
        }

        public Criteria andBankOther1Like(String value) {
            addCriterion("BANK_OTHER1 like", value, "bankOther1");
            return (Criteria) this;
        }

        public Criteria andBankOther1NotLike(String value) {
            addCriterion("BANK_OTHER1 not like", value, "bankOther1");
            return (Criteria) this;
        }

        public Criteria andBankOther1In(List<String> values) {
            addCriterion("BANK_OTHER1 in", values, "bankOther1");
            return (Criteria) this;
        }

        public Criteria andBankOther1NotIn(List<String> values) {
            addCriterion("BANK_OTHER1 not in", values, "bankOther1");
            return (Criteria) this;
        }

        public Criteria andBankOther1Between(String value1, String value2) {
            addCriterion("BANK_OTHER1 between", value1, value2, "bankOther1");
            return (Criteria) this;
        }

        public Criteria andBankOther1NotBetween(String value1, String value2) {
            addCriterion("BANK_OTHER1 not between", value1, value2, "bankOther1");
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