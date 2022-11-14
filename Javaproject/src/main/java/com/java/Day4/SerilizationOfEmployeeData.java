package com.java.Day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StudentManagement implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	int id;
    String firstName;
    String lastName;
    double salary;
    double premium;
	public StudentManagement(int id, String firstName, String lastName, double salary, double premium) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.premium = premium;
	}
    
    
	
}

public class SerilizationOfEmployeeData {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fileName = "C:\\Users\\abhiseks\\Desktop\\Sample\\input.txt";
		FileOutputStream fout = new FileOutputStream(fileName);
		StudentManagement emp1 = new StudentManagement(1, "Sunil","kumar",122920.0,12000);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(emp1);
		StudentManagement emp2 = new StudentManagement(2, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp2);
		StudentManagement emp3 = new StudentManagement(3, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp3);
		StudentManagement emp4 = new StudentManagement(4, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp4);
		StudentManagement emp5 = new StudentManagement(5, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp5);
		StudentManagement emp6 = new StudentManagement(6, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp6);
		StudentManagement emp7 = new StudentManagement(7, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp7);
		StudentManagement emp8 = new StudentManagement(8, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp8);
		StudentManagement emp9 = new StudentManagement(9, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp9);
		StudentManagement emp10 = new StudentManagement(10, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp10);
		StudentManagement emp11 = new StudentManagement(11, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp11);
		StudentManagement emp12 = new StudentManagement(12, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp12);
		StudentManagement emp13 = new StudentManagement(13, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp13);
		StudentManagement emp14 = new StudentManagement(14, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp14);
		StudentManagement emp15 = new StudentManagement(15, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp15);
		StudentManagement emp16 = new StudentManagement(16, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp16);
		StudentManagement emp17 = new StudentManagement(17, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp17);
		StudentManagement emp18 = new StudentManagement(18, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp18);
		StudentManagement emp19 = new StudentManagement(19, "Harish", "kumar", 100000, 10000);
		out.writeObject(emp19);
		System.out.println("Data Serilised SuccessFuly");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
		
		StudentManagement em11 = (StudentManagement) in.readObject();
		System.out.println(em11.id + " "+ em11.firstName + " "+ em11.lastName + " "+ em11.salary + " "+ em11.premium);
		StudentManagement em1121 = (StudentManagement) in.readObject();
		System.out.println(em1121.id + " "+ em1121.firstName + " "+ em1121.lastName + " "+ em1121.salary + " "+ em1121.premium);
		StudentManagement em12 = (StudentManagement) in.readObject();
		System.out.println(em12.id + " "+ em12.firstName + " "+ em12.lastName + " "+ em12.salary + " "+ em12.premium);
		StudentManagement em13 = (StudentManagement) in.readObject();
		System.out.println(em13.id + " "+ em13.firstName + " "+ em13.lastName + " "+ em13.salary + " "+ em13.premium);
		StudentManagement em14 = (StudentManagement) in.readObject();
		System.out.println(em14.id + " "+ em14.firstName + " "+ em14.lastName + " "+ em14.salary + " "+ em14.premium);
		StudentManagement em15 = (StudentManagement) in.readObject();
		System.out.println(em15.id + " "+ em15.firstName + " "+ em15.lastName + " "+ em15.salary + " "+ em15.premium);
		StudentManagement em16 = (StudentManagement) in.readObject();
		System.out.println(em16.id + " "+ em16.firstName + " "+ em16.lastName + " "+ em16.salary + " "+ em16.premium);
		StudentManagement em17 = (StudentManagement) in.readObject();
		System.out.println(em17.id + " "+ em17.firstName + " "+ em17.lastName + " "+ em17.salary + " "+ em17.premium);
		StudentManagement em18 = (StudentManagement) in.readObject();
		System.out.println(em18.id + " "+ em18.firstName + " "+ em18.lastName + " "+ em18.salary + " "+ em18.premium);
		StudentManagement em19 = (StudentManagement) in.readObject();
		System.out.println(em19.id + " "+ em19.firstName + " "+ em19.lastName + " "+ em19.salary + " "+ em19.premium);
		StudentManagement em111 = (StudentManagement) in.readObject();
		System.out.println(em111.id + " "+ em111.firstName + " "+ em111.lastName + " "+ em111.salary + " "+ em111.premium);
		StudentManagement em112 = (StudentManagement) in.readObject();
		System.out.println(em112.id + " "+ em112.firstName + " "+ em112.lastName + " "+ em112.salary + " "+ em112.premium);
		StudentManagement em113 = (StudentManagement) in.readObject();
		System.out.println(em113.id + " "+ em113.firstName + " "+ em113.lastName + " "+ em113.salary + " "+ em113.premium);
		StudentManagement em114 = (StudentManagement) in.readObject();
		System.out.println(em114.id + " "+ em114.firstName + " "+ em114.lastName + " "+ em114.salary + " "+ em114.premium);
		StudentManagement em115 = (StudentManagement) in.readObject();
		System.out.println(em115.id + " "+ em115.firstName + " "+ em115.lastName + " "+ em115.salary + " "+ em115.premium);
		StudentManagement em116 = (StudentManagement) in.readObject();
		System.out.println(em116.id + " "+ em116.firstName + " "+ em116.lastName + " "+ em116.salary + " "+ em116.premium);
		StudentManagement em117 = (StudentManagement) in.readObject();
		System.out.println(em117.id + " "+ em117.firstName + " "+ em117.lastName + " "+ em117.salary + " "+ em117.premium);
		StudentManagement em118 = (StudentManagement) in.readObject();
		System.out.println(em118.id + " "+ em118.firstName + " "+ em118.lastName + " "+ em118.salary + " "+ em118.premium);
		StudentManagement em119 = (StudentManagement) in.readObject();
		System.out.println(em119.id + " "+ em119.firstName + " "+ em119.lastName + " "+ em119.salary + " "+ em119.premium);
		
	}
	
}