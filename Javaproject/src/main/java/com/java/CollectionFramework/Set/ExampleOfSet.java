package com.java.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class ExampleOfSet {
// set - order of elements is unordered and no duplicate elements cannot be found inside the set 
	public static void main(String[] args) {
		
		Set<Integer> listOfInteger = new HashSet<>();
		listOfInteger.add(13);
		listOfInteger.add(22);
		listOfInteger.add(45);
		listOfInteger.add(356);
		listOfInteger.add(42);
		
		/** for every element that is added creates a hash in collection ,which is checked internally 
		 * if there is no same double hashes (memory address) present for a single element .
		 * as every element generates a unique hash for itself 
		 * Time complexity in hashset is O(n)
		 * 
		 */
		System.out.println(listOfInteger); //the elements are printed hapazardly inside set
		
		//lets add another 22
		listOfInteger.add(22);
		System.out.println("even after adding the same element 22 twice we have no changes " + listOfInteger);
		// wont be adding the same integer again 
		
		//remove() - is used to remove an element from the set 
		listOfInteger.remove(13);
		System.out.println("after removing the element we have : " + listOfInteger);
		
		//contains() - checks if a element is present inside a set or not.returns a boolean value true/false
		
		System.out.println(listOfInteger.contains(22));
		
		//isEmpty() -checks if a set is empty or not and returns a boolean value 
		
		System.out.println(listOfInteger.isEmpty());
		
		//size() - returns the size number of elements present inside the set 
		
		System.out.println(listOfInteger.size());
		
		//clear() - use to clear the whole set 
		
		
		
	}
}
