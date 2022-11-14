package Employ;
//Define allFUnctions Here Only 

import java.util.List;
import java.util.stream.Collectors;

public class EmployFunctionalityParts {
	
//	1 : ShowAllEmployData Using Stream API
	
	public static List<Employ> getAllShowEmploy(){
		List<Employ> listOfEmployData = Employ.getAllSaveEmployData();
		List<Employ> listOfEmploy = listOfEmployData.stream()
				.collect(Collectors.toList());
		return listOfEmployData;
	}

}
