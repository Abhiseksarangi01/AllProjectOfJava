package com.java.Day1;

import java.util.Scanner;

class Rev{
	public void revStr() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String str=sc.next();
		String rev="";
		
		int count=str.length();
		System.out.println(count);
		
		for(int i=str.length()-1;i>=0;i--)
			 rev=rev+str.charAt(i);
		System.out.println(rev);
		String concat=(str+rev);
		System.out.println(concat);
		int count1=concat.length();
		System.out.println(count1);
		sc.close();

	}
}


public class ReverseString {
	public static void main(String[] args) {
		
		Rev rv=new Rev();
		rv.revStr();
	
		
	
	

	
	}
}

