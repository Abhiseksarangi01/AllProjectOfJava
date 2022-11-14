package com.java.sumanthTask;

import java.util.Scanner;

interface EvenOdd {
	void calculate(int a);
}

public class Lamda_Expression {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		 a = sc.nextInt();
		
		EvenOdd oddEven=(a) ->{
			System.out.println("Enter the Number of your choice");
			a = sc.nextInt();
			
			if(a%2==0) {
				System.out.println("Number is even");
			}else {
					System.out.println("Number is odd");
				}
		};
	
	}
}
		
	
