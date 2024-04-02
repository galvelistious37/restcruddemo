package com.johnny.spring.restcruddemo.dao;

import com.johnny.spring.restcruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
// Used for Spring Data REST
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//
//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // That's it ... no need to write any code.
    // Crud methods are inherited from JpaRepository
}
