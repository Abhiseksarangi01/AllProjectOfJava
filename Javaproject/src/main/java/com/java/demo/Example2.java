package com.java.demo;

public class Example2 {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Hello");
	sb.append("java");
	//after the modification of the string 
	System.out.println(sb);
	
	//how to insert the string at the specific index using index()
	sb.insert(1,"wello");
	System.out.println(sb);
	
//use of replace() in string buffer
	
//	StringBuffer sb1=new StringBuffer("explore");
	sb.replace(0, 4, "php");
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	
}
}
