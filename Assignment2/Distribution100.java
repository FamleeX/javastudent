import static java.lang.System.out;

//import java.util.Scanner;
public class Distribution100 {
	
	//Main method of program/class
	public static void main(String[] args) {
		
		//This int variable is the amount of numbers grabbed from the command line argument
		//Integer is used to parse the int value from the argument
		int amount = Integer.parseInt(args[0]);
		
		//This variable keeps track of numbers that are less than or equal to 50
		int lessThanEqualTo = 0;
		//This variable keeps track of numbers that are greater than 50
		int greaterThan = 0;
		
		//Checks if there are enough arguments. - 1 makes
		//the first argument not apply in calculation
		if (amount < args.length-1) {
			out.println("There are not enough arguments between 1 and 100");
			System.exit(1);
		} 

		//This for loop adds parsed command line numbers to an array and counts
		//how many numbers are less than or equal to 50; as well as greater than 50
		for (int i = 1; i < args.length; i++) { 
			
			//The number variable parses an int value from the command line argument
			int number = Integer.parseInt(args[i]);
			//If the number is not between 1 and 100 the loop will continue
			//without touching lessThanEqualTo or greaterThan 
			if (number < 1 || 100 < number) continue;
			//This if statement checks if the "i" number is less than or equal to 50
			//and then increases the lessThan variable
			if (number <= 50) lessThanEqualTo++;
			//This (else)if statement checks if the "i" number is greater than 50
			//and then increases the moreThan variable
			else if (number > 50) greaterThan++;
			//If lessThan and greaterThan are equal to the amount,
			//the loop will break as the conditions have been met
			if (lessThanEqualTo + greaterThan == amount) break;
		}
		
		//print out total amount of numbers less than or equal to 50
		out.println(lessThanEqualTo + " numbers entered are less than or equal to 50");
		//print out total amount of numbers that are greater than 50
		out.println(greaterThan + " numbers entered are greater than 50");
		
	} //Main method end bracket
	
	
} //Class end bracket