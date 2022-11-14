package com.java.demo;

import java.util.Scanner;

public class FirstJavaProgram {
 public static void main(String[] args) {
	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a number");
	 int num=sc.nextInt();
	 System.out.println("the number enterd is "+num);
	 sc.close();
}

}