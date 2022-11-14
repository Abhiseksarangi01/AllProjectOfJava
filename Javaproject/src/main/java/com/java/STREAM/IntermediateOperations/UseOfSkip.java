package com.java.STREAM.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseOfSkip {
	private static void skipTheNumbers(List<Integer> listOfNumbers) {
		System.out.println("the list after skip is " +
		listOfNumbers.stream()
		.skip(4)
		.collect(Collectors.toList())
		);
		
	}
	
	
	
public static void main(String[] args) {
	
	 /*
     * The skip() method discards the first n elements of a stream. n cannot be a
     * negative number and if it is higher than the size of a stream the method will
     * return an empty stream
     */
	List<Integer> numberList = Arrays.asList(23,45,66,67,34,22,11,89,98);
	 System.out.println("The Array of the List is ");
     System.out.println(numberList);
     skipTheNumbers(numberList);
     
}
}
