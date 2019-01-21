package com.bank.dubbo;

import com.bank.pojo.ServiceCommit;

import java.util.List;

public interface ServiceCommitService {

    //新增业务请求
    int insert(ServiceCommit serviceCommit);

    List<ServiceCommit> selectAllByStatus(int status);

    int updateService(ServiceCommit serviceCommit);

    List<ServiceCommit> selectServiceCommit(String serviceCustomer);
}
