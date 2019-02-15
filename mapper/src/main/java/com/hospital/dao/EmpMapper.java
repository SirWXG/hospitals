package com.hospital.dao;

import com.hospital.pojo.Emp;
import com.hospital.pojo.EmpInfo;

import java.util.List;
import java.util.Map;

public interface EmpMapper {
   List<Emp> selectEmpByDept(int deptId);

   void  updateNum(String empName);

}
