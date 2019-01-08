package com.tb.dubbo;

import com.tb.pojo.Test;

import java.util.List;

/**
 * @author 何龙
 * @create 2019-01-08 12:47
 */
public interface ItestService {
    /**
     * 查询全表
     */
    List<Test> getAll();

    /**
     * 查询名字
     * @param string 名字
     * @return 结果
     */
    List<Test> getOne(String string);
}
