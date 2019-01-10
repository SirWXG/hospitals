package com.bank.dubbo_service;

import com.bank.dao.StreamlineMapper;
import com.bank.dubbo.streamlineService;
import com.bank.pojo.Streamline;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StreamlineServicePro implements streamlineService {
    @Autowired
    private StreamlineMapper streamline;
    @Override
    public List<Streamline> getTheone(int stakid) {
        return streamline.selectBystask(stakid);
    }

    @Override
    public int addOne(Streamline streamlin) {
        return streamline.insertSelective(streamlin);
    }
}
