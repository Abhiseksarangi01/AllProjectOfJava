package com.java.demo;

import java.util.Scanner;

class Calculate{
	public void getDemo() {
		int number,counter=0,i;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		for(i=1;i<=number;i++) {
			if(number%i==0)
				counter=counter+1;
		}
		if (counter==2)
			System.out.println("Number is prime ");
		else {
			System.out.println("number is not prime");
		}
	}
}



public class PrimeNum {
public static void main(String[] args) {
	Calculate pn=new Calculate();
	pn.getDemo();
}
}
