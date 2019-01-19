package com.bank.dubbo_service;

import com.bank.dao.DepositMapper;
import com.bank.dubbo.depositService;
import com.bank.pojo.Deposit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class DepositServicePro implements depositService {
    @Autowired
    private DepositMapper depositMapper;

    /**
     * 查找存款记录
     * @param map
     * @return
     */
    @Override
    public List<Deposit> getAll(Map<String, Object> map) {
        return depositMapper.selectByCond(map);
    }

    /**
     * 更新
     *
     * @param deposit
     * @return
     */
    @Override
    public int updateDeposit(Deposit deposit) {
        return depositMapper.updateByPrimaryKeySelective(deposit);
    }
    /**
     * 新增一个存款
     * @param deposit
     * @return
     */
    @Override
    public int addDeposit(Deposit deposit) {
        return depositMapper.insert(deposit);
    }

    /**
     * 删除一个存款记录
     * @param id
     * @return
     */
    @Override
    public int deleteDeposit(Integer id) {
        return depositMapper.deleteByPrimaryKey(id);
    }
}
