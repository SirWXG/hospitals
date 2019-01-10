package com.bank.dubbo_service;

import com.bank.dao.TasksMapper;
import com.bank.dubbo.taskService;
import com.bank.pojo.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TaskServicePro implements taskService {
    /**
     * @param tasks
     * @return int判断是否修改成功
     */
    @Override
    public int updateTask(Tasks tasks) {
        return tasksMapper.updateByPrimaryKeySelective(tasks);
    }

    @Autowired
    private TasksMapper tasksMapper;
    /**
     * @param map
     * @return 任务列表
     */
    @Override
    public List<Tasks> getAll(Map<String, Object> map) {
        return tasksMapper.selectBymap(map);
    }

    /**
     * @param tasks 对象
     * @return 确定是否增加成功
     */
    @Override
    public int add(Tasks tasks) {
        return tasksMapper.insert(tasks);
    }
}
