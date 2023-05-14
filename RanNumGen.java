/*
 * Created by Carter Lee
 * RanNumGen - Generate random whole numbers with
 * amount of numbers based on command line argument
 */
public class RanNumGen {
	
	//The main method that runs when class is called
	public static void main (String[] args) {
		
		//This variable calls Integer.parseInt()
		//to convert String command line argument into an int value
		//n is the amount of random numbers to generate
		int n = Integer.parseInt(args[0]);

		//constant RANGE for the range of numbers to generate
		//made a constant since value should not change during run
		final int RANGE = 100;

		//constant SPACE, equal to " " string value
		final String SPACE = " ";
		
		//Stores the minimum and maximum numbers to print later
		//maximum is set to 0 to allow larger values to be set
		//minimum is set to 100 to allow smaller values to be set
		int minimum = 100;
		int maximum = 0;

		//This loop generates numbers and prints them out
		//And finds the minimum and maximum of the generated values
		for (int i = 0; i < n; i++) {
			
			//creates currentNumber to store a randomly generated number
			//Math.random() generates a double between 0 and 1 normally.
			//Multiplying by RANGE changes the range of values from 0 to 1 to
			//0 * RANGE to 1 * RANGE. (- 1 due to double/int conversion). 
			//+ 1 shifts the range to the right to remove 0 and add the RANGE value as max
			//and (int) casts the results as an int value for the currentNumber variable
			int currentNumber = (int)(Math.random() * RANGE + 1);

			//prints the generated number from the variable currentNumber
			System.out.print(currentNumber + SPACE);
			
			//These if statements check if the currently generated number
			//is smaller than the minimum or larger than the maximum
			//and sets the values if any are true.
			if (currentNumber < minimum) minimum = currentNumber;
			else if (currentNumber > maximum)  maximum = currentNumber;
			
		}

		//Adds a line break to start a new line
		System.out.println();

		//Print out the minimum and maximum numbers
		System.out.println("The minimum value is " + minimum);
		System.out.println("The maximum value is " + maximum);
		
		
	} // End of main method bracket
	
} // End of Class bracket