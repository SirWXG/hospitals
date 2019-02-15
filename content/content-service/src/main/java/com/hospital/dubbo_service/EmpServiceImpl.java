package com.hospital.dubbo_service;

import com.hospital.dao.EmpInfoMapper;
import com.hospital.dao.EmpMapper;
import com.hospital.dubbo.EmpService;
import com.hospital.pojo.Emp;
import com.hospital.pojo.EmpInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private EmpInfoMapper empInfoMapper;

    @Override
    public List<Emp> selectEmpByDept(int deptId) {
        List<Emp> list = empMapper.selectEmpByDept(deptId);
        return list;
    }

    @Override
    public void updateNum(String empName) {
        empMapper.updateNum(empName);
    }

}
