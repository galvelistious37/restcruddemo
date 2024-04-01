package com.johnny.spring.restcruddemo.service;

import com.johnny.spring.restcruddemo.dao.EmployeeRepository;
import com.johnny.spring.restcruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * No longer needed when importing spring-boot-starter-data-rest. Spring Data
 * REST provides endpoints, and we don't need to manually create them anymore.
 * This whole class can go away with spring-boot-start-data-rest dependency, but
 * bringing it back to align with the training video.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);
        Employee theEmployee = null;
        if(result.isPresent()){
            theEmployee =  result.get();
        } else {
            throw new RuntimeException("Did not find employeeId - " + id);
        }
        return theEmployee;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
