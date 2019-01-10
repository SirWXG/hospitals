package com.bank.dubbo;

import com.bank.pojo.Streamline;

import java.util.List;

public interface streamlineService {
    /**
     *
     * @param stakid
     * @return 返回所有的任务流程
     */
    public List<Streamline> getTheone(int stakid);

    /**
     *
     * @param streamline
     * @return 增加一个流程线
     */

    public int addOne(Streamline streamline);
}
