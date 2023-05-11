/*
 * Created by Carter Lee
 * LC class - Prints 100 numbers, 10 per line
 * 
 */
public class LC {
	
	//The main method of the program
	public static void main(String[] args) {
		
		//method constant shorthand for " "
		final String SPACE = " "; 
		
		//This variable keeps track of the number
		int number; 
		//This variable keeps track of numbers on a line
		int lineTracker = 1;
		
		//This for loop as a whole prints out numbers 1 through 100
		//and adds a line break every 10 numbers printed
		for (number = 1; number <= 100; number++) {
			
			//Not needed for purpose of program but moves numbers
			//less than 10 a space to the right to make the whole
			//first row equal with the rest of the rows of numbers
			if (number < 10) System.out.print(SPACE);
			
			//This if statement checks if there will be more than
			//10 numbers on a line and adds a line break if needed
			if (lineTracker > 10) {
				System.out.println(); //line break
				lineTracker = 1; //resets lineTracker
			}
			//Prints out current number with a space
			System.out.print(number + SPACE);
			//Increments or Increases lineTracker by one
			lineTracker++;
			
		}
		
		//when ran on certain systems it shows command prompt on same line
		//adding line break for that situation
		System.out.println();
		
	}
	
}