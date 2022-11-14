package com.java.Day2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingAJavaFile {
public static void main(String[] args) throws IOException {
	//code for creating a file
	
	File file=new File("C:\\Users\\abhiseks\\Desktop\\Sample\\Sample.txt");// representing the file
	
	if(!file.exists()) {
		file.createNewFile();
	}
	
	
	//writing the text into the file using FileOutputStream
	
	FileOutputStream fout=new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\Sample.txt");
	String textToBeWritten = "Abhisek made the code";
	fout.write(textToBeWritten.getBytes()); // converting string into byte array so tht we get the exact data there    
	fout.flush();
	fout.close();
			
	
	
}
}
