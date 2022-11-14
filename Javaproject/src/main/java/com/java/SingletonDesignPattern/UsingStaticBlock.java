package com.java.SingletonDesignPattern;

public class UsingStaticBlock {

	private UsingStaticBlock() {}// constructor
	
	
	public static UsingStaticBlock instance; //variable
	
	{
		instance=new UsingStaticBlock();
	}
	
	public static void main(String[] args) {
		EagerSingleton obj1= EagerSingleton.getInstance();
		System.out.println(obj1.hashCode());
		EagerSingleton obj2= EagerSingleton.getInstance();
		System.out.println(obj2.hashCode());
}
}
