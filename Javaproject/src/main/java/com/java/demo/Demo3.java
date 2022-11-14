package com.java.demo;

public class Demo3 {
public static void main(String[] args) {
	//let the arguemnt type using string
	//declare a variable for switch expression
	String str="two";
	switch(str)
	{
	case "one":
		System.out.println("one");
	case "two":
		System.out.println("two");
//		break;
	case "three":
		System.out.println("three");
		default:
			System.out.println("no match");
	}
}
}
