package com.java.Day9;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<String> listOfStrings = new ArrayList<>();
		listOfStrings.add("abhisek");
		listOfStrings.add("is");
		listOfStrings.add("a");
		listOfStrings.add("naughty");
		listOfStrings.add("boy");
		/* 
		 * Employ[] function(){
		 * return employList.toArray(new Employ[employList.size()])
		 * 
		 * */
		System.out.println(listOfStrings);
		System.out.println("ArrayList is ");
		System.out.println(listOfStrings.toArray().toString());
		
		String[] str_array = listOfStrings.stream()
				.toArray(String[] :: new);
		System.out.println(" list converted to array  : ");
             for (String val:str_array)
          System.out.print (val + " ");
//        System.out.println("    ");
//             ArrayList<String> listOfStrings1 = new ArrayList<>();
//     		listOfStrings.add("abhisek");
//     		listOfStrings.add("is");
//     		listOfStrings.add("a");
//     		listOfStrings.add("naughty");
//     		listOfStrings.add("boy");
//     		
//     		System.out.println(listOfStrings1);
//     		
//     		String[] str_array1 = listOfStrings1.stream()
//     				.toArray(String[] :: new);
//     		System.out.println(" list converted to array  : ");
//                  for (String val:str_array1)
//               System.out.print (val + " ");
             
             ArrayList list = new ArrayList<>();
             list.add("Harish");
             list.add("Sai");
             list.add("Sujman");
             System.out.println("The Array List is ");
             System.out.println(list);
             list.add(1);
             System.out.println("After adding Integre ");
             System.out.println(list);
//
//		
	}
}
