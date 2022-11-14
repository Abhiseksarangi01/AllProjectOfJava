package com.java.LeaveManagementSystem;

import java.util.Scanner;

public class StudentFunctionality {
		public static void Option() {
			
			StudentFunctionality SF = new StudentFunctionality();
			
 
       
			        // Creating Scanner Object to read input
			        Scanner input = new Scanner(System.in);
			 
			        // Creating option integer variable
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
			                System.out.print(
			                    "What is the Leave id Number ? ");
			 
			                int leaveId = input.nextInt();
			                input.nextInt();
			                
			                // Display message
			                System.out.print(
			                    "What is the Number of Days ? ");
			 
			                int noOfDays = input.nextInt();
			                input.nextInt();
			 
			                // Display message
			                System.out.print(
			                    "What is the Manager Comments ");
			 
			                String managerComments = input.nextLine();
			                input.nextLine();
			                
			                //Display message 
			                System.out.println("what is your empid");
			                
			                int empId = input.nextInt();
			                input.nextLine();
			                
			                //display message 
			                System.out.println("what is Leave reason ");
			                
			                String leaveReason=input.nextLine();
			                input.nextLine();
			                
			 
			                // Create record object and pass constructor
			                // parameters.
			                Student st = new Student(leaveId, noOfDays,
			                		managerComments,empId,leaveReason);
			                // Call add() record
			                SF.add(st);
			                System.out.println(st.toString());
			 
			                // Break statement used to terminate program
			                // from here only once it entered this case
			                break;
			 
			            // Case 2
			            case 2:
			 
			                // Display message
			                System.out.print(
			                    "What is the Student id number ? ");
			                int LId = input.nextInt();
			 
			                // Invoke remove/delete record
			                SF.delete(LId);
			 
			                break;
			 
			            // Case 3
			            case 3:
			 
			                // Display message
			                System.out.print(
			                    "What is the Leave id number? ");
			 
			                int LIdNo = input.nextInt();
			                SF.update(LIdNo, input);
			 
			                break;
			 
			            // Case 5
			            
            case 5:
            	SF.display();
                break;
 
            // Case 6
            case 9:
 
                // Display message
                System.out.println(
                    "\nThank you for using the program. Goodbye!\n");
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
 
 

	private void display() {
			// TODO Auto-generated method stub
			
		}

	private void update(int lIdNo, Scanner input) {
			// TODO Auto-generated method stub
			
		}

	private void delete(int lId) {
			// TODO Auto-generated method stub
			
		}

	private void add(Student st) {
			// TODO Auto-generated method stub
			
		}

	// Method 2
    // Menu - Static menu for displaying options
    public static void menu()
    {
 
        // Printing statements displaying menu on console
        System.out.println("MENU");
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Update Student");
        System.out.println("4: Search Student");
        System.out.println("5: Display Students");
        System.out.println("9: Exit program");
        System.out.print("Enter your selection : ");
    
		}
}
