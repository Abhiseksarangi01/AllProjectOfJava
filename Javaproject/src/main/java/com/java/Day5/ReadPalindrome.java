package com.java.Day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadPalindrome {
public static void main(String[] args) throws FileNotFoundException {
	String line="";
	FileInputStream fin=new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\palindrome.txt");
	Scanner sc=new Scanner(fin);
	while(sc.hasNext()) {
		line=sc.next();
	}
	System.out.println(line);
	
	int number=Integer.parseInt(line);
	
	System.out.println(number);
	
	
	 int divisor,remainder=0;
	 int SaveNumber=number;
	while(number!=0) {	
		divisor=number%10;
	    remainder=remainder*10+divisor;
	    number=number/10;
	}
	if(remainder==SaveNumber) {
    System.out.println("it is a palindrome number :");
	}else {
		System.out.println("it is not a palindrome number");
	}
    sc.close();
}
}

