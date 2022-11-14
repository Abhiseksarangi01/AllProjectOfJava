package com.java.STREAM.TerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

class City{
	String cityName;
	double  cityTemp;
	public City(String cityName, double cityTemp) {
		super();
		this.cityName = cityName;
		this.cityTemp = cityTemp;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public double getCityTemp() {
		return cityTemp;
	}
	public void setCityTemp(double cityTemp) {
		this.cityTemp = cityTemp;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", cityTemp=" + cityTemp + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cityName, cityTemp);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(cityName, other.cityName)
				&& Double.doubleToLongBits(cityTemp) == Double.doubleToLongBits(other.cityTemp);
	}
	
	
}





public class UseOfCollect {
	 
	 private static List<City> prepareTemperature() {
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
	        listOfCity.add(new City("afghanistan", 14));
			return listOfCity;

	 } 
	 
	        public static void getListOfCityName() {
	            List<String> namesOfCity = prepareTemperature().stream()
	                    .map(
	                            City::getCityName)
	                    .collect(Collectors.toList());
	            System.out.println( " the names of the city: " +  namesOfCity);
	        }
	        
	        
	        public static void main(String[] args) {
	        	 System.out.println("This is the example of the Collectors in java");
	             System.out.println(
	                     prepareTemperature().stream()
	                             .filter(f -> f.getCityTemp() > 10)
	                             .map(name -> name.getCityName())
	                             .collect(Collectors.toList()));

	             System.out.println("THE DATA IN THE FORM OF SET ");
	             System.out.println("after the use of the toSet() in stream api in java");
	             System.out.println(
	                     prepareTemperature().stream()
	                             .filter(f -> f.getCityTemp() > 10)
	                             .map(name -> name.getCityName())
	                             .collect(Collectors.toSet()));
	             
	             // The useOfMap()
	             System.out.println("The use of Map() in java ");
	             System.out.println(
	                     prepareTemperature().stream()
	                             .filter(f -> f.getCityTemp() > 10)
	                             .collect(Collectors.toMap(  // for temp greater than 10 it will take cityname and temp  both 
	                                     City::getCityName, // getting name of the city whose temp is greater than 10
	                                     City::getCityTemp, // getting name of the temp whose temp is greater than 10
	                                     (key, identicalKey) -> key)));//if any duplicates are present it will consider them too
	             
	             
	             // The Another Example of the collections
	             System.out.println("Counting the Number of the City in the lits of the data is ");
	             System.out.println(
	                     prepareTemperature().stream()
	                             .collect(Collectors.groupingBy(
	                                     City::getCityName,//grouping by getting the name of the cities from the class city
	                                     Collectors.counting())));
	             

	             // Another way to do so

	             System.out.println("The Another way to get the list of the map values after using groupBy()");

	             Map<String, List<City>> MapofList = prepareTemperature().stream()
	                     .collect(Collectors.groupingBy(
	                             City::getCityName));
	             System.out.println(MapofList);
	             // Collector joining(CharSequence delimiter): Concatenates the input elements,
	             // separated by the specified delimiter, and returns a Collector
	             System.out.println("after getting the filter data with map and join with comma");
	             System.out.println(
	                     prepareTemperature().stream()
	                             .filter(f -> f.getCityTemp() > 10)
	                             .map(
	                                     name -> name.getCityName())
	                             .collect(Collectors.joining(",")));//joining with commas 

	             List<String> namesOfCity = prepareTemperature().stream()
	                     .map(
	                             City::getCityName)
	                     .collect(Collectors.toList());
	             System.out.println("The List of the City Name is ");
	             System.out.println(namesOfCity);
	             System.out.println("getting the list of the temp is ");
	             List<Double> tempOflist = prepareTemperature().stream()
	                     .map(City::getCityTemp).collect(Collectors.toList());
	             System.out.println(tempOflist);
	             System.out.println();
	             System.out.println("I am calling the getAllCityByName() 5 times");
	             for (int i = 0; i < 5; i++) {
	                 getListOfCityName();
	             }

	             // Collector <T, ?, Map<K, List>> groupingBy(Function classifier):
	             // Performs group by operation on input elements of type T. The grouping of
	             // elements is done
	             // as per the passed classifier function and returns the Collector with result
	             // in a Map.
	             System.out.println("Getting the map  values of all city ");
	             System.out.println(
	                     prepareTemperature().stream()
	                             .collect(Collectors.groupingBy(
	                                     City::getCityName)));

	             // The Another use of the mapping inside the Collectors

	             /*
	              * 
	              * 13. Collector mapping(Function mapper, Collector downstream): Transforms a
	              * Collector of the input elements of type U to one the input elements of type T
	              * by applying a mapping function to every input element before the
	              * transformation.
	              */
	             System.out.println("The use of the Collectors.mapping in Stream API and getting the list of values");
	             System.out.println(
	                     prepareTemperature().stream()
	                             .collect(Collectors.groupingBy(
	                                     City::getCityName,
	                                     Collectors.mapping(
	                                             City::getCityTemp,
	                                             Collectors.toList()))));
	             System.out.println("The use of the Collectors.mapping in Stream API and getting the Set of values");
	             System.out.println(
	                     prepareTemperature().stream()
	                             .collect(Collectors.groupingBy(
	                                     City::getCityName,
	                                     Collectors.mapping(
	                                             City::getCityTemp,
	                                             Collectors.toSet()))));

	             /*
	              * 
	              * 14. Collector<T, ?, Map<Boolean, List>> partitioningBy(Predicate predicate):
	              * Partitions the input elements as per the passed Predicate, and transforms
	              * them into a Map and returns the Collector
	              */
	             System.out.println("This is the example of the partitionBy()");
	             System.out.println("getting the temp which is greater than 15  using partitioBy()");
	             System.out.println(
	                     prepareTemperature().stream()
	                             .collect(Collectors.partitioningBy(
	                                     City -> City.getCityTemp() > 15

	                             )));

	             System.out.println("Counting the number of the ELement in the Stream ");
	             long countingTheData = prepareTemperature().stream()
	                     .count();
	             System.out.println("the Number of the ELement in the array list is ");
	             System.out.println(countingTheData);
			}
}
