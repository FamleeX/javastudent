import static java.lang.System.out;

public class Distribution100PF {
    public static void main(String[] args) {
        //String[] args2 = new String[] {"15", "5", "82", "2", "1", "74", "19", "47", "64", "39", "77", "25", "99", "100", "1", "10", "11"};

        int amount = Integer.parseInt(args[0]);
        int lessThanEqualTo = 0;
        int greaterThan = 0;

        for (int i = 1; i <= amount; i++) {
            int number = Integer.parseInt(args[i]);

            if (100 < number || number < 1) {
                System.out.println("Sorry, numbers and arguments must be between 1 and 100");
                System.exit(1);
            }

            if (number <= 50 && number >= 1)
                lessThanEqualTo++;
            else if (number > 50 && number <= 100)
                greaterThan++;
        }

        // Use printf instead of println
        out.printf("%d numbers entered are less than or equal to 50%n", lessThanEqualTo);
        out.printf("%d numbers entered are greater than 50%n", greaterThan);
    }
}
