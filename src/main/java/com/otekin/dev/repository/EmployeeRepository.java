package com.otekin.dev.repository;

import org.springframework.data.repository.CrudRepository;

import com.otekin.dev.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}