package com.bank.dao;

import com.bank.pojo.Dict;
import com.bank.pojo.DictExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DictMapper {
    //按条件进行查询
    List<Dict> selectByCond(Map<String, Object> map);
    long countByExample(DictExample example);

    int deleteByExample(DictExample example);

    int deleteByPrimaryKey(Integer dictId);

    int insert(Dict record);

    int insertSelective(Dict record);

    List<Dict> selectByExample(DictExample example);

    Dict selectByPrimaryKey(Integer dictId);

    int updateByExampleSelective(@Param("record") Dict record, @Param("example") DictExample example);

    int updateByExample(@Param("record") Dict record, @Param("example") DictExample example);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);


}