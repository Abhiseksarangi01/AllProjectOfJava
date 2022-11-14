package com.java.demo;

import java.util.*;
import java.util.InputMismatchException;

public class Exception {
	
	public void show(int x,int y) {
		
	int z=x/y;
	System.out.println("result="+z);
}
public static void main(String[] args) {
	
	
		Scanner sc=new Scanner(System.in);
	    int x=0,y=0;
	    
	try{
		System.out.println("enter a whole number to divide");
	    x=sc.nextInt();
	    System.out.println("enter a number to divide by");
	    y=sc.nextInt();
		
		Exception obj=new Exception();
		obj.show(x,y);
	   }
	catch
		(ArithmeticException e){
			System.out.println("you cannot divide by zero");
	}
    catch
	    (InputMismatchException e){
			System.out.println("input a number");
				}
	finally{
		sc.close();
	}
	
}
}
		
