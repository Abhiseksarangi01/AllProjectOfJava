package com.java.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class StudentDataSorting{
	int id;
	String firstName;
	String lastName;
	String startDate;
	String endDate;
	public StudentDataSorting(int id, String firstName, String lastName, String startDate, String endDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "StudentDataSorting [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}
	
	
}

class IdSort implements Comparator<StudentDataSorting>{
	@Override
	public int compare(StudentDataSorting o1, StudentDataSorting o2) {
		if(o1.id==o2.id) {
			return 0;
		}else if(o1.id>o2.id) {
			return 1;
		}else {
			return -1;
		}
	}  
	
}

class firstNameSort implements Comparator<StudentDataSorting>{

	@Override
	public int compare(StudentDataSorting o1, StudentDataSorting o2) {  
		return o1.firstName.compareTo(o2.firstName);  
				
	}
	
}

class lastNameSort implements Comparator<StudentDataSorting>{

	@Override
	public int compare(StudentDataSorting o1, StudentDataSorting o2) {
		return o1.lastName.compareTo(o2.lastName);
	}
	
}

class startDateSort implements Comparator<StudentDataSorting>{

	@Override
	public int compare(StudentDataSorting o1, StudentDataSorting o2) {
		return o1.startDate.compareTo(o2.startDate);

	}
	
}

public class StudentSortById {
	public static void main(String[] args) {
		List<StudentDataSorting> listOfStudent = new ArrayList<StudentDataSorting>();
		StudentDataSorting s1 = new StudentDataSorting(1, "Arti", "Gupta", "20-12-2022", "12-09-2022");
		listOfStudent.add(s1);
//		System.out.println(listOfStudent);
		listOfStudent.add(new StudentDataSorting(2, "Sunil", "Kumar", "12-09-2022", "12-12-2022"));
		System.out.println(listOfStudent);
		listOfStudent.add(new StudentDataSorting(0, "Abhsek", "Kumar", "09-09-2022", "12-12-2022"));
		
		Iterator itr = listOfStudent.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(listOfStudent,new IdSort());
		System.out.println("after sorting the data on the basis of id");
		System.out.println(listOfStudent);
		
		Collections.sort(listOfStudent,new firstNameSort());
		System.out.println("after sorting on the basis of firstName");
		System.out.println(listOfStudent);
		
		Collections.sort(listOfStudent,new lastNameSort());
		System.out.println("after sorting the data on the basis of lastName");
		System.out.println(listOfStudent);
		
		Collections.sort(listOfStudent,new startDateSort());
		System.out.println("after sorting the data on the basis of lastName");
		System.out.println(listOfStudent);
		
		Iterator itr1 = listOfStudent.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());


	}
}
}


