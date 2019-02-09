package com.hospital.dubbo;

import com.hospital.pojo.Dept;

import java.util.List;

public interface DeptService  {

    List<Dept> selectAllDept();
}
