package com.java.Day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


class Data{
	int id;
	String name;
	
	public Data(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String display() {
		return "Data [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class SerAndDeser {
public static void main(String[] args) {
	
	try {
		
	FileOutputStream fos=new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\input.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
		Data d1=new Data(12, "abhisek");
		oos.writeObject(d1);
		d1.display();
	
	FileInputStream fis=new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\output.txt");
	ObjectInputStream ois= new ObjectInputStream(fis);
	Data d2=(Data)ois.readObject();
	d2.display();
	
	}
	catch (Exception e) {
		// TODO: handle exception
	}
}
}

