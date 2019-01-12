package com.bank.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceCommitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceCommitExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("service_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("service_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("service_type =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("service_type <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("service_type >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("service_type >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("service_type <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("service_type <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("service_type like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("service_type not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("service_type in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("service_type not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("service_type between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("service_type not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceCustomerIsNull() {
            addCriterion("service_customer is null");
            return (Criteria) this;
        }

        public Criteria andServiceCustomerIsNotNull() {
            addCriterion("service_customer is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCustomerEqualTo(String value) {
            addCriterion("service_customer =", value, "serviceCustomer");
            return (Criteria) this;
        }

        public Criteria andServiceCustomerNotEqualTo(String value) {
            addCriterion("service_customer <>", value, "serviceCustomer");
            return (Criteria) this;
        }

        public Criteria andServiceCustomerGreaterThan(String value) {
            addCriterion("service_customer >", value, "serviceCustomer");
            return (Criteria) this;
        }

        public Criteria andServiceCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("service_customer >=", value, "serviceCustomer");
            return (Criteria) this;
        }

        public Criteria andServiceCustomerLessThan(String value) {
            addCriterion("service_customer <", value, "serviceCustomer");
            return (Criteria) this;
        }

        public Criteria andServiceCustomerLessThanOrEqualTo(String value) {
            addCriterion("service_customer <=", value, "serviceCustomer");
            return (Criteria) this;
        }

        public Criteria andServiceCustomerLike(String value) {
            addCriterion("service_customer like", value, "serviceCustomer");
            return (Criteria) this;
        }

        public Criteria andServiceCustomerNotLike(String value) {
            addCriterion("service_customer not like", value, "serviceCustomer");
            return (Criteria) this;
        }

        public Criteria andServiceCustomerIn(List<String> values) {
            addCriterion("service_customer in", values, "serviceCustomer");
            return (Criteria) this;
        }

        public Criteria andServiceCustomerNotIn(List<String> values) {
            addCriterion("service_customer not in", values, "serviceCustomer");
            return (Criteria) this;
        }

        public Criteria andServiceCustomerBetween(String value1, String value2) {
            addCriterion("service_customer between", value1, value2, "serviceCustomer");
            return (Criteria) this;
        }

        public Criteria andServiceCustomerNotBetween(String value1, String value2) {
            addCriterion("service_customer not between", value1, value2, "serviceCustomer");
            return (Criteria) this;
        }

        public Criteria andServiceCardIsNull() {
            addCriterion("service_card is null");
            return (Criteria) this;
        }

        public Criteria andServiceCardIsNotNull() {
            addCriterion("service_card is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCardEqualTo(String value) {
            addCriterion("service_card =", value, "serviceCard");
            return (Criteria) this;
        }

        public Criteria andServiceCardNotEqualTo(String value) {
            addCriterion("service_card <>", value, "serviceCard");
            return (Criteria) this;
        }

        public Criteria andServiceCardGreaterThan(String value) {
            addCriterion("service_card >", value, "serviceCard");
            return (Criteria) this;
        }

        public Criteria andServiceCardGreaterThanOrEqualTo(String value) {
            addCriterion("service_card >=", value, "serviceCard");
            return (Criteria) this;
        }

        public Criteria andServiceCardLessThan(String value) {
            addCriterion("service_card <", value, "serviceCard");
            return (Criteria) this;
        }

        public Criteria andServiceCardLessThanOrEqualTo(String value) {
            addCriterion("service_card <=", value, "serviceCard");
            return (Criteria) this;
        }

        public Criteria andServiceCardLike(String value) {
            addCriterion("service_card like", value, "serviceCard");
            return (Criteria) this;
        }

        public Criteria andServiceCardNotLike(String value) {
            addCriterion("service_card not like", value, "serviceCard");
            return (Criteria) this;
        }

        public Criteria andServiceCardIn(List<String> values) {
            addCriterion("service_card in", values, "serviceCard");
            return (Criteria) this;
        }

        public Criteria andServiceCardNotIn(List<String> values) {
            addCriterion("service_card not in", values, "serviceCard");
            return (Criteria) this;
        }

        public Criteria andServiceCardBetween(String value1, String value2) {
            addCriterion("service_card between", value1, value2, "serviceCard");
            return (Criteria) this;
        }

        public Criteria andServiceCardNotBetween(String value1, String value2) {
            addCriterion("service_card not between", value1, value2, "serviceCard");
            return (Criteria) this;
        }

        public Criteria andServiceUseIsNull() {
            addCriterion("service_use is null");
            return (Criteria) this;
        }

        public Criteria andServiceUseIsNotNull() {
            addCriterion("service_use is not null");
            return (Criteria) this;
        }

        public Criteria andServiceUseEqualTo(String value) {
            addCriterion("service_use =", value, "serviceUse");
            return (Criteria) this;
        }

        public Criteria andServiceUseNotEqualTo(String value) {
            addCriterion("service_use <>", value, "serviceUse");
            return (Criteria) this;
        }

        public Criteria andServiceUseGreaterThan(String value) {
            addCriterion("service_use >", value, "serviceUse");
            return (Criteria) this;
        }

        public Criteria andServiceUseGreaterThanOrEqualTo(String value) {
            addCriterion("service_use >=", value, "serviceUse");
            return (Criteria) this;
        }

        public Criteria andServiceUseLessThan(String value) {
            addCriterion("service_use <", value, "serviceUse");
            return (Criteria) this;
        }

        public Criteria andServiceUseLessThanOrEqualTo(String value) {
            addCriterion("service_use <=", value, "serviceUse");
            return (Criteria) this;
        }

        public Criteria andServiceUseLike(String value) {
            addCriterion("service_use like", value, "serviceUse");
            return (Criteria) this;
        }

        public Criteria andServiceUseNotLike(String value) {
            addCriterion("service_use not like", value, "serviceUse");
            return (Criteria) this;
        }

        public Criteria andServiceUseIn(List<String> values) {
            addCriterion("service_use in", values, "serviceUse");
            return (Criteria) this;
        }

        public Criteria andServiceUseNotIn(List<String> values) {
            addCriterion("service_use not in", values, "serviceUse");
            return (Criteria) this;
        }

        public Criteria andServiceUseBetween(String value1, String value2) {
            addCriterion("service_use between", value1, value2, "serviceUse");
            return (Criteria) this;
        }

        public Criteria andServiceUseNotBetween(String value1, String value2) {
            addCriterion("service_use not between", value1, value2, "serviceUse");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNull() {
            addCriterion("service_phone is null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNotNull() {
            addCriterion("service_phone is not null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneEqualTo(String value) {
            addCriterion("service_phone =", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotEqualTo(String value) {
            addCriterion("service_phone <>", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThan(String value) {
            addCriterion("service_phone >", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("service_phone >=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThan(String value) {
            addCriterion("service_phone <", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThanOrEqualTo(String value) {
            addCriterion("service_phone <=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLike(String value) {
            addCriterion("service_phone like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotLike(String value) {
            addCriterion("service_phone not like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIn(List<String> values) {
            addCriterion("service_phone in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotIn(List<String> values) {
            addCriterion("service_phone not in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneBetween(String value1, String value2) {
            addCriterion("service_phone between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotBetween(String value1, String value2) {
            addCriterion("service_phone not between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServiceDateIsNull() {
            addCriterion("service_date is null");
            return (Criteria) this;
        }

        public Criteria andServiceDateIsNotNull() {
            addCriterion("service_date is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDateEqualTo(Date value) {
            addCriterion("service_date =", value, "serviceDate");
            return (Criteria) this;
        }

        public Criteria andServiceDateNotEqualTo(Date value) {
            addCriterion("service_date <>", value, "serviceDate");
            return (Criteria) this;
        }

        public Criteria andServiceDateGreaterThan(Date value) {
            addCriterion("service_date >", value, "serviceDate");
            return (Criteria) this;
        }

        public Criteria andServiceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("service_date >=", value, "serviceDate");
            return (Criteria) this;
        }

        public Criteria andServiceDateLessThan(Date value) {
            addCriterion("service_date <", value, "serviceDate");
            return (Criteria) this;
        }

        public Criteria andServiceDateLessThanOrEqualTo(Date value) {
            addCriterion("service_date <=", value, "serviceDate");
            return (Criteria) this;
        }

        public Criteria andServiceDateIn(List<Date> values) {
            addCriterion("service_date in", values, "serviceDate");
            return (Criteria) this;
        }

        public Criteria andServiceDateNotIn(List<Date> values) {
            addCriterion("service_date not in", values, "serviceDate");
            return (Criteria) this;
        }

        public Criteria andServiceDateBetween(Date value1, Date value2) {
            addCriterion("service_date between", value1, value2, "serviceDate");
            return (Criteria) this;
        }

        public Criteria andServiceDateNotBetween(Date value1, Date value2) {
            addCriterion("service_date not between", value1, value2, "serviceDate");
            return (Criteria) this;
        }

        public Criteria andServiceDescIsNull() {
            addCriterion("service_desc is null");
            return (Criteria) this;
        }

        public Criteria andServiceDescIsNotNull() {
            addCriterion("service_desc is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDescEqualTo(String value) {
            addCriterion("service_desc =", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotEqualTo(String value) {
            addCriterion("service_desc <>", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescGreaterThan(String value) {
            addCriterion("service_desc >", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescGreaterThanOrEqualTo(String value) {
            addCriterion("service_desc >=", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescLessThan(String value) {
            addCriterion("service_desc <", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescLessThanOrEqualTo(String value) {
            addCriterion("service_desc <=", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescLike(String value) {
            addCriterion("service_desc like", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotLike(String value) {
            addCriterion("service_desc not like", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescIn(List<String> values) {
            addCriterion("service_desc in", values, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotIn(List<String> values) {
            addCriterion("service_desc not in", values, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescBetween(String value1, String value2) {
            addCriterion("service_desc between", value1, value2, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotBetween(String value1, String value2) {
            addCriterion("service_desc not between", value1, value2, "serviceDesc");
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