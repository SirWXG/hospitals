package com.bank.dao;

import com.bank.pojo.ServiceCommit;
import com.bank.pojo.ServiceCommitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import javax.xml.ws.Service;

public interface ServiceCommitMapper {
    int insert(ServiceCommit record);

    List<ServiceCommit> selectAllByStatus(int status);

     int updateService(ServiceCommit serviceCommit);
}