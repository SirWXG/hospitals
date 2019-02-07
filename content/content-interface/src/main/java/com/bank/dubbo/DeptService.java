package com.bank.dubbo;

import com.bank.pojo.Dept;

import java.util.List;

public interface DeptService  {

    List<Dept> selectAllDept();
}
