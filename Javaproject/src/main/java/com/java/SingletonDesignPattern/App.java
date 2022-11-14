package com.java.SingletonDesignPattern;

public class App {
public static void main(String[] args) {
	
	System.out.println("Hello singleton");
	
	EagerSingleton obj1=new EagerSingleton();
//	System.out.println(obj1.hashCode());
//	EarlySingleton obj2=new EarlySingleton.getInstance();
//	System.out.println((obj2.hashCode()));
	
	
	//LazySingleton obj1=new LazySingleton.getInstance();
	
//	System.out.println(obj1.hashCode());
//	LazySingleton obj2=new LazySingleton.getInstance();
//	System.out.println((obj2.hashCode()));
//	
	System.out.println(EagerSingleton.getInstance());
	LazySingleton.getInstance();
	
	LazySingletonDoubleCheckBlock.getInstance();
	
	
}
}
