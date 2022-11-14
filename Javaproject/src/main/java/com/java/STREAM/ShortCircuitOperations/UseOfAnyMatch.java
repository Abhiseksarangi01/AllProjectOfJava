package com.java.STREAM.ShortCircuitOperations;

import java.util.Arrays;
import java.util.List;

public class UseOfAnyMatch {
	private static boolean anyMatchedNumbers(List<Integer> listOfNumbers) {

		boolean result = listOfNumbers.stream()
				.anyMatch(i -> i % 2 ==0);
				
		return result;
		
		
		
		
		
		
	}

	
	
	public static void main(String[] args) {
		
		List<Integer> anyMatch = Arrays.asList(23,23,66,5,44,3,590,78,445);
		boolean  ans = anyMatchedNumbers(anyMatch);
		System.out.println(ans);
		
	}
}
