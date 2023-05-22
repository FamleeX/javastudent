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

        for (int column = 0, row = 0; row <= n; column++) {
			
			//These statements determine the character to print for the table of data
            if (row == 0 && column == 0)
                printSpace(2);
            else if (row == 0) {
                out.print(column);
            } else if (column == row)
                printSpace();
            else if (rpa[column][row] == true)
                out.print("T");
            else
                out.print("F");


            if (column == n && n == row)
                break;
			else if (column == n) {
				if (row < 9)
					out.print("\n " + (row + 1));
				else
					out.print("\n" + (row + 1));
				column = 0;
				row++;
			}

            if (column > 9 && row > 0) {
                out.print(SPACE + SPACE);
                continue;
            } else if (column > 9) {
                out.print(SPACE);
                continue;
            }
            out.print(SPACE + SPACE);
        }
        out.println("\nProgram completed!");
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
        if (number1 == 0 || number2 == 0) {
            return false; // Zero is not relatively prime to any number
        }

        int smallerNumber = Math.min(Math.abs(number1), Math.abs(number2));
        for (int i = 2; i <= smallerNumber; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                return false; // Common divisor found, numbers are not relatively prime
            }
        }
        return true; // No common divisor found, numbers are relatively prime
    }

}
