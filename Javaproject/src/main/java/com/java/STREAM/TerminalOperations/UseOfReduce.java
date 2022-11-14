package com.java.STREAM.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UseOfReduce {
	public static void main(String[] args) {
		
		/*
         * The reduce function can be used whenever you want to take the values from a
         * stream and aggregate them into a single value. An example could be that you
         * want to take all the numeric values from a stream and add all of these
         * values.
         */
		
		  // Creating list of integers
        List<Integer> array = Arrays.asList(2, 0, 4, 6, 8);
  
        // Finding sum of all elements
        Optional<Integer> sum = array.stream()
        		.reduce((element1, element2) -> element1 + element2);
  
        // Displaying sum of all elements
        System.out.println("The sum of all elements is " + sum);
	}
}
