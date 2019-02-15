package com.hospital.dubbo_service;

import com.hospital.dao.EmpInfoMapper;
import com.hospital.dubbo.EmpInfoService;
import com.hospital.pojo.EmpInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EmpInfoServiceImpl implements EmpInfoService {

    @Autowired
    private EmpInfoMapper empInfoMapper;

    @Override
    public EmpInfo checkLogin(String empName) {
        EmpInfo empInfos = empInfoMapper.checkLogin(empName);
        return empInfos;
    }
}
