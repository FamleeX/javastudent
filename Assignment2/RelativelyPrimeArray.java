import static java.lang.System.out;

/* Created by Carter Lee
 * RelativelyPrimeArray - Uses a nested array
 * to calculate, store and print relatively prime 
 * values 
 * */
class RelativelyPrimeArray {

    public static void main(String[] args) {

        //This is the command line argument n, which is used
		//to create a Boolean array
        int n = Integer.parseInt(args[0]);
		
        Boolean[][] rpa = new Boolean[n + 1][n + 1];
		//This for loop loads the Boolean area with values
		//Values will be if [i][j] are relatively prime
		//If i or j is 0, default values will be set/not used
        for (int i = 1, j = 1; j < rpa.length; i++) {
			//This sets the index to its value
            rpa[i][j] = isRelativelyPrime(i, j);
			//If we are in the last i
            if (i == n) {
				//reset to the first i
                i = 0;
				//and go to the next j
                j++;
            }
        }
		//This for loop prints out the rpa Boolean array like a table
        for (int column = 0, row = 0; row <= n; column++) {
            //string will store the "cell" of data to print later
			String string = "";
            //format is to tell printf() how to print string
			String format = "%3s";

			//These if statements determine the character 
            //to print for the table of data
			
			//If the indexes are equal set string to space
            if (column == row) string = " ";
			//If it is the 0 row, set string to the current column number
			else if (row == 0) string += column; //Integer.toString(column);
			//Otherwise if it is not the 0 row but it is the
			//0 column then set the string to the row number
			else if (column == 0 && row != 0) string += row;//Integer.toString(row);
			//If the row or column is not 0 and the value is true
			//at the given index Then set the string to a T character
            else if (rpa[column][row] == true) string = "T";
			//Otherwise set the string to a F character
			else string = "F";
			
			//If it's the last column of the row 
			if (column == n) {
				//add a new line after the string is printed
				format += "%n";
				//set column to -1 so it resets to 0 after this loop iteration
				column = -1;
				//start the next row of data
				row++;
			}
			//Print the table cell from the string
			out.printf(format, string);
			
        }
		
    }
	
	//This method checks if two numbers are relatively 
	//prime (excluding 0 since we do not require it)
    public static boolean isRelativelyPrime(int number1, int number2) {
        int smallerNumber = Math.min(Math.abs(number1), Math.abs(number2));
        for (int i = 2; i <= smallerNumber; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                return false; // Common divisor found, numbers are not relatively prime
            }
        }
        return true; // No common divisor found, numbers are relatively prime
    }

}