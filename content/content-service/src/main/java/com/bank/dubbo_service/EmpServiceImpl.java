package com.bank.dubbo_service;

import com.bank.dao.EmpMapper;
import com.bank.dubbo.EmpService;
import com.bank.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> selectEmpByDept(int deptId) {
        List<Emp> list = empMapper.selectEmpByDept(deptId);
        return list;
    }
}
