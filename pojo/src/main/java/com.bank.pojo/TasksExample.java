package com.bank.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TasksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TasksExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskEmpidIsNull() {
            addCriterion("TASK_EMPID is null");
            return (Criteria) this;
        }

        public Criteria andTaskEmpidIsNotNull() {
            addCriterion("TASK_EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEmpidEqualTo(Integer value) {
            addCriterion("TASK_EMPID =", value, "taskEmpid");
            return (Criteria) this;
        }

        public Criteria andTaskEmpidNotEqualTo(Integer value) {
            addCriterion("TASK_EMPID <>", value, "taskEmpid");
            return (Criteria) this;
        }

        public Criteria andTaskEmpidGreaterThan(Integer value) {
            addCriterion("TASK_EMPID >", value, "taskEmpid");
            return (Criteria) this;
        }

        public Criteria andTaskEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_EMPID >=", value, "taskEmpid");
            return (Criteria) this;
        }

        public Criteria andTaskEmpidLessThan(Integer value) {
            addCriterion("TASK_EMPID <", value, "taskEmpid");
            return (Criteria) this;
        }

        public Criteria andTaskEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_EMPID <=", value, "taskEmpid");
            return (Criteria) this;
        }

        public Criteria andTaskEmpidIn(List<Integer> values) {
            addCriterion("TASK_EMPID in", values, "taskEmpid");
            return (Criteria) this;
        }

        public Criteria andTaskEmpidNotIn(List<Integer> values) {
            addCriterion("TASK_EMPID not in", values, "taskEmpid");
            return (Criteria) this;
        }

        public Criteria andTaskEmpidBetween(Integer value1, Integer value2) {
            addCriterion("TASK_EMPID between", value1, value2, "taskEmpid");
            return (Criteria) this;
        }

        public Criteria andTaskEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_EMPID not between", value1, value2, "taskEmpid");
            return (Criteria) this;
        }

        public Criteria andTaskDateIsNull() {
            addCriterion("TASK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTaskDateIsNotNull() {
            addCriterion("TASK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDateEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_DATE =", value, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_DATE <>", value, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateGreaterThan(Date value) {
            addCriterionForJDBCDate("TASK_DATE >", value, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_DATE >=", value, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateLessThan(Date value) {
            addCriterionForJDBCDate("TASK_DATE <", value, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TASK_DATE <=", value, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateIn(List<Date> values) {
            addCriterionForJDBCDate("TASK_DATE in", values, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TASK_DATE not in", values, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TASK_DATE between", value1, value2, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TASK_DATE not between", value1, value2, "taskDate");
            return (Criteria) this;
        }

        public Criteria andTaskTitleIsNull() {
            addCriterion("TASK_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTaskTitleIsNotNull() {
            addCriterion("TASK_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTitleEqualTo(String value) {
            addCriterion("TASK_TITLE =", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotEqualTo(String value) {
            addCriterion("TASK_TITLE <>", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleGreaterThan(String value) {
            addCriterion("TASK_TITLE >", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TITLE >=", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLessThan(String value) {
            addCriterion("TASK_TITLE <", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLessThanOrEqualTo(String value) {
            addCriterion("TASK_TITLE <=", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLike(String value) {
            addCriterion("TASK_TITLE like", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotLike(String value) {
            addCriterion("TASK_TITLE not like", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleIn(List<String> values) {
            addCriterion("TASK_TITLE in", values, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotIn(List<String> values) {
            addCriterion("TASK_TITLE not in", values, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleBetween(String value1, String value2) {
            addCriterion("TASK_TITLE between", value1, value2, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotBetween(String value1, String value2) {
            addCriterion("TASK_TITLE not between", value1, value2, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskInfoIsNull() {
            addCriterion("TASK_INFO is null");
            return (Criteria) this;
        }

        public Criteria andTaskInfoIsNotNull() {
            addCriterion("TASK_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andTaskInfoEqualTo(String value) {
            addCriterion("TASK_INFO =", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoNotEqualTo(String value) {
            addCriterion("TASK_INFO <>", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoGreaterThan(String value) {
            addCriterion("TASK_INFO >", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_INFO >=", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoLessThan(String value) {
            addCriterion("TASK_INFO <", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoLessThanOrEqualTo(String value) {
            addCriterion("TASK_INFO <=", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoLike(String value) {
            addCriterion("TASK_INFO like", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoNotLike(String value) {
            addCriterion("TASK_INFO not like", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoIn(List<String> values) {
            addCriterion("TASK_INFO in", values, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoNotIn(List<String> values) {
            addCriterion("TASK_INFO not in", values, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoBetween(String value1, String value2) {
            addCriterion("TASK_INFO between", value1, value2, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoNotBetween(String value1, String value2) {
            addCriterion("TASK_INFO not between", value1, value2, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskResultIsNull() {
            addCriterion("TASK_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andTaskResultIsNotNull() {
            addCriterion("TASK_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andTaskResultEqualTo(String value) {
            addCriterion("TASK_RESULT =", value, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultNotEqualTo(String value) {
            addCriterion("TASK_RESULT <>", value, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultGreaterThan(String value) {
            addCriterion("TASK_RESULT >", value, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_RESULT >=", value, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultLessThan(String value) {
            addCriterion("TASK_RESULT <", value, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultLessThanOrEqualTo(String value) {
            addCriterion("TASK_RESULT <=", value, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultLike(String value) {
            addCriterion("TASK_RESULT like", value, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultNotLike(String value) {
            addCriterion("TASK_RESULT not like", value, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultIn(List<String> values) {
            addCriterion("TASK_RESULT in", values, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultNotIn(List<String> values) {
            addCriterion("TASK_RESULT not in", values, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultBetween(String value1, String value2) {
            addCriterion("TASK_RESULT between", value1, value2, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskResultNotBetween(String value1, String value2) {
            addCriterion("TASK_RESULT not between", value1, value2, "taskResult");
            return (Criteria) this;
        }

        public Criteria andTaskOtherIsNull() {
            addCriterion("TASK_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andTaskOtherIsNotNull() {
            addCriterion("TASK_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andTaskOtherEqualTo(String value) {
            addCriterion("TASK_OTHER =", value, "taskOther");
            return (Criteria) this;
        }

        public Criteria andTaskOtherNotEqualTo(String value) {
            addCriterion("TASK_OTHER <>", value, "taskOther");
            return (Criteria) this;
        }

        public Criteria andTaskOtherGreaterThan(String value) {
            addCriterion("TASK_OTHER >", value, "taskOther");
            return (Criteria) this;
        }

        public Criteria andTaskOtherGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_OTHER >=", value, "taskOther");
            return (Criteria) this;
        }

        public Criteria andTaskOtherLessThan(String value) {
            addCriterion("TASK_OTHER <", value, "taskOther");
            return (Criteria) this;
        }

        public Criteria andTaskOtherLessThanOrEqualTo(String value) {
            addCriterion("TASK_OTHER <=", value, "taskOther");
            return (Criteria) this;
        }

        public Criteria andTaskOtherLike(String value) {
            addCriterion("TASK_OTHER like", value, "taskOther");
            return (Criteria) this;
        }

        public Criteria andTaskOtherNotLike(String value) {
            addCriterion("TASK_OTHER not like", value, "taskOther");
            return (Criteria) this;
        }

        public Criteria andTaskOtherIn(List<String> values) {
            addCriterion("TASK_OTHER in", values, "taskOther");
            return (Criteria) this;
        }

        public Criteria andTaskOtherNotIn(List<String> values) {
            addCriterion("TASK_OTHER not in", values, "taskOther");
            return (Criteria) this;
        }

        public Criteria andTaskOtherBetween(String value1, String value2) {
            addCriterion("TASK_OTHER between", value1, value2, "taskOther");
            return (Criteria) this;
        }

        public Criteria andTaskOtherNotBetween(String value1, String value2) {
            addCriterion("TASK_OTHER not between", value1, value2, "taskOther");
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