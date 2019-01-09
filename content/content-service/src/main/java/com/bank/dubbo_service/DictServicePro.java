package com.bank.dubbo_service;

import com.bank.dubbo.dictService;
import com.bank.dao.DictMapper;
import com.bank.pojo.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DictServicePro implements dictService {
    @Autowired
    private DictMapper dictMapper;
    @Override
    public List<Dict> getAll() {
        return dictMapper.selectByExample( null );
    }

    @Override
    public Dict getOne(String id) {

        return dictMapper.selectByPrimaryKey(Integer.parseInt(id));
    }
}
