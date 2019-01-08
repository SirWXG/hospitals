package com.bank.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ConsumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsumeExample() {
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

        public Criteria andConsumeIdIsNull() {
            addCriterion("CONSUME_ID is null");
            return (Criteria) this;
        }

        public Criteria andConsumeIdIsNotNull() {
            addCriterion("CONSUME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeIdEqualTo(Integer value) {
            addCriterion("CONSUME_ID =", value, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdNotEqualTo(Integer value) {
            addCriterion("CONSUME_ID <>", value, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdGreaterThan(Integer value) {
            addCriterion("CONSUME_ID >", value, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONSUME_ID >=", value, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdLessThan(Integer value) {
            addCriterion("CONSUME_ID <", value, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("CONSUME_ID <=", value, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdIn(List<Integer> values) {
            addCriterion("CONSUME_ID in", values, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdNotIn(List<Integer> values) {
            addCriterion("CONSUME_ID not in", values, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdBetween(Integer value1, Integer value2) {
            addCriterion("CONSUME_ID between", value1, value2, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CONSUME_ID not between", value1, value2, "consumeId");
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

        public Criteria andConsumeAmountIsNull() {
            addCriterion("CONSUME_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountIsNotNull() {
            addCriterion("CONSUME_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountEqualTo(Float value) {
            addCriterion("CONSUME_AMOUNT =", value, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountNotEqualTo(Float value) {
            addCriterion("CONSUME_AMOUNT <>", value, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountGreaterThan(Float value) {
            addCriterion("CONSUME_AMOUNT >", value, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("CONSUME_AMOUNT >=", value, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountLessThan(Float value) {
            addCriterion("CONSUME_AMOUNT <", value, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountLessThanOrEqualTo(Float value) {
            addCriterion("CONSUME_AMOUNT <=", value, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountIn(List<Float> values) {
            addCriterion("CONSUME_AMOUNT in", values, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountNotIn(List<Float> values) {
            addCriterion("CONSUME_AMOUNT not in", values, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountBetween(Float value1, Float value2) {
            addCriterion("CONSUME_AMOUNT between", value1, value2, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountNotBetween(Float value1, Float value2) {
            addCriterion("CONSUME_AMOUNT not between", value1, value2, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeDateIsNull() {
            addCriterion("CONSUME_DATE is null");
            return (Criteria) this;
        }

        public Criteria andConsumeDateIsNotNull() {
            addCriterion("CONSUME_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeDateEqualTo(Date value) {
            addCriterionForJDBCDate("CONSUME_DATE =", value, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CONSUME_DATE <>", value, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CONSUME_DATE >", value, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CONSUME_DATE >=", value, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateLessThan(Date value) {
            addCriterionForJDBCDate("CONSUME_DATE <", value, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CONSUME_DATE <=", value, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateIn(List<Date> values) {
            addCriterionForJDBCDate("CONSUME_DATE in", values, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CONSUME_DATE not in", values, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CONSUME_DATE between", value1, value2, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CONSUME_DATE not between", value1, value2, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeReceiptIsNull() {
            addCriterion("CONSUME_RECEIPT is null");
            return (Criteria) this;
        }

        public Criteria andConsumeReceiptIsNotNull() {
            addCriterion("CONSUME_RECEIPT is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeReceiptEqualTo(String value) {
            addCriterion("CONSUME_RECEIPT =", value, "consumeReceipt");
            return (Criteria) this;
        }

        public Criteria andConsumeReceiptNotEqualTo(String value) {
            addCriterion("CONSUME_RECEIPT <>", value, "consumeReceipt");
            return (Criteria) this;
        }

        public Criteria andConsumeReceiptGreaterThan(String value) {
            addCriterion("CONSUME_RECEIPT >", value, "consumeReceipt");
            return (Criteria) this;
        }

        public Criteria andConsumeReceiptGreaterThanOrEqualTo(String value) {
            addCriterion("CONSUME_RECEIPT >=", value, "consumeReceipt");
            return (Criteria) this;
        }

        public Criteria andConsumeReceiptLessThan(String value) {
            addCriterion("CONSUME_RECEIPT <", value, "consumeReceipt");
            return (Criteria) this;
        }

        public Criteria andConsumeReceiptLessThanOrEqualTo(String value) {
            addCriterion("CONSUME_RECEIPT <=", value, "consumeReceipt");
            return (Criteria) this;
        }

        public Criteria andConsumeReceiptLike(String value) {
            addCriterion("CONSUME_RECEIPT like", value, "consumeReceipt");
            return (Criteria) this;
        }

        public Criteria andConsumeReceiptNotLike(String value) {
            addCriterion("CONSUME_RECEIPT not like", value, "consumeReceipt");
            return (Criteria) this;
        }

        public Criteria andConsumeReceiptIn(List<String> values) {
            addCriterion("CONSUME_RECEIPT in", values, "consumeReceipt");
            return (Criteria) this;
        }

        public Criteria andConsumeReceiptNotIn(List<String> values) {
            addCriterion("CONSUME_RECEIPT not in", values, "consumeReceipt");
            return (Criteria) this;
        }

        public Criteria andConsumeReceiptBetween(String value1, String value2) {
            addCriterion("CONSUME_RECEIPT between", value1, value2, "consumeReceipt");
            return (Criteria) this;
        }

        public Criteria andConsumeReceiptNotBetween(String value1, String value2) {
            addCriterion("CONSUME_RECEIPT not between", value1, value2, "consumeReceipt");
            return (Criteria) this;
        }

        public Criteria andConsumeOther1IsNull() {
            addCriterion("CONSUME_OTHER1 is null");
            return (Criteria) this;
        }

        public Criteria andConsumeOther1IsNotNull() {
            addCriterion("CONSUME_OTHER1 is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeOther1EqualTo(String value) {
            addCriterion("CONSUME_OTHER1 =", value, "consumeOther1");
            return (Criteria) this;
        }

        public Criteria andConsumeOther1NotEqualTo(String value) {
            addCriterion("CONSUME_OTHER1 <>", value, "consumeOther1");
            return (Criteria) this;
        }

        public Criteria andConsumeOther1GreaterThan(String value) {
            addCriterion("CONSUME_OTHER1 >", value, "consumeOther1");
            return (Criteria) this;
        }

        public Criteria andConsumeOther1GreaterThanOrEqualTo(String value) {
            addCriterion("CONSUME_OTHER1 >=", value, "consumeOther1");
            return (Criteria) this;
        }

        public Criteria andConsumeOther1LessThan(String value) {
            addCriterion("CONSUME_OTHER1 <", value, "consumeOther1");
            return (Criteria) this;
        }

        public Criteria andConsumeOther1LessThanOrEqualTo(String value) {
            addCriterion("CONSUME_OTHER1 <=", value, "consumeOther1");
            return (Criteria) this;
        }

        public Criteria andConsumeOther1Like(String value) {
            addCriterion("CONSUME_OTHER1 like", value, "consumeOther1");
            return (Criteria) this;
        }

        public Criteria andConsumeOther1NotLike(String value) {
            addCriterion("CONSUME_OTHER1 not like", value, "consumeOther1");
            return (Criteria) this;
        }

        public Criteria andConsumeOther1In(List<String> values) {
            addCriterion("CONSUME_OTHER1 in", values, "consumeOther1");
            return (Criteria) this;
        }

        public Criteria andConsumeOther1NotIn(List<String> values) {
            addCriterion("CONSUME_OTHER1 not in", values, "consumeOther1");
            return (Criteria) this;
        }

        public Criteria andConsumeOther1Between(String value1, String value2) {
            addCriterion("CONSUME_OTHER1 between", value1, value2, "consumeOther1");
            return (Criteria) this;
        }

        public Criteria andConsumeOther1NotBetween(String value1, String value2) {
            addCriterion("CONSUME_OTHER1 not between", value1, value2, "consumeOther1");
            return (Criteria) this;
        }

        public Criteria andConsumeOther2IsNull() {
            addCriterion("CONSUME_OTHER2 is null");
            return (Criteria) this;
        }

        public Criteria andConsumeOther2IsNotNull() {
            addCriterion("CONSUME_OTHER2 is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeOther2EqualTo(String value) {
            addCriterion("CONSUME_OTHER2 =", value, "consumeOther2");
            return (Criteria) this;
        }

        public Criteria andConsumeOther2NotEqualTo(String value) {
            addCriterion("CONSUME_OTHER2 <>", value, "consumeOther2");
            return (Criteria) this;
        }

        public Criteria andConsumeOther2GreaterThan(String value) {
            addCriterion("CONSUME_OTHER2 >", value, "consumeOther2");
            return (Criteria) this;
        }

        public Criteria andConsumeOther2GreaterThanOrEqualTo(String value) {
            addCriterion("CONSUME_OTHER2 >=", value, "consumeOther2");
            return (Criteria) this;
        }

        public Criteria andConsumeOther2LessThan(String value) {
            addCriterion("CONSUME_OTHER2 <", value, "consumeOther2");
            return (Criteria) this;
        }

        public Criteria andConsumeOther2LessThanOrEqualTo(String value) {
            addCriterion("CONSUME_OTHER2 <=", value, "consumeOther2");
            return (Criteria) this;
        }

        public Criteria andConsumeOther2Like(String value) {
            addCriterion("CONSUME_OTHER2 like", value, "consumeOther2");
            return (Criteria) this;
        }

        public Criteria andConsumeOther2NotLike(String value) {
            addCriterion("CONSUME_OTHER2 not like", value, "consumeOther2");
            return (Criteria) this;
        }

        public Criteria andConsumeOther2In(List<String> values) {
            addCriterion("CONSUME_OTHER2 in", values, "consumeOther2");
            return (Criteria) this;
        }

        public Criteria andConsumeOther2NotIn(List<String> values) {
            addCriterion("CONSUME_OTHER2 not in", values, "consumeOther2");
            return (Criteria) this;
        }

        public Criteria andConsumeOther2Between(String value1, String value2) {
            addCriterion("CONSUME_OTHER2 between", value1, value2, "consumeOther2");
            return (Criteria) this;
        }

        public Criteria andConsumeOther2NotBetween(String value1, String value2) {
            addCriterion("CONSUME_OTHER2 not between", value1, value2, "consumeOther2");
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