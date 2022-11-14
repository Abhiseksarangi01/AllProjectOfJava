package com.java.demo.pk1;

import com.java.demo.pk2.employDisplayData;

class Student{
	void display() {
		System.out.println("I am Calling again Display here");
	}
}

 class StudentNameDisplay {

	void hello() {
		System.out.println("I am calling hello()");
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		
		employDisplayData e2 = new employDisplayData();
		e2.EmployNameHere();
		
	}



}
