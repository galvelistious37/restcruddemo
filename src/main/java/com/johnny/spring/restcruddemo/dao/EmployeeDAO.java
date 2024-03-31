package com.johnny.spring.restcruddemo.dao;

import com.johnny.spring.restcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
