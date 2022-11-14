package com.java.STREAM.IntermediateOperations;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class UseOfMap {
	
	static void findSquareUsingMap(List<Integer> listOfNumber) {
		listOfNumber.stream()
		.map(element -> element*element)
		.forEach(obj -> System.out.println(obj + " "));
		
		//applying distinct on map
		
		System.out.println(" i am getting the distinct values after getting the square of each element ");
		System.out.println(
				listOfNumber.stream()
				.distinct()
				.map(element -> element*element)
				.collect(Collectors.toList())
				);
		
		// applying sorted on distinct
		System.out.println("after sorting the values using sorted we have");
		System.out.println(
				listOfNumber.stream()
				.distinct()
				.sorted()
				.map(element -> element*element )
				.collect(Collectors.toList()));
		
		
		// applying filter tht only values less than 50 will be printed
		
	System.out.println("after applying distinct,sort and filter we have the list ");
	
	System.out.println(
			listOfNumber.stream()
			.distinct()
			.sorted()
			.map(element -> element*element)
			.filter(element -> (element<50))
			.collect(Collectors.toList())
			);
			
		
	}
	
	//now lets call the function in main 
	
public static void main(String[] args) {
	System.out.println("the use of map");
	List<Integer> listNum = Arrays.asList(3,4,1,2,3,1);
	findSquareUsingMap(listNum);

	
	
}
}
