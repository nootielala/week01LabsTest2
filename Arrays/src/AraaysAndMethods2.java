import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AraaysAndMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		//Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		int[] array = new int[8];
		array[0] = 3;
		array[1] = 9;
		array[2] = 23;
		array[3] = 64;
		array[4] = 2;
		array[5] = 8;
		array[6] = 28;
		array[7] = 93;
		int arrayLastMinusFirst = array[array.length-1] - array[0];
		System.out.println("Age of last element in array minus the frist value in the array = " + arrayLastMinusFirst);
		
		//Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		// averages out the age in the array.
		int sum = 0;
		int average =0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			average = sum/array.length;
			
		}
		System.out.println("Average age =" + average);
		
		//Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
	 List<Integer> age = new ArrayList<>();
	    age.add(3);
	    age.add(9);
	    age.add(23);
	    age.add(63);
	    age.add(2);
	    age.add(8);
	    age.add(28);
	    age.add(93);
	    age.add(18);

	    int ageListLastMinusFirst = (age.get(age.size()-1)) - age.get(0);
		System.out.println("Age of last value in list minus the first value in the array = " + ageListLastMinusFirst);
		age.add(17);
		ageListLastMinusFirst = (age.get(age.size()-1)) - age.get(0);
		System.out.println("New Age of last value in list minus the first value in the array = " + ageListLastMinusFirst);
		
		int sumList = 0;
		int averageList = 0;
		for (int i = 0; i < age.size(); i++) {
			sumList += age.get(i);
			averageList = sumList/age.size();
		}
		System.out.println("Average age in List = " + averageList);
		
		System.out.println();
	    
		//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		//Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		// 
		double nameSum = 0;
		double nameAverage = 0;
		
		String[] names = {"sam", "tommy", "tim", "sally", "buck", "bob"};
		
		for (int i = 0; i < names.length; i++) {
			nameSum += names[i].length();
		}
		
		
		System.out.println("Sum of all letters in array = " + (int)nameSum); 
		
		nameAverage = nameSum/names.length;
		
		System.out.println("Average letters per string = " + nameAverage);
		
		
		
		
		
		
		//Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		String concatNames = "";
		for (int i =0; i < names.length; i++) {
			
			concatNames += names[i] + " ";
		}
		System.out.println("concatenated names =  " + concatNames);
		
		
		//How do you access the last element of any array?
		System.out.println(names [names.length-1]);
		
		//How do you access the first element of any array?
		System.out.println(names[0]);
		
		//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] namesLength = new int[names.length];
		for (int i =0; i < names.length; i++) {
			
			namesLength[i] =names[i].length();
		}
		for (int name : namesLength) {
			System.out.println(name);
		}
		
		
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int  newNameSum =0;
		for(int i =0; i < namesLength.length; i++) {
			
			newNameSum += namesLength[i];
		}
		       System.out.println("sum of length = " + newNameSum + " Letters.");
		       
		//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”)
		       	
		      
		       System.out.println(StringRepeater("Miles", 5));
		       
		//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space)
		       
		       String firstName = "miles";
				String lastName = "spicer";
				System.out.print("Full name method = ");
				System.out.println(fullName(firstName, lastName));
				System.out.println();
		       
		       
		//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
			System.out.print("Is the ages array sum greater than 100? ");
				System.out.println(isArrayGreaterthan100(array));
				System.out.print("Is the nameLength array sum greater than 100? ");
				System.out.println(isArrayGreaterthan100( namesLength));
				System.out.println();
		       
		//Write a method that takes an array of double and returns the average of all the elements in the array
				double doubleArray[] = {3.74, 32.844, 78.45, 44.900, 9.13, 56.45, 7.664, 5.335};
				System.out.print("The average of an array of doubles = ");
				System.out.println(getAverage(doubleArray));
				System.out.println();
		       
		//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
				double newDoubleArray[] = {1.234, 32.66776, 0.344, 4.56, 6.75, 1.23456};
				System.out.print("Does the first array have a greater average than the second array? ");
				System.out.println(getAverage(doubleArray, newDoubleArray));
				System.out.println();
		
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
				boolean isHotOutside = true;
				double moneyInPocket = 10.51;
				System.out.print("Will buy drink? ");
				System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
				isHotOutside = false;
				moneyInPocket = 10.51;
				System.out.print("Will buy drink? ");
				System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
				isHotOutside = false;
				moneyInPocket = 10.5;
				System.out.print("Will buy drink? ");
				System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
				isHotOutside = true;
				moneyInPocket = 10.5;
				System.out.print("Will buy drink? ");
				System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
				System.out.println();
		
		//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
          	  
				String[] weekDay = {"monday", "tueday", "wednesday", "thursday", "friday", "saturday", "sunday"}; 
				int[] hoursWorked = new int[7];
				hoursWorked[0] = 8;
				hoursWorked[1] = 8;
				hoursWorked[2] = 8;	
				hoursWorked[3] = 8;
				hoursWorked[4] = 8;
				hoursWorked[4] = 8;
				hoursWorked[5] = 8;
				hoursWorked[6] = 8;
				
				 
				System.out.println(hoursWorked(weekDay, hoursWorked));
				 
				 
				 
	} // end of main method
	
	  public static String hoursWorked (String[] dayOfWeek, int[] hours) {
		    String whatDays = " ";
		    for(int i = 0; i < dayOfWeek.length; i++) {
		      whatDays += dayOfWeek[i] + ":" + hours[i] + " ";
		    }   
		      return whatDays;
		  }
		  
	
	
	
	
	
	
	
	
	//12
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.5;
	}
	
	
	
	
	
	//11
	
	public static boolean getAverage(double array1[], double array2[]) {
		double sum1 = 0;
		double average1 = 0;
		for (double numbers : array1) {
			sum1 += numbers;
			average1 = sum1/array1.length;
		}
		double sum2 = 0;
		double average2 = 0;
		for (double numbers : array2) {
			sum2 += numbers;
			average2 = sum2/array2.length;
		}
		return average1 > average2;
	}
	
	
	
	
	
	//10
	
	public static double getAverage(double array[]) {
		double sum = 0;
		double average = 0;
		for (double numbers : array) {
			sum += numbers;
			average = sum/array.length;
		}
		return average;
	}
	
	
	
	//9
	
	public static boolean isArrayGreaterthan100(int array[]) {
		int sum = 0;
		for (int numbers : array) {
			sum += numbers;
		}
		return sum > 100;
	}
	
	
	
	
	//8
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	
	
	
	
	
	
	// 7

	public static String StringRepeater (String word, int n) {
	
	String addedWord = "";
	
	for (int i = 0; i < n; i++) {
		
		addedWord +=word;
		
	}
		
		return addedWord;
		
	
		
		
		
         }
	
	
	
	} // end of package
	
	
	
	
	
	
	

