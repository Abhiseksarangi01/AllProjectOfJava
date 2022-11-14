package com.java.Day2;
	import java.io.*;
import java.util.Scanner;
	public class CopyFile {

	   public static void main(String args[]) throws IOException {  
	      FileInputStream in = null;
	      FileOutputStream out = null;

	      try {
	    	  //to read the data inside the file from a source
	         in = new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\input.txt");
	         //to write the data read into source destination
	         out = new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\output.txt");
	         //Is telling that:

// Assign fis.read() to the var i
//
// If i != -1, print the ASCII char representing the integer just read from the inputstream, and continue the loop.
//
// If i == -1, end the loop / stop reading, because it reached the end of file.


	         int i;
	         while ((i = in.read()) != -1) {
	            out.write(i);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	            
//	            
//	         String str = " ";
//	         Scanner sc= new Scanner(System.in);
//	         while(str.)
	         }
	      }
	   }
	}

