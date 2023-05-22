// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
public class Average {
	
	public static void main (String[] args) {
		
		String testString = "Carter 2 6 9";
		String testName = "";
		int[] numbers = new int[3];
		int numberTracker = 0;
		
		for (int i = 0; i < testString.length(); i++) {
			
			char ch = testString.charAt(i);
			String s = String.valueOf(ch);
			
			if (' ' == ch) continue;
			else if ('0' <= ch && ch <= '9') {
				numbers[numberTracker] = Integer.parseInt(s);
				numberTracker++;
			} else {
				testName = testName + Character.toString(ch);
			}
			
		}
		
		System.out.print(testName);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(" " + numbers[i]);
		}
		
		System.out.println(" " + getAverage(numbers));
		
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