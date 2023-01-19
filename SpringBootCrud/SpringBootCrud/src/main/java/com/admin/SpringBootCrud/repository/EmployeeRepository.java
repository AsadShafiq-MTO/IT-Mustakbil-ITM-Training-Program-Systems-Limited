package com.admin.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.admin.SpringBootCrud.bean.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

	
}
