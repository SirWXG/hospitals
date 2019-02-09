package com.bank.dubbo;

import com.bank.pojo.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> selectEmpByDept(int deptId);
}
