package com.java.Day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingString {
	    
	    public static List<String> getAllList(){
	        List<String> listOfString = new ArrayList<String>();
	        listOfString.add("Hello");
	        listOfString.add("hello");
	        listOfString.add("Praveen");
	        listOfString.add("Harish");
	        listOfString.add("Sai");
	        listOfString.add("Abhisek");
	        listOfString.add("Gowri");
	        listOfString.add("kavya");
	        listOfString.add("kamesh");
	        listOfString.add("Shruti");
	        listOfString.add("Shristi");
	        listOfString.add("Madhukumar");
	        return listOfString;
	    }
	    
	    public static void main(String[] args) {
	    	List<String> getAllList = SortingString.getAllList();
	    	System.out.print("The string after being sorted is : ");
	    	System.out.println(getAllList.stream()
	    			.sorted()
	    			.collect(Collectors.toList())
	    			);
		}
	}

