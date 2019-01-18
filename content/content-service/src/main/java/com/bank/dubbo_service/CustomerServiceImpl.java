package com.bank.dubbo_service;

import com.bank.dao.CustomerMapper;
import com.bank.dubbo.CustomerService;
import com.bank.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> selectCustomer(Customer customer) {
        List<Customer> list = customerMapper.selectCustomer(customer);
        return list;
    }

    @Override
    public int addCustomer(Customer customer) {
        int flag = customerMapper.addCustomer(customer);
        return flag;
    }

    @Override
    public String selectCustomerByIdentity(String identity) {
        String realName = customerMapper.selectCustomerByIdentity(identity);
        return realName;
    }
}
