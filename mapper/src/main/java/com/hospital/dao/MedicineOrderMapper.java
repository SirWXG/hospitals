package com.hospital.dao;

import com.hospital.pojo.MedicineOrder;
import com.hospital.pojo.MedicineOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicineOrderMapper {
    long countByExample(MedicineOrderExample example);

    int deleteByExample(MedicineOrderExample example);

    int deleteByPrimaryKey(String medicineOrderId);

    int insert(MedicineOrder record);

    int insertSelective(MedicineOrder record);

    List<MedicineOrder> selectByExample(MedicineOrderExample example);

    MedicineOrder selectByPrimaryKey(String medicineOrderId);

    int updateByExampleSelective(@Param("record") MedicineOrder record, @Param("example") MedicineOrderExample example);

    int updateByExample(@Param("record") MedicineOrder record, @Param("example") MedicineOrderExample example);

    int updateByPrimaryKeySelective(MedicineOrder record);

    int updateByPrimaryKey(MedicineOrder record);
}