package com.java.demo;

public class Example {
	//defining the variable of the class
	
		int a=9;
		int b=11;
		int c;
		//defining the methods of the class
		
	public void add() {
	int c=a+b;
	System.out.println("addition="+c);
	}
	
	public void sub() {
		int c=b-a;
		System.out.println("substraction="+ c);
		
	}
	//main method
public static void main(String[] args) {
	//creating the object of the class
	Example obj=new Example();
	//calling the methods
	obj.add();
	obj.sub();
	}
}
