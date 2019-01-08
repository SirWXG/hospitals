package com.tb.dubbo_service;

import com.tb.dubbo.ItestService;
import com.tb.mapper.TestMapper;
import com.tb.pojo.Test;
import com.tb.pojo.TestExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 何龙
 * @create 2019-01-08 12:48
 */
@Service
public class TestService implements ItestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public List<Test> getAll() {
        return testMapper.selectByExample( null );
    }

    @Override
    public List<Test> getOne(String name) {
        TestExample example=new TestExample();
        TestExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike( "%"+name+"%" );
        return testMapper.selectByExample( example );
    }
}
