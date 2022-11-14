package com.java.QuestionOnStreamApi;

import java.util.ArrayList;
import java.util.List;

import com.java.demo.pk2.employDisplayData;

public class Employee {
	int employeeId ;
	String employeeName;
	String employeeInfo;
	public Employee(int employeeId, String employeeName, String employeeInfo) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeInfo = employeeInfo;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeInfo() {
		return employeeInfo;
	}
	public void setEmployeeInfo(String employeeInfo) {
		this.employeeInfo = employeeInfo;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeInfo="
				+ employeeInfo + "]";
	}
	
	public static List<Employee> getAllEmployees() {

		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee(111, "abhisek", "Hr"));
		employeeList.add(new Employee(112, "sunil", "sales"));
		employeeList.add(new Employee(113, "sai", "Marketing"));
		employeeList.add(new Employee(114, "sumanth", "SoftwareEngineer"));
		employeeList.add(new Employee(115, "shristi", "Developer"));
		employeeList.add(new Employee(116, "shruti", "Admin"));
		
		return employeeList;
		
		
	}
	public static void main(String[] args) {
		
	List<Employee> listOfEmployee = new ArrayList<>();
	listOfEmployee.addAll(new EmployeeDaoClass().getEmployeeStartsWith("s"));
	System.out.println(listOfEmployee);
	
	List<Employee> SumofAllEmployee = new ArrayList<>();
	SumofAllEmployee.addAll(new EmployeeDaoClass().getSumOfAllEmployees());
	System.out.println(SumOfAllEmployee);


	
}
}


	





 	
 	
 	