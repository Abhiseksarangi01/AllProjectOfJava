package com.java.EmployeeMS;

import java.security.Key;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CityFunctionality {
 
	public static List<String> cityList(){
		System.out.println("list of cities from the class city");
		List<City> listOfCity = City.getAllcityList();
		List<String> nameCity = listOfCity.stream()
				.map(name -> name.getName())
				.collect(Collectors.toList());
		return nameCity;
	}
	public static List<City> cityTemp(){
		System.out.println("List of TEMPERATURES GREATER than 20 from the list city ");
		List<City> listOfTemp = City.getAllcityList();
		List<City> tempList = listOfTemp.stream()
				.filter(temp -> temp.getTemp()>20)
				.collect(Collectors.toList());
		return tempList;
		
		
	}
	public static Set<City> cityTemps(){
		System.out.println("Set of TEMPERATURES GREATER than 31 from the list city ");
		List<City> listOfTemps = City.getAllcityList();
		Set<City> tempSet = listOfTemps.stream()
				.filter(temp -> temp.getTemp()>31)
				.collect(Collectors.toSet());
		return tempSet;
}
	public static void cityMapTemp(){
		System.out.println("I am mapping the city to the temperature and printing it ");
		List<City> cityTemps = City.getAllcityList();
		System.out.println(cityTemps.stream()
				.collect(Collectors.toMap(
						City::getName, 
						City::getTemp,
						(Key,identicalKey) -> Key)));
		
		
		
//		return cityTempMap;
	}
	
	public static int cityElement() {
		System.out.println("i am counting the number of elements in the city");
		List<City> listOfElements = City.getAllcityList();
		int elementsInCity = (int) listOfElements.stream()
				.count();
				return elementsInCity;
				
	}
	
	public static void cityTempJoin() {
		System.out.println(" i am joining the temp of cities by , using joining ");
		List<City> listOfTempss = City.getAllcityList();
		System.out.println(listOfTempss.stream()
				.filter(temp -> temp.getTemp()>10)
				.map(name -> name.getName())
				.collect(Collectors.joining(",")));
		
	}
}
