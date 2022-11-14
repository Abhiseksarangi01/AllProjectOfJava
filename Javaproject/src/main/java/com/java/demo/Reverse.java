package com.java.demo;

import java.util.*;



public class Reverse {

	public void show(int n) {

		int r=0;
		int d=0;
		
		while(n != 0) {
			
			d=n%10;
		    r=r*10+d;
		    n=n/10;
		} 
		    System.out.println("the reversed number is ="+r);
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		Reverse obj=new Reverse();
		obj.show(n);
		sc.close();
		
	}
}
