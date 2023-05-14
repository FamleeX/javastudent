/*
 * Created by Carter Lee
 * AndOp - Checks two command line argument doubles
 * if they are between 0 and 1
 */
public class AndOp {

	//The main method that runs when class is called
	public static void main(String[] args) {
		
		//These variables call Double.parseDouble()
		//to convert the String command line inputs
		//into doubles and set that as their value
		//only checks the first two arguments
		double double1 = Double.parseDouble(args[0]);
		double double2 = Double.parseDouble(args[1]);
		
		//Stores the result if both doubles are between 0 and 1
		boolean result;
		
		//The if statement checks if the two inputted numbers are between 0 and 1
		//otherwise it sets the result variable to false and prints the result
		//It is assumed that their was only two inputs. The rest are ignored
		if (1 > double1 && double1 > 0 && 0 < double2 && double2 < 1) {
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