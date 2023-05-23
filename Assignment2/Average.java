// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
import static java.lang.System.out;
public class Average {
	
	public static void main (String[] args) {
		
		/*String testString = "Carter 2 6 9";
		String testName = "";
		int[] numbers = new int[3];
		int numberTracker = 0;*/

		Scanner scanner = new Scanner(System.in);
		int amount = 4;//Integer.parseInt(args[0]);
		String[] userData = new String[amount];

		int w = 0;
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (w < amount) userData[w] = line;
			w++;
		}

		scanner.close();

		String[] names = new String[amount];
		int[] number1 = new int[amount];
		int[] number2 = new int[amount];
		int[] number3 = new int[amount];
		double[] average = new double[amount];
		//This loop will load the arrays
		for (int i = 0; i < userData.length; i++) {
			String line = userData[i];
			String name = "";
			int numberTracker = 1;
			for (int j = 0; j < line.length(); j++) {
				
				char ch = line.charAt(j);
				String s = String.valueOf(ch);

				if (' ' == ch) continue;
				else if ('0' <= ch && ch <= '9') {
					if (numberTracker == 1) {
						number1[i] = Integer.parseInt(s);
						numberTracker++;
					} else if (numberTracker == 2) {
						number2[i] = Integer.parseInt(s);
						numberTracker++;
					} else {
						number3[i] = Integer.parseInt(s);
						break;
					} 	
				} else {
					name = name + Character.toString(ch);
				}
			}
			names[i] = name;
			average[i] = getAverage(number1[i], number2[i], number3[i]);
		}

		for (int i = 0; i < amount; i++) {
			String formats = "%8s %d %d %d %4.2f%n";
			out.printf(formats, names[i], number1[i], number2[i], number3[i], average[i]);
		}

		
	}
	
	public static double getAverage (int[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) sum += array[i];
		double average = (sum / array.length);
		average = Math.round(average * 100.0) / 100.0;
		return average;
	}
	
	public static double getAverage (int a, int b, int c) {
		double sum = 0;
		sum = a + b + c;
		double average = sum / 3;
		average = Math.round(average * 100.0) / 100.0;
		return average;
	}
	
}