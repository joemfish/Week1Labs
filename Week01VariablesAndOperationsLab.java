//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package Week1;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		
		System.out.println("Week 1 Labs");

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		
		int totalSeats = 100;
		System.out.println(totalSeats);
		
		// 2. Create a variable to hold the cost of groceries at checkout

		double groceryCost = 260.00;
		String statement = String.format("%.2f", groceryCost);
		System.out.println(statement);
		
		// 3. Create a variable to hold a person's middle initial
		
		char middleInitial = 'M';
		System.out.println(middleInitial);

	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside

		boolean isHotOutside = true;
		System.out.println(isHotOutside);
		
		// 5. Create a variable to hold a customer's first name

		String firstName = "Joe";
		System.out.println(firstName);
		
		// 6. Create a variable to hold a street address
		
		String address = "123 Main Street";
		System.out.println(address);
		

		// 7. Print all variables to the console
	

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
	totalSeats = totalSeats - 2;
			System.out.println(totalSeats);
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;

		groceryCost = groceryCost + 2.15;
		String newstatement = String.format("%.2f", groceryCost);
		System.out.println(newstatement);

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		
		char newMiddle = 'K';
		middleInitial = newMiddle;
		System.out.println(middleInitial);
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was

isHotOutside = false;
System.out.println(isHotOutside);
		
		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		
		String fullName = String.format("%s %s %s", firstName, middleInitial, "Johnson");
		System.out.println(fullName);
	
		System.out.println(firstName + ' ' + middleInitial + ' ' + "Johnson");

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable

		String intro = String.format("Hello!  My name is %s and I live at %s", fullName, address);
		System.out.println(intro);
		
	}
}