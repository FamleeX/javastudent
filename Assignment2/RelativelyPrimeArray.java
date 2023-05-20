import java.math.BigInteger;


// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class RelativelyPrimeArray {
	
	public static void main (String[] args) {
		
		final String SPACE = " ";
		
		int n = 20;
		Boolean[][] rpa = new Boolean[n + 1][n + 1];
		
		//the x and y variables track that location in the array
		for (int x = 1, y = 1; y <= n; x++) {
			
			rpa[x][y] = isRelativelyPrime(x, y);
			
			//Trying one for loop with two variables. 
			//If x is 9 at the end of loop, it should start
			//loading data in next row
			if (x == n) {
				x = 0;
				y++;
			}
		}
		
		int rowNumber = 1;
		int columnNumber = 1;
		for (int x = 0, y = 0; y <= n; x++) {
			
			//if (y >= 10) System.out.print(SPACE);
			if (y == 0 && 0 == x) System.out.print(SPACE + SPACE);
			else if (y == 0) {
				System.out.print(columnNumber);
				columnNumber++;
			} else if (x == y) System.out.print(SPACE);
			else if (rpa[x][y] == true) System.out.print("T");
			else System.out.print("F");
			
			
			if (x == n && n == y) break;
			else if (x == n) {
				String rowNumberString = Integer.toString(rowNumber);
				if (rowNumber < 10) rowNumberString = SPACE + rowNumberString;
				x = 0;
				System.out.print("\n" + rowNumberString);
				rowNumber++; y++;
			}
			
			if (x > 9 && y > 0) {
				System.out.print(SPACE + SPACE);
				continue;
			} else if (x > 9) {
				System.out.print(SPACE);
				continue;
			}
			System.out.print(SPACE + SPACE);
		} 
		System.out.println("\n Program completed!");
	}
	
	public static boolean isRelativelyPrime (int number1, int number2) {
		
		boolean result;
		result = BigInteger.valueOf(number1).gcd(BigInteger.valueOf(number2)).equals(BigInteger.ONE);
		return result;
		
	}
	
}