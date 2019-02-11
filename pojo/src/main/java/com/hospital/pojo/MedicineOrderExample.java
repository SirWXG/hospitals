package com.hospital.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MedicineOrderExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicineOrderExample() {
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

        public Criteria andMedicineOrderIdIsNull() {
            addCriterion("medicine_order_id is null");
            return (Criteria) this;
        }

        public Criteria andMedicineOrderIdIsNotNull() {
            addCriterion("medicine_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineOrderIdEqualTo(String value) {
            addCriterion("medicine_order_id =", value, "medicineOrderId");
            return (Criteria) this;
        }

        public Criteria andMedicineOrderIdNotEqualTo(String value) {
            addCriterion("medicine_order_id <>", value, "medicineOrderId");
            return (Criteria) this;
        }

        public Criteria andMedicineOrderIdGreaterThan(String value) {
            addCriterion("medicine_order_id >", value, "medicineOrderId");
            return (Criteria) this;
        }

        public Criteria andMedicineOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_order_id >=", value, "medicineOrderId");
            return (Criteria) this;
        }

        public Criteria andMedicineOrderIdLessThan(String value) {
            addCriterion("medicine_order_id <", value, "medicineOrderId");
            return (Criteria) this;
        }

        public Criteria andMedicineOrderIdLessThanOrEqualTo(String value) {
            addCriterion("medicine_order_id <=", value, "medicineOrderId");
            return (Criteria) this;
        }

        public Criteria andMedicineOrderIdLike(String value) {
            addCriterion("medicine_order_id like", value, "medicineOrderId");
            return (Criteria) this;
        }

        public Criteria andMedicineOrderIdNotLike(String value) {
            addCriterion("medicine_order_id not like", value, "medicineOrderId");
            return (Criteria) this;
        }

        public Criteria andMedicineOrderIdIn(List<String> values) {
            addCriterion("medicine_order_id in", values, "medicineOrderId");
            return (Criteria) this;
        }

        public Criteria andMedicineOrderIdNotIn(List<String> values) {
            addCriterion("medicine_order_id not in", values, "medicineOrderId");
            return (Criteria) this;
        }

        public Criteria andMedicineOrderIdBetween(String value1, String value2) {
            addCriterion("medicine_order_id between", value1, value2, "medicineOrderId");
            return (Criteria) this;
        }

        public Criteria andMedicineOrderIdNotBetween(String value1, String value2) {
            addCriterion("medicine_order_id not between", value1, value2, "medicineOrderId");
            return (Criteria) this;
        }

        public Criteria andCottomsIdIsNull() {
            addCriterion("cottoms_id is null");
            return (Criteria) this;
        }

        public Criteria andCottomsIdIsNotNull() {
            addCriterion("cottoms_id is not null");
            return (Criteria) this;
        }

        public Criteria andCottomsIdEqualTo(String value) {
            addCriterion("cottoms_id =", value, "cottomsId");
            return (Criteria) this;
        }

        public Criteria andCottomsIdNotEqualTo(String value) {
            addCriterion("cottoms_id <>", value, "cottomsId");
            return (Criteria) this;
        }

        public Criteria andCottomsIdGreaterThan(String value) {
            addCriterion("cottoms_id >", value, "cottomsId");
            return (Criteria) this;
        }

        public Criteria andCottomsIdGreaterThanOrEqualTo(String value) {
            addCriterion("cottoms_id >=", value, "cottomsId");
            return (Criteria) this;
        }

        public Criteria andCottomsIdLessThan(String value) {
            addCriterion("cottoms_id <", value, "cottomsId");
            return (Criteria) this;
        }

        public Criteria andCottomsIdLessThanOrEqualTo(String value) {
            addCriterion("cottoms_id <=", value, "cottomsId");
            return (Criteria) this;
        }

        public Criteria andCottomsIdLike(String value) {
            addCriterion("cottoms_id like", value, "cottomsId");
            return (Criteria) this;
        }

        public Criteria andCottomsIdNotLike(String value) {
            addCriterion("cottoms_id not like", value, "cottomsId");
            return (Criteria) this;
        }

        public Criteria andCottomsIdIn(List<String> values) {
            addCriterion("cottoms_id in", values, "cottomsId");
            return (Criteria) this;
        }

        public Criteria andCottomsIdNotIn(List<String> values) {
            addCriterion("cottoms_id not in", values, "cottomsId");
            return (Criteria) this;
        }

        public Criteria andCottomsIdBetween(String value1, String value2) {
            addCriterion("cottoms_id between", value1, value2, "cottomsId");
            return (Criteria) this;
        }

        public Criteria andCottomsIdNotBetween(String value1, String value2) {
            addCriterion("cottoms_id not between", value1, value2, "cottomsId");
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