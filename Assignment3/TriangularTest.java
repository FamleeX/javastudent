package Assignment3;

public class TriangularTest {
	
	public static void main (String[] args) {
		
		int number1 = 5;
		int number2 = 3;
		int number3 = 6;
		
		//These variables store a parsed int value from command line arguments
		//int number1 = Integer.parseInt(args[0]);
		//int number2 = Integer.parseInt(args[1]);
		//int number3 = Integer.parseInt(args[2]);
		
		if (isTriangular(number1, number2, number3))
			System.out.println("True");
		else 
			System.out.println("False");
		
	}
	
	public static boolean isTriangular(int side1, int side2, int side3) {
		
		if (side1 >= side2 + side3) return false;
		else if (side2 >= side1 + side3) return false;
		else if (side3 >= side1 + side2) return false;
		else return true;
		
	}
	
}