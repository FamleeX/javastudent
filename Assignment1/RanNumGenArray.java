import java.util.Arrays;

public class RanNumGenArray {
	
	//The main method that runs when class is called
	public static void main (String[] args) {
		
		//This variable parses the command line input
		//and stores it as an int
		//n is the amount of random numbers to generate
		int n = Integer.parseInt(args[0]);
		
		//This int array will store the generated numbers
		int[] numbers = new int[n];
		
		//This loop generates numbers and stores them in the array
		//and prints the generated numbers out
		for (int i = 0; i < n; i++) {
			numbers[i] = (int)(Math.random() * 100) + (1);
			System.out.print(numbers[i] + " ");
		}
		
		Arrays.sort(numbers); 
		System.out.println("\nThe minimum value is " + numbers[0]);
		System.out.println("The maximum value is " + numbers[numbers.length-1]);
		
		
	} // End of main method
	
} // End of Class File