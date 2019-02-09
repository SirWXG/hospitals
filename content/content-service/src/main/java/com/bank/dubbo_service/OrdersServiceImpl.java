package com.bank.dubbo_service;

import com.bank.dao.OrdersMapper;
import com.bank.dubbo.OrdersService;
import com.bank.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public int addOrders(Orders orders) {
        int flag = ordersMapper.addOrders(orders);
        return flag;
    }
}
