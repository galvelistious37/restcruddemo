package com.johnny.spring.restcruddemo.dao;

import com.johnny.spring.restcruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    // Define fields for entityManager
    private EntityManager entityManager;

    // Set up constructor injection
    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        // Create a query
        TypedQuery<Employee> theQeury = entityManager.createQuery(
                "FROM Employee", Employee.class);

        // Execute query and get result list
        // Return the results
        return theQeury.getResultList();
    }

    @Override
    public Employee findById(int id) {
        // Get employee
        // Return employee
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee save(Employee employee) {
        // Merge will save or update...
        // if id = 0, it inserts... else, update
        return entityManager.merge(employee);
    }

    @Override
    public void deleteById(int id) {
        // Find employee by id
        Employee employee = findById(id);
        // Delete the employee
        entityManager.remove(employee);
    }
}
