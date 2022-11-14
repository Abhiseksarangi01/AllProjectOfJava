package com.java.QuestionOnStreamApi;

import java.util.List;

public interface EmployeeDaoInterface  {
	List<Employee> getEmployeeStartsWith(String startingChar);
	 int getSumOfAllEmployees();

}
