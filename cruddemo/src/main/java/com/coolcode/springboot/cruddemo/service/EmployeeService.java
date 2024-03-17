package com.coolcode.springboot.cruddemo.service;

import com.coolcode.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
