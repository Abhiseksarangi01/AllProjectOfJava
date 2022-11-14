package com.java.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SolutionS {
public static void main(String[] args) throws IOException {
	
	FileInputStream file1 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\file1.txt");
	FileInputStream file2 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\file2.txt");
	FileInputStream file3 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\file3.txt");
	FileInputStream file4 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\file4.txt");
	FileInputStream file5 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\file5.txt");
	FileInputStream file6 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\file6.txt");
	FileInputStream file7 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\file7.txt");
	FileInputStream file8 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\file8.txt");
	FileInputStream file9 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\file9.txt");
	FileInputStream file10 = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\file10.txt");
	
	//using vector to hold multiple Inputstreams
	//vector provides the element function to add the files one by one into the vector
	Vector v=new Vector();
	v.add(file1);
	v.add(file2);
	v.add(file3);
	v.add(file4);
	v.add(file5);
	v.add(file6);
	v.add(file7);
	v.add(file8);
	v.add(file9);
	v.add(file10);
	
	
	//
	
	Enumeration e=v.elements();
	
	SequenceInputStream bin=new SequenceInputStream(e);//used to read multiple files from the folder 
	int i=0;
	while((i=bin.read())!=-1) {
		System.out.print((char)i);
	}
	bin.close();
	file1.close();
    file2.close();

	}
}
