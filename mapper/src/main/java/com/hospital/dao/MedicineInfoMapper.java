package com.hospital.dao;

import com.hospital.pojo.MedicineInfo;
import com.hospital.pojo.MedicineInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicineInfoMapper {
    long countByExample(MedicineInfoExample example);

    int deleteByExample(MedicineInfoExample example);

    int deleteByPrimaryKey(String medicineInfoId);

    int insert(MedicineInfo record);

    int insertSelective(MedicineInfo record);

    List<MedicineInfo> selectByExample(MedicineInfoExample example);

    MedicineInfo selectByPrimaryKey(String medicineInfoId);

    int updateByExampleSelective(@Param("record") MedicineInfo record, @Param("example") MedicineInfoExample example);

    int updateByExample(@Param("record") MedicineInfo record, @Param("example") MedicineInfoExample example);

    int updateByPrimaryKeySelective(MedicineInfo record);

    int updateByPrimaryKey(MedicineInfo record);
}