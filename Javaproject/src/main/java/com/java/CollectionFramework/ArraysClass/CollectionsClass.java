package com.java.CollectionFramework.ArraysClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java.demo.Arry;

public class CollectionsClass {
     /**
      * Collection class is used to perform 
      * small quick actions ie 
      * smallest element ,mininum, maximum ,
      * the frequency of a certain element
      */
	
	public static void main(String[] args) {
		List<Integer> listOfIntegers = new ArrayList<>();
		listOfIntegers.add(23);
		listOfIntegers.add(243);
		listOfIntegers.add(33);
		listOfIntegers.add(27);
		listOfIntegers.add(83);
		listOfIntegers.add(25);
		listOfIntegers.add(23);
		
		System.out.println(" list of Integers are : " + listOfIntegers);
		//Collections.min - gives you the smallest element inside the list .
		System.out.println(" The minimum element is : " + Collections.min(listOfIntegers));
		//Collections.min - gives you the smallest element inside the list .
		System.out.println(" The minimum element is : " + Collections.max(listOfIntegers));
		//Collections.frequency gives you the frequency of a certain element inside the list 
		System.out.println(" the frequency of 23 inside the list is : " + Collections.frequency(listOfIntegers, 23));
		
        //Collections.sort will sort the order inside your list 
		System.out.println(" after sorting using collections.sort");
        Collections.sort(listOfIntegers);
        System.out.println(listOfIntegers);
        
        /**if you want to sort the elements in descending order 
         * after sort you can pass comparator 
         */
        
        Collections.sort(listOfIntegers,Comparator.reverseOrder());
        System.out.println(listOfIntegers);

	}
	
}
