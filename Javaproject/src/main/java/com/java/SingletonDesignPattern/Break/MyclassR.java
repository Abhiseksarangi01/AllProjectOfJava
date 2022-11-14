package com.java.SingletonDesignPattern.Break;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MyclassR {

		 private static MyclassR instance = new MyclassR();
	      
	      private static MyclassR getInstance() {
	    	  return instance;
	    	  
	      }
	      public static void main(String[] args) {
			MyclassR obj = MyclassR.getInstance();
			
			
		try {
			//load class
			Class c = Class.forName("com.codippa.MyClass");
			//get all constructors (whether public or private)
			Constructor[] constructors = c.getDeclaredConstructors();
			//suppress access check errors
			constructors[0].setAccessible(true);
			//instance no 1
			System.out.println(constructors[0].newInstance());
			//instance no 2
			System.out.println(constructors[0].newInstance());
		} catch (ClassNotFoundException e) {
				e.printStackTrace();
		} catch (InstantiationException e) {
				e.printStackTrace();
		} catch (IllegalAccessException e) {
				e.printStackTrace();
		} catch (IllegalArgumentException e) {
				e.printStackTrace();
		} catch (InvocationTargetException e) {
				e.printStackTrace();
		}
	}
}
