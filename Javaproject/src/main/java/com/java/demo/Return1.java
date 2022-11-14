package com.java.demo;

public class Return1 {
	public static void hello() {
		System.out.println("returning void ");
	}
	public static int number() {
		return 100;
	}
	 public static String Name() {
		 return "abhisek";
	 }
	 public static float value() {
	 return 0.002f;
	 }
public static void main(String[] args) {
	hello();
	
	int num=number();
	System.out.println("the return number is "+ num);
	
	String name=Name();
	System.out.println("the return string is "+ name);
	 
	float vl=value();
	System.out.println("the return float value is "+ vl);
	
}
}
