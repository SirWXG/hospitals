package com.hospital.dao;

import com.hospital.pojo.Patients;
import com.hospital.pojo.PatientsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientsMapper {
    long countByExample(PatientsExample example);

    int deleteByExample(PatientsExample example);

    int deleteByPrimaryKey(String patientIdentity);

    int insert(Patients record);

    int insertSelective(Patients record);

    List<Patients> selectByExample(PatientsExample example);

    Patients selectByPrimaryKey(String patientIdentity);

    int updateByExampleSelective(@Param("record") Patients record, @Param("example") PatientsExample example);

    int updateByExample(@Param("record") Patients record, @Param("example") PatientsExample example);

    int updateByPrimaryKeySelective(Patients record);

    int updateByPrimaryKey(Patients record);
}