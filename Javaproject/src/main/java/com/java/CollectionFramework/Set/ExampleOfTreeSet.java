package com.java.CollectionFramework.Set;

import java.util.Set;
import java.util.TreeSet;

public class ExampleOfTreeSet {
	/**
	 * treeset also implements the property of a set but it has a unique property
	 * it perform the tasks in a sorted form behind the scenes
	 * it implements a binary tree as well as implements the properties of a set as well
	 * TreeSet has the order sorted 
	 * Time complexity is Olog(n)
	 */
	
	public static void main(String[] args) {
		
		Set<Integer> listOfInteger = new TreeSet<>();
		listOfInteger.add(13);
		listOfInteger.add(22);
		listOfInteger.add(45);
		listOfInteger.add(356);
		listOfInteger.add(42);
		
		/** for every element that is added creates a hash in collection ,which is checked internally 
		 * if there is no same double hashes (memory address) present for a single element .
		 * as every element generates a unique hash for itself 
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
