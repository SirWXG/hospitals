package com.bank.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanExample() {
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

        public Criteria andLoanIdIsNull() {
            addCriterion("LOAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNotNull() {
            addCriterion("LOAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLoanIdEqualTo(Integer value) {
            addCriterion("LOAN_ID =", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotEqualTo(Integer value) {
            addCriterion("LOAN_ID <>", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThan(Integer value) {
            addCriterion("LOAN_ID >", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOAN_ID >=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThan(Integer value) {
            addCriterion("LOAN_ID <", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThanOrEqualTo(Integer value) {
            addCriterion("LOAN_ID <=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIn(List<Integer> values) {
            addCriterion("LOAN_ID in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotIn(List<Integer> values) {
            addCriterion("LOAN_ID not in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_ID between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_ID not between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("CUSTOMER_ID like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("CUSTOMER_ID not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("LOAN_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("LOAN_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(Integer value) {
            addCriterion("LOAN_AMOUNT =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(Integer value) {
            addCriterion("LOAN_AMOUNT <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(Integer value) {
            addCriterion("LOAN_AMOUNT >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOAN_AMOUNT >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(Integer value) {
            addCriterion("LOAN_AMOUNT <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(Integer value) {
            addCriterion("LOAN_AMOUNT <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<Integer> values) {
            addCriterion("LOAN_AMOUNT in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<Integer> values) {
            addCriterion("LOAN_AMOUNT not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_AMOUNT between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_AMOUNT not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanCardIdIsNull() {
            addCriterion("LOAN_CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andLoanCardIdIsNotNull() {
            addCriterion("LOAN_CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLoanCardIdEqualTo(String value) {
            addCriterion("LOAN_CARD_ID =", value, "loanCardId");
            return (Criteria) this;
        }

        public Criteria andLoanCardIdNotEqualTo(String value) {
            addCriterion("LOAN_CARD_ID <>", value, "loanCardId");
            return (Criteria) this;
        }

        public Criteria andLoanCardIdGreaterThan(String value) {
            addCriterion("LOAN_CARD_ID >", value, "loanCardId");
            return (Criteria) this;
        }

        public Criteria andLoanCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_CARD_ID >=", value, "loanCardId");
            return (Criteria) this;
        }

        public Criteria andLoanCardIdLessThan(String value) {
            addCriterion("LOAN_CARD_ID <", value, "loanCardId");
            return (Criteria) this;
        }

        public Criteria andLoanCardIdLessThanOrEqualTo(String value) {
            addCriterion("LOAN_CARD_ID <=", value, "loanCardId");
            return (Criteria) this;
        }

        public Criteria andLoanCardIdLike(String value) {
            addCriterion("LOAN_CARD_ID like", value, "loanCardId");
            return (Criteria) this;
        }

        public Criteria andLoanCardIdNotLike(String value) {
            addCriterion("LOAN_CARD_ID not like", value, "loanCardId");
            return (Criteria) this;
        }

        public Criteria andLoanCardIdIn(List<String> values) {
            addCriterion("LOAN_CARD_ID in", values, "loanCardId");
            return (Criteria) this;
        }

        public Criteria andLoanCardIdNotIn(List<String> values) {
            addCriterion("LOAN_CARD_ID not in", values, "loanCardId");
            return (Criteria) this;
        }

        public Criteria andLoanCardIdBetween(String value1, String value2) {
            addCriterion("LOAN_CARD_ID between", value1, value2, "loanCardId");
            return (Criteria) this;
        }

        public Criteria andLoanCardIdNotBetween(String value1, String value2) {
            addCriterion("LOAN_CARD_ID not between", value1, value2, "loanCardId");
            return (Criteria) this;
        }

        public Criteria andLoanTermIsNull() {
            addCriterion("LOAN_TERM is null");
            return (Criteria) this;
        }

        public Criteria andLoanTermIsNotNull() {
            addCriterion("LOAN_TERM is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTermEqualTo(Integer value) {
            addCriterion("LOAN_TERM =", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermNotEqualTo(Integer value) {
            addCriterion("LOAN_TERM <>", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermGreaterThan(Integer value) {
            addCriterion("LOAN_TERM >", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOAN_TERM >=", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermLessThan(Integer value) {
            addCriterion("LOAN_TERM <", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermLessThanOrEqualTo(Integer value) {
            addCriterion("LOAN_TERM <=", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermIn(List<Integer> values) {
            addCriterion("LOAN_TERM in", values, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermNotIn(List<Integer> values) {
            addCriterion("LOAN_TERM not in", values, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_TERM between", value1, value2, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermNotBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_TERM not between", value1, value2, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanRateIsNull() {
            addCriterion("LOAN_RATE is null");
            return (Criteria) this;
        }

        public Criteria andLoanRateIsNotNull() {
            addCriterion("LOAN_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoanRateEqualTo(Integer value) {
            addCriterion("LOAN_RATE =", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotEqualTo(Integer value) {
            addCriterion("LOAN_RATE <>", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateGreaterThan(Integer value) {
            addCriterion("LOAN_RATE >", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOAN_RATE >=", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateLessThan(Integer value) {
            addCriterion("LOAN_RATE <", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateLessThanOrEqualTo(Integer value) {
            addCriterion("LOAN_RATE <=", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateIn(List<Integer> values) {
            addCriterion("LOAN_RATE in", values, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotIn(List<Integer> values) {
            addCriterion("LOAN_RATE not in", values, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_RATE between", value1, value2, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_RATE not between", value1, value2, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanGuarantorIsNull() {
            addCriterion("LOAN_GUARANTOR is null");
            return (Criteria) this;
        }

        public Criteria andLoanGuarantorIsNotNull() {
            addCriterion("LOAN_GUARANTOR is not null");
            return (Criteria) this;
        }

        public Criteria andLoanGuarantorEqualTo(String value) {
            addCriterion("LOAN_GUARANTOR =", value, "loanGuarantor");
            return (Criteria) this;
        }

        public Criteria andLoanGuarantorNotEqualTo(String value) {
            addCriterion("LOAN_GUARANTOR <>", value, "loanGuarantor");
            return (Criteria) this;
        }

        public Criteria andLoanGuarantorGreaterThan(String value) {
            addCriterion("LOAN_GUARANTOR >", value, "loanGuarantor");
            return (Criteria) this;
        }

        public Criteria andLoanGuarantorGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_GUARANTOR >=", value, "loanGuarantor");
            return (Criteria) this;
        }

        public Criteria andLoanGuarantorLessThan(String value) {
            addCriterion("LOAN_GUARANTOR <", value, "loanGuarantor");
            return (Criteria) this;
        }

        public Criteria andLoanGuarantorLessThanOrEqualTo(String value) {
            addCriterion("LOAN_GUARANTOR <=", value, "loanGuarantor");
            return (Criteria) this;
        }

        public Criteria andLoanGuarantorLike(String value) {
            addCriterion("LOAN_GUARANTOR like", value, "loanGuarantor");
            return (Criteria) this;
        }

        public Criteria andLoanGuarantorNotLike(String value) {
            addCriterion("LOAN_GUARANTOR not like", value, "loanGuarantor");
            return (Criteria) this;
        }

        public Criteria andLoanGuarantorIn(List<String> values) {
            addCriterion("LOAN_GUARANTOR in", values, "loanGuarantor");
            return (Criteria) this;
        }

        public Criteria andLoanGuarantorNotIn(List<String> values) {
            addCriterion("LOAN_GUARANTOR not in", values, "loanGuarantor");
            return (Criteria) this;
        }

        public Criteria andLoanGuarantorBetween(String value1, String value2) {
            addCriterion("LOAN_GUARANTOR between", value1, value2, "loanGuarantor");
            return (Criteria) this;
        }

        public Criteria andLoanGuarantorNotBetween(String value1, String value2) {
            addCriterion("LOAN_GUARANTOR not between", value1, value2, "loanGuarantor");
            return (Criteria) this;
        }

        public Criteria andLoanMortgageIsNull() {
            addCriterion("LOAN_MORTGAGE is null");
            return (Criteria) this;
        }

        public Criteria andLoanMortgageIsNotNull() {
            addCriterion("LOAN_MORTGAGE is not null");
            return (Criteria) this;
        }

        public Criteria andLoanMortgageEqualTo(String value) {
            addCriterion("LOAN_MORTGAGE =", value, "loanMortgage");
            return (Criteria) this;
        }

        public Criteria andLoanMortgageNotEqualTo(String value) {
            addCriterion("LOAN_MORTGAGE <>", value, "loanMortgage");
            return (Criteria) this;
        }

        public Criteria andLoanMortgageGreaterThan(String value) {
            addCriterion("LOAN_MORTGAGE >", value, "loanMortgage");
            return (Criteria) this;
        }

        public Criteria andLoanMortgageGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_MORTGAGE >=", value, "loanMortgage");
            return (Criteria) this;
        }

        public Criteria andLoanMortgageLessThan(String value) {
            addCriterion("LOAN_MORTGAGE <", value, "loanMortgage");
            return (Criteria) this;
        }

        public Criteria andLoanMortgageLessThanOrEqualTo(String value) {
            addCriterion("LOAN_MORTGAGE <=", value, "loanMortgage");
            return (Criteria) this;
        }

        public Criteria andLoanMortgageLike(String value) {
            addCriterion("LOAN_MORTGAGE like", value, "loanMortgage");
            return (Criteria) this;
        }

        public Criteria andLoanMortgageNotLike(String value) {
            addCriterion("LOAN_MORTGAGE not like", value, "loanMortgage");
            return (Criteria) this;
        }

        public Criteria andLoanMortgageIn(List<String> values) {
            addCriterion("LOAN_MORTGAGE in", values, "loanMortgage");
            return (Criteria) this;
        }

        public Criteria andLoanMortgageNotIn(List<String> values) {
            addCriterion("LOAN_MORTGAGE not in", values, "loanMortgage");
            return (Criteria) this;
        }

        public Criteria andLoanMortgageBetween(String value1, String value2) {
            addCriterion("LOAN_MORTGAGE between", value1, value2, "loanMortgage");
            return (Criteria) this;
        }

        public Criteria andLoanMortgageNotBetween(String value1, String value2) {
            addCriterion("LOAN_MORTGAGE not between", value1, value2, "loanMortgage");
            return (Criteria) this;
        }

        public Criteria andMortgageValueIsNull() {
            addCriterion("MORTGAGE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andMortgageValueIsNotNull() {
            addCriterion("MORTGAGE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageValueEqualTo(Float value) {
            addCriterion("MORTGAGE_VALUE =", value, "mortgageValue");
            return (Criteria) this;
        }

        public Criteria andMortgageValueNotEqualTo(Float value) {
            addCriterion("MORTGAGE_VALUE <>", value, "mortgageValue");
            return (Criteria) this;
        }

        public Criteria andMortgageValueGreaterThan(Float value) {
            addCriterion("MORTGAGE_VALUE >", value, "mortgageValue");
            return (Criteria) this;
        }

        public Criteria andMortgageValueGreaterThanOrEqualTo(Float value) {
            addCriterion("MORTGAGE_VALUE >=", value, "mortgageValue");
            return (Criteria) this;
        }

        public Criteria andMortgageValueLessThan(Float value) {
            addCriterion("MORTGAGE_VALUE <", value, "mortgageValue");
            return (Criteria) this;
        }

        public Criteria andMortgageValueLessThanOrEqualTo(Float value) {
            addCriterion("MORTGAGE_VALUE <=", value, "mortgageValue");
            return (Criteria) this;
        }

        public Criteria andMortgageValueIn(List<Float> values) {
            addCriterion("MORTGAGE_VALUE in", values, "mortgageValue");
            return (Criteria) this;
        }

        public Criteria andMortgageValueNotIn(List<Float> values) {
            addCriterion("MORTGAGE_VALUE not in", values, "mortgageValue");
            return (Criteria) this;
        }

        public Criteria andMortgageValueBetween(Float value1, Float value2) {
            addCriterion("MORTGAGE_VALUE between", value1, value2, "mortgageValue");
            return (Criteria) this;
        }

        public Criteria andMortgageValueNotBetween(Float value1, Float value2) {
            addCriterion("MORTGAGE_VALUE not between", value1, value2, "mortgageValue");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("ACCOUNT_ID >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("ACCOUNT_ID <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("ACCOUNT_ID in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("ACCOUNT_ID not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNT_ID between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNT_ID not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andLoanBankIdIsNull() {
            addCriterion("LOAN_BANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andLoanBankIdIsNotNull() {
            addCriterion("LOAN_BANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLoanBankIdEqualTo(String value) {
            addCriterion("LOAN_BANK_ID =", value, "loanBankId");
            return (Criteria) this;
        }

        public Criteria andLoanBankIdNotEqualTo(String value) {
            addCriterion("LOAN_BANK_ID <>", value, "loanBankId");
            return (Criteria) this;
        }

        public Criteria andLoanBankIdGreaterThan(String value) {
            addCriterion("LOAN_BANK_ID >", value, "loanBankId");
            return (Criteria) this;
        }

        public Criteria andLoanBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_BANK_ID >=", value, "loanBankId");
            return (Criteria) this;
        }

        public Criteria andLoanBankIdLessThan(String value) {
            addCriterion("LOAN_BANK_ID <", value, "loanBankId");
            return (Criteria) this;
        }

        public Criteria andLoanBankIdLessThanOrEqualTo(String value) {
            addCriterion("LOAN_BANK_ID <=", value, "loanBankId");
            return (Criteria) this;
        }

        public Criteria andLoanBankIdLike(String value) {
            addCriterion("LOAN_BANK_ID like", value, "loanBankId");
            return (Criteria) this;
        }

        public Criteria andLoanBankIdNotLike(String value) {
            addCriterion("LOAN_BANK_ID not like", value, "loanBankId");
            return (Criteria) this;
        }

        public Criteria andLoanBankIdIn(List<String> values) {
            addCriterion("LOAN_BANK_ID in", values, "loanBankId");
            return (Criteria) this;
        }

        public Criteria andLoanBankIdNotIn(List<String> values) {
            addCriterion("LOAN_BANK_ID not in", values, "loanBankId");
            return (Criteria) this;
        }

        public Criteria andLoanBankIdBetween(String value1, String value2) {
            addCriterion("LOAN_BANK_ID between", value1, value2, "loanBankId");
            return (Criteria) this;
        }

        public Criteria andLoanBankIdNotBetween(String value1, String value2) {
            addCriterion("LOAN_BANK_ID not between", value1, value2, "loanBankId");
            return (Criteria) this;
        }

        public Criteria andLoanDateIsNull() {
            addCriterion("LOAN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLoanDateIsNotNull() {
            addCriterion("LOAN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDateEqualTo(Date value) {
            addCriterionForJDBCDate("LOAN_DATE =", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LOAN_DATE <>", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateGreaterThan(Date value) {
            addCriterionForJDBCDate("LOAN_DATE >", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LOAN_DATE >=", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateLessThan(Date value) {
            addCriterionForJDBCDate("LOAN_DATE <", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LOAN_DATE <=", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateIn(List<Date> values) {
            addCriterionForJDBCDate("LOAN_DATE in", values, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LOAN_DATE not in", values, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LOAN_DATE between", value1, value2, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LOAN_DATE not between", value1, value2, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanProcessIsNull() {
            addCriterion("LOAN_PROCESS is null");
            return (Criteria) this;
        }

        public Criteria andLoanProcessIsNotNull() {
            addCriterion("LOAN_PROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andLoanProcessEqualTo(String value) {
            addCriterion("LOAN_PROCESS =", value, "loanProcess");
            return (Criteria) this;
        }

        public Criteria andLoanProcessNotEqualTo(String value) {
            addCriterion("LOAN_PROCESS <>", value, "loanProcess");
            return (Criteria) this;
        }

        public Criteria andLoanProcessGreaterThan(String value) {
            addCriterion("LOAN_PROCESS >", value, "loanProcess");
            return (Criteria) this;
        }

        public Criteria andLoanProcessGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_PROCESS >=", value, "loanProcess");
            return (Criteria) this;
        }

        public Criteria andLoanProcessLessThan(String value) {
            addCriterion("LOAN_PROCESS <", value, "loanProcess");
            return (Criteria) this;
        }

        public Criteria andLoanProcessLessThanOrEqualTo(String value) {
            addCriterion("LOAN_PROCESS <=", value, "loanProcess");
            return (Criteria) this;
        }

        public Criteria andLoanProcessLike(String value) {
            addCriterion("LOAN_PROCESS like", value, "loanProcess");
            return (Criteria) this;
        }

        public Criteria andLoanProcessNotLike(String value) {
            addCriterion("LOAN_PROCESS not like", value, "loanProcess");
            return (Criteria) this;
        }

        public Criteria andLoanProcessIn(List<String> values) {
            addCriterion("LOAN_PROCESS in", values, "loanProcess");
            return (Criteria) this;
        }

        public Criteria andLoanProcessNotIn(List<String> values) {
            addCriterion("LOAN_PROCESS not in", values, "loanProcess");
            return (Criteria) this;
        }

        public Criteria andLoanProcessBetween(String value1, String value2) {
            addCriterion("LOAN_PROCESS between", value1, value2, "loanProcess");
            return (Criteria) this;
        }

        public Criteria andLoanProcessNotBetween(String value1, String value2) {
            addCriterion("LOAN_PROCESS not between", value1, value2, "loanProcess");
            return (Criteria) this;
        }

        public Criteria andLoanOtherIsNull() {
            addCriterion("LOAN_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andLoanOtherIsNotNull() {
            addCriterion("LOAN_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andLoanOtherEqualTo(String value) {
            addCriterion("LOAN_OTHER =", value, "loanOther");
            return (Criteria) this;
        }

        public Criteria andLoanOtherNotEqualTo(String value) {
            addCriterion("LOAN_OTHER <>", value, "loanOther");
            return (Criteria) this;
        }

        public Criteria andLoanOtherGreaterThan(String value) {
            addCriterion("LOAN_OTHER >", value, "loanOther");
            return (Criteria) this;
        }

        public Criteria andLoanOtherGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_OTHER >=", value, "loanOther");
            return (Criteria) this;
        }

        public Criteria andLoanOtherLessThan(String value) {
            addCriterion("LOAN_OTHER <", value, "loanOther");
            return (Criteria) this;
        }

        public Criteria andLoanOtherLessThanOrEqualTo(String value) {
            addCriterion("LOAN_OTHER <=", value, "loanOther");
            return (Criteria) this;
        }

        public Criteria andLoanOtherLike(String value) {
            addCriterion("LOAN_OTHER like", value, "loanOther");
            return (Criteria) this;
        }

        public Criteria andLoanOtherNotLike(String value) {
            addCriterion("LOAN_OTHER not like", value, "loanOther");
            return (Criteria) this;
        }

        public Criteria andLoanOtherIn(List<String> values) {
            addCriterion("LOAN_OTHER in", values, "loanOther");
            return (Criteria) this;
        }

        public Criteria andLoanOtherNotIn(List<String> values) {
            addCriterion("LOAN_OTHER not in", values, "loanOther");
            return (Criteria) this;
        }

        public Criteria andLoanOtherBetween(String value1, String value2) {
            addCriterion("LOAN_OTHER between", value1, value2, "loanOther");
            return (Criteria) this;
        }

        public Criteria andLoanOtherNotBetween(String value1, String value2) {
            addCriterion("LOAN_OTHER not between", value1, value2, "loanOther");
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