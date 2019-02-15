package com.hospital.dao;

import com.hospital.pojo.EmpInfo;

public interface EmpInfoMapper {
    EmpInfo checkLogin(String empName);
}
