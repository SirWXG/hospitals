package com.hospital.dubbo;

import com.hospital.pojo.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> selectEmpByDept(int deptId);

    void updateNum(String empName);
}
