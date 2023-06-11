import static java.lang.System.out;
public class TriangularTest {
	
	//Main method of class
	//Exit code 1 is not enough arguments
	public static void main (String[] args) {
		
		//Checks if there are three command line arguments and exits program if there isn't
		if (args.length != 3) {
			out.println("Please enter three integers from the command line as arguments");
			System.exit(1);
		}
		
		//Assign command line int arguments to local variables
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		int number3 = Integer.parseInt(args[2]);
		
		//See if the three integers are sides of a triangle and store the value
		boolean isTriangular = isTriangular(number1, number2, number3);
		
		//If they were sides of a triangle print True, otherwise print False
		if (isTriangular) out.println("True");
		else out.println("False");
		
	}
	
	//This method checks if three integers are sides of a triangle
	//arguments are a, b, c to represent sides of a triangle
	//order of numbers does not matter
	public static boolean isTriangular(int a, int b, int c) {
		//evaluates if any side is greater than the sum of the other two
		//if so the numbers are not from a triangle and returns false
		if (a >= b + c || b >= a + c || c >= a + b) 
			return false;
		//Otherwise the sides are from a triangle
		else 
			return true;
		
	}
	
}