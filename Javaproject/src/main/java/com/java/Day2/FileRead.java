package com.java.Day2;

import java.io.FileInputStream;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		
		String line="";
		
		try {
			FileInputStream infile=new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\input.txt");
			Scanner sc=new Scanner(infile);
			while(sc.hasNext()) {
				line=sc.nextLine();
				System.out.println(line);
			}
			
			
				
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}

