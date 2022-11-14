package com.java.Day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) throws IOException {
	String line=" ";
	FileInputStream fin=new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\Armstrong.txt");
	Scanner sc=new Scanner(fin);
	while(sc.hasNext()) {
		line=sc.next();
	}
	System.out.println(line);
	
	int number=Integer.parseInt(line);
	
	int remainder,sum=0,saveNumber=number;
	while(number!=0) {
		remainder=number%10;
		sum=sum+remainder*remainder*remainder;
		number=number/10;
	}
	if(sum==saveNumber) {
		FileOutputStream fos=new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\Armstrong1.txt");
		fos.write(sum);
		fos.flush();
		System.out.println("its a armstrong number");
	}else {
			System.out.println("its not a armstrong number");
		}
		
	
	}
}

