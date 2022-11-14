package com.java.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OddNumberUsingStreamApi {
public static void main(String[] args) {
	List<Integer> listN = new ArrayList<>();
	listN.add(234);
	listN.add(34);
	listN.add(673);
	listN.add(673);
	listN.add(4531);
	listN.add(2984);
	listN.add(261);
	listN.add(234);
	listN.add(673);
	
	
	
	System.out.println(listN);
	
	List<Integer> listN1 = listN.stream().filter(i->i%2==1).collect(Collectors.toList());
	System.out.println(listN1);
	
	Set<Integer> setN=listN.stream().filter(i->i%2==1).collect(Collectors.toSet());
	System.out.println(setN);
	//set is used to remove duplicate elements,
	
	
}
}
