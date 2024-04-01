package com.johnny.spring.restcruddemo.service;

import com.johnny.spring.restcruddemo.entity.Employee;

import java.util.List;

/**
 * No longer needed when importing spring-boot-starter-data-rest. Spring Data
 * REST provides endpoints, and we don't need to manually create them anymore.
 * This whole class can go away with spring-boot-start-data-rest dependency, but
 * bringing it back to align with the training video.
 */
public interface EmployeeService {

    List<Employee> findAll();

    public Employee findById(int id);

    public Employee save(Employee employee);

    public void deleteById(int id);
}
