package com.java.EmployeeMS;

import java.util.List;

public class EmployMainClass {
	public static void main(String[] args) {
		EmployFunctionality empDAO = new EmployFunctionality();
		 List<Employ> listOfEmploydata=empDAO.getAllShowData();
		 System.out.println(listOfEmploydata);
		 List<Employ> listOfEMploy =empDAO.getAge();
		 System.out.println(listOfEMploy);
		 
		 EmployFunctionality distinct = new EmployFunctionality();
		 List<Employ> listOfDistinctData = distinct.distinctLimitSkip();
		 System.out.println(listOfDistinctData);
		 
		 EmployFunctionality.mininmumSal();
		 
		 EmployFunctionality.ifNotDistinct();
		 
		 System.out.println(EmployFunctionality.sameFandLnames());
		 
		 System.out.println(EmployFunctionality.listOfId());
		 
		 System.out.println(EmployFunctionality.listOfSal());
		 
		 System.out.println(EmployFunctionality.setOfLastName());
		 
		 System.out.println(EmployFunctionality.listOfElements());
		 
		 EmployFunctionality.listOfObjects();
	}

}
