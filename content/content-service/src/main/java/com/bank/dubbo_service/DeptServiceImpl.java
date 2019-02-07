package com.bank.dubbo_service;

import com.bank.dao.DeptMapper;
import com.bank.dubbo.DeptService;
import com.bank.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> selectAllDept() {
        List<Dept> list = deptMapper.selectAllDept();
        return list;
    }
}
