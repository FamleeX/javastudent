public class Distribution100 {
	
	//Main method of program/class
	public static void main(String[] args) {
		
		//This int variable is the amount of numbers grabbed from the command line argument
		//Integer is used to parse the int value from the argument
		int amount = Integer.parseInt(args[0]);
		int[] numbers = new int[amount];
		
		//This variable keeps track of numbers that are less than or equal to 50
		int lessThan = 0;
		//This variable keeps track of numbers that are greater than 50
		int moreThan = 0;
		
		//This for loop adds parsed command line numbers to an array and counts
		//how many numbers are less than or equal to 50; as well as greater than 50
		for (int i = 0; i < numbers.length; i++) { 
			
			//This array takes the argument array and parses the string values
			//with the Integer class to store them as int values in the array
			numbers[i] = Integer.parseInt(args[i + 1]);
			//This if statement checks if the "i" number is less than or equal to 50
			//and then increases the lessThan variable
			if (numbers[i] <= 50) lessThan++;
			//This (else)if statement checks if the "i" number is greater than 50
			//and then increases the moreThan variable
			else if (numbers[i] > 50) moreThan++;
			
		} // for loop end bracket
		
		//print out total amount of numbers less than or equal to 50
		System.out.println(lessThan + " numbers entered are less than or equal to 50");
		//print out total amount of numbers that are greater than 50
		System.out.println(moreThan + " numbers entered are greater than 50");
		
	} // Main method end bracket
	
	
} //Class end bracker