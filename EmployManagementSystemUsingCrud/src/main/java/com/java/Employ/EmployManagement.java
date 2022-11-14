package com.java.Employ;

import java.util.LinkedList;

public class EmployManagement {
		 
	    // Creating an empty LinkedList
	LinkedList<EmploySaveData> list;
	 
    // Default Constructor
    public EmployManagement()
    {
        list = new LinkedList<>();
    }
 
    // Method 1
    // Adding EmploySaveData
    // @param EmploySaveData
    public void add(EmploySaveData employ)
    {
 
        // Checking if a EmploySaveData already exists or not,
        // if not add it to EmploySaveData list, Otherwise
        // error display message
        if (!find(Employ.getEmpId())) {
            list.add(employ);
        }
        else {
 
            // Print statement
            System.out.println(
                "EmploySaveData already exists in the EmploySaveData list");
        }
    }
}
