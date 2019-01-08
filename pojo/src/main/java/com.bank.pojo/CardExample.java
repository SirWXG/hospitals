package com.bank.pojo;

import java.util.ArrayList;
import java.util.List;

public class CardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CardExample() {
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

        public Criteria andCardIdIsNull() {
            addCriterion("CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Integer value) {
            addCriterion("CARD_ID =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Integer value) {
            addCriterion("CARD_ID <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Integer value) {
            addCriterion("CARD_ID >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CARD_ID >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Integer value) {
            addCriterion("CARD_ID <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("CARD_ID <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Integer> values) {
            addCriterion("CARD_ID in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Integer> values) {
            addCriterion("CARD_ID not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Integer value1, Integer value2) {
            addCriterion("CARD_ID between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CARD_ID not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardPasswordIsNull() {
            addCriterion("CARD_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCardPasswordIsNotNull() {
            addCriterion("CARD_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCardPasswordEqualTo(String value) {
            addCriterion("CARD_PASSWORD =", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordNotEqualTo(String value) {
            addCriterion("CARD_PASSWORD <>", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordGreaterThan(String value) {
            addCriterion("CARD_PASSWORD >", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_PASSWORD >=", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordLessThan(String value) {
            addCriterion("CARD_PASSWORD <", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordLessThanOrEqualTo(String value) {
            addCriterion("CARD_PASSWORD <=", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordLike(String value) {
            addCriterion("CARD_PASSWORD like", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordNotLike(String value) {
            addCriterion("CARD_PASSWORD not like", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordIn(List<String> values) {
            addCriterion("CARD_PASSWORD in", values, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordNotIn(List<String> values) {
            addCriterion("CARD_PASSWORD not in", values, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordBetween(String value1, String value2) {
            addCriterion("CARD_PASSWORD between", value1, value2, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordNotBetween(String value1, String value2) {
            addCriterion("CARD_PASSWORD not between", value1, value2, "cardPassword");
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

        public Criteria andCardBalanceIsNull() {
            addCriterion("CARD_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andCardBalanceIsNotNull() {
            addCriterion("CARD_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andCardBalanceEqualTo(Float value) {
            addCriterion("CARD_BALANCE =", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceNotEqualTo(Float value) {
            addCriterion("CARD_BALANCE <>", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceGreaterThan(Float value) {
            addCriterion("CARD_BALANCE >", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("CARD_BALANCE >=", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceLessThan(Float value) {
            addCriterion("CARD_BALANCE <", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceLessThanOrEqualTo(Float value) {
            addCriterion("CARD_BALANCE <=", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceIn(List<Float> values) {
            addCriterion("CARD_BALANCE in", values, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceNotIn(List<Float> values) {
            addCriterion("CARD_BALANCE not in", values, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceBetween(Float value1, Float value2) {
            addCriterion("CARD_BALANCE between", value1, value2, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardBalanceNotBetween(Float value1, Float value2) {
            addCriterion("CARD_BALANCE not between", value1, value2, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andCardStatusIsNull() {
            addCriterion("CARD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCardStatusIsNotNull() {
            addCriterion("CARD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCardStatusEqualTo(String value) {
            addCriterion("CARD_STATUS =", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusNotEqualTo(String value) {
            addCriterion("CARD_STATUS <>", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusGreaterThan(String value) {
            addCriterion("CARD_STATUS >", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_STATUS >=", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusLessThan(String value) {
            addCriterion("CARD_STATUS <", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusLessThanOrEqualTo(String value) {
            addCriterion("CARD_STATUS <=", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusLike(String value) {
            addCriterion("CARD_STATUS like", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusNotLike(String value) {
            addCriterion("CARD_STATUS not like", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusIn(List<String> values) {
            addCriterion("CARD_STATUS in", values, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusNotIn(List<String> values) {
            addCriterion("CARD_STATUS not in", values, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusBetween(String value1, String value2) {
            addCriterion("CARD_STATUS between", value1, value2, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusNotBetween(String value1, String value2) {
            addCriterion("CARD_STATUS not between", value1, value2, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardFailIsNull() {
            addCriterion("CARD_FAIL is null");
            return (Criteria) this;
        }

        public Criteria andCardFailIsNotNull() {
            addCriterion("CARD_FAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCardFailEqualTo(Integer value) {
            addCriterion("CARD_FAIL =", value, "cardFail");
            return (Criteria) this;
        }

        public Criteria andCardFailNotEqualTo(Integer value) {
            addCriterion("CARD_FAIL <>", value, "cardFail");
            return (Criteria) this;
        }

        public Criteria andCardFailGreaterThan(Integer value) {
            addCriterion("CARD_FAIL >", value, "cardFail");
            return (Criteria) this;
        }

        public Criteria andCardFailGreaterThanOrEqualTo(Integer value) {
            addCriterion("CARD_FAIL >=", value, "cardFail");
            return (Criteria) this;
        }

        public Criteria andCardFailLessThan(Integer value) {
            addCriterion("CARD_FAIL <", value, "cardFail");
            return (Criteria) this;
        }

        public Criteria andCardFailLessThanOrEqualTo(Integer value) {
            addCriterion("CARD_FAIL <=", value, "cardFail");
            return (Criteria) this;
        }

        public Criteria andCardFailIn(List<Integer> values) {
            addCriterion("CARD_FAIL in", values, "cardFail");
            return (Criteria) this;
        }

        public Criteria andCardFailNotIn(List<Integer> values) {
            addCriterion("CARD_FAIL not in", values, "cardFail");
            return (Criteria) this;
        }

        public Criteria andCardFailBetween(Integer value1, Integer value2) {
            addCriterion("CARD_FAIL between", value1, value2, "cardFail");
            return (Criteria) this;
        }

        public Criteria andCardFailNotBetween(Integer value1, Integer value2) {
            addCriterion("CARD_FAIL not between", value1, value2, "cardFail");
            return (Criteria) this;
        }

        public Criteria andCardPhoneIsNull() {
            addCriterion("CARD_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCardPhoneIsNotNull() {
            addCriterion("CARD_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCardPhoneEqualTo(String value) {
            addCriterion("CARD_PHONE =", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneNotEqualTo(String value) {
            addCriterion("CARD_PHONE <>", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneGreaterThan(String value) {
            addCriterion("CARD_PHONE >", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_PHONE >=", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneLessThan(String value) {
            addCriterion("CARD_PHONE <", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneLessThanOrEqualTo(String value) {
            addCriterion("CARD_PHONE <=", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneLike(String value) {
            addCriterion("CARD_PHONE like", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneNotLike(String value) {
            addCriterion("CARD_PHONE not like", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneIn(List<String> values) {
            addCriterion("CARD_PHONE in", values, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneNotIn(List<String> values) {
            addCriterion("CARD_PHONE not in", values, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneBetween(String value1, String value2) {
            addCriterion("CARD_PHONE between", value1, value2, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneNotBetween(String value1, String value2) {
            addCriterion("CARD_PHONE not between", value1, value2, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardBankIdIsNull() {
            addCriterion("CARD_BANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardBankIdIsNotNull() {
            addCriterion("CARD_BANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardBankIdEqualTo(Integer value) {
            addCriterion("CARD_BANK_ID =", value, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdNotEqualTo(Integer value) {
            addCriterion("CARD_BANK_ID <>", value, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdGreaterThan(Integer value) {
            addCriterion("CARD_BANK_ID >", value, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CARD_BANK_ID >=", value, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdLessThan(Integer value) {
            addCriterion("CARD_BANK_ID <", value, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("CARD_BANK_ID <=", value, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdIn(List<Integer> values) {
            addCriterion("CARD_BANK_ID in", values, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdNotIn(List<Integer> values) {
            addCriterion("CARD_BANK_ID not in", values, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdBetween(Integer value1, Integer value2) {
            addCriterion("CARD_BANK_ID between", value1, value2, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CARD_BANK_ID not between", value1, value2, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardOtherIsNull() {
            addCriterion("CARD_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andCardOtherIsNotNull() {
            addCriterion("CARD_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andCardOtherEqualTo(String value) {
            addCriterion("CARD_OTHER =", value, "cardOther");
            return (Criteria) this;
        }

        public Criteria andCardOtherNotEqualTo(String value) {
            addCriterion("CARD_OTHER <>", value, "cardOther");
            return (Criteria) this;
        }

        public Criteria andCardOtherGreaterThan(String value) {
            addCriterion("CARD_OTHER >", value, "cardOther");
            return (Criteria) this;
        }

        public Criteria andCardOtherGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_OTHER >=", value, "cardOther");
            return (Criteria) this;
        }

        public Criteria andCardOtherLessThan(String value) {
            addCriterion("CARD_OTHER <", value, "cardOther");
            return (Criteria) this;
        }

        public Criteria andCardOtherLessThanOrEqualTo(String value) {
            addCriterion("CARD_OTHER <=", value, "cardOther");
            return (Criteria) this;
        }

        public Criteria andCardOtherLike(String value) {
            addCriterion("CARD_OTHER like", value, "cardOther");
            return (Criteria) this;
        }

        public Criteria andCardOtherNotLike(String value) {
            addCriterion("CARD_OTHER not like", value, "cardOther");
            return (Criteria) this;
        }

        public Criteria andCardOtherIn(List<String> values) {
            addCriterion("CARD_OTHER in", values, "cardOther");
            return (Criteria) this;
        }

        public Criteria andCardOtherNotIn(List<String> values) {
            addCriterion("CARD_OTHER not in", values, "cardOther");
            return (Criteria) this;
        }

        public Criteria andCardOtherBetween(String value1, String value2) {
            addCriterion("CARD_OTHER between", value1, value2, "cardOther");
            return (Criteria) this;
        }

        public Criteria andCardOtherNotBetween(String value1, String value2) {
            addCriterion("CARD_OTHER not between", value1, value2, "cardOther");
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