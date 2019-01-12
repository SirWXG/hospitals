package com.bank.dubbo;

import com.bank.pojo.Emp;

import java.util.List;
import java.util.Map;

public interface empService {
    /**
     * 获取所有员工信息，可以根据银行编号，角色等查询
     * @param map
     * @return List
     */
    public List<Emp> getAll(Map<String, Object> map);

    /**
     * 增加员工信息
     * @param emp
     * @return 返回值用来判断是否成功
     */
    public int addEmp(Emp emp);

    /**
     * 根据员工编号进行删除
     * @param empId
     * @return 判断是否删除成功
     */
    public int deleteEmp(Integer empId);

    /**
     * 更新员工信息
     * @param emp
     * @return
     */
    public int updateEmp(Emp emp);
}
