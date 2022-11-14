package com.java.Employ;

import java.util.List;
import java.util.Scanner;

public class EmployFunctionality {
	
	
	

	public static List<Employ> getAllShowDataEmp() {
		List<Employ> listOfEmployData = EmploySaveData.saveAllData();
		System.out.println(listOfEmployData);
		return listOfEmployData;

	}

	public static String addEmploy() {
		List<Employ> getAddData = EmploySaveData.saveAllData();
		getAddData.add(new Employ(23, "suresh", "kolkata", 981, "singing"));
		System.out.println("after adding the data into the list : " + getAddData);
		return " Employ Added Successfully ";

	}

	public static String updateEmploy() {
		List<Employ> data = EmploySaveData.saveAllData();
		return " employ data are updated SuccessFully";
	}

	public static void searEmployDataById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empId ");
		int empId = sc.nextInt();
		List<Employ> empData = EmploySaveData.saveAllData();
		if(true) {
			System.out.println("Employ Data is Found ");
			System.out.println(empData.get(empId-1));
		}else {
			System.out.println("Employ Data Does Not Exits");
		}
	}
	
	
	
	
}

//		public static List<Employ> showDataById() {
//			List<Employ> listById = EmploySaveData.saveAllData();
//			List<Employ> listShowId = listById.stream()
//					.filter
//
//	}

