package com.java.Day7;

import java.util.Scanner;

class Substraction{
	public void sub() {
		int n,calc=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of digits you want to enter");
		n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int j=0;j<n;j++) {
			calc = - (arr[j]) - calc;
		}
		
		System.out.println("after substraction between the numbers "+ calc);
		
		
	}
}
public class Calculate {
public static void main(String[] args) {
	Substraction subtract=new Substraction();
	subtract.sub();
}
}
