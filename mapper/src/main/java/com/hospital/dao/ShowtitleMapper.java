package com.hospital.dao;

import com.hospital.pojo.Showtitle;
import com.hospital.pojo.ShowtitleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShowtitleMapper {
    long countByExample(ShowtitleExample example);

    int deleteByExample(ShowtitleExample example);

    int deleteByPrimaryKey(String titleId);

    int insert(Showtitle record);

    int insertSelective(Showtitle record);

    List<Showtitle> selectByExampleWithBLOBs(ShowtitleExample example);

    List<Showtitle> selectByExample(ShowtitleExample example);

    Showtitle selectByPrimaryKey(String titleId);

    int updateByExampleSelective(@Param("record") Showtitle record, @Param("example") ShowtitleExample example);

    int updateByExampleWithBLOBs(@Param("record") Showtitle record, @Param("example") ShowtitleExample example);

    int updateByExample(@Param("record") Showtitle record, @Param("example") ShowtitleExample example);

    int updateByPrimaryKeySelective(Showtitle record);

    int updateByPrimaryKeyWithBLOBs(Showtitle record);

    int updateByPrimaryKey(Showtitle record);
}