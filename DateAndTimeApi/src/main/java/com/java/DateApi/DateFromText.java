package com.java.DateApi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DateFromText {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("C:\\Users\\abhiseks\\Desktop\\abc.txt");
		
		FileInputStream fin= new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fin);
		
	    ois.readObject();
		
		
	}
}
