package com.hospital.dubbo_service;

import com.hospital.dao.MenuMapper;
import com.hospital.dubbo.MenuService;
import com.hospital.pojo.MenuAndEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<MenuAndEmp> selectMenuByEmp(String empId) {
        List<MenuAndEmp> list = menuMapper.selectMenuByEmp(empId);
        return list;
    }
}
