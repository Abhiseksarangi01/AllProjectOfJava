package com.java.demo;

import java.util.Scanner;

class ReverseN{
	public void getReverse() {
		int r=0,d=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number of your choice");
		int n=sc.nextInt();
		int m=n;
		
		
		while(n != 0) {
			
			d=n%10;
		    r=r*10+d;
		    n=n/10;
		}
		if(r==m) {
	    System.out.println("it is a palindrome number :");
		}else {
			System.out.println("it is not a palindrome number");
		}
	    sc.close();
		
	}
}



public class Palindrome_Number {
          public static void main(String[] args) {
        	  ReverseN rv=new ReverseN();
        	  rv.getReverse();
		}

}
