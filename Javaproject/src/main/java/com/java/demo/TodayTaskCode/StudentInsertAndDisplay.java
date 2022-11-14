package com.java.demo.TodayTaskCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	int id;
	String firstName;
	String lastName;
	String universityName;
	
	
	public Student(int id, String firstName, String lastName, String universityName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.universityName = universityName;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", universityName="
				+ universityName + "]";
	}
	
	
	
		
	
}


public class StudentInsertAndDisplay {
	public static void main(String[] args) {
		
		List<Student> listOfStudent = new ArrayList<Student>();
		
		Student s1 = new Student(1, "Omkar", "bhagat", "Rava university");
		listOfStudent.add(s1);
		Student s2 = new Student(2, "Sunil", "Kumar", "BBDU");
		listOfStudent.add(s2);
		Student s3 = new Student(3, "Abhisek", "Sarangi","Bhagalpur University");
		listOfStudent.add(s3);
		System.out.println("the list of the Student is ");
		System.out.println(listOfStudent);
		System.out.println("i am using iterator ");
		Iterator<Student> itr  = listOfStudent.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
