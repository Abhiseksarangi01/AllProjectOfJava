package com.java.STREAM.TerminalOperations;

import java.util.List;
import java.util.Arrays;

public class UseOfForEach {
      public static void getEachElement(List<Integer> listOfIntegers) {
    	  listOfIntegers.stream()
    	 // .filter(element -> (element % 2==0))
    	  .forEach(element -> System.out.println(element));
      }
      
      
      
      public static void main(String[] args) {
		List<Integer> ListOfIntegers = Arrays.asList(23,45,33,55,64,89,67,90,1);
		getEachElement(ListOfIntegers);
		}
}
