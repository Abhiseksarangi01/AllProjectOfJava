package com.java.demo.TodayTaskCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StudentDetails{
	int id;
	String firstName;
	String lastName;
	String universityName;
	public StudentDetails(int id, String firstName, String lastName, String universityName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.universityName = universityName;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", universityName="
				+ universityName + "]";
	}
	

     }
public class StudentInsertAndDisplayUsingScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<StudentDetails> listOfDetails = new ArrayList<StudentDetails>();

		
		System.out.println("Enter the number of student details you want to input");
	     int numberOfInputs = sc.nextInt();{
	     for( int i=0;  i < numberOfInputs ; i++) {
		
		
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter First Name");
		String firstName = sc.next();
		System.out.println("Enter Last Name ");
		String lastName = sc.next();
		System.out.println("Enter university ");
		String universityName = sc.next();
				
		StudentDetails s1 = new StudentDetails(id, firstName, lastName, universityName);
		listOfDetails.add(s1);
	     }
		System.out.println("The list is");
		System.out.println(listOfDetails);
	}

	}
	}


