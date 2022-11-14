package com.java.TaskOnStreamBySunil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


class Employee{

	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String city;
	private int pinCode;
	private double salary;
	private String gender;
	private String maritalStatus;
	public int price;
	public Employee(int id, String firstName, String lastName, int age, String city, int pinCode, double salary,
			String gender, String maritalStatus) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;
		this.pinCode = pinCode;
		this.salary = salary;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", city="
				+ city + ", pinCode=" + pinCode + ", salary=" + salary + ", gender=" + gender + ", maritalStatus="
				+ maritalStatus + "]";
	}
	
}

class City{

private String name ;
private double temp;
public City(String name, double temp) {
	super();
	this.name = name;
	this.temp = temp;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getTemp() {
	return temp;
}
public void setTemp(double temp) {
	this.temp = temp;
}
@Override
public String toString() {
	return "City [name=" + name + ", temp=" + temp + "]";
}
}


public class EmployeeData {
	public static void main(String[] args) {
		
		
		List<Employee> listOfEmployData = new ArrayList<>();
        listOfEmployData.add(new Employee(10295214, "Sunil", "Kumar", 23, "Lucknow", 216020, 1200000, "MALE", "Unmarried"));
        listOfEmployData.add(new Employee(21029521, "Harish", "Kumar", 20,"Bangalore", 226020, 1200000, "MALE", "Unmarried"));
        listOfEmployData.add(new Employee(31029521, "Subham", "Kumar", 12, "Delhi", 226020, 1200000, "MALE", "Unmarried"));
        listOfEmployData.add(new Employee(10295210, "Suman", "Kumari", 15, "Goa", 626020, 1200000, "FEMALE", "Unmarried"));
        listOfEmployData.add(new Employee(10295215, "Khushboo", "Kumari", 13, "Chennai", 226020, 1200000, "FEMALE", "Unmarried"));
        listOfEmployData.add(new Employee(71029521, "Arti", "Kumari", 10, "Noida", 226020, 1200000, "FEMALE", "Unmarried"));
        listOfEmployData.add(new Employee(10295218, "Ashok", "Kumar", 40, "Gurugram", 226020, 1200000, "MALE", "Married"));
        listOfEmployData.add(new Employee(10295210, "Vinod", "Kumar", 40, "Bihar", 226020, 1200000, "MALE", "Married"));
        listOfEmployData.add(new Employee(21029521, "Pooja", "kumari", 16,"Ranchi", 226020, 1200000, "FEMALE", "Unmarried"));
        listOfEmployData.add(new Employee(31029521, "Neha", "Kumari", 18, "Jharkhand", 226020, 1200000, "FEMALE", "Unmarried"));
        listOfEmployData.add(new Employee(10295214, "Nishu", "Kumari", 6, "New  York", 226020, 1200000, "FEMALE", "Unmarried"));
        listOfEmployData.add(new Employee(10295217, "Sushila", "Gupta", 38, "Mexico", 226020, 1200000, "FEMALE", "Unmarried"));
        listOfEmployData.add(new Employee(10295212, "RP", "Gupta", 39, "London", 2626020, 1200000, "MALE", "Married"));
        listOfEmployData.add(new Employee(10295219, "Muthun", "Gupta", 20, "Canada", 126020, 1200000, "MALE", "Unmarried"));
        listOfEmployData.add(new Employee(10295210, "Rajesh", "Gupta", 25, "Steryn", 226020, 1200000, "MALE", "Unmarried"));
        listOfEmployData.add(new Employee(10295217, "Ramesh", "Gupta", 55, "BrokSide", 226020, 1200000, "MALE", "Unmarried"));
        
        System.out.println(listOfEmployData);
        
//        Iterator itr = listOfEmployData.iterator();
//        while(itr.hasNext()) {
//        	System.out.println(itr.next());
//        	
//        
        Employee minSalary = listOfEmployData.stream()
    			.min((employee1 ,employee2)-> employee1.price>employee2.price?1:-1).get();
    	System.out.println("the Minimum salary is ");
    	System.out.println(listOfEmployData);

    	
    	Employee maxSalary = listOfEmployData.stream()
    			.max((employee1 ,employee2)-> employee1.price>employee2.price?1:-1).get();
    	System.out.println("the Maximum salary is ");
    	System.out.println(listOfEmployData);
    	
    	
    	System.out.println("whose salary is greater than 1,00,000");
    	List<Employee> listOfEmployData2 = 
    			listOfEmployData.stream()
    			.filter(s->s.getSalary()>100000)
    			.collect(Collectors.toList());
//    	System.out.println("the list of the price list is ");
    	System.out.println(listOfEmployData2);
    	}
	
	
	
	

	
}
