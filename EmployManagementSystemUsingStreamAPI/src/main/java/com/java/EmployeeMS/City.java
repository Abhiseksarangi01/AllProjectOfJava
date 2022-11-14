package com.java.EmployeeMS;

import java.util.ArrayList;
import java.util.List;

public class City {

private String name ;
private double temp;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getTemp() {
	return temp;
}
public void setTemp(double temp) {
	this.temp = temp;
}
public City(String name, double temp) {
	super();
	this.name = name;
	this.temp = temp;
}
@Override
public String toString() {
	return "City [name=" + name + ", temp=" + temp + "]";
}

 public static List<City> getAllcityList(){
	 List<City> listOfCity = new ArrayList<>();
	 listOfCity.add(new City("New Delhi", 33.5));
     listOfCity.add(new City("Mexico", 14));
     listOfCity.add(new City("New York", 13));
     listOfCity.add(new City("Dubai", 43));
     listOfCity.add(new City("London", 15));
     listOfCity.add(new City("Alaska", 1));
     listOfCity.add(new City("Kolkata", 10));
     listOfCity.add(new City("Sydney", 11));
     listOfCity.add(new City("Mexico", 21));
     listOfCity.add(new City("Dubai", 43));
     listOfCity.add(new City("New Delhi", 33.5));
     listOfCity.add(new City("Mexico", 14));
     listOfCity.add(new City("New York", 13));
     listOfCity.add(new City("Dubai", 43));
     listOfCity.add(new City("London", 15));
     listOfCity.add(new City("Alaska", 1));
     listOfCity.add(new City("Kolkata", 10));
     listOfCity.add(new City("Sydney", 11));
     listOfCity.add(new City("Mexico", 21));
     listOfCity.add(new City("Dubai", 43));
     listOfCity.add(new City("New Delhi", 33.5));
     listOfCity.add(new City("Mexico", 14));
     listOfCity.add(new City("New York", 13));
     listOfCity.add(new City("Dubai", 43));
     listOfCity.add(new City("London", 15));
     listOfCity.add(new City("Alaska", 1));
     listOfCity.add(new City("Kolkata", 10));
     listOfCity.add(new City("Sydney", 11));
     listOfCity.add(new City("Mexico", 21));
     listOfCity.add(new City("Dubai", 43));
     return listOfCity;
 }

}
