package com.admin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.SpringBootCrud.bean.Employee;
import com.admin.SpringBootCrud.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepo;
	
	public List<Employee> getAllEmployees()
	{
		List<Employee>employees=new ArrayList<>();
		employeeRepo.findAll().forEach(employees::add);
		return employees;
	}

	private Iterable<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public void addEmployee(Employee employee) {
		
		employeeRepo.save(employee);
		
	}	


	private void save(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public void updateEmployee(String id, Employee employee) {


		employeeRepo.save(employee);
		
	}

	public void deleteEmployee(String id) {


		employeeRepo.deleteById(id);
		
	}

	
}
