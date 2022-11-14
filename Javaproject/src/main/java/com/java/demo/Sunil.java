package com.java.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sunil {
	public static void main(String[] args) {
        System.out.println("This is the example of the searching the Data by Id ");
        Scanner sc = new Scanner(System.in); 
		System.out.println("enter the employ Number for searching the records in text file ");
		String empId = sc.next();
		String line = "";
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\data1.txt");
			Scanner sc1 = new Scanner(fin);
			while(sc1.hasNext()) {
				line = sc1.nextLine();
				if(line.startsWith(empId+",")) {
					System.out.println(line);
				}
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
