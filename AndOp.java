public class AndOp {

	public static void main(String[] args) {
		
		//These variables call the parseDouble method
		//from Double class to convert the String command line inputs
		//into doubles and set that as their value
		double arg1 = Double.parseDouble(args[0]);
		double arg2 = Double.parseDouble(args[1]);
		
		//Stores the result if both doubles are between 0 and 1
		boolean result;
		
		//The if statement checks if the two inputted numbers are between 0 and 1
		//otherwise it sets the result variable to false and prints the result
		//It is assumed that their was only two inputs. The rest are ignored
		if (1 > arg1 && arg1 > 0 && 0 < arg2 && arg2 < 1) {
			//Set the result variable to true if both doubles are between 0 and 1
			result = true;
		} else {
			//Set the result variable to false otherwise
			result = false;
		}
		//Print the result
		System.out.println(result);
		
	} //End of main method bracket
	
} //End of Class bracket