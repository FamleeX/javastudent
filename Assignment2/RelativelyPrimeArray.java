//importing BigInteger class for use 
import java.math.BigInteger;

// 
public class RelativelyPrimeArray {
	
	//Main method of class/program
	public static void main (String[] args) {
		
		//n is used to take the command line argument and use parseInt to store as an int value
		//to create the array length
		int n = Integer.parseInt(args[0]);
		//This Boolean array takes the command line argument variable n and sets that is its size, plus 1
		Boolean[][] rpa = new Boolean[n + 1][n + 1];
		
		//the x and y variables track the location in the array
		for (int x = 0, y = 0; y < n; x++) {
			
			rpa[x][y] = isRelPrime(x + 1, y + 1);
			
			//Trying one for loop with two variables. 
			//If x is 8 at the end of loop, it should start
			//loading data in next row
			if (x == n - 1) {
				x = -1;
				y++;
			}
		}
		
		for (int column = 0; column < n + 1; column++) {
			if (column == 0) System.out.print("   ");
			else if (column > 9) System.out.print(column + " ");
			else System.out.print(column + "  ");
		}
		
		System.out.println();
		
		for (int x = 0, y = 0; y < n;) {
			int row = y + 1;
			
			if (x == 0 && row < 10) System.out.print(" " + row + " ");
			else if (x == 0) System.out.print(row + " ");
			//if (x > 9) System.out.print(" ");
			if (x == y) System.out.print("   ");
			else if (rpa[x][y] == true) System.out.print("T  ");
			//else if (rpa[x][y] == true && y > 9) System.out.print("  T  ");
			else if (rpa[x][y] == false) System.out.print("F  ");
			//else if (rpa[x][y] == false && y > 9) System.out.print("  F  ");
			
			//Trying one for loop with two variables. 
			//If x is 8 at the end of loop, it should start
			//loading data in next row
			if (x == n - 1) {
				System.out.println();
				
				x = 0;
				y++;
				continue;
			}
			x++;
		} 
		
	}
	
	public static boolean isRelPrime (int n1, int n2) {
		
		boolean result;
		result = BigInteger.valueOf(n1).gcd(BigInteger.valueOf(n2)).equals(BigInteger.ONE);
		return result;
		
	}
	
}