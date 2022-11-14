package com.java.CollectionFramework;

import java.util.Set;
import java.util.HashSet;


public class LinkedHashSet {
	/** LINKED HASHSET implements the property of a set as well the properties of a linkedlist 
	 * the order is maintained here unlike hashset 
	 * 
	 */
	public static void main(String[] args) {
		
		Set<Integer> linkedHashSet = new java.util.LinkedHashSet<>();
		linkedHashSet.add(100);
		linkedHashSet.add(200);
		linkedHashSet.add(300);
		linkedHashSet.add(400);
		linkedHashSet.add(500);
		linkedHashSet.add(600);
		System.out.println("the Linked has Set is ");
		System.out.println(linkedHashSet);
		
		
		
		Set<Integer> listOfInteger = new HashSet<>();
		listOfInteger.add(13);
		listOfInteger.add(22);
		listOfInteger.add(45);
		listOfInteger.add(356);
		listOfInteger.add(42);
		System.out.println("The List of Integer ");
		System.out.println(listOfInteger);
		
		/** for every element that is added creates a hash in collection ,which is checked internally 
		 * if there is no same double hashes (memory address) present for a single element .
		 * as every element generates a unique hash for itself 
		 */
		System.out.println(listOfInteger); //the elements are printed hapazardly inside set
		
		//lets add another 22
		listOfInteger.add(22);
		System.out.println("even after adding the same element twice we have no changes " + listOfInteger);
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
