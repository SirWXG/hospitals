package com.bank.dubbo_service;

import com.bank.dao.StreamlineMapper;
import com.bank.dubbo.streamlineService;
import com.bank.pojo.Streamline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StreamlineServicePro implements streamlineService {
    @Autowired
    private StreamlineMapper streamline;
    @Override
    public List<Streamline> getTheone(String stakid) {
        return streamline.selectBystask(stakid);
    }

    @Override
    public int addOne(Streamline streamlin) {
        return streamline.insertSelective(streamlin);
    }
}
