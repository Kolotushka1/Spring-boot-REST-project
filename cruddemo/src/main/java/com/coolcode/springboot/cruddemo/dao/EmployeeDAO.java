package com.coolcode.springboot.cruddemo.dao;

import com.coolcode.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
