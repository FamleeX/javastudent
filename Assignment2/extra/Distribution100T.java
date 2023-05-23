public class Distribution100T {
	public static void main(String[] args) {
		int lessThan = 0, moreThan = 0;
		for (int i = 0; i < Integer.parseInt(args[0]); i++) {
			if (Integer.parseInt(args[i + 1]) <= 50) lessThan++;
			else if (Integer.parseInt(args[i + 1]) > 50) moreThan++;
		}
		System.out.println(lessThan + " numbers entered are less than or equal to 50");
		System.out.println(moreThan + " numbers entered are greater than 50");
	}
}