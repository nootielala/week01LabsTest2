
//Copyright (c) 2023 Promineo Tech
//Author:  Promineo Tech Academic Team
//Subject:  Variables & Operations Lab
//Java Week 01 Lab  
//
package week01LabsTest;

public class  week01LabsTest {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
          int availablePlaneSeats = 5;
		
		// 2. Create a variable to hold the cost of groceries at checkout
          double groceriesBalance = 24.34;
		
		// 3. Create a variable to hold a person's middle initial
          char middleInitial = 's';

	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
            boolean isColdOutside = false;        
           
		// 5. Create a variable to hold a customer's first name
            
          String firstName = "miles";
		
		// 6. Create a variable to hold a street address
		     String streetAddress = "1234 e easy street";

		// 7. Print all variables to the console
		     System.out.println("Availble Seats Left on the plane: " +availablePlaneSeats);
		     System.out.println(groceriesBalance + " is the price for groceries:");
		     System.out.println("it is cold outside- " + isColdOutside);
		     System.out.println("The persons middle intial is " + middleInitial);
		     System.out.println("Firstname is " + firstName);
		     System.out.println(streetAddress +"is where the person lives.");
	

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		     availablePlaneSeats = availablePlaneSeats -2;
		     availablePlaneSeats -= 2;
		     System.out.println(availablePlaneSeats);

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		       groceriesBalance = groceriesBalance + 2.15;
		       System.out.println(groceriesBalance);


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		       middleInitial = 't';
		       System.out.println(middleInitial);

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was\
		       isColdOutside = !isColdOutside;
		       System.out.println(isColdOutside);


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
	           String fullName = firstName + " " + middleInitial + " Spicer";
	           System.out.println(fullName);

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
            
	           System.out.println("Hi my name is " + fullName + " and i live at " + streetAddress + ".");
		
		
	}
}