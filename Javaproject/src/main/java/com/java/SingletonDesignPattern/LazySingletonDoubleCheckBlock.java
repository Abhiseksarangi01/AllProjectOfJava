package com.java.SingletonDesignPattern;

public class LazySingletonDoubleCheckBlock {

	private LazySingletonDoubleCheckBlock() {}

	private static LazySingletonDoubleCheckBlock instance;

	public static LazySingletonDoubleCheckBlock getInstance()
	{
		if(instance==null) 
		{
		
			synchronized (LazySingletonDoubleCheckBlock.class)
			{
			if(instance ==  null)
				{

					instance = new LazySingletonDoubleCheckBlock();
				}
			 }
		 }
		
			return instance;
	 }
	public static void main(String[] args) {
		EagerSingleton obj1= EagerSingleton.getInstance();
		System.out.println(obj1.hashCode());
		EagerSingleton obj2= EagerSingleton.getInstance();
		System.out.println(obj2.hashCode());
}
}

