package com.bank.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WithdrawExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WithdrawExample() {
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

        public Criteria andWithdrawIdIsNull() {
            addCriterion("WITHDRAW_ID is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdIsNotNull() {
            addCriterion("WITHDRAW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdEqualTo(Integer value) {
            addCriterion("WITHDRAW_ID =", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotEqualTo(Integer value) {
            addCriterion("WITHDRAW_ID <>", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdGreaterThan(Integer value) {
            addCriterion("WITHDRAW_ID >", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WITHDRAW_ID >=", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLessThan(Integer value) {
            addCriterion("WITHDRAW_ID <", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdLessThanOrEqualTo(Integer value) {
            addCriterion("WITHDRAW_ID <=", value, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdIn(List<Integer> values) {
            addCriterion("WITHDRAW_ID in", values, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotIn(List<Integer> values) {
            addCriterion("WITHDRAW_ID not in", values, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdBetween(Integer value1, Integer value2) {
            addCriterion("WITHDRAW_ID between", value1, value2, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andWithdrawIdNotBetween(Integer value1, Integer value2) {
            addCriterion("WITHDRAW_ID not between", value1, value2, "withdrawId");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("CARD_ID =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("CARD_ID <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("CARD_ID >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_ID >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("CARD_ID <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("CARD_ID <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("CARD_ID like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("CARD_ID not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("CARD_ID in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("CARD_ID not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("CARD_ID between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("CARD_ID not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountIsNull() {
            addCriterion("WITHDRAW_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountIsNotNull() {
            addCriterion("WITHDRAW_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountEqualTo(Float value) {
            addCriterion("WITHDRAW_AMOUNT =", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountNotEqualTo(Float value) {
            addCriterion("WITHDRAW_AMOUNT <>", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountGreaterThan(Float value) {
            addCriterion("WITHDRAW_AMOUNT >", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("WITHDRAW_AMOUNT >=", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountLessThan(Float value) {
            addCriterion("WITHDRAW_AMOUNT <", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountLessThanOrEqualTo(Float value) {
            addCriterion("WITHDRAW_AMOUNT <=", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountIn(List<Float> values) {
            addCriterion("WITHDRAW_AMOUNT in", values, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountNotIn(List<Float> values) {
            addCriterion("WITHDRAW_AMOUNT not in", values, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountBetween(Float value1, Float value2) {
            addCriterion("WITHDRAW_AMOUNT between", value1, value2, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountNotBetween(Float value1, Float value2) {
            addCriterion("WITHDRAW_AMOUNT not between", value1, value2, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateIsNull() {
            addCriterion("WITHDRAW_DATE is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateIsNotNull() {
            addCriterion("WITHDRAW_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateEqualTo(Date value) {
            addCriterionForJDBCDate("WITHDRAW_DATE =", value, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("WITHDRAW_DATE <>", value, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateGreaterThan(Date value) {
            addCriterionForJDBCDate("WITHDRAW_DATE >", value, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WITHDRAW_DATE >=", value, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateLessThan(Date value) {
            addCriterionForJDBCDate("WITHDRAW_DATE <", value, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WITHDRAW_DATE <=", value, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateIn(List<Date> values) {
            addCriterionForJDBCDate("WITHDRAW_DATE in", values, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("WITHDRAW_DATE not in", values, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WITHDRAW_DATE between", value1, value2, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WITHDRAW_DATE not between", value1, value2, "withdrawDate");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankIdIsNull() {
            addCriterion("WITHDRAW_BANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankIdIsNotNull() {
            addCriterion("WITHDRAW_BANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankIdEqualTo(Integer value) {
            addCriterion("WITHDRAW_BANK_ID =", value, "withdrawBankId");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankIdNotEqualTo(Integer value) {
            addCriterion("WITHDRAW_BANK_ID <>", value, "withdrawBankId");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankIdGreaterThan(Integer value) {
            addCriterion("WITHDRAW_BANK_ID >", value, "withdrawBankId");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WITHDRAW_BANK_ID >=", value, "withdrawBankId");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankIdLessThan(Integer value) {
            addCriterion("WITHDRAW_BANK_ID <", value, "withdrawBankId");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("WITHDRAW_BANK_ID <=", value, "withdrawBankId");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankIdIn(List<Integer> values) {
            addCriterion("WITHDRAW_BANK_ID in", values, "withdrawBankId");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankIdNotIn(List<Integer> values) {
            addCriterion("WITHDRAW_BANK_ID not in", values, "withdrawBankId");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankIdBetween(Integer value1, Integer value2) {
            addCriterion("WITHDRAW_BANK_ID between", value1, value2, "withdrawBankId");
            return (Criteria) this;
        }

        public Criteria andWithdrawBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("WITHDRAW_BANK_ID not between", value1, value2, "withdrawBankId");
            return (Criteria) this;
        }

        public Criteria andWithdrawOtherIsNull() {
            addCriterion("WITHDRAW_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawOtherIsNotNull() {
            addCriterion("WITHDRAW_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawOtherEqualTo(String value) {
            addCriterion("WITHDRAW_OTHER =", value, "withdrawOther");
            return (Criteria) this;
        }

        public Criteria andWithdrawOtherNotEqualTo(String value) {
            addCriterion("WITHDRAW_OTHER <>", value, "withdrawOther");
            return (Criteria) this;
        }

        public Criteria andWithdrawOtherGreaterThan(String value) {
            addCriterion("WITHDRAW_OTHER >", value, "withdrawOther");
            return (Criteria) this;
        }

        public Criteria andWithdrawOtherGreaterThanOrEqualTo(String value) {
            addCriterion("WITHDRAW_OTHER >=", value, "withdrawOther");
            return (Criteria) this;
        }

        public Criteria andWithdrawOtherLessThan(String value) {
            addCriterion("WITHDRAW_OTHER <", value, "withdrawOther");
            return (Criteria) this;
        }

        public Criteria andWithdrawOtherLessThanOrEqualTo(String value) {
            addCriterion("WITHDRAW_OTHER <=", value, "withdrawOther");
            return (Criteria) this;
        }

        public Criteria andWithdrawOtherLike(String value) {
            addCriterion("WITHDRAW_OTHER like", value, "withdrawOther");
            return (Criteria) this;
        }

        public Criteria andWithdrawOtherNotLike(String value) {
            addCriterion("WITHDRAW_OTHER not like", value, "withdrawOther");
            return (Criteria) this;
        }

        public Criteria andWithdrawOtherIn(List<String> values) {
            addCriterion("WITHDRAW_OTHER in", values, "withdrawOther");
            return (Criteria) this;
        }

        public Criteria andWithdrawOtherNotIn(List<String> values) {
            addCriterion("WITHDRAW_OTHER not in", values, "withdrawOther");
            return (Criteria) this;
        }

        public Criteria andWithdrawOtherBetween(String value1, String value2) {
            addCriterion("WITHDRAW_OTHER between", value1, value2, "withdrawOther");
            return (Criteria) this;
        }

        public Criteria andWithdrawOtherNotBetween(String value1, String value2) {
            addCriterion("WITHDRAW_OTHER not between", value1, value2, "withdrawOther");
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