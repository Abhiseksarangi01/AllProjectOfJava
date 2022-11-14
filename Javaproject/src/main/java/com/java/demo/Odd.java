package com.java.demo;

import java.util.Scanner;

public class Odd {
	public void show() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number of your choice");
		 int n = sc.nextInt();
	if(n % 2 ==1)
	{
		System.out.println("its odd");
	}
	else
		System.out.println("its even");
	}
public static void main(String[] args) {
	
     Odd obj =new Odd();
     obj.show();
     
} 
}

