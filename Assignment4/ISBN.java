import java.util.*;
import java.io.*;
import static java.lang.System.out;
public class ISBN {
	
	public static void main(String[] args) {
		
		//This if statement checks if the command line argument is 9 characters
		if (args[0].length() != 9) {
			out.println("The ISBN number must be 9 digits long");
			System.exit(1);
		}

		//store the argument as a local variable
		//ISBN is the 9 digit book number
		final String ISBN = args[0];
		
		//store the result
		String checksum = calculateChecksum(ISBN);
		//print the result
		out.println("The ISBN number would be " + ISBN + checksum);
		
	}

	public static String calculateChecksum(String input) {
		
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			int digit = Character.getNumericValue(input.charAt(i));
			sum += (i + 1) * digit;
		}
		//checksumDigit stores the checksum as an int
		int checksumDigit = sum % 11;
		//checksum will hold the checksum as a String
		String checksum = "";
		//If the checksum is 10, it will set result to X per ISBN conventions
		if (checksumDigit == 10) checksum += "X";
		//Otherwise result will be set to the digit
		else checksum += checksumDigit;
		//return the checksum
		return checksum;

	}
}