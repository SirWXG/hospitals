package com.bank.dao;

import com.bank.pojo.DictCategory;
import com.bank.pojo.DictCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictCategoryMapper {
    long countByExample(DictCategoryExample example);

    int deleteByExample(DictCategoryExample example);

    int deleteByPrimaryKey(Integer dictCategoryId);

    int insert(DictCategory record);

    int insertSelective(DictCategory record);

    List<DictCategory> selectByExample(DictCategoryExample example);

    DictCategory selectByPrimaryKey(Integer dictCategoryId);

    int updateByExampleSelective(@Param("record") DictCategory record, @Param("example") DictCategoryExample example);

    int updateByExample(@Param("record") DictCategory record, @Param("example") DictCategoryExample example);

    int updateByPrimaryKeySelective(DictCategory record);

    int updateByPrimaryKey(DictCategory record);
}