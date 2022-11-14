package com.java.Day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

class Demo implements Serializable {
	int id;
	String name;
	public Demo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

public class Serialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Demo onj = new Demo(1, "JSon Data");
		String filePath = "C:\\Users\\abhiseks\\Desktop\\Sample\\Serilization.txt";
		FileOutputStream file = new FileOutputStream(filePath);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(onj);
		System.out.println("Success");
		out.close();
		FileInputStream file1 = new FileInputStream(filePath);
		ObjectInputStream ins = new ObjectInputStream(file1);
		Demo obj1 =  null;
		obj1 = (Demo) ins.readObject();
//		System.out.println(obj1.id);
//		System.out.println(obj1.name);
		
		int id = obj1.id;
		String name = obj1.name;
		System.out.println("id  " + id);
		System.out.println("Name is "+name);
		FileOutputStream file2 = new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\OutputAfterdes.txt");
		String str = "";
		//file2.write(str.getBytes());
//		file2.write(name,0,name.length());
		String text = id + " " + name; 
		Path fileName = Path.of("C:\\Users\\abhiseks\\Desktop\\Sample\\OutputAfterdes1.txt");
		Files.writeString(fileName,text); 
		String file_reader = Files.readString(fileName);
		System.out.println(file_reader);
		System.out.println("Data write SuccessFully");
		
	}

}
