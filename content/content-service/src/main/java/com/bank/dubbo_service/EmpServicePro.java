package com.bank.dubbo_service;

import com.bank.dao.EmpMapper;
import com.bank.dubbo.empService;
import com.bank.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class EmpServicePro implements empService {
    @Autowired
    private EmpMapper empMapper;
    /**
     * 获取所有员工信息，可以根据银行编号，角色等查询
     * @param map
     * @return List
     */
    @Override
    public List<Emp> getAll(Map<String, Object> map) {
        return empMapper.selectByCond(map);
    }

    /**
     * 增加员工信息
     *
     * @param emp
     * @return 返回值用来判断是否成功
     */
    @Override
    public int addEmp(Emp emp) {
        return empMapper.insertSelective(emp);
    }
    /**
     * 根据员工编号进行删除
     *
     * @param empId
     * @return 判断是否删除成功
     */
    @Override
    public int deleteEmp(Integer empId) {
        return empMapper.deleteByPrimaryKey(empId);
    }
    /**
     * 更新员工信息
     *
     * @param emp
     * @return
     */
    @Override
    public int updateEmp(Emp emp) {
        return empMapper.updateByPrimaryKeySelective(emp);
    }

    @Override
    public List<Emp> checkLogin(Map<String, Object> map) {
        List<Emp> list = empMapper.checkLogin(map);
        return list;
    }
}
