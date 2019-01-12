package com.bank.dubbo;

import com.bank.pojo.Tasks;

import java.util.List;
import java.util.Map;

public interface taskService {
    /**
     *zhou
     * @param map  用来实现动态查询
     * @return 任务列表
     */
    public List<Tasks> getAll(Map<String,Object> map);

    /**
     *
     * @param tasks
     * @return int判断是否修改成功
     */
    public int updateTask(Tasks tasks);
    /**
     *
     * @param tasks 对象
     * @return 确定是否增加成功
     */
    public int add(Tasks tasks);
}
