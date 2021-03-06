package com.hospital.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RolerExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RolerExample() {
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

        public Criteria andRolerIdIsNull() {
            addCriterion("roler_id is null");
            return (Criteria) this;
        }

        public Criteria andRolerIdIsNotNull() {
            addCriterion("roler_id is not null");
            return (Criteria) this;
        }

        public Criteria andRolerIdEqualTo(Integer value) {
            addCriterion("roler_id =", value, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdNotEqualTo(Integer value) {
            addCriterion("roler_id <>", value, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdGreaterThan(Integer value) {
            addCriterion("roler_id >", value, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roler_id >=", value, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdLessThan(Integer value) {
            addCriterion("roler_id <", value, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdLessThanOrEqualTo(Integer value) {
            addCriterion("roler_id <=", value, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdIn(List<Integer> values) {
            addCriterion("roler_id in", values, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdNotIn(List<Integer> values) {
            addCriterion("roler_id not in", values, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdBetween(Integer value1, Integer value2) {
            addCriterion("roler_id between", value1, value2, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roler_id not between", value1, value2, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerNameIsNull() {
            addCriterion("roler_name is null");
            return (Criteria) this;
        }

        public Criteria andRolerNameIsNotNull() {
            addCriterion("roler_name is not null");
            return (Criteria) this;
        }

        public Criteria andRolerNameEqualTo(String value) {
            addCriterion("roler_name =", value, "rolerName");
            return (Criteria) this;
        }

        public Criteria andRolerNameNotEqualTo(String value) {
            addCriterion("roler_name <>", value, "rolerName");
            return (Criteria) this;
        }

        public Criteria andRolerNameGreaterThan(String value) {
            addCriterion("roler_name >", value, "rolerName");
            return (Criteria) this;
        }

        public Criteria andRolerNameGreaterThanOrEqualTo(String value) {
            addCriterion("roler_name >=", value, "rolerName");
            return (Criteria) this;
        }

        public Criteria andRolerNameLessThan(String value) {
            addCriterion("roler_name <", value, "rolerName");
            return (Criteria) this;
        }

        public Criteria andRolerNameLessThanOrEqualTo(String value) {
            addCriterion("roler_name <=", value, "rolerName");
            return (Criteria) this;
        }

        public Criteria andRolerNameLike(String value) {
            addCriterion("roler_name like", value, "rolerName");
            return (Criteria) this;
        }

        public Criteria andRolerNameNotLike(String value) {
            addCriterion("roler_name not like", value, "rolerName");
            return (Criteria) this;
        }

        public Criteria andRolerNameIn(List<String> values) {
            addCriterion("roler_name in", values, "rolerName");
            return (Criteria) this;
        }

        public Criteria andRolerNameNotIn(List<String> values) {
            addCriterion("roler_name not in", values, "rolerName");
            return (Criteria) this;
        }

        public Criteria andRolerNameBetween(String value1, String value2) {
            addCriterion("roler_name between", value1, value2, "rolerName");
            return (Criteria) this;
        }

        public Criteria andRolerNameNotBetween(String value1, String value2) {
            addCriterion("roler_name not between", value1, value2, "rolerName");
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