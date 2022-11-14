package com.java.STREAM.ShortCircuitOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UseOfFindAny {
//	private static Integer anyNumberFromStream(Optional<Integer> ListOfNumbers) {
//		System.out.println(
//				ListOfNumbers.stream()
//				.filter(i -> (i%2==0))
//				.findAny()
//				);
//		Integer result = ListOfNumbers.stream()
//				.anyMatch(i -> i % 2 ==0);
//				
//		return result;
		
//	}

	/*
     * In Java Stream API findAny() method is used to return some element of the
     * stream. Method returns the element as an Optional or an empty Optional if the
     * stream is empty.
     * 
     * The findAny () method is a terminal short-circuiting operation.
       The findAny () method returns an Optional.
       The Optional contains the value as any element of the given stream, if Stream is non-empty. 
     */
	
	
	
	public static void main(String[] args) {
		
		   List<Integer> listOfNumber = Arrays.asList(3, 9, 1, 9, 7, 8);
	         Optional<Integer> anyNumberFromStream = listOfNumber.stream()
	         .filter(n -> n>5)
	         .findAny();
	         System.out.println(anyNumberFromStream);
	}
}
