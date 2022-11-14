package com.java.demo;

import java.util.Scanner;

public class Revwhile {
public static void main(String[] args) {
	int num=0,rev=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number to reverse");
    num=sc.nextInt();
	while(num!=0)
	{
		rev=rev*10;
		rev=rev+num % 10;
		num=num/10;
	}
	System.out.println(rev);
	sc.close();
}
}
