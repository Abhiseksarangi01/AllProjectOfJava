package com.java.SingletonDesignPattern.Break;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import java.io.Serializable;

//A typical Singleton class
class Singleton implements Serializable {

public static Singleton instance = new Singleton();

private Singleton() {
 // private constructor
}

  private Object readResolve(){
	return instance;
  }

}

public class SingletonUsingSerilizationAndDeserilization {
	public static void main(String[] args) {
	    try {
	      // instance1 created from Singleton
	      Singleton instance1 = Singleton.instance;

	      // serialize instance1
	      ObjectOutput out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\Singleton\\SerDes12.text"));
	      out.writeObject(instance1);
//	      System.out.println(out);
//	      System.out.println(instance1.toString());
	      out.close();

	      // deserialize from file to object
	      ObjectInput in = new ObjectInputStream(new FileInputStream("C:\\Users\\abhiseks\\Desktop\\Singleton\\SerDes.text"));
	      Singleton instance2 = (Singleton) in.readObject();
//	      System.out.println(in);
//	      System.out.println(instance2.toString());
	      in.close();

	      System.out.println("instance1 hashCode: " + instance1.hashCode());
	      System.out.println("instance2 hashCode: " + instance2.hashCode());
	    }

	    catch (Exception e) {
	      e.printStackTrace();
	    }
	  
}
}