package com.java.Employ;

import java.util.ArrayList;
import java.util.List;

public class EmploySaveData {
	public static List<Employ> saveAllData(){
		List<Employ> listOfEmploy = new ArrayList<>();
		listOfEmploy.add(new Employ(1, "abhisek", "rourkela", 891, "football"));
		listOfEmploy.add(new Employ(2, "sunil", "ramgarh", 391, "football"));
		listOfEmploy.add(new Employ(3, "sunila", "badlapur", 851, "football"));
		listOfEmploy.add(new Employ(4, "bhaskar", "rourkela", 791, "football"));
		listOfEmploy.add(new Employ(5, "balam", "delhi", 891, "football"));
		listOfEmploy.add(new Employ(6, "abhisek", "sultanpur", 491, "football"));
		return listOfEmploy;
		
	}
}
