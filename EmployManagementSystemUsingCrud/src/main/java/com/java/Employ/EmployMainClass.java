package com.java.Employ;

import java.util.Scanner;

public class EmployMainClass {
	public static void main(String[] args) {
		EmployFunctionality ef = new EmployFunctionality();

		EmploySaveData employ = new EmploySaveData();

		Scanner sc = new Scanner(System.in);
		int option = 0;

		// Do - While loop
		do {
			menu();
			option = input.nextInt();

			// Switch case
			switch (option) {

				// Case 1
				case 1:

					// Display message
					System.out.print("What is the Employee id Number ? ");

					int empid = input.nextInt();

					// Display message
					System.out.print("What is the Empoyee Name ? ");

					int empName = input.nextInt();
					input.nextLine();

					// Display message
					System.out.print("What is the Employee City ? ");

					String name = input.nextLine();

					int empCity = input.nextInt();
					input.nextLine();

					// Display message
					System.out.print("What is the Employee City ? ");

					String name = input.nextLine();

					int empNo = input.nextInt();
					input.nextLine();

					// Display message
					System.out.print("What is the Employee City ? ");

					int number = input.nextInt();

					// Create record object and pass constructor
					// parameters.
					record = new Record(name, idNumber, contactNumber);

					// Call add() record
					hr.add(record);
					System.out.println(record.toString());

					// Break statement used to terminate program
					// from here only once it entered this case
					break;

				// Case 2
				case 2:

					// Display message
					System.out.print("What is the Student id number ? ");
					int rId = input.nextInt();

					// Invoke remove/delete record
					hr.delete(rId);

					break;

				// Case 3
				case 3:

					// Display message
					System.out.print("What is the Student id number? ");

					int rIdNo = input.nextInt();
					hr.update(rIdNo, input);

					break;

				// Case 4
				case 4:

					// Display message
					System.out.print("What is the Student id ? ");
					int bookId = input.nextInt();

					if (!hr.find(bookId)) {
						System.out.println("Student id does not exist\n");
					}

					break;

				// Case 5
				case 5:
					hr.display();
					break;

				// Case 6
				case 9:

					// Display message
					System.out.println("\nThank you for using the program. Goodbye!\n");
					System.exit(0);

					break;

				// Case 7: Default case
				// If none above case executes
				default:

					// Print statement
					System.out.println("\nInvalid input\n");
					break;
			}
		}

		// Checking condition
		while (option != 9);
	}

//	EmployFunctionality employfunctionality = new EmployFunctionality();		
//	System.out.println("I am performing the add employ function");
//	employfunctionality.addEmploy();
//	System.out.println(" I am calling the search by Id employ ");
//	employfunctionality.searEmployDataById();
//		

	public static void menu() {

		System.out.println("// MENU //");
		System.out.println("Enter your choice:");
		System.out.println("1.DISPLAY EMPLOYEE");
		System.out.println("2.SEARCH EMPLOYEE");
		System.out.println("3.ADD EMPLOYEE");
		System.out.println("4.UPDATE EMPLOYEE");
		System.out.println("5.EXIT PROGRAM");
		System.out.println("ENTER YOUR SELECTION");
	}

}
