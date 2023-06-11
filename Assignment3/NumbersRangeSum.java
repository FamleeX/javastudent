import static java.lang.System.out;
public class NumbersRangeSum {
	
	public static void main (String[] args) {
		
		//These arguments parse and store the command line arguments
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
		//This variable stores the result of the sum of a range of numbers
		//and calls a recursive method to get the sum of the range
		int sum = getSum(number1, number2);
		
		//Create the message to print
		String message = "The sum of natural numbers in range";
		
		//Create the format string. I could include message in the format,
		//but research for C told me it is bad practice. Better safe than sorry.
		String format = "%s [%d, %d] %s %d %n";
		
		//Print the original range and resulting sum
		out.printf(format, message, number1, number2, "is", sum);
		
	}
	
	//This is a recursive method that gets the sum of a range of numbers
	public static int getSum(int startNumber, int endNumber) {
		
		//This if statement would swap the arguments if startNumber is the bigger number
		//makes the recursive function below shorter when done this way.
		if (startNumber > endNumber) {
			int temp = endNumber;
			endNumber = startNumber;
			startNumber = temp;
		}
		
		//This if statement will end the recursion and return the last number
		//if it is the last number remaining
		if (startNumber == endNumber) return endNumber;
		
		//sum variable stores the sum. To add the next number in the range
		//recursion is used by calling the startNumber, then calling method with
		//startNumber + 1 added to close in the range
		int sum = startNumber + getSum(startNumber + 1, endNumber);
		
		//once recursion is done adding all numbers this returns the result as an int
		return sum;
		
	}
	
}