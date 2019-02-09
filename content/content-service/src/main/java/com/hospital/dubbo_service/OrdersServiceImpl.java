package com.hospital.dubbo_service;

import com.hospital.dao.OrdersMapper;
import com.hospital.dubbo.OrdersService;
import com.hospital.pojo.Orders;
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
