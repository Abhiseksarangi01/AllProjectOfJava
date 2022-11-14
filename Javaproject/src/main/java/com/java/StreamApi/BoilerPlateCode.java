package com.java.StreamApi;

import java.util.ArrayList;
import java.util.List;

//Without Using Stream API

public class BoilerPlateCode {
public static void main(String[] args) {
	
	List<Integer> list1 = new ArrayList<>();
	list1.add(23);
	list1.add(56);
	list1.add(78);
	list1.add(1);
	list1.add(9);
	
	System.out.println(list1);
	
	ArrayList<Integer> listEven = new ArrayList<Integer>();
	ArrayList<Integer> listOdd = new ArrayList<Integer>();
	
	for(Integer i:list1) {
		
	
	if(i%2==0)
	{
		listEven.add(i);
		
	}
	else 
	{
		listOdd.add(i);
	}
	
	
}
	System.out.println(listEven);
	System.out.println(listOdd);
}
}

