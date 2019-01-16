package com.bank.dubbo_service;

import com.bank.dao.CustomerMapper;
import com.bank.dubbo.CustomerService;
import com.bank.pojo.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerMapper customerMapper;

    @Override
    public List<Customer> selectCustomer(Customer customer) {
        return null;
    }
}
