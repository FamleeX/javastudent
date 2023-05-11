public class RanNumGen {
	
	//The main method that runs when class is called
	public static void main (String[] args) {
		
		//This variable parses the command line input
		//and stores it as an int
		//n is the amount of random numbers to generate
		int n = Integer.parseInt(args[0]);
		
		//Stores the minimum and maximum numbers to print later
		int minimum = 0;
		int maximum = 0;
		
		//The range of numbers to generate from
		//change 100 to whatever number you want the maximum to be
		int range = 100;
		
		//This loop generates numbers and prints them out
		//currentNumber stores the number generated
		for (int i = 0; i < n; i++) {
			
			//Sets currentNumber to a randomly generated number
			//currentNumber stores the number value to print and check
			//for minimum or maximum value. 
			int currentNumber = (int)(Math.random() * range + 1);
			System.out.print(currentNumber + " ");
			
			//This if statement sets the generated number for minimum and maximum
			//if no other iterations of the loop have been completed
			if (i == 0) {
				minimum = currentNumber;
				maximum = currentNumber;
			}
			
			//These if statements check if the currently generated number
			//is smaller than the minimum or bigger than the maximum
			//and sets the values if any are true
			if (currentNumber < minimum) minimum = currentNumber;
			else if (currentNumber > maximum)  maximum = currentNumber;
			
			
		}
		
		//Print out the minimum and maximum numbers
		System.out.println("\nThe minimum value is " + minimum);
		System.out.println("The maximum value is " + maximum);
		
		
	} // End of main method
	
} // End of Class File