package com.hospital.dubbo;

import com.hospital.pojo.MenuAndEmp;

import java.util.List;

public interface MenuService {

    List<MenuAndEmp> selectMenuByEmp(String empId);
}
