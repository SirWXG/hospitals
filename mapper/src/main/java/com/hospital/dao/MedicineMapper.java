package com.hospital.dao;

import com.hospital.pojo.Medicine;
import com.hospital.pojo.MedicineExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MedicineMapper {
    List<Medicine> selectByCond(Map<String, Object> map);
    long countByExample(MedicineExample example);

    int deleteByExample(MedicineExample example);

    int insert(Medicine record);

    int insertSelective(Medicine record);

    List<Medicine> selectByExample(MedicineExample example);

    int updateByExampleSelective(@Param("record") Medicine record, @Param("example") MedicineExample example);

    int updateByExample(@Param("record") Medicine record, @Param("example") MedicineExample example);
}