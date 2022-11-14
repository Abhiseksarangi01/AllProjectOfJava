package com.java.demo;
class student{
	int id;
	String name;
	String address;
	int age;
	
	
	public student(int id, String name, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}

	

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}



	public static void Displaydetails() {
		System.out.println("displaying details for students");
		
	}
}
public class StudentDetails {
public static void main(String[] args) {
	student str1=new student(1,"harish","bangalore",21);
	student str2 = new student(2, "abhishek", "chennai", 20);
	student str3= new student(3, "sunil", "kolkata", 22);
	System.out.println(str3);
	System.out.println(str1);
	System.out.println(str2);
//	int id1=str1.id;
//	str1.Displaydetails();
//	str2.Displaydetails();
//	str3.Displaydetails();
	
}
}
