package com.bank.dubbo_service;

import com.bank.dao.ServiceCommitMapper;
import com.bank.dubbo.ServiceCommitService;
import com.bank.pojo.ServiceCommit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCommitServiceImpl implements ServiceCommitService {

    @Autowired
    private ServiceCommitMapper serviceCommitMapper;

    @Override
    public int insert(ServiceCommit serviceCommit) {
        int flag = serviceCommitMapper.insert(serviceCommit);
        return flag;
    }

    @Override
    public List<ServiceCommit> selectAllByStatus(int status) {
        List<ServiceCommit> list = serviceCommitMapper.selectAllByStatus(status);
        return list;
    }

    @Override
    public int updateService(ServiceCommit serviceCommit) {
        int flag = serviceCommitMapper.updateService(serviceCommit);
        return flag;
    }

    @Override
    public List<ServiceCommit> selectServiceCommit(String serviceCustomer) {
        List<ServiceCommit> list = serviceCommitMapper.selectServiceCommit(serviceCustomer);
        return list;
    }


}
