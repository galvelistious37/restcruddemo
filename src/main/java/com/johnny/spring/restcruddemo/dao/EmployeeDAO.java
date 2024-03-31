package com.johnny.spring.restcruddemo.dao;

import com.johnny.spring.restcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    public Employee findById(int id);

    public Employee save(Employee employee);

    public void deleteById(int id);
}
