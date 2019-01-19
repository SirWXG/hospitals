package com.bank.dubbo;

import com.bank.pojo.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> selectCustomer(String identity);

    int addCustomer(Customer customer);

    String selectCustomerByIdentity(String identity);
}
