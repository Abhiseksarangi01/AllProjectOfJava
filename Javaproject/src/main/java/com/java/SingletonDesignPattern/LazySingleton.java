package com.java.SingletonDesignPattern;

public class LazySingleton {

	private LazySingleton() {}
	
	private static LazySingleton instance;
	    
	public static LazySingleton getInstance() {
		if(instance==null) {
			return instance=new LazySingleton();
			
		}else
		{
			return instance;
		}
		
		
	}
	public static void main(String[] args) {
		EagerSingleton obj1= EagerSingleton.getInstance();
		System.out.println(obj1.hashCode());
		EagerSingleton obj2= EagerSingleton.getInstance();
		System.out.println(obj2.hashCode());
	}
}
