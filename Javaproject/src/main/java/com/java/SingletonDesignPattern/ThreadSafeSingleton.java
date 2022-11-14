package com.java.SingletonDesignPattern;

public class ThreadSafeSingleton {

	private ThreadSafeSingleton() {}
	
	private static ThreadSafeSingleton instance;
	
	synchronized public static ThreadSafeSingleton getInstance() {
		
		if(instance == null)
		{
			return instance = new ThreadSafeSingleton();
		}
		else 
		{
			return instance;
		}
	}
}
