/*
 * Created by Carter Lee
 * ISBN - Calculates checksum digit from a command line
 * ISBN number argument
 */
import static java.lang.System.out;
public class ISBN {
	
	//'immutable' String constant to display a message for not enough characters 
	private static final String NOT_ENOUGH_CHARACTERS = "Please provide a 9 digit String representing an ISBN number";
	
	//the main method to calculate checksum from a string ISBN number argument
	public static void main(String[] args) {
		
		//command line argument for first 9 digits of ISBN number
		String ISBN = args[0];//"032149805";
		//stores the calculated checksum digit
		String checksum = calculateChecksum(ISBN);
		//appends the checksum to the ISBN number
		ISBN += checksum;
		//prints the result
		out.println("The ISBN number would be " + ISBN);
		
	}
	
	//This method can be used to pass a String of 9 numbers (command line argument)
	//to return a String of the checksum digit of the ISBN number
	public static String calculateChecksum(String ISBN) {
		
		//Checks if provided ISBN string is 9 digits
		if (ISBN.length() != 9) {
			out.println(NOT_ENOUGH_CHARACTERS);
			System.exit(1);
		}
		
		//split the string to parse each character to an int value
		String[] characters = ISBN.split("");
		
		//sum is used to store the sum of (d1 + 2d2 + 3d3 + ... + 10d10)
		//which is part of the calculation for the checksum digit
		int sum = 0;
		for (int i = 0, j = 1; i < characters.length; i++, j++) {
			int tempInt = Integer.parseInt(characters[i]);
			sum += (j * tempInt);
		}
		
		//remainder is used to exit loop if the checksum digit was calculated
		int remainder = 1;
		//checksum is used to track which digit satisfies the checksum calculation
		//value is set to -1 to increase with the while loop while starting at 0
		int checksum = -1;
		//the loop will exit if the remainder is 0 as the checksum was calculated
		
		while (remainder != 0) {
			
			//increase checksum
			checksum++;
			//calculate remainder to determine if checksum is valid
			remainder = (sum + (checksum * 10)) % 11;
			
		}
		
		//returns the calculated checksum
		if (checksum < 10) return Integer.toString(checksum);
		else return "X";
		
	}
	
	//This method is just like above, but can be used to pass a int value as a String 
	//for the ISBN number to the above method. Unused in my tests
	public static String calculateChecksum(int ISBN) {
		
		return calculateChecksum(Integer.toString(ISBN));
		
	}
	
}