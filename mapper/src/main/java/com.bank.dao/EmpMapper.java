package com.bank.dao;

import com.bank.pojo.Emp;

import java.util.List;

public interface EmpMapper {
   List<Emp> selectEmpByDept(int deptId);
}
