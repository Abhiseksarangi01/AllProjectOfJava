package com.java.demo;

public class BreakL {
public static void main(String[] args) {
	 int x=10;
	 l1:
	 {
		 System.out.println("begin");
		 if(x==10)
     	 break l1;
		 System.out.println("end");
		 }
	 System.out.println("harry");
	 
}
}
