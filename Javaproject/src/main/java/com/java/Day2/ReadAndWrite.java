package com.java.Day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWrite {

	public static void main(String[] args) {
		 String line="";
		 
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\input.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc=new Scanner(fin);
		while(sc.hasNext()) {
			line=sc.nextLine();
			System.out.println(line);
		}
		
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\output.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fout.write(line.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fout.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
