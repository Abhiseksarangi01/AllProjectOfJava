package com.java.QuestionOnStreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDaoClass implements EmployeeDaoInterface{

	@Override
	public List<Employee> getEmployeeStartsWith(String startingChar) {
		
		List<Employee> ListOfEmploy = Employee.getAllEmployees();
		List<Employee> FilterredData = ListOfEmploy.stream()
				.filter(startingChar1 -> startingChar1.getEmployeeName().startsWith(startingChar))
				.collect(Collectors.toList());
		return FilterredData;
	}
	@Override
		public int  getSumOfAllEmployees() {
			List<Employee> sumOfAllEmploy = Employee.getAllEmployees();
			int  countEmployee = (int) sumOfAllEmploy.stream()
					.count();
			return countEmployee;
			
			
			
		}
	
		
	}


