package com.java.Day2;


import java.io.FileOutputStream;


public class WriteFile {
public static void main(String[] args) {
	    String s="abhisek";
  
	try {
		FileOutputStream ofile = new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\output.txt");
	    ofile.write(s.getBytes());
	    ofile.close();
	    ofile.close();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
