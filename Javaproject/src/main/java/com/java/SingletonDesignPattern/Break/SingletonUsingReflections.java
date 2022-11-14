package com.java.SingletonDesignPattern.Break;

import java.lang.reflect.Constructor;

public class SingletonUsingReflections {
	

	private SingletonUsingReflections() {
		//private constructor
	}
	public static ReflectionInSingleton instance = new ReflectionInSingleton();

	public static void main(String[] args) {
		ReflectionInSingleton instance1 = ReflectionInSingleton.instance;
		ReflectionInSingleton instance2 = null;
		try {
			Constructor[] constructors = ReflectionInSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
            //Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instance2 = (ReflectionInSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("instance1.hashCode():- " + instance1.hashCode());
		System.out.println("instance2.hashCode():- " + instance2.hashCode());
	}

}
