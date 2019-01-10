package com.bank.dubbo;

import com.bank.pojo.Dict;

import java.util.List;


public interface dictService {
    /**
     *
     * @return Dict 集合
     */
    List<Dict> getAll();

    /**
     * 查询名字
     * @param string 名字
     * @return 结果
     */
    Dict getOne(String string);
}
