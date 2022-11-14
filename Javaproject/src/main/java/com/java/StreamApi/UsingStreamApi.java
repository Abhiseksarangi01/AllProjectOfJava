package com.java.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Using Stream API 

public class UsingStreamApi {
public static void main(String[] args) {
	List<Integer> list1=new ArrayList<>();
	list1.add(12);
	list1.add(23);
	list1.add(34);
	list1.add(45);
	
	System.out.println(list1);
	
	Stream<Integer> stream=list1.stream();
	List<Integer> newList=stream.filter(i -> i % 2==0).collect(Collectors.toList());
	System.out.println(newList);
	
	//printing the list with numbers greater than 12
	
	List<Integer> list2=list1.stream().filter(i->i>12).collect(Collectors.toList());
	System.out.println(list2);
}
}
