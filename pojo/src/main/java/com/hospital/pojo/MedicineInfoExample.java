package com.hospital.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MedicineInfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicineInfoExample() {
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

        public Criteria andMedicineInfoIdIsNull() {
            addCriterion("medicine_info_id is null");
            return (Criteria) this;
        }

        public Criteria andMedicineInfoIdIsNotNull() {
            addCriterion("medicine_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineInfoIdEqualTo(String value) {
            addCriterion("medicine_info_id =", value, "medicineInfoId");
            return (Criteria) this;
        }

        public Criteria andMedicineInfoIdNotEqualTo(String value) {
            addCriterion("medicine_info_id <>", value, "medicineInfoId");
            return (Criteria) this;
        }

        public Criteria andMedicineInfoIdGreaterThan(String value) {
            addCriterion("medicine_info_id >", value, "medicineInfoId");
            return (Criteria) this;
        }

        public Criteria andMedicineInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_info_id >=", value, "medicineInfoId");
            return (Criteria) this;
        }

        public Criteria andMedicineInfoIdLessThan(String value) {
            addCriterion("medicine_info_id <", value, "medicineInfoId");
            return (Criteria) this;
        }

        public Criteria andMedicineInfoIdLessThanOrEqualTo(String value) {
            addCriterion("medicine_info_id <=", value, "medicineInfoId");
            return (Criteria) this;
        }

        public Criteria andMedicineInfoIdLike(String value) {
            addCriterion("medicine_info_id like", value, "medicineInfoId");
            return (Criteria) this;
        }

        public Criteria andMedicineInfoIdNotLike(String value) {
            addCriterion("medicine_info_id not like", value, "medicineInfoId");
            return (Criteria) this;
        }

        public Criteria andMedicineInfoIdIn(List<String> values) {
            addCriterion("medicine_info_id in", values, "medicineInfoId");
            return (Criteria) this;
        }

        public Criteria andMedicineInfoIdNotIn(List<String> values) {
            addCriterion("medicine_info_id not in", values, "medicineInfoId");
            return (Criteria) this;
        }

        public Criteria andMedicineInfoIdBetween(String value1, String value2) {
            addCriterion("medicine_info_id between", value1, value2, "medicineInfoId");
            return (Criteria) this;
        }

        public Criteria andMedicineInfoIdNotBetween(String value1, String value2) {
            addCriterion("medicine_info_id not between", value1, value2, "medicineInfoId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIsNull() {
            addCriterion("medicine_id is null");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIsNotNull() {
            addCriterion("medicine_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineIdEqualTo(String value) {
            addCriterion("medicine_id =", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotEqualTo(String value) {
            addCriterion("medicine_id <>", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdGreaterThan(String value) {
            addCriterion("medicine_id >", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_id >=", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdLessThan(String value) {
            addCriterion("medicine_id <", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdLessThanOrEqualTo(String value) {
            addCriterion("medicine_id <=", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdLike(String value) {
            addCriterion("medicine_id like", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotLike(String value) {
            addCriterion("medicine_id not like", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIn(List<String> values) {
            addCriterion("medicine_id in", values, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotIn(List<String> values) {
            addCriterion("medicine_id not in", values, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdBetween(String value1, String value2) {
            addCriterion("medicine_id between", value1, value2, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotBetween(String value1, String value2) {
            addCriterion("medicine_id not between", value1, value2, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineNumIsNull() {
            addCriterion("medicine_num is null");
            return (Criteria) this;
        }

        public Criteria andMedicineNumIsNotNull() {
            addCriterion("medicine_num is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineNumEqualTo(Integer value) {
            addCriterion("medicine_num =", value, "medicineNum");
            return (Criteria) this;
        }

        public Criteria andMedicineNumNotEqualTo(Integer value) {
            addCriterion("medicine_num <>", value, "medicineNum");
            return (Criteria) this;
        }

        public Criteria andMedicineNumGreaterThan(Integer value) {
            addCriterion("medicine_num >", value, "medicineNum");
            return (Criteria) this;
        }

        public Criteria andMedicineNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicine_num >=", value, "medicineNum");
            return (Criteria) this;
        }

        public Criteria andMedicineNumLessThan(Integer value) {
            addCriterion("medicine_num <", value, "medicineNum");
            return (Criteria) this;
        }

        public Criteria andMedicineNumLessThanOrEqualTo(Integer value) {
            addCriterion("medicine_num <=", value, "medicineNum");
            return (Criteria) this;
        }

        public Criteria andMedicineNumIn(List<Integer> values) {
            addCriterion("medicine_num in", values, "medicineNum");
            return (Criteria) this;
        }

        public Criteria andMedicineNumNotIn(List<Integer> values) {
            addCriterion("medicine_num not in", values, "medicineNum");
            return (Criteria) this;
        }

        public Criteria andMedicineNumBetween(Integer value1, Integer value2) {
            addCriterion("medicine_num between", value1, value2, "medicineNum");
            return (Criteria) this;
        }

        public Criteria andMedicineNumNotBetween(Integer value1, Integer value2) {
            addCriterion("medicine_num not between", value1, value2, "medicineNum");
            return (Criteria) this;
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

        public Criteria andMedicineDosageIsNull() {
            addCriterion("medicine_dosage is null");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageIsNotNull() {
            addCriterion("medicine_dosage is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageEqualTo(String value) {
            addCriterion("medicine_dosage =", value, "medicineDosage");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageNotEqualTo(String value) {
            addCriterion("medicine_dosage <>", value, "medicineDosage");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageGreaterThan(String value) {
            addCriterion("medicine_dosage >", value, "medicineDosage");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_dosage >=", value, "medicineDosage");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageLessThan(String value) {
            addCriterion("medicine_dosage <", value, "medicineDosage");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageLessThanOrEqualTo(String value) {
            addCriterion("medicine_dosage <=", value, "medicineDosage");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageLike(String value) {
            addCriterion("medicine_dosage like", value, "medicineDosage");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageNotLike(String value) {
            addCriterion("medicine_dosage not like", value, "medicineDosage");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageIn(List<String> values) {
            addCriterion("medicine_dosage in", values, "medicineDosage");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageNotIn(List<String> values) {
            addCriterion("medicine_dosage not in", values, "medicineDosage");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageBetween(String value1, String value2) {
            addCriterion("medicine_dosage between", value1, value2, "medicineDosage");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageNotBetween(String value1, String value2) {
            addCriterion("medicine_dosage not between", value1, value2, "medicineDosage");
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