package com.java.Day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

public class SerealizeIntoAFile {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	ArrayList<Student> listOfStudents = new ArrayList<Student>();
	listOfStudents.add(new Student(1, "abhisek"));
	listOfStudents.add(new Student(2, "Sunil"));
	
	String FilePath="C:\\Users\\abhiseks\\Desktop\\abc.txt";
	FileOutputStream fos=new FileOutputStream(FilePath);
	ObjectOutputStream ous=new ObjectOutputStream(fos);
	ous.writeObject(listOfStudents);
	ous.close();
	fos.flush();
	
	FileInputStream fis=new FileInputStream(FilePath);
	ObjectInputStream oos=new ObjectInputStream(fis);
	
	ArrayList<Student> studentList = new ArrayList<Student>();
	studentList = (ArrayList<Student>)oos.readObject();
	
	System.out.println(studentList);
	
	FileOutputStream fos1=new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\bcd.txt");
//	ObjectOutputStream ous1=new ObjectOutputStream(fos1);
//	ous1.writeObject(studentList);
//	ous1.close();
//	fos1.flush();
	fos1.write(studentList.);
}
}
