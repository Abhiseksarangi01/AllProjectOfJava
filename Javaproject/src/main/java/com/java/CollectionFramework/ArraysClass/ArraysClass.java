package com.java.CollectionFramework.ArraysClass;

import java.util.Arrays;

public class ArraysClass {
	/**
	 * arrays class is basically used to handle manipulations in array not in arrayList
	 */
	public static void main(String[] args) {
		 
		int[] numbers= {1,2,3,4,5,6,7,8,9};
		
		
		
		
		
		/**
		 * binary search is a function present inside arrays class
		 * which helps to search a element and returns the index in which it is present 
		 * It works only if the array is sorted because
		 * it works only in sorted arrays 
		 * Time complexity is O(log n)
		 */
		
		int index= Arrays.binarySearch(numbers, 4);
		System.out.println("the index of element 4 in the array " + index);
		
		int[] num= {23,65,76,22,11,45,77,89,89};
		//I  want to sort this array 
		Arrays.sort(num);
		 for(int i : num) {
			 System.out.print(i +" ");
		 }
		 
		 /**
		  * parallelSort() - basically sorts the array a bit more faster
		  * than normal sort ,but it also has some restrictions like if
		  * the number of elements inside it is more than 8192,
		  * only then parallel sort works otherwise it runs a normal sort
		  */
		 
		 /**
		  * Arrays.fill - it will fill the whole arrays the total number of times 
		  * accrding to the number of elements present inside it  with the element 
		  * you provide .
		  */
		 
		  Arrays.fill(numbers, 12);
		  for(int i : numbers) {
			  System.out.print(i + " ");
		  }
		 
		
	}
}
