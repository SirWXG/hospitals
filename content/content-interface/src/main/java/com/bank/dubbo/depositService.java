package com.bank.dubbo;

import com.bank.pojo.Deposit;

import java.util.List;
import java.util.Map;

public interface depositService {
    /**
     * 查找存款记录
     * @param map
     * @return
     */
    public List<Deposit> getAll(Map<String,Object> map);

    /**
     * 更新
     * @param deposit
     * @return
     */

    public int updateDeposit(Deposit deposit);

    /**
     * 新增一个存款
     * @param deposit
     * @return
     */
    public int addDeposit(Deposit deposit);

    /**
     *
     * 删除一个存款记录
     * @param id
     * @return
     */
    public  int deleteDeposit(Integer id);
}
