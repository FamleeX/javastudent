import static java.lang.System.out;
public class Distribution100 {
	
	//Main method of program/class
	public static void main(String[] args) {
		
		//String Array for args
		String[] args2 = new String[] {"15","5","82","2","1","74",
		"19","47","64","39","77","25","99","100","1","10","11"};
		
		
		//This int variable is the amount of numbers grabbed from the command line argument
		//Integer is used to parse the int value from the argument
		int amount = Integer.parseInt(args[0]);
		
		//This variable keeps track of numbers that are less than or equal to 50
		int lessThanEqualTo = 0;
		//This variable keeps track of numbers that are greater than 50
		int greaterThan = 0;
		
		//This for loop adds parsed command line numbers to an array and counts
		//how many numbers are less than or equal to 50; as well as greater than 50
		for (int i = 1; i < args.length; i++) { 
			
			//The number variable parses an int value from the command line argument
			int number = Integer.parseInt(args[i]);
			if (100 < number || number < 1) {
				System.out.println("Sorry, numbers and arguments must be between 1 and 100");
				System.exit(1);
			}
			//This if statement checks if the "i" number is less than or equal to 50
			//and then increases the lessThan variable
			if (number <= 50 && number >= 1) lessThanEqualTo++;
			//This (else)if statement checks if the "i" number is greater than 50
			//and then increases the moreThan variable
			else if (number > 50 && number <= 100) greaterThan++;
			
		} // for loop end bracket
		
		//print out total amount of numbers less than or equal to 50
		out.println(lessThanEqualTo + " numbers entered are less than or equal to 50");
		//print out total amount of numbers that are greater than 50
		out.println(greaterThan + " numbers entered are greater than 50");
		
	} // Main method end bracket
	
	
} //Class end bracker