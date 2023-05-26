package Assignment3;

import static java.lang.System.out;
public class NumbersRangeSum {
	
	public static void main (String[] args) {
		
		//These arguments parse and store the command line arguments
		int number1 = 6;//Integer.parseInt(args[0]);
		int number2 = 10;//Integer.parseInt(args[1]);
		
		//This variable stores the result of the sum of a range of numbers
		int sum = getSum(number1, number2);
		
		//The line to print
		String string = "The sum of natural numbers in range [" + 
						   number1 + ", " + number2 + "] is " + sum;
		out.println(string);
		//System.out.println("The sum of natural numbers in range [" + 
		//				   number1 + ", " + number2 + "] is " + sum);
		
	}
	
	//This is a recursive method that gets the sum of a range of numbers
	public static int getSum(int startNumber, int endNumber) {
		
		//This if statement would swap the arguments if startNumber is the bigger number
		if (startNumber > endNumber) {
			int temp = endNumber;
			endNumber = startNumber;
			startNumber = temp;
		}
		
		//This if statement will end the recursion and return the last number
		//if it is the last number remaining
		if (startNumber == endNumber) return endNumber;
		//sumOf variable stores the sum
		int sumOf = startNumber + getSum(startNumber + 1, endNumber);
		//once recursion is done adding all numbers this returns the result as an int
		return sumOf;
		
	}
	
}