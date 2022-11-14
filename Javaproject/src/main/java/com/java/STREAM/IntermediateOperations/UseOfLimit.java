package com.java.STREAM.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseOfLimit {
public static void main(String[] args) {
	 
	List<Integer> numberList = Arrays.asList(23,45,34,22,778,99,56,44,35,90,23);
	printNumberUsingLimit(numberList);
	System.out.println("the List of The Number Using Double colon");
	numberList.forEach(System.out::println);//used as a iterator we can say 
	
	
}
  
	private static void printNumberUsingLimit(List<Integer> listOfNUmbers) {
		System.out.println(
				listOfNUmbers.stream()
				.limit(1)
				.collect(Collectors.toList()));
		
		
		
	}
	
	
}
