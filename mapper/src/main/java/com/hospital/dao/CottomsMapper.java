package com.hospital.dao;

import com.hospital.pojo.Cottoms;
import com.hospital.pojo.CottomsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CottomsMapper {
    long countByExample(CottomsExample example);

    int deleteByExample(CottomsExample example);

    int deleteByPrimaryKey(String cottomsId);

    int insert(Cottoms record);

    int insertSelective(Cottoms record);

    List<Cottoms> selectByExampleWithBLOBs(CottomsExample example);

    List<Cottoms> selectByExample(CottomsExample example);

    Cottoms selectByPrimaryKey(String cottomsId);

    int updateByExampleSelective(@Param("record") Cottoms record, @Param("example") CottomsExample example);

    int updateByExampleWithBLOBs(@Param("record") Cottoms record, @Param("example") CottomsExample example);

    int updateByExample(@Param("record") Cottoms record, @Param("example") CottomsExample example);

    int updateByPrimaryKeySelective(Cottoms record);

    int updateByPrimaryKeyWithBLOBs(Cottoms record);

    int updateByPrimaryKey(Cottoms record);
}