package com.hospital.dao;

import com.hospital.pojo.Emp;

import java.util.List;

public interface EmpMapper {
   List<Emp> selectEmpByDept(int deptId);

   void  updateNum(String empName);
}
