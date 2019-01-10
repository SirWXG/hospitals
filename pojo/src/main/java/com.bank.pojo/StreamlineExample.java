package com.bank.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StreamlineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StreamlineExample() {
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

        public Criteria andStreamlineIdIsNull() {
            addCriterion("STREAMLINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStreamlineIdIsNotNull() {
            addCriterion("STREAMLINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStreamlineIdEqualTo(Integer value) {
            addCriterion("STREAMLINE_ID =", value, "streamlineId");
            return (Criteria) this;
        }

        public Criteria andStreamlineIdNotEqualTo(Integer value) {
            addCriterion("STREAMLINE_ID <>", value, "streamlineId");
            return (Criteria) this;
        }

        public Criteria andStreamlineIdGreaterThan(Integer value) {
            addCriterion("STREAMLINE_ID >", value, "streamlineId");
            return (Criteria) this;
        }

        public Criteria andStreamlineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STREAMLINE_ID >=", value, "streamlineId");
            return (Criteria) this;
        }

        public Criteria andStreamlineIdLessThan(Integer value) {
            addCriterion("STREAMLINE_ID <", value, "streamlineId");
            return (Criteria) this;
        }

        public Criteria andStreamlineIdLessThanOrEqualTo(Integer value) {
            addCriterion("STREAMLINE_ID <=", value, "streamlineId");
            return (Criteria) this;
        }

        public Criteria andStreamlineIdIn(List<Integer> values) {
            addCriterion("STREAMLINE_ID in", values, "streamlineId");
            return (Criteria) this;
        }

        public Criteria andStreamlineIdNotIn(List<Integer> values) {
            addCriterion("STREAMLINE_ID not in", values, "streamlineId");
            return (Criteria) this;
        }

        public Criteria andStreamlineIdBetween(Integer value1, Integer value2) {
            addCriterion("STREAMLINE_ID between", value1, value2, "streamlineId");
            return (Criteria) this;
        }

        public Criteria andStreamlineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STREAMLINE_ID not between", value1, value2, "streamlineId");
            return (Criteria) this;
        }

        public Criteria andStreamlineNameIsNull() {
            addCriterion("STREAMLINE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStreamlineNameIsNotNull() {
            addCriterion("STREAMLINE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStreamlineNameEqualTo(String value) {
            addCriterion("STREAMLINE_NAME =", value, "streamlineName");
            return (Criteria) this;
        }

        public Criteria andStreamlineNameNotEqualTo(String value) {
            addCriterion("STREAMLINE_NAME <>", value, "streamlineName");
            return (Criteria) this;
        }

        public Criteria andStreamlineNameGreaterThan(String value) {
            addCriterion("STREAMLINE_NAME >", value, "streamlineName");
            return (Criteria) this;
        }

        public Criteria andStreamlineNameGreaterThanOrEqualTo(String value) {
            addCriterion("STREAMLINE_NAME >=", value, "streamlineName");
            return (Criteria) this;
        }

        public Criteria andStreamlineNameLessThan(String value) {
            addCriterion("STREAMLINE_NAME <", value, "streamlineName");
            return (Criteria) this;
        }

        public Criteria andStreamlineNameLessThanOrEqualTo(String value) {
            addCriterion("STREAMLINE_NAME <=", value, "streamlineName");
            return (Criteria) this;
        }

        public Criteria andStreamlineNameLike(String value) {
            addCriterion("STREAMLINE_NAME like", value, "streamlineName");
            return (Criteria) this;
        }

        public Criteria andStreamlineNameNotLike(String value) {
            addCriterion("STREAMLINE_NAME not like", value, "streamlineName");
            return (Criteria) this;
        }

        public Criteria andStreamlineNameIn(List<String> values) {
            addCriterion("STREAMLINE_NAME in", values, "streamlineName");
            return (Criteria) this;
        }

        public Criteria andStreamlineNameNotIn(List<String> values) {
            addCriterion("STREAMLINE_NAME not in", values, "streamlineName");
            return (Criteria) this;
        }

        public Criteria andStreamlineNameBetween(String value1, String value2) {
            addCriterion("STREAMLINE_NAME between", value1, value2, "streamlineName");
            return (Criteria) this;
        }

        public Criteria andStreamlineNameNotBetween(String value1, String value2) {
            addCriterion("STREAMLINE_NAME not between", value1, value2, "streamlineName");
            return (Criteria) this;
        }

        public Criteria andCheckEmpidIsNull() {
            addCriterion("CHECK_EMPID is null");
            return (Criteria) this;
        }

        public Criteria andCheckEmpidIsNotNull() {
            addCriterion("CHECK_EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckEmpidEqualTo(Integer value) {
            addCriterion("CHECK_EMPID =", value, "checkEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckEmpidNotEqualTo(Integer value) {
            addCriterion("CHECK_EMPID <>", value, "checkEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckEmpidGreaterThan(Integer value) {
            addCriterion("CHECK_EMPID >", value, "checkEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECK_EMPID >=", value, "checkEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckEmpidLessThan(Integer value) {
            addCriterion("CHECK_EMPID <", value, "checkEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("CHECK_EMPID <=", value, "checkEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckEmpidIn(List<Integer> values) {
            addCriterion("CHECK_EMPID in", values, "checkEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckEmpidNotIn(List<Integer> values) {
            addCriterion("CHECK_EMPID not in", values, "checkEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckEmpidBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_EMPID between", value1, value2, "checkEmpid");
            return (Criteria) this;
        }

        public Criteria andCheckEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_EMPID not between", value1, value2, "checkEmpid");
            return (Criteria) this;
        }

        public Criteria andStreamlineDateIsNull() {
            addCriterion("STREAMLINE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStreamlineDateIsNotNull() {
            addCriterion("STREAMLINE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStreamlineDateEqualTo(Date value) {
            addCriterionForJDBCDate("STREAMLINE_DATE =", value, "streamlineDate");
            return (Criteria) this;
        }

        public Criteria andStreamlineDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STREAMLINE_DATE <>", value, "streamlineDate");
            return (Criteria) this;
        }

        public Criteria andStreamlineDateGreaterThan(Date value) {
            addCriterionForJDBCDate("STREAMLINE_DATE >", value, "streamlineDate");
            return (Criteria) this;
        }

        public Criteria andStreamlineDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STREAMLINE_DATE >=", value, "streamlineDate");
            return (Criteria) this;
        }

        public Criteria andStreamlineDateLessThan(Date value) {
            addCriterionForJDBCDate("STREAMLINE_DATE <", value, "streamlineDate");
            return (Criteria) this;
        }

        public Criteria andStreamlineDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STREAMLINE_DATE <=", value, "streamlineDate");
            return (Criteria) this;
        }

        public Criteria andStreamlineDateIn(List<Date> values) {
            addCriterionForJDBCDate("STREAMLINE_DATE in", values, "streamlineDate");
            return (Criteria) this;
        }

        public Criteria andStreamlineDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STREAMLINE_DATE not in", values, "streamlineDate");
            return (Criteria) this;
        }

        public Criteria andStreamlineDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STREAMLINE_DATE between", value1, value2, "streamlineDate");
            return (Criteria) this;
        }

        public Criteria andStreamlineDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STREAMLINE_DATE not between", value1, value2, "streamlineDate");
            return (Criteria) this;
        }

        public Criteria andStreamlineInfoIsNull() {
            addCriterion("STREAMLINE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andStreamlineInfoIsNotNull() {
            addCriterion("STREAMLINE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andStreamlineInfoEqualTo(String value) {
            addCriterion("STREAMLINE_INFO =", value, "streamlineInfo");
            return (Criteria) this;
        }

        public Criteria andStreamlineInfoNotEqualTo(String value) {
            addCriterion("STREAMLINE_INFO <>", value, "streamlineInfo");
            return (Criteria) this;
        }

        public Criteria andStreamlineInfoGreaterThan(String value) {
            addCriterion("STREAMLINE_INFO >", value, "streamlineInfo");
            return (Criteria) this;
        }

        public Criteria andStreamlineInfoGreaterThanOrEqualTo(String value) {
            addCriterion("STREAMLINE_INFO >=", value, "streamlineInfo");
            return (Criteria) this;
        }

        public Criteria andStreamlineInfoLessThan(String value) {
            addCriterion("STREAMLINE_INFO <", value, "streamlineInfo");
            return (Criteria) this;
        }

        public Criteria andStreamlineInfoLessThanOrEqualTo(String value) {
            addCriterion("STREAMLINE_INFO <=", value, "streamlineInfo");
            return (Criteria) this;
        }

        public Criteria andStreamlineInfoLike(String value) {
            addCriterion("STREAMLINE_INFO like", value, "streamlineInfo");
            return (Criteria) this;
        }

        public Criteria andStreamlineInfoNotLike(String value) {
            addCriterion("STREAMLINE_INFO not like", value, "streamlineInfo");
            return (Criteria) this;
        }

        public Criteria andStreamlineInfoIn(List<String> values) {
            addCriterion("STREAMLINE_INFO in", values, "streamlineInfo");
            return (Criteria) this;
        }

        public Criteria andStreamlineInfoNotIn(List<String> values) {
            addCriterion("STREAMLINE_INFO not in", values, "streamlineInfo");
            return (Criteria) this;
        }

        public Criteria andStreamlineInfoBetween(String value1, String value2) {
            addCriterion("STREAMLINE_INFO between", value1, value2, "streamlineInfo");
            return (Criteria) this;
        }

        public Criteria andStreamlineInfoNotBetween(String value1, String value2) {
            addCriterion("STREAMLINE_INFO not between", value1, value2, "streamlineInfo");
            return (Criteria) this;
        }

        public Criteria andStreamlineResultIsNull() {
            addCriterion("STREAMLINE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andStreamlineResultIsNotNull() {
            addCriterion("STREAMLINE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andStreamlineResultEqualTo(String value) {
            addCriterion("STREAMLINE_RESULT =", value, "streamlineResult");
            return (Criteria) this;
        }

        public Criteria andStreamlineResultNotEqualTo(String value) {
            addCriterion("STREAMLINE_RESULT <>", value, "streamlineResult");
            return (Criteria) this;
        }

        public Criteria andStreamlineResultGreaterThan(String value) {
            addCriterion("STREAMLINE_RESULT >", value, "streamlineResult");
            return (Criteria) this;
        }

        public Criteria andStreamlineResultGreaterThanOrEqualTo(String value) {
            addCriterion("STREAMLINE_RESULT >=", value, "streamlineResult");
            return (Criteria) this;
        }

        public Criteria andStreamlineResultLessThan(String value) {
            addCriterion("STREAMLINE_RESULT <", value, "streamlineResult");
            return (Criteria) this;
        }

        public Criteria andStreamlineResultLessThanOrEqualTo(String value) {
            addCriterion("STREAMLINE_RESULT <=", value, "streamlineResult");
            return (Criteria) this;
        }

        public Criteria andStreamlineResultLike(String value) {
            addCriterion("STREAMLINE_RESULT like", value, "streamlineResult");
            return (Criteria) this;
        }

        public Criteria andStreamlineResultNotLike(String value) {
            addCriterion("STREAMLINE_RESULT not like", value, "streamlineResult");
            return (Criteria) this;
        }

        public Criteria andStreamlineResultIn(List<String> values) {
            addCriterion("STREAMLINE_RESULT in", values, "streamlineResult");
            return (Criteria) this;
        }

        public Criteria andStreamlineResultNotIn(List<String> values) {
            addCriterion("STREAMLINE_RESULT not in", values, "streamlineResult");
            return (Criteria) this;
        }

        public Criteria andStreamlineResultBetween(String value1, String value2) {
            addCriterion("STREAMLINE_RESULT between", value1, value2, "streamlineResult");
            return (Criteria) this;
        }

        public Criteria andStreamlineResultNotBetween(String value1, String value2) {
            addCriterion("STREAMLINE_RESULT not between", value1, value2, "streamlineResult");
            return (Criteria) this;
        }

        public Criteria andLastIdIsNull() {
            addCriterion("LAST_ID is null");
            return (Criteria) this;
        }

        public Criteria andLastIdIsNotNull() {
            addCriterion("LAST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLastIdEqualTo(Integer value) {
            addCriterion("LAST_ID =", value, "lastId");
            return (Criteria) this;
        }

        public Criteria andLastIdNotEqualTo(Integer value) {
            addCriterion("LAST_ID <>", value, "lastId");
            return (Criteria) this;
        }

        public Criteria andLastIdGreaterThan(Integer value) {
            addCriterion("LAST_ID >", value, "lastId");
            return (Criteria) this;
        }

        public Criteria andLastIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAST_ID >=", value, "lastId");
            return (Criteria) this;
        }

        public Criteria andLastIdLessThan(Integer value) {
            addCriterion("LAST_ID <", value, "lastId");
            return (Criteria) this;
        }

        public Criteria andLastIdLessThanOrEqualTo(Integer value) {
            addCriterion("LAST_ID <=", value, "lastId");
            return (Criteria) this;
        }

        public Criteria andLastIdIn(List<Integer> values) {
            addCriterion("LAST_ID in", values, "lastId");
            return (Criteria) this;
        }

        public Criteria andLastIdNotIn(List<Integer> values) {
            addCriterion("LAST_ID not in", values, "lastId");
            return (Criteria) this;
        }

        public Criteria andLastIdBetween(Integer value1, Integer value2) {
            addCriterion("LAST_ID between", value1, value2, "lastId");
            return (Criteria) this;
        }

        public Criteria andLastIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LAST_ID not between", value1, value2, "lastId");
            return (Criteria) this;
        }

        public Criteria andNextEmpidIsNull() {
            addCriterion("NEXT_EMPID is null");
            return (Criteria) this;
        }

        public Criteria andNextEmpidIsNotNull() {
            addCriterion("NEXT_EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andNextEmpidEqualTo(Integer value) {
            addCriterion("NEXT_EMPID =", value, "nextEmpid");
            return (Criteria) this;
        }

        public Criteria andNextEmpidNotEqualTo(Integer value) {
            addCriterion("NEXT_EMPID <>", value, "nextEmpid");
            return (Criteria) this;
        }

        public Criteria andNextEmpidGreaterThan(Integer value) {
            addCriterion("NEXT_EMPID >", value, "nextEmpid");
            return (Criteria) this;
        }

        public Criteria andNextEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEXT_EMPID >=", value, "nextEmpid");
            return (Criteria) this;
        }

        public Criteria andNextEmpidLessThan(Integer value) {
            addCriterion("NEXT_EMPID <", value, "nextEmpid");
            return (Criteria) this;
        }

        public Criteria andNextEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("NEXT_EMPID <=", value, "nextEmpid");
            return (Criteria) this;
        }

        public Criteria andNextEmpidIn(List<Integer> values) {
            addCriterion("NEXT_EMPID in", values, "nextEmpid");
            return (Criteria) this;
        }

        public Criteria andNextEmpidNotIn(List<Integer> values) {
            addCriterion("NEXT_EMPID not in", values, "nextEmpid");
            return (Criteria) this;
        }

        public Criteria andNextEmpidBetween(Integer value1, Integer value2) {
            addCriterion("NEXT_EMPID between", value1, value2, "nextEmpid");
            return (Criteria) this;
        }

        public Criteria andNextEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("NEXT_EMPID not between", value1, value2, "nextEmpid");
            return (Criteria) this;
        }

        public Criteria andStreamlineOtherIsNull() {
            addCriterion("STREAMLINE_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andStreamlineOtherIsNotNull() {
            addCriterion("STREAMLINE_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andStreamlineOtherEqualTo(String value) {
            addCriterion("STREAMLINE_OTHER =", value, "streamlineOther");
            return (Criteria) this;
        }

        public Criteria andStreamlineOtherNotEqualTo(String value) {
            addCriterion("STREAMLINE_OTHER <>", value, "streamlineOther");
            return (Criteria) this;
        }

        public Criteria andStreamlineOtherGreaterThan(String value) {
            addCriterion("STREAMLINE_OTHER >", value, "streamlineOther");
            return (Criteria) this;
        }

        public Criteria andStreamlineOtherGreaterThanOrEqualTo(String value) {
            addCriterion("STREAMLINE_OTHER >=", value, "streamlineOther");
            return (Criteria) this;
        }

        public Criteria andStreamlineOtherLessThan(String value) {
            addCriterion("STREAMLINE_OTHER <", value, "streamlineOther");
            return (Criteria) this;
        }

        public Criteria andStreamlineOtherLessThanOrEqualTo(String value) {
            addCriterion("STREAMLINE_OTHER <=", value, "streamlineOther");
            return (Criteria) this;
        }

        public Criteria andStreamlineOtherLike(String value) {
            addCriterion("STREAMLINE_OTHER like", value, "streamlineOther");
            return (Criteria) this;
        }

        public Criteria andStreamlineOtherNotLike(String value) {
            addCriterion("STREAMLINE_OTHER not like", value, "streamlineOther");
            return (Criteria) this;
        }

        public Criteria andStreamlineOtherIn(List<String> values) {
            addCriterion("STREAMLINE_OTHER in", values, "streamlineOther");
            return (Criteria) this;
        }

        public Criteria andStreamlineOtherNotIn(List<String> values) {
            addCriterion("STREAMLINE_OTHER not in", values, "streamlineOther");
            return (Criteria) this;
        }

        public Criteria andStreamlineOtherBetween(String value1, String value2) {
            addCriterion("STREAMLINE_OTHER between", value1, value2, "streamlineOther");
            return (Criteria) this;
        }

        public Criteria andStreamlineOtherNotBetween(String value1, String value2) {
            addCriterion("STREAMLINE_OTHER not between", value1, value2, "streamlineOther");
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