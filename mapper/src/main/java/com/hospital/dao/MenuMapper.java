package com.hospital.dao;

import com.hospital.pojo.MenuAndEmp;

import java.util.List;

public interface MenuMapper {

    List<MenuAndEmp> selectMenuByEmp(String empId);
}
