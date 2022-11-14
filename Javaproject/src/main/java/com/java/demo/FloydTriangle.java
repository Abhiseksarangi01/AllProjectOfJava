package com.java.demo;


import java.util.Scanner;

public class FloydTriangle {
public static void main(String[] args) {
	int c,num=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of rows");
	int rows=sc.nextInt();
	for(c=1;c<=rows;c++)
	{
		for(int j=1;j<=c;j++)
		{
			System.out.print(num +" ");
		num++;
		sc.close();
		}
	System.out.println();
}
}
}
