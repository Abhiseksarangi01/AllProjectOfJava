package com.java.STREAM.ShortCircuitOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseOfAllMatch {
	
	private static boolean matchedNumbers(List<Integer> listOfNumbers) {
		boolean res = listOfNumbers.stream()
				.allMatch(element -> element%3==0);
		
		return res;
		
		
	}
	
	
	
	
public static void main(String[] args) {
	 
	
	 /*
     * Stream allMatch(Predicate predicate) returns whether all elements of this
     * stream match the provided predicate. It may not evaluate the predicate on all
     * elements if not necessary for determining the result. This is a
     * short-circuiting terminal operation. A terminal operation is short-circuiting
     * if, when presented with infinite input, it may terminate in finite time.
     */
	
	List<Integer> allmatch = Arrays.asList(4,6,2,8,23,46);
	boolean ans = matchedNumbers(allmatch);
	System.out.println(ans);
	
	
}
}
