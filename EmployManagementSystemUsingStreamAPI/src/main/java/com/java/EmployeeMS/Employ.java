package com.java.EmployeeMS;


import java.util.ArrayList;
import java.util.List;

public class Employ {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private City city;
	private int pinCode;
	private double salary;
	private String gender;
	private String maritalStatus;

	

	public Employ(int id, String firstName, String lastName, int age, City city, int pinCode, double salary,
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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
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
		return "Employ [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", city="
				+ city + ", pinCode=" + pinCode + ", salary=" + salary + ", gender=" + gender + ", maritalStatus="
				+ maritalStatus + "]";
	}

	public static List<Employ> getAllSaveEmployData() {
		List<Employ> listOfEmployData = new ArrayList<>();
		listOfEmployData.add(new Employ(1,"Sunil","Kumar",53,new City("LKO", 30),226020,12000,"MALE","Single"));
		listOfEmployData.add(new Employ(2, "Sunil", "Gupta", 21,new City("lucknow",34), 769075, 45090, "male", "single"));
		listOfEmployData.add(new Employ(3, "Piyush", "jaiswal", 51,new City("rourkela",45), 769005, 45400, "male", "single"));
		listOfEmployData.add(new Employ(4, "sumanth", "talada", 21,new City("bangalore",67), 769505, 45600, "male", "married"));
		listOfEmployData.add(new Employ(5, "Panpat", "guzzar", 25,new City("rourkela",45), 789005, 45070, "male", "single"));
		listOfEmployData.add(new Employ(6, "babu", "bhaiya", 29,new City("delhi",47), 769005, 65050, "male", "married"));
		listOfEmployData.add(new Employ(7, "guddu", "bhaiya", 31,new City("rourkela",56), 969005, 45000, "male", "married"));
		listOfEmployData.add(new Employ(8, "choti", "chachi", 51,new City("mumbai",78), 789005, 75000, "male", "single"));
		listOfEmployData.add(new Employ(9, "Katarina", "khauff", 23,new City("mysore",48), 769005, 95000, "male", "married"));
		listOfEmployData.add(new Employ(10, "priyanka", "chawla", 28,new City("kolkata",37), 569005, 46000, "male", "single"));
		listOfEmployData.add(new Employ(11, "ghatuthkach", "natkhat", 31,new City("assam",47), 769805, 49000, "male", "married"));
		listOfEmployData.add(new Employ(12, "Balam", "pichkari", 28,new City("gangtok",56), 769095, 44000, "male", "single"));
		listOfEmployData.add(new Employ(13, "saiyan", "jyothi", 31,new City("kerela",37), 739005, 49000, "male", "bisexual"));
		listOfEmployData.add(new Employ(14, "khatarnak", "nayak", 71, new City("ranchi",49), 769805, 45000, "male", "married"));
		return listOfEmployData;

	}

}
