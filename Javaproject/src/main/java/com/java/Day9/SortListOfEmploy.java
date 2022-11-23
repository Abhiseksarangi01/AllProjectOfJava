package com.java.Day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
class Employee{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}
	
}

public class SortListOfEmploy {
	private static List<Employee> employeeTest() {
		
		List<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(new Employee("Abhisek"));
		listOfEmployee.add(new Employee("vidya"));
		listOfEmployee.add(new Employee("sunil"));
		listOfEmployee.add(new Employee("tejaswini"));
		listOfEmployee.add(new Employee("ananya"));
		listOfEmployee.add(new Employee("venugoal"));
		listOfEmployee.add(new Employee("siddhartha"));
		listOfEmployee.add(new Employee("supriya"));
		listOfEmployee.add(new Employee("ambika"));
		listOfEmployee.add(new Employee("sreenath"));
		return listOfEmployee;
	   }
	public static void main(String[] args) {
		List<Employee> listOfEmploy = employeeTest();
		System.out.println(listOfEmploy.toString());
		System.out.println("After sorting the List Of The Data is ");
		Iterator itr = listOfEmploy.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<Employee> listOfEmploy1 = listOfEmploy.stream()
				.sorted().
				collect(Collectors.toList());
		Iterator itr1 = listOfEmploy1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
