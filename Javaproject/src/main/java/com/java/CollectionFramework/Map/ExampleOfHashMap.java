package com.java.CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class ExampleOfHashMap {
	public static void main(String[] args) {

		/**
		 * map always have a key value pair , in which the key is always unique but the
		 * value can or cannot be unique whenever an element is added in a same position
		 * it basically overrides tht value
		 */
		Map<String, Integer> numbers = new HashMap<>();

		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		numbers.put("four", 4);

		System.out.println(numbers);
		// whenever an element is added in a same position it basically overrides tht
		// value
		// after overriding the key four with value 5
		numbers.put("four", 5);

		System.out.println(numbers);

		// if we want to check a certain key is present then dont override orelse
		// overrides

		if (!numbers.containsKey("four"))
			;
		numbers.put("four", 4);

		// another way

		numbers.putIfAbsent("five", 5);
		System.out.println("after using putIfAbsent we have " + numbers);

		// to check if a value or key is present or not

		System.out.println(" using containsKey :  " + numbers.containsKey("three")); // will return boolean value
		System.out.println(" using containsValue : " + numbers.containsValue(4)); // will return boolean value

		// isEmpty is used to check if the map is empty or not
		System.out.println(numbers.isEmpty());

		// for iterating the key value pairs inside the map

		for (Map.Entry<String, Integer> e : numbers.entrySet()) {
			System.out.println(e);
					//to get only key 
					System.out.println(" the key is " + e.getKey());
					// to get the value 
					System.out.println(" the value is " + e.getValue());

		}

	}
}
