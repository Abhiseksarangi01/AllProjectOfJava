package com.java.demo.TodayTaskCode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class DeserializeDemo implements Serializable {

    try {
    	Employee f=new Employee();
	         FileInputStream fileIn =
	         new FileInputStream("C:\\Users\\abhiseks\\Desktop\\ser.txt");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         in.readObject(f);
	         in.close();
	         fileIn.close();
	         System.out.printf("Serialized data is saved in ser.txt");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
 }



class Employee implements java.io.Serializable {
	   public String name;
	   public String address;
	   public transient int SSN;//transient is used to leave tht input as it is without serializing it .
	   public int number;
	   
	   public void Check() {
	      System.out.println(" check to " + name + " " + address);
	   }
	}

public class Serialization {
	   public static void main(String [] args) {
		      Employee e = new Employee();
		      e.name = "Ramya Ali";
		      e.address = "Phokka Kuan, Ambehta Peer";
		      e.SSN = 11122333;
		      e.number = 101;
		      
		      try {
		    	  //creating stream to read the object 
		         FileOutputStream fileOut =new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\ser.txt");
		         //writing the file
		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
		         out.writeObject(e);
		         out.close();
		         fileOut.close();
		         System.out.printf("Serialized data is saved in ser.txt");
		      } catch (IOException i) {
		         i.printStackTrace();
		      }
	   } 
}
}
		      
	