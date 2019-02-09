package com.hospital.dao;

import com.hospital.pojo.WorkTime;
import com.hospital.pojo.WorkTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkTimeMapper {
    long countByExample(WorkTimeExample example);

    int deleteByExample(WorkTimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkTime record);

    int insertSelective(WorkTime record);

    List<WorkTime> selectByExample(WorkTimeExample example);

    WorkTime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkTime record, @Param("example") WorkTimeExample example);

    int updateByExample(@Param("record") WorkTime record, @Param("example") WorkTimeExample example);

    int updateByPrimaryKeySelective(WorkTime record);

    int updateByPrimaryKey(WorkTime record);
}