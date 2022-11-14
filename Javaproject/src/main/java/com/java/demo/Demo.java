package com.java.demo;

import java.util.InputMismatchException;
import java.util.*;


public class Demo{
	
	public void show(int x, int y) {
		
	int z=x/y;
	System.out.println("result:"+z);
	}
	
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	int x = 0,y = 0;
	
	try {
		System.out.println("Enter a whole number to divide:");
		x=sc.nextInt();
		
		System.out.println("enter a whole to divide by:");
		 y=sc.nextInt();
		
		}
	catch(ArithmeticException e) {
		System.out.println("you cant divide zero!");
	   }
	catch(InputMismatchException e) {
		System.out.println("Please enter  a number ");
	}
	
	finally {
		sc.close();
	}
	Demo obj=new Demo();
	obj.show(x,y);
	

}
}

