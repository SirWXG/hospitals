package com.bank.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChecksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChecksExample() {
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

        public Criteria andCheckIdIsNull() {
            addCriterion("CHECK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCheckIdIsNotNull() {
            addCriterion("CHECK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckIdEqualTo(Integer value) {
            addCriterion("CHECK_ID =", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotEqualTo(Integer value) {
            addCriterion("CHECK_ID <>", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThan(Integer value) {
            addCriterion("CHECK_ID >", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECK_ID >=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThan(Integer value) {
            addCriterion("CHECK_ID <", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHECK_ID <=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdIn(List<Integer> values) {
            addCriterion("CHECK_ID in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotIn(List<Integer> values) {
            addCriterion("CHECK_ID not in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_ID between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_ID not between", value1, value2, "checkId");
            return (Criteria) this;
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

        public Criteria andPayCardIdIsNull() {
            addCriterion("PAY_CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayCardIdIsNotNull() {
            addCriterion("PAY_CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayCardIdEqualTo(String value) {
            addCriterion("PAY_CARD_ID =", value, "payCardId");
            return (Criteria) this;
        }

        public Criteria andPayCardIdNotEqualTo(String value) {
            addCriterion("PAY_CARD_ID <>", value, "payCardId");
            return (Criteria) this;
        }

        public Criteria andPayCardIdGreaterThan(String value) {
            addCriterion("PAY_CARD_ID >", value, "payCardId");
            return (Criteria) this;
        }

        public Criteria andPayCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_CARD_ID >=", value, "payCardId");
            return (Criteria) this;
        }

        public Criteria andPayCardIdLessThan(String value) {
            addCriterion("PAY_CARD_ID <", value, "payCardId");
            return (Criteria) this;
        }

        public Criteria andPayCardIdLessThanOrEqualTo(String value) {
            addCriterion("PAY_CARD_ID <=", value, "payCardId");
            return (Criteria) this;
        }

        public Criteria andPayCardIdLike(String value) {
            addCriterion("PAY_CARD_ID like", value, "payCardId");
            return (Criteria) this;
        }

        public Criteria andPayCardIdNotLike(String value) {
            addCriterion("PAY_CARD_ID not like", value, "payCardId");
            return (Criteria) this;
        }

        public Criteria andPayCardIdIn(List<String> values) {
            addCriterion("PAY_CARD_ID in", values, "payCardId");
            return (Criteria) this;
        }

        public Criteria andPayCardIdNotIn(List<String> values) {
            addCriterion("PAY_CARD_ID not in", values, "payCardId");
            return (Criteria) this;
        }

        public Criteria andPayCardIdBetween(String value1, String value2) {
            addCriterion("PAY_CARD_ID between", value1, value2, "payCardId");
            return (Criteria) this;
        }

        public Criteria andPayCardIdNotBetween(String value1, String value2) {
            addCriterion("PAY_CARD_ID not between", value1, value2, "payCardId");
            return (Criteria) this;
        }

        public Criteria andCheckAmountIsNull() {
            addCriterion("CHECK_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCheckAmountIsNotNull() {
            addCriterion("CHECK_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckAmountEqualTo(Float value) {
            addCriterion("CHECK_AMOUNT =", value, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountNotEqualTo(Float value) {
            addCriterion("CHECK_AMOUNT <>", value, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountGreaterThan(Float value) {
            addCriterion("CHECK_AMOUNT >", value, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("CHECK_AMOUNT >=", value, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountLessThan(Float value) {
            addCriterion("CHECK_AMOUNT <", value, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountLessThanOrEqualTo(Float value) {
            addCriterion("CHECK_AMOUNT <=", value, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountIn(List<Float> values) {
            addCriterion("CHECK_AMOUNT in", values, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountNotIn(List<Float> values) {
            addCriterion("CHECK_AMOUNT not in", values, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountBetween(Float value1, Float value2) {
            addCriterion("CHECK_AMOUNT between", value1, value2, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckAmountNotBetween(Float value1, Float value2) {
            addCriterion("CHECK_AMOUNT not between", value1, value2, "checkAmount");
            return (Criteria) this;
        }

        public Criteria andCheckCreateIsNull() {
            addCriterion("CHECK_CREATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckCreateIsNotNull() {
            addCriterion("CHECK_CREATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckCreateEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_CREATE =", value, "checkCreate");
            return (Criteria) this;
        }

        public Criteria andCheckCreateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_CREATE <>", value, "checkCreate");
            return (Criteria) this;
        }

        public Criteria andCheckCreateGreaterThan(Date value) {
            addCriterionForJDBCDate("CHECK_CREATE >", value, "checkCreate");
            return (Criteria) this;
        }

        public Criteria andCheckCreateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_CREATE >=", value, "checkCreate");
            return (Criteria) this;
        }

        public Criteria andCheckCreateLessThan(Date value) {
            addCriterionForJDBCDate("CHECK_CREATE <", value, "checkCreate");
            return (Criteria) this;
        }

        public Criteria andCheckCreateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_CREATE <=", value, "checkCreate");
            return (Criteria) this;
        }

        public Criteria andCheckCreateIn(List<Date> values) {
            addCriterionForJDBCDate("CHECK_CREATE in", values, "checkCreate");
            return (Criteria) this;
        }

        public Criteria andCheckCreateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CHECK_CREATE not in", values, "checkCreate");
            return (Criteria) this;
        }

        public Criteria andCheckCreateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHECK_CREATE between", value1, value2, "checkCreate");
            return (Criteria) this;
        }

        public Criteria andCheckCreateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHECK_CREATE not between", value1, value2, "checkCreate");
            return (Criteria) this;
        }

        public Criteria andReceiptNameIsNull() {
            addCriterion("RECEIPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReceiptNameIsNotNull() {
            addCriterion("RECEIPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptNameEqualTo(String value) {
            addCriterion("RECEIPT_NAME =", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotEqualTo(String value) {
            addCriterion("RECEIPT_NAME <>", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameGreaterThan(String value) {
            addCriterion("RECEIPT_NAME >", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIPT_NAME >=", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameLessThan(String value) {
            addCriterion("RECEIPT_NAME <", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameLessThanOrEqualTo(String value) {
            addCriterion("RECEIPT_NAME <=", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameLike(String value) {
            addCriterion("RECEIPT_NAME like", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotLike(String value) {
            addCriterion("RECEIPT_NAME not like", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameIn(List<String> values) {
            addCriterion("RECEIPT_NAME in", values, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotIn(List<String> values) {
            addCriterion("RECEIPT_NAME not in", values, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameBetween(String value1, String value2) {
            addCriterion("RECEIPT_NAME between", value1, value2, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotBetween(String value1, String value2) {
            addCriterion("RECEIPT_NAME not between", value1, value2, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptCardIsNull() {
            addCriterion("RECEIPT_CARD is null");
            return (Criteria) this;
        }

        public Criteria andReceiptCardIsNotNull() {
            addCriterion("RECEIPT_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptCardEqualTo(String value) {
            addCriterion("RECEIPT_CARD =", value, "receiptCard");
            return (Criteria) this;
        }

        public Criteria andReceiptCardNotEqualTo(String value) {
            addCriterion("RECEIPT_CARD <>", value, "receiptCard");
            return (Criteria) this;
        }

        public Criteria andReceiptCardGreaterThan(String value) {
            addCriterion("RECEIPT_CARD >", value, "receiptCard");
            return (Criteria) this;
        }

        public Criteria andReceiptCardGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIPT_CARD >=", value, "receiptCard");
            return (Criteria) this;
        }

        public Criteria andReceiptCardLessThan(String value) {
            addCriterion("RECEIPT_CARD <", value, "receiptCard");
            return (Criteria) this;
        }

        public Criteria andReceiptCardLessThanOrEqualTo(String value) {
            addCriterion("RECEIPT_CARD <=", value, "receiptCard");
            return (Criteria) this;
        }

        public Criteria andReceiptCardLike(String value) {
            addCriterion("RECEIPT_CARD like", value, "receiptCard");
            return (Criteria) this;
        }

        public Criteria andReceiptCardNotLike(String value) {
            addCriterion("RECEIPT_CARD not like", value, "receiptCard");
            return (Criteria) this;
        }

        public Criteria andReceiptCardIn(List<String> values) {
            addCriterion("RECEIPT_CARD in", values, "receiptCard");
            return (Criteria) this;
        }

        public Criteria andReceiptCardNotIn(List<String> values) {
            addCriterion("RECEIPT_CARD not in", values, "receiptCard");
            return (Criteria) this;
        }

        public Criteria andReceiptCardBetween(String value1, String value2) {
            addCriterion("RECEIPT_CARD between", value1, value2, "receiptCard");
            return (Criteria) this;
        }

        public Criteria andReceiptCardNotBetween(String value1, String value2) {
            addCriterion("RECEIPT_CARD not between", value1, value2, "receiptCard");
            return (Criteria) this;
        }

        public Criteria andCheckUseIsNull() {
            addCriterion("CHECK_USE is null");
            return (Criteria) this;
        }

        public Criteria andCheckUseIsNotNull() {
            addCriterion("CHECK_USE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckUseEqualTo(String value) {
            addCriterion("CHECK_USE =", value, "checkUse");
            return (Criteria) this;
        }

        public Criteria andCheckUseNotEqualTo(String value) {
            addCriterion("CHECK_USE <>", value, "checkUse");
            return (Criteria) this;
        }

        public Criteria andCheckUseGreaterThan(String value) {
            addCriterion("CHECK_USE >", value, "checkUse");
            return (Criteria) this;
        }

        public Criteria andCheckUseGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_USE >=", value, "checkUse");
            return (Criteria) this;
        }

        public Criteria andCheckUseLessThan(String value) {
            addCriterion("CHECK_USE <", value, "checkUse");
            return (Criteria) this;
        }

        public Criteria andCheckUseLessThanOrEqualTo(String value) {
            addCriterion("CHECK_USE <=", value, "checkUse");
            return (Criteria) this;
        }

        public Criteria andCheckUseLike(String value) {
            addCriterion("CHECK_USE like", value, "checkUse");
            return (Criteria) this;
        }

        public Criteria andCheckUseNotLike(String value) {
            addCriterion("CHECK_USE not like", value, "checkUse");
            return (Criteria) this;
        }

        public Criteria andCheckUseIn(List<String> values) {
            addCriterion("CHECK_USE in", values, "checkUse");
            return (Criteria) this;
        }

        public Criteria andCheckUseNotIn(List<String> values) {
            addCriterion("CHECK_USE not in", values, "checkUse");
            return (Criteria) this;
        }

        public Criteria andCheckUseBetween(String value1, String value2) {
            addCriterion("CHECK_USE between", value1, value2, "checkUse");
            return (Criteria) this;
        }

        public Criteria andCheckUseNotBetween(String value1, String value2) {
            addCriterion("CHECK_USE not between", value1, value2, "checkUse");
            return (Criteria) this;
        }

        public Criteria andCheckOther1IsNull() {
            addCriterion("CHECK_OTHER1 is null");
            return (Criteria) this;
        }

        public Criteria andCheckOther1IsNotNull() {
            addCriterion("CHECK_OTHER1 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckOther1EqualTo(String value) {
            addCriterion("CHECK_OTHER1 =", value, "checkOther1");
            return (Criteria) this;
        }

        public Criteria andCheckOther1NotEqualTo(String value) {
            addCriterion("CHECK_OTHER1 <>", value, "checkOther1");
            return (Criteria) this;
        }

        public Criteria andCheckOther1GreaterThan(String value) {
            addCriterion("CHECK_OTHER1 >", value, "checkOther1");
            return (Criteria) this;
        }

        public Criteria andCheckOther1GreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_OTHER1 >=", value, "checkOther1");
            return (Criteria) this;
        }

        public Criteria andCheckOther1LessThan(String value) {
            addCriterion("CHECK_OTHER1 <", value, "checkOther1");
            return (Criteria) this;
        }

        public Criteria andCheckOther1LessThanOrEqualTo(String value) {
            addCriterion("CHECK_OTHER1 <=", value, "checkOther1");
            return (Criteria) this;
        }

        public Criteria andCheckOther1Like(String value) {
            addCriterion("CHECK_OTHER1 like", value, "checkOther1");
            return (Criteria) this;
        }

        public Criteria andCheckOther1NotLike(String value) {
            addCriterion("CHECK_OTHER1 not like", value, "checkOther1");
            return (Criteria) this;
        }

        public Criteria andCheckOther1In(List<String> values) {
            addCriterion("CHECK_OTHER1 in", values, "checkOther1");
            return (Criteria) this;
        }

        public Criteria andCheckOther1NotIn(List<String> values) {
            addCriterion("CHECK_OTHER1 not in", values, "checkOther1");
            return (Criteria) this;
        }

        public Criteria andCheckOther1Between(String value1, String value2) {
            addCriterion("CHECK_OTHER1 between", value1, value2, "checkOther1");
            return (Criteria) this;
        }

        public Criteria andCheckOther1NotBetween(String value1, String value2) {
            addCriterion("CHECK_OTHER1 not between", value1, value2, "checkOther1");
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