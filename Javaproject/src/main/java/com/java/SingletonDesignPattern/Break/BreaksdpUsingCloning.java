package com.java.SingletonDesignPattern.Break;

public class BreaksdpUsingCloning {
      private static BreaksdpUsingCloning instance = new BreaksdpUsingCloning();
      
      private static BreaksdpUsingCloning getInstance() {
    	  return instance;
    	  
      }
      public static void main(String[] args) throws CloneNotSupportedException {
		BreaksdpUsingCloning obj = BreaksdpUsingCloning.getInstance();
		System.out.println(obj);
		System.out.println(obj.clone());
	}
}
