package com.java.sumanthTask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TraditionalM {
public static void main(String[] args) {
	
	try {
		FileReader reader=new FileReader("C://Users//abhiseks//Desktop//Even.txt");
		int data=reader.read();
		while(data != -1) {
//			System.out.print((char)data);
			data=reader.read();
//			System.out.println(data);
			if(data%2==0) {
				System.out.println("Even Number ");
				break;
			}else {
				System.out.println("Odd number");
				break;
			}
		}
		System.out.println(data);
	
		FileReader reader1=new FileReader("C://Users//abhiseks//Desktop//Odd.txt");
		int data1=reader1.read();
		while(data1 != -1) {
//			System.out.print((char)data);
			data1 =reader1.read();
//			System.out.println(data1);
			if(data1%2==0) {
				System.out.println("Even Number ");
				break;
			}else {
				System.out.println("Odd number");
				break;
			}
			
		}
		reader1.close();	
		 		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}


