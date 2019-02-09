package com.hospital.dubbo_service;

import com.hospital.dao.DeptMapper;
import com.hospital.dubbo.DeptService;
import com.hospital.pojo.Dept;
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
