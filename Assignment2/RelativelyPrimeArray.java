import static java.lang.System.out;

class RelativelyPrimeArray {

    public static void main(String[] args) {

        final String SPACE = " ";
		int n = 20;
        //int n = Integer.parseInt(args[0]);
        Boolean[][] rpa = new Boolean[n + 1][n + 1];

        for (int column = 1, row = 1; row <= n; column++) {

            rpa[column][row] = isRelativelyPrime(column, row);

            if (column == n) {
                column = 0;
                row++;
            }
        }
        printSpace();
        for (int column = 0, row = 0; row <= n; column++) {
			
			//These if statements determine the character 
            //to print for the table of data
            if (column == row)
                printSpace();
            else if (row == 0)
                out.print(column);
            else if (rpa[column][row] == true)
                out.print("T");
            else
                out.print("F");

            //These if statements check if the 
            //last column of the row was printed 
            if (column == n) {
                //Starts a new line for the next row
                out.println();
                //If the last row was printed, exit the loop
                if (row == n) break;
                //Otherwise start the next row
                else row++;
                //If it is not the tenth row yet print a space
                //to line up the numbers (looks like an invisible line)
                if (row < 10) printSpace();
                //Print the row number for the table
                out.print(row);
                //Reset the column to show no data
                //was printed yet for this row
				column = 0;
			}
            
            if (column > 9 && row > 0) {
                printSpace(2);
                continue;
            } else if (column > 9) {
                printSpace();
                continue;
            }
            printSpace(2);
        }
    }

    public static void printSpace(int space) {
        for (int i = 1; i <= space; i++) {
            out.print(" ");
        }
    }

    public static void printSpace() {
        printSpace(1);
    }

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
