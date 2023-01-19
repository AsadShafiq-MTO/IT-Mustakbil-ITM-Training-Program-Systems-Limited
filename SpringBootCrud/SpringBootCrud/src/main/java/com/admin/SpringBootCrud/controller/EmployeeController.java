package com.admin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.admin.SpringBootCrud.bean.Employee;
import com.admin.SpringBootCrud.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/employees")
	public void addEmployee(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/employees/{id}")
	public void UpdateEmployee(@PathVariable String id, @RequestBody Employee employee)
	{
		employeeService.updateEmployee(id,employee);
	}
	
	public void DeleteEmployee(@PathVariable String id)
	{
		employeeService.deleteEmployee(id);
	}
}
