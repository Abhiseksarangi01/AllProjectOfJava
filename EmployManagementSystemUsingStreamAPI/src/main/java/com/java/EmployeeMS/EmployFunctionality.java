package com.java.EmployeeMS;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployFunctionality {
	public static List<Employ> getAllShowEmploy() {
		List<Employ> listOfEmployData = Employ.getAllSaveEmployData();
		List<Employ> listOfEmploy = listOfEmployData.stream().collect(Collectors.toList());
		return listOfEmployData;
	}

	public static List<Employ> getAllShowData() {
		List<Employ> listOfEmploydata = Employ.getAllSaveEmployData();
		List<Employ> listOfEmploy = listOfEmploydata.stream().collect(Collectors.toList());
		return listOfEmploydata;
	}

// To filter out Employee whose age is greater than 30:
	public static List<Employ> getAge() {
		List<Employ> listOfEmploy = Employ.getAllSaveEmployData();
		System.out.println("I am calling the list of  Employs whose age is greater than 30");
//		System.out.println(
//				listOfEmploy.stream()
//				.filter(age ->age.getAge()>30)
//				.collect(Collectors.toList())
//				);
		List<Employ> listOfEmployAge = listOfEmploy.stream().filter(age -> age.getAge() > 30)
				.collect(Collectors.toList());
		return listOfEmployAge;
	}

	/**
	 * SLicing is of three ways 1: distinct() - it basically removes the duplicates
	 * elements present in the list 2: limit() - limiting the returned stream to
	 * return only upto n values. 3. skip() - skipping the first n values
	 */

	public static List<Employ> distinctLimitSkip() {
		System.out.println("here i am returning a list with distinct ,limit ,skip ");
		List<Employ> distinctData = Employ.getAllSaveEmployData();
		List<Employ> distinctWithLimit = distinctData.stream().distinct().limit(4).skip(2).collect(Collectors.toList());
		return distinctWithLimit;
	}

	/**
	 * Mapping- Mapping operations are those operations that transform the elements
	 * of a stream and return a new stream with transformed elements.Map() and
	 * flatMap() are most commonly used methods
	 */

//      public static List<Employ> namesInUpperCase(){
//    	  List<Employ> mapData = Employ.getAllSaveEmployData();
//    	  List<Employ> mapDataUC = mapData.stream()
//    			  .map(name -> name.getFirstName().toUpperCase())
//    			  .collect(Collectors.toList());
//    	 
	// minimum salary from the employee table
	public static void mininmumSal() {
//		List<Employ> minimumSalData =Employ.getAllSaveEmployData();
//		List<Employ> minimumSalList = minimumSalData.stream()
//				.min(Comparator.comparing(person::get)
		System.out.println("I am calling ,minimum Salary ");
		List<Employ> getListOfEmploy = Employ.getAllSaveEmployData();
		System.out.println(getListOfEmploy.stream().min(Comparator.comparing(Employ::getSalary)));
	}

	public static List<Employ> ifNotDistinct(){
		System.out.println("here i am returning the elemnts which are not distinct ");
		List<Employ> ifNotDistinctData = Employ.getAllSaveEmployData();
		System.out.println(ifNotDistinctData.stream()
				.filter(name -> name.getFirstName().startsWith("S"))
				.count()
	);
		return ifNotDistinctData;
	}
	
	public static List<Employ> sameFandLnames(){
		List<Employ> listOfNames = Employ.getAllSaveEmployData();
		System.out.println("list on the basis of same names ");
		List<Employ> sortNames = listOfNames.stream()
				.filter(name -> name.getFirstName().startsWith("S") && name.getLastName().startsWith("G"))
				.collect(Collectors.toList());
//		System.out.println(sortNames);
				return sortNames;
	}
	
	public static List<Integer> listOfId(){
		System.out.println("list of Id in the employee table ");
		List<Employ> empList= Employ.getAllSaveEmployData();
		List<Integer> empDataList =empList.stream()
				.map(id -> id.getId())
				.collect(Collectors.toList());
		return empDataList;
		
	}
	
	public static List<Employ> listOfSal(){
		System.out.println("list of people getting salaries greater than 10000");
		List<Employ> empsalData=Employ.getAllSaveEmployData();
		List<Employ> empDataSal = empsalData.stream()
				.filter(salary -> salary.getSalary() > 10000)
				//.map(name -> name.getSalary())
				.collect(Collectors.toList());
		return empDataSal;
		
	}
	
	public static Set<String> setOfLastName(){
		System.out.println("set of last names ");
		List<Employ> empdatas = Employ.getAllSaveEmployData();
		Set<String> empLastn = empdatas.stream()
				.map(name -> name.getLastName())
				.collect(Collectors.toSet());
		return empLastn;
		
	}
	public static int listOfElements(){
		System.out.println("I am returning the List of elements ");
		List<Employ> elementsData = Employ.getAllSaveEmployData();
		int  NumberOfElement =  (int) elementsData.stream().count();
		return NumberOfElement;
		
	}
	public static List<Employ> listOfObjects() {
		System.out.println("i am printing the objects using :: operator");
		List<Employ> ObjectsData = Employ.getAllSaveEmployData();
//		List<Employ> NumberOfObjects = ObjectsData.stream()
//				.forEach(System.out::println);
		List<Employ> listOfEmploy = ObjectsData.stream()
		.toList();
		listOfEmploy.forEach(System.out::println);
		return listOfEmploy;
				
	}
	
	
}
