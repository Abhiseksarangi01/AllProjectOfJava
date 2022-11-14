package com.java.SingletonDesignPattern;

public class EagerSingleton {
	private EagerSingleton() {
	}
		private static final EagerSingleton instance=new EagerSingleton();
		
		public static EagerSingleton getInstance() {
			return instance;
		
		}
		public static void main(String[] args) {
			EagerSingleton obj1= EagerSingleton.getInstance();
			System.out.println(obj1.hashCode());
			EagerSingleton obj2= EagerSingleton.getInstance();
			System.out.println(obj2.hashCode());
		}
	}

