package com.java.demo;

public class Example1 {
  //defining the variables of the class
	int a=20;
	int b=10;
	int c;
	
	//defining the methods of the class
	 public void add() {
		 int c=a+b;
		 System.out.println("addition="+c);
	 }
	 public void sub() {
		 int c=a-b;
		 System.out.println("substraction="+c);
	 }
	 //main method
	 public static void main(String[]args) {
		 //creating the object of the class
		  Example1 obj=new Example1();
		 //calling the methods 
		 obj.add();
		 obj.sub();
	 }
}
