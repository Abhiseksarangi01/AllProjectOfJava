package com.java.demo;

import java.util.Scanner;

class Armstrong{
	public void getArm() {
		int m,num,r=0,sum=0;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	     m=num;
	     while(num!=0) {
	     
	    	 r=num%10;
	         sum += r*r*r;
	         num=num/10;
	         
	}
	if(sum==m)
	{
		System.out.println("it is a Armstrong number");
		
		
	}
	else {
		System.out.println("this is not a armstrong number");
	}
		sc.close();
		
	}
}


public class ArmStrong_Number {
public static void main(String[] args) {
	Armstrong arm=new Armstrong();
	arm.getArm();
}
}
