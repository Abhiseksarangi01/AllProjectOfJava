package com.java.Day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class StudentDataSearchById{
	int studentId;
	String firstName;
	String lastName;
	public StudentDataSearchById(int studentId, String firstName, String lastName) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "StudentDataSearchById [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	
}

public class StudentSearchingDataById {
	public static void main(String[] args) {
		
		ArrayList<StudentDataSearchById> listOfStudents =new ArrayList<StudentDataSearchById>();
		listOfStudents.add(new StudentDataSearchById(12, "abhisek", "sarangi"));
		listOfStudents.add(new StudentDataSearchById(23, "sunil", "gupta"));
		listOfStudents.add(new StudentDataSearchById(23, "bethanapalli", "chandrasekhar"));
		
		System.out.println(listOfStudents);
		
		Iterator itr = listOfStudents.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
//			 int id1 = 2;
//
//		        List<Student> filterStudent = listOfStudent.stream().filter(
//
//		            student -> student.getStudentId()==id1
//
//		        ).collect(Collectors.toList());
//
//		     System.out.println("the List of the Student is ");
//
//		     System.out.println(filterStudent);
//		
		     

		      String firstName1="abhisek";
		      List<StudentDataSearchById> filterStudentDataSearchById = listOfStudents.stream().filter(
		    		  name -> name.getFirstName()==firstName1
		    		  ).collect(Collectors.toList());
		      
		      System.out.println("the List of the Student is after searching by FirstNames ");

			     System.out.println(filterStudentDataSearchById);
}
	}
}
