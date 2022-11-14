package com.java.Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student{
	int roll;
	String name;
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
	
}

class rollSort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.roll==o2.roll) {
			return 0;
		}else if(o1.roll>o2.roll) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	
	
}

public class IteratorI {
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      List<Student> listOfDetails=new ArrayList<Student>();
      Student s1=new Student(12, "abhisek");
      listOfDetails.add(s1);
      Student s2=new Student(114, "raabhisek");
      listOfDetails.add(s2);
      Student s3=new Student(214, "rarayakama");
      listOfDetails.add(s3);
      System.out.println(listOfDetails);
      
      Collections.sort(listOfDetails, new rollSort());
      System.out.println(listOfDetails);
      
      Iterator itr=listOfDetails.iterator();
      while(itr.hasNext());{
      System.out.println(itr.next());
	}
}
}

