package com.bank.dao;

import com.bank.pojo.Tasks;
import com.bank.pojo.TasksExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TasksMapper {
    List<Tasks> selectBymap(Map<String,Object> map);

    long countByExample(TasksExample example);

    int deleteByExample(TasksExample example);

    int deleteByPrimaryKey(String taskId);

    int insert(Tasks record);

    int insertSelective(Tasks record);

    List<Tasks> selectByExample(TasksExample example);

    Tasks selectByPrimaryKey(String taskId);

    int updateByExampleSelective(@Param("record") Tasks record, @Param("example") TasksExample example);

    int updateByExample(@Param("record") Tasks record, @Param("example") TasksExample example);

    int updateByPrimaryKeySelective(Tasks record);

    int updateByPrimaryKey(Tasks record);
}