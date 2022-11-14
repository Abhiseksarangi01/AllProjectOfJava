package com.java.demo;

public class ForEach1 {
public static void main(String[] args) {
	
	//to print the elements using for and for each 
	int [] x= {10,20,30,40,50};
	//normal for loop 
	for(int i=0;i<5;i++)
		
	{
		System.out.println(x[i]);
	}
	//enhanced for loop or for each loop 
	 for(int x1:x)
	 {
		 System.out.println(x1);
	 }
}
}
