package com.coolcode.springboot.cruddemo.dao;

import com.coolcode.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // FREE CODE!

}
