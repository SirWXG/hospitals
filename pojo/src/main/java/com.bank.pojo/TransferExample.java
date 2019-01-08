package com.bank.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransferExample() {
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

        public Criteria andTransferIdIsNull() {
            addCriterion("TRANSFER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransferIdIsNotNull() {
            addCriterion("TRANSFER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransferIdEqualTo(Integer value) {
            addCriterion("TRANSFER_ID =", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotEqualTo(Integer value) {
            addCriterion("TRANSFER_ID <>", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdGreaterThan(Integer value) {
            addCriterion("TRANSFER_ID >", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSFER_ID >=", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdLessThan(Integer value) {
            addCriterion("TRANSFER_ID <", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSFER_ID <=", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdIn(List<Integer> values) {
            addCriterion("TRANSFER_ID in", values, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotIn(List<Integer> values) {
            addCriterion("TRANSFER_ID not in", values, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFER_ID between", value1, value2, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFER_ID not between", value1, value2, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferOutIsNull() {
            addCriterion("TRANSFER_OUT is null");
            return (Criteria) this;
        }

        public Criteria andTransferOutIsNotNull() {
            addCriterion("TRANSFER_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andTransferOutEqualTo(String value) {
            addCriterion("TRANSFER_OUT =", value, "transferOut");
            return (Criteria) this;
        }

        public Criteria andTransferOutNotEqualTo(String value) {
            addCriterion("TRANSFER_OUT <>", value, "transferOut");
            return (Criteria) this;
        }

        public Criteria andTransferOutGreaterThan(String value) {
            addCriterion("TRANSFER_OUT >", value, "transferOut");
            return (Criteria) this;
        }

        public Criteria andTransferOutGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_OUT >=", value, "transferOut");
            return (Criteria) this;
        }

        public Criteria andTransferOutLessThan(String value) {
            addCriterion("TRANSFER_OUT <", value, "transferOut");
            return (Criteria) this;
        }

        public Criteria andTransferOutLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_OUT <=", value, "transferOut");
            return (Criteria) this;
        }

        public Criteria andTransferOutLike(String value) {
            addCriterion("TRANSFER_OUT like", value, "transferOut");
            return (Criteria) this;
        }

        public Criteria andTransferOutNotLike(String value) {
            addCriterion("TRANSFER_OUT not like", value, "transferOut");
            return (Criteria) this;
        }

        public Criteria andTransferOutIn(List<String> values) {
            addCriterion("TRANSFER_OUT in", values, "transferOut");
            return (Criteria) this;
        }

        public Criteria andTransferOutNotIn(List<String> values) {
            addCriterion("TRANSFER_OUT not in", values, "transferOut");
            return (Criteria) this;
        }

        public Criteria andTransferOutBetween(String value1, String value2) {
            addCriterion("TRANSFER_OUT between", value1, value2, "transferOut");
            return (Criteria) this;
        }

        public Criteria andTransferOutNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_OUT not between", value1, value2, "transferOut");
            return (Criteria) this;
        }

        public Criteria andTransferAmountIsNull() {
            addCriterion("TRANSFER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTransferAmountIsNotNull() {
            addCriterion("TRANSFER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTransferAmountEqualTo(Integer value) {
            addCriterion("TRANSFER_AMOUNT =", value, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountNotEqualTo(Integer value) {
            addCriterion("TRANSFER_AMOUNT <>", value, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountGreaterThan(Integer value) {
            addCriterion("TRANSFER_AMOUNT >", value, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSFER_AMOUNT >=", value, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountLessThan(Integer value) {
            addCriterion("TRANSFER_AMOUNT <", value, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSFER_AMOUNT <=", value, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountIn(List<Integer> values) {
            addCriterion("TRANSFER_AMOUNT in", values, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountNotIn(List<Integer> values) {
            addCriterion("TRANSFER_AMOUNT not in", values, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFER_AMOUNT between", value1, value2, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFER_AMOUNT not between", value1, value2, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferDateIsNull() {
            addCriterion("TRANSFER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTransferDateIsNotNull() {
            addCriterion("TRANSFER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransferDateEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSFER_DATE =", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSFER_DATE <>", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateGreaterThan(Date value) {
            addCriterionForJDBCDate("TRANSFER_DATE >", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSFER_DATE >=", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateLessThan(Date value) {
            addCriterionForJDBCDate("TRANSFER_DATE <", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSFER_DATE <=", value, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateIn(List<Date> values) {
            addCriterionForJDBCDate("TRANSFER_DATE in", values, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TRANSFER_DATE not in", values, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANSFER_DATE between", value1, value2, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANSFER_DATE not between", value1, value2, "transferDate");
            return (Criteria) this;
        }

        public Criteria andTransferInIsNull() {
            addCriterion("TRANSFER_IN is null");
            return (Criteria) this;
        }

        public Criteria andTransferInIsNotNull() {
            addCriterion("TRANSFER_IN is not null");
            return (Criteria) this;
        }

        public Criteria andTransferInEqualTo(String value) {
            addCriterion("TRANSFER_IN =", value, "transferIn");
            return (Criteria) this;
        }

        public Criteria andTransferInNotEqualTo(String value) {
            addCriterion("TRANSFER_IN <>", value, "transferIn");
            return (Criteria) this;
        }

        public Criteria andTransferInGreaterThan(String value) {
            addCriterion("TRANSFER_IN >", value, "transferIn");
            return (Criteria) this;
        }

        public Criteria andTransferInGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_IN >=", value, "transferIn");
            return (Criteria) this;
        }

        public Criteria andTransferInLessThan(String value) {
            addCriterion("TRANSFER_IN <", value, "transferIn");
            return (Criteria) this;
        }

        public Criteria andTransferInLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_IN <=", value, "transferIn");
            return (Criteria) this;
        }

        public Criteria andTransferInLike(String value) {
            addCriterion("TRANSFER_IN like", value, "transferIn");
            return (Criteria) this;
        }

        public Criteria andTransferInNotLike(String value) {
            addCriterion("TRANSFER_IN not like", value, "transferIn");
            return (Criteria) this;
        }

        public Criteria andTransferInIn(List<String> values) {
            addCriterion("TRANSFER_IN in", values, "transferIn");
            return (Criteria) this;
        }

        public Criteria andTransferInNotIn(List<String> values) {
            addCriterion("TRANSFER_IN not in", values, "transferIn");
            return (Criteria) this;
        }

        public Criteria andTransferInBetween(String value1, String value2) {
            addCriterion("TRANSFER_IN between", value1, value2, "transferIn");
            return (Criteria) this;
        }

        public Criteria andTransferInNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_IN not between", value1, value2, "transferIn");
            return (Criteria) this;
        }

        public Criteria andTransferInNameIsNull() {
            addCriterion("TRANSFER_IN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTransferInNameIsNotNull() {
            addCriterion("TRANSFER_IN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTransferInNameEqualTo(String value) {
            addCriterion("TRANSFER_IN_NAME =", value, "transferInName");
            return (Criteria) this;
        }

        public Criteria andTransferInNameNotEqualTo(String value) {
            addCriterion("TRANSFER_IN_NAME <>", value, "transferInName");
            return (Criteria) this;
        }

        public Criteria andTransferInNameGreaterThan(String value) {
            addCriterion("TRANSFER_IN_NAME >", value, "transferInName");
            return (Criteria) this;
        }

        public Criteria andTransferInNameGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_IN_NAME >=", value, "transferInName");
            return (Criteria) this;
        }

        public Criteria andTransferInNameLessThan(String value) {
            addCriterion("TRANSFER_IN_NAME <", value, "transferInName");
            return (Criteria) this;
        }

        public Criteria andTransferInNameLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_IN_NAME <=", value, "transferInName");
            return (Criteria) this;
        }

        public Criteria andTransferInNameLike(String value) {
            addCriterion("TRANSFER_IN_NAME like", value, "transferInName");
            return (Criteria) this;
        }

        public Criteria andTransferInNameNotLike(String value) {
            addCriterion("TRANSFER_IN_NAME not like", value, "transferInName");
            return (Criteria) this;
        }

        public Criteria andTransferInNameIn(List<String> values) {
            addCriterion("TRANSFER_IN_NAME in", values, "transferInName");
            return (Criteria) this;
        }

        public Criteria andTransferInNameNotIn(List<String> values) {
            addCriterion("TRANSFER_IN_NAME not in", values, "transferInName");
            return (Criteria) this;
        }

        public Criteria andTransferInNameBetween(String value1, String value2) {
            addCriterion("TRANSFER_IN_NAME between", value1, value2, "transferInName");
            return (Criteria) this;
        }

        public Criteria andTransferInNameNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_IN_NAME not between", value1, value2, "transferInName");
            return (Criteria) this;
        }

        public Criteria andTransferInfoIsNull() {
            addCriterion("TRANSFER_INFO is null");
            return (Criteria) this;
        }

        public Criteria andTransferInfoIsNotNull() {
            addCriterion("TRANSFER_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andTransferInfoEqualTo(String value) {
            addCriterion("TRANSFER_INFO =", value, "transferInfo");
            return (Criteria) this;
        }

        public Criteria andTransferInfoNotEqualTo(String value) {
            addCriterion("TRANSFER_INFO <>", value, "transferInfo");
            return (Criteria) this;
        }

        public Criteria andTransferInfoGreaterThan(String value) {
            addCriterion("TRANSFER_INFO >", value, "transferInfo");
            return (Criteria) this;
        }

        public Criteria andTransferInfoGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_INFO >=", value, "transferInfo");
            return (Criteria) this;
        }

        public Criteria andTransferInfoLessThan(String value) {
            addCriterion("TRANSFER_INFO <", value, "transferInfo");
            return (Criteria) this;
        }

        public Criteria andTransferInfoLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_INFO <=", value, "transferInfo");
            return (Criteria) this;
        }

        public Criteria andTransferInfoLike(String value) {
            addCriterion("TRANSFER_INFO like", value, "transferInfo");
            return (Criteria) this;
        }

        public Criteria andTransferInfoNotLike(String value) {
            addCriterion("TRANSFER_INFO not like", value, "transferInfo");
            return (Criteria) this;
        }

        public Criteria andTransferInfoIn(List<String> values) {
            addCriterion("TRANSFER_INFO in", values, "transferInfo");
            return (Criteria) this;
        }

        public Criteria andTransferInfoNotIn(List<String> values) {
            addCriterion("TRANSFER_INFO not in", values, "transferInfo");
            return (Criteria) this;
        }

        public Criteria andTransferInfoBetween(String value1, String value2) {
            addCriterion("TRANSFER_INFO between", value1, value2, "transferInfo");
            return (Criteria) this;
        }

        public Criteria andTransferInfoNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_INFO not between", value1, value2, "transferInfo");
            return (Criteria) this;
        }

        public Criteria andTransferStatusIsNull() {
            addCriterion("TRANSFER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTransferStatusIsNotNull() {
            addCriterion("TRANSFER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTransferStatusEqualTo(String value) {
            addCriterion("TRANSFER_STATUS =", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusNotEqualTo(String value) {
            addCriterion("TRANSFER_STATUS <>", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusGreaterThan(String value) {
            addCriterion("TRANSFER_STATUS >", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_STATUS >=", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusLessThan(String value) {
            addCriterion("TRANSFER_STATUS <", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_STATUS <=", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusLike(String value) {
            addCriterion("TRANSFER_STATUS like", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusNotLike(String value) {
            addCriterion("TRANSFER_STATUS not like", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusIn(List<String> values) {
            addCriterion("TRANSFER_STATUS in", values, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusNotIn(List<String> values) {
            addCriterion("TRANSFER_STATUS not in", values, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusBetween(String value1, String value2) {
            addCriterion("TRANSFER_STATUS between", value1, value2, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_STATUS not between", value1, value2, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferOtherIsNull() {
            addCriterion("TRANSFER_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andTransferOtherIsNotNull() {
            addCriterion("TRANSFER_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andTransferOtherEqualTo(String value) {
            addCriterion("TRANSFER_OTHER =", value, "transferOther");
            return (Criteria) this;
        }

        public Criteria andTransferOtherNotEqualTo(String value) {
            addCriterion("TRANSFER_OTHER <>", value, "transferOther");
            return (Criteria) this;
        }

        public Criteria andTransferOtherGreaterThan(String value) {
            addCriterion("TRANSFER_OTHER >", value, "transferOther");
            return (Criteria) this;
        }

        public Criteria andTransferOtherGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_OTHER >=", value, "transferOther");
            return (Criteria) this;
        }

        public Criteria andTransferOtherLessThan(String value) {
            addCriterion("TRANSFER_OTHER <", value, "transferOther");
            return (Criteria) this;
        }

        public Criteria andTransferOtherLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_OTHER <=", value, "transferOther");
            return (Criteria) this;
        }

        public Criteria andTransferOtherLike(String value) {
            addCriterion("TRANSFER_OTHER like", value, "transferOther");
            return (Criteria) this;
        }

        public Criteria andTransferOtherNotLike(String value) {
            addCriterion("TRANSFER_OTHER not like", value, "transferOther");
            return (Criteria) this;
        }

        public Criteria andTransferOtherIn(List<String> values) {
            addCriterion("TRANSFER_OTHER in", values, "transferOther");
            return (Criteria) this;
        }

        public Criteria andTransferOtherNotIn(List<String> values) {
            addCriterion("TRANSFER_OTHER not in", values, "transferOther");
            return (Criteria) this;
        }

        public Criteria andTransferOtherBetween(String value1, String value2) {
            addCriterion("TRANSFER_OTHER between", value1, value2, "transferOther");
            return (Criteria) this;
        }

        public Criteria andTransferOtherNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_OTHER not between", value1, value2, "transferOther");
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