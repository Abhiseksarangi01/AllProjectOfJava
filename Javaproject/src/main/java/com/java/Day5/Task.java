package com.java.Day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.SequenceInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

class Manager implements Serializable {
	int managerId;
	String firstName;
	String lastName;
	String address;
	String pinCode;
	public Manager(int managerId, String firstName, String lastName, String address, String pinCode) {

		this.managerId = managerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", pinCode=" + pinCode + "]";
	}
	
	
}
class Student implements Serializable{
	int StudentId;
	String firstName;
	String lastName;
	String address;
	String pinCode;
	public Student(int studentId, String firstName, String lastName, String address, String pinCode) {
		StudentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", pinCode=" + pinCode + "]";
	}
	
	
	
	}

class EmployDetails implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String firstName;
	String lastName;
	String address;
	String pinCode;
	public EmployDetails(int id, String firstName, String lastName, String address, String pinCode) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "EmployDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", pinCode=" + pinCode + "]";
	}
	
	
	
	}

class Admin implements Serializable {
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	int adminId;
	String firstName;
	String lastName;
	String address;
	String pinCode;
	
	public Admin(int adminId, String firstName, String lastName, String address, String pinCode) {
		this.adminId = adminId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Admin [AdminId=" + adminId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", pinCode=" + pinCode + "]";
	}
	
	}
	
public class Task {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	ArrayList<Manager> listOfManagers = new ArrayList<Manager>();
	listOfManagers.add(new Manager(1, "abhisek", "sarangi", "banagalore", "whitefield"));
    listOfManagers.add(new Manager(2, "sunil", "gupta", "lucknow", "gorakhpur"));
    
    System.out.println("list of managers "+ listOfManagers);
    
    
    FileOutputStream fos = new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\TaskBySunilDay5\\Manager.txt");
    ObjectOutputStream ous = new ObjectOutputStream(fos);
    ous.writeObject(listOfManagers);
    ous.close();
    fos.close();
    
    System.out.println("success");
   
    
    
    //graphity
    
    
    ArrayList<Student> listOfStudents = new ArrayList<Student>();
    listOfStudents.add(new Student(3, "abhisek", "sarangi", "banagalore", "whitefield"));
    listOfStudents.add(new Student(4, "sunil", "gupta", "lucknow", "gorakhpur"));
    
    System.out.println("list of Students "+ listOfStudents);
    
    FileOutputStream fos1 = new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\TaskBySunilDay5\\Student.txt");
    ObjectOutputStream ous1 = new ObjectOutputStream(fos1);
    ous1.writeObject(listOfStudents);
    ous1.close();
    fos1.close();
    
    System.out.println("Success");
  
    //graphity
    
    ArrayList<EmployDetails> listOfEmploy = new ArrayList<EmployDetails>();
    listOfEmploy.add(new EmployDetails(5, "abhisek", "sarangi", "banagalore", "whitefield"));
    listOfEmploy.add(new EmployDetails(6, "sunil", "gupta", "lucknow", "gorakhpur"));
    
    System.out.println("list of Employees "+ listOfEmploy);
    
    FileOutputStream fos2 = new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\TaskBySunilDay5\\Employ.txt");
    ObjectOutputStream ous2 = new ObjectOutputStream(fos2);
    ous2.writeObject(listOfEmploy);
    ous2.close();
    fos2.close();
    System.out.println("success");
    
    //graphit
    
    ArrayList<Admin> listOfAdmin = new ArrayList<Admin>();
    listOfAdmin.add(new Admin(7, "abhisek", "sarangi", "banagalore", "whitefield"));
    listOfAdmin.add(new Admin(8, "sunil", "gupta", "lucknow", "gorakhpur"));
    
    System.out.println("list of Admins "+ listOfAdmin);
    
    FileOutputStream fos3 = new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\TaskBySunilDay5\\Admin.txt");
    ObjectOutputStream ous3 = new ObjectOutputStream(fos3);
    ous3.writeObject(listOfAdmin);
    ous3.close();
    fos3.close();
    
    System.out.println("success");
    
    //graphity
    
    
    FileInputStream file1 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\TaskBySunilDay5\\Manager.txt");
    FileInputStream file2 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\TaskBySunilDay5\\Student.txt");
    FileInputStream file3 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\TaskBySunilDay5\\Employ.txt");
    FileInputStream file4 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\TaskBySunilDay5\\Admin.txt");
    
    System.out.println("after concatenating all the files");
    
    Vector v=new Vector();
	v.add(file1);
	v.add(file2);
	v.add(file3);
	v.add(file4);
	
	Enumeration e=v.elements();
	
	SequenceInputStream bin=new SequenceInputStream(e);//used to read multiple files from the folder 
	int i=0;
	while((i=bin.read())!=-1) {
		System.out.print((char)i);
	}
	bin.close();
	file1.close();
    file2.close();
    
    System.out.println("success");
    
    
    
    
    FileInputStream fis1 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\TaskBySunilDay5\\Manager.txt");
    FileInputStream fis2 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\TaskBySunilDay5\\Student.txt");
    FileInputStream fis3 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\TaskBySunilDay5\\Employ.txt");
    FileInputStream fis4 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\TaskBySunilDay5\\Admin.txt");
   
   
    
   ObjectInputStream ois1 = new ObjectInputStream(fis1); 
   Manager m1=(Manager)ois1.readObject();
   System.out.println(m1.managerId + " " + m1.firstName + " "+ m1.lastName + " " + m1.address + " " + m1.pinCode); 
 
   
   
   Manager m2=(Manager)ois1.readObject();
   System.out.println(m2.managerId + " " + m2.firstName + " "+ m2.lastName + " " + m2.address + " " + m2.pinCode);
   
   
   
   ObjectInputStream ois2 = new ObjectInputStream(fis2);
   Student s1=(Student)ois2.readObject();
   System.out.println(s1.StudentId + " " + s1.firstName + " "+ s1.lastName + " " + s1.address + " " + s1.pinCode); 
   
   
   Student s2=(Student)ois2.readObject();
   System.out.println(s2.StudentId + " " + s2.firstName + " "+ s2.lastName + " " + s2.address + " " + s2.pinCode); 
   
   
   
   ObjectInputStream ois3 = new ObjectInputStream(fis3);
   EmployDetails e1=(EmployDetails)ois3.readObject();
   System.out.println(e1.id + " " + e1.firstName + " "+ e1.lastName + " " + e1.address + " " + e1.pinCode); 
   
   EmployDetails e2=(EmployDetails)ois3.readObject();
   System.out.println(e2.id + " " + e2.firstName + " "+ e2.lastName + " " + e2.address + " " + e2.pinCode); 
   
   
   ObjectInputStream ois4 = new ObjectInputStream(fis4); 
   Admin a1=(Admin)ois3.readObject();
   System.out.println(a1.adminId + " " + a1.firstName + " "+ a1.lastName + " " + a1.address + " " + a1.pinCode); 
   
   
   System.out.println("succss");
   
   
   
   
}

}
