package Week04Package;

public class Week04CodingProject {

	public static void main(String[] args) {

	//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
	int[] ages = {3,9,23,64,2,8,28,93};
	
	//a. Programmatically subtract the value of the first element in the array from the value in the last 
	//   element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
	int result = ages[ages.length-1] - ages[0];
	System.out.println("1.a. Subtract the value of first element from last element:");
	System.out.println(result);
	System.out.println("*********************************");
	
	//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, 
	//   and have more elements).  
	int[] ages2 = new int[9];   //i. Make sure that there are 9 elements of type int in this new array.  
	
	//int[] ages2 = {3,9,23,64,2,8,28,93,150};  //iii. Show that using the index values for the elements is 
												//dynamic (works for arrays of different lengths).
	
	int result2 = ages2[ages2.length-1] - ages2[0];    //ii. Repeat the subtraction from Step 1.a. (Programmatically 
															//subtract the value of the first element in the
															//new array ages2 from the last element of ages2). 
	System.out.println("1.b.ii. Repeat subtraction (from Step 1.a.):");
	System.out.println(result2);
	System.out.println("*********************************");

	
	//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	
	double sum = 0;
	double avg = 0;
	
	for (int age : ages) {
		sum += age;
	}
		avg = sum / ages.length;
		System.out.println("1.c. Calculate average age:");
		System.out.println(avg);
		System.out.println("*********************************");
		
	//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, 
		//“Buck”, “Bob”.
	String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
	
	//2.a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the 
	//result to the console.
	double sumLetters = 0;
	double avgLetters = 0;
	String concatNames = "";
	
	for (String name : names) {
		sumLetters += name.length();
	}
		avgLetters = sumLetters / names.length;
		System.out.println("2.a. Calculate average name length:");
		System.out.println(avgLetters);
		System.out.println("--------------------------------");
		
	//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, 
		// and print the result to the console.
	int count = 1;
	for (String name : names) {
		if (count < names.length) {
		concatNames += name + " ";
		count++;
		} else {
			concatNames += name;
		}
		}
		System.out.println("2.b. Concatenate names:");
		System.out.println(concatNames);
		System.out.println("*********************************");

	//3. How do you access the last element of any array?
		//String lastElement = array[array.length-1];
	
	//4. How do you access the first element of any array?
		//String firstElement = array[0];

	//5. Create a new array of int called nameLengths. Write a loop to iterate over the 
		//previously created names array and add the length of each name to the nameLengths array.
	
	int[] nameLengths = new int[9];
	System.out.println("5. Add the length of each name to the nameLengths array:");
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
				System.out.print(nameLengths[i] + " ");	
	}
			System.out.println("\n*********************************");
	
	//6. Write a loop to iterate over the nameLengths array and calculate the sum of all 
		//the elements in the array. Print the result to the console.
			
			int countNameLength = 0;
			for (int nameLength : nameLengths) {
				countNameLength++;
			}
			System.out.print("6. Sum of all the elements in the nameLengths array:");
			System.out.print(" " + countNameLength);
			System.out.println("\n*********************************");
	
	//7. Call the 'Concatenated Words' method
		System.out.println("7. Concatenated words method:");

		String word = "hola";
		int n = 5;
		
		concatenatedWords(word, n);
		
		System.out.println("*********************************");

	//8. Call the 'fullNames' method
		String firstName = "Helen";
		String lastName = "Blankship";
		
		System.out.println("8. Full name method:");
		fullNames(firstName, lastName);
		
		System.out.println("*********************************");
		
	
	//9. Call the 'sumOfInts' method
		System.out.println("9. Sum of array integers method:");

		int[] numbers = {2,4,5,7,9,23,58,25,9,65};
		
		sumOfInts(numbers);
		
		System.out.println("*********************************");
		
	//10. Call the 'averageOfElements' method
			System.out.println("10. Average of elements in the array method:");

			double[] elements = {2,4,5,7,9,23,58,25,9,65};
				
			averageOfElements(elements);
				
			System.out.println("*********************************");
			
			
	//11. Call the 'compareArrays' method
			System.out.println("11. Comparing the average two arrays:");
			
			double[] array1 = {56,98,2,36,487,5,65,8};
			double[] array2 = {48,98,65,24,7,5,1,99,1};
			compareArrays(array1,array2);
	
			System.out.println("*********************************");

	//12. Call the 'willBuyDrink' method
			System.out.println("12. Checking temp and money:");
			
			boolean itsHot = true;
			double money = 11;
			
			willBuyDrink(itsHot,money);
	
			System.out.println("*********************************");
			
			
	//13. Call the 'orderNewMeds' method
			System.out.println("13. Checking if we need to order more meds:");
			
			int pillQuantity = 6;
			
			orderNewMeds (pillQuantity);
			
}
//*******************************METHODS*****************************************
	
	//13. Write a method called orderNewMeds that takes an integer pillQuantity,
	//and returns true if it the pillQuantity is less than 7. 
	public static boolean orderNewMeds(int pillQuantity) {
		if (pillQuantity > 7) {
			System.out.println("You still have enough meds for the week.");
			return false;
		} else {
			System.out.println("You need to order more meds!");
			return true;
		}
		}
	
	
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a 
	//double moneyInPocket, and returns true if it is hot outside and if moneyInPocket 
	//is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && (moneyInPocket > 10.5)) {
			System.out.println("It's hot outside and money is more than $10.50:" + " " + true);
			return true;
		} else {
			return false;
		}

	}
	
	//11. Write a method that takes two arrays of double and returns true if the average 
	//of the elements in the first array is greater than the average of the elements in the 
	//second array.
	public static boolean compareArrays(double[] firstArray, double[] secondArray) {
		
		double sumOfFirstElements = 0;
		double averageOfFirst = 0;
		
		double sumOfSecondElements = 0;
		double averageOfSecond = 0;
		
		for (double number : firstArray) {
			sumOfFirstElements += number;
		}
		averageOfFirst = sumOfFirstElements / firstArray.length;
		System.out.println("Average of elements in FIRST array is: " + averageOfFirst);
		
		for (double number : secondArray) {
			sumOfSecondElements += number;
		}
		averageOfSecond = sumOfSecondElements / secondArray.length;
		System.out.println("Average of elements in SECOND array is: " + averageOfSecond);
		
		boolean firstIsGreater = averageOfFirst > averageOfSecond;
		System.out.println("Average of FIRST array is greater: " + firstIsGreater);

		return firstIsGreater;
	}


	
	//10. Write a method that takes an array of double and returns the average of all the 
	//elements in the array.
	public static double averageOfElements(double[] numbers) {
		
		double sumOfElements = 0;
		double average = 0;
		
		for (double number : numbers) {
			sumOfElements += number;
		}
		average = sumOfElements / numbers.length;
		System.out.println("Average of all the elements in this array is: " + average);
		return average;
	}

	
	//9. METHOD - Write a method that takes an array of int and returns true if the sum of all 
	//the ints in the array is greater than 100.
	public static boolean sumOfInts(int[] integers) {
		int sumz=0;
		for (int integer : integers) {
		sumz += integer;
		}
			if (sumz > 100) {
				
				System.out.println("TRUE - The sum is greater than 100");
				return true;

			} else {
				System.out.println("FALSE - The sum is less than 100");
				return false;
			}

	}
	
	//8. METHOD - Write a method that takes two Strings, firstName and lastName, and returns a 
	//full name (the full name should be the first and the last name as a String separated by a space).
		public static String fullNames(String firstName, String lastName) {
		
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		return fullName;

		}

	//7. METHOD - Write a method that takes a String, word, and an int, n, as arguments and returns 
	//the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
	//I expect the method to return “HelloHelloHello”).
			public static String concatenatedWords(String word, int n) {
				
			String results = "";
			for (int i = 0; i < n; i++) {
			results += word;
			}
			System.out.println(results);
			return results;

	}
}
