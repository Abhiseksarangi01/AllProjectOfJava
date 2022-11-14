package com.java.StreamApi;

import java.util.List;

public class Student {
	private String firstName;
	private String lastName;
	private List<String> projects;
	public Student(String firstName, String lastName, List<String> projects) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.projects = projects;
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
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", projects=" + projects + "]";
	}
	
	
	
}
