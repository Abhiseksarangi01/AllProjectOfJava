package com.java.SingletonDesignPattern.Break;

public class MyClass implements Cloneable {
	
	private static MyClass instance = new MyClass();
	
	private static MyClass getInstace() {
		return instance;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		MyClass obj = MyClass.getInstace();
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println(obj.clone());
		
	}

}
