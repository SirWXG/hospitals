package com.hospital.dubbo;

import com.hospital.pojo.EmpInfo;


public interface EmpInfoService {
    EmpInfo checkLogin(String empName);
}
