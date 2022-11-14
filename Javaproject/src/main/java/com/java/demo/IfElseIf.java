package com.java.demo;

import java.util.Scanner;

public class IfElseIf {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 int num1 = sc.nextInt();
     int num2 = sc.nextInt();
     sc.close();
     if (num1==num2) {
	 System.out.println("num1 and num2 are equal");
     }
     else{
	 System.out.println("num1 and num2 are not equal");
     }

     if( num1 != num2 ){
	 System.out.println("num1 and num2 are not equal");
     }
     else{
	 System.out.println("num1 and num2 are equal");
     }

     if( num1 > num2 ){
	 System.out.println("num1 is greater than num2");
     }
     else{
	 System.out.println("num1 is not greater than num2");
     }

     if( num1 >= num2 ){
	 System.out.println("num1 is greater than or equal to num2");
     }
     else{
	 System.out.println("num1 is less than num2");
     }

     if( num1 < num2 ){
	 System.out.println("num1 is less than num2");
     }
     else{
	 System.out.println("num1 is not less than num2");
     }

     if( num1 <= num2){
	 System.out.println("num1 is less than or equal to num2");
     }
     else{
	 System.out.println("num1 is greater than num2");
     }
  }

}

