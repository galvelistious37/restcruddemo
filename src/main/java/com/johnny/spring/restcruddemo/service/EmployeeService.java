package com.johnny.spring.restcruddemo.service;

import com.johnny.spring.restcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
