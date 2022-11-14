package com.java.STREAM.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java.demo.Array;

public class UseOfFilter {
public static void main(String[] args) {
	
	

    /*
     * 
     * Note:
     * 
     * Intermediate functions return a stream back.
     * On any stream you can execute any number of intermediate operations, but the
     * terminal operation should be single and written at last. So following are the
     * intermediate methods provided by the Stream
     * Predicate is a non-interfering, stateless predicate to apply to each element
     * to determine if it should be included or not.
     * 
     * 
     */
    /*
     * It returns a new stream consisting of the elements of the stream from which
     * it is called which are according to the predicate (condition).
     * 
     * 
     */
	
	System.out.println("the use of filter() in stream");
	List<String> names = Arrays.asList("abhisek","sunil","bishal");
	List<String> resultAfterFilter = names.stream()
	.filter(s -> s.startsWith("s"))
	.collect(Collectors.toList());
	System.out.println("after filtering the data with S is :" + resultAfterFilter);
	
	List<Integer> number = Arrays.asList(12,34,2,3,67,87,98,80,96,543,334,234);
	printEvenNumberUSingStream(number);
	printOddNumberUsingStream(number);
	
}
     
     private static void printEvenNumberUSingStream(List<Integer> evenNumberList) {
    	 evenNumberList.stream()
    	 .filter(i -> (i%2==0))
    	 .forEach(element -> System.out.println(element));
    	 
    	 
    	 
     }
     private static void printOddNumberUsingStream(List<Integer> oddNumberList) {
    	 oddNumberList.stream()
    	 .filter(i -> (i % 2 == 1))
    	 .forEach(element -> System.out.println(element));
     }
}
