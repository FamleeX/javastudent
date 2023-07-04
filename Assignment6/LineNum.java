import java.util.Scanner;
import static java.lang.System.out;

public class LineNum {
    
    public static void main(String[] args) {
        // parse number from command line to print later
        int n = Integer.parseInt(args[0]);
        // initiliaze scanner
        Scanner scanner = new Scanner(System.in);
        // create Queue object
        Queue<String> queue = new Queue<String>();
        // this string will store the desired line from standard input
        String string = "";
        // this final string will contain the standard message for the result
        final String message = n + " from the first is";
        // this string is used for the format for printf
        final String format = "%s %s\n";
        
        // Add user lines into Queue untl Ctrl D or Ctrl Z on Windows is pressed
        while(scanner.hasNextLine()) queue.enqueue(scanner.nextLine());
        
        // close scanner
        scanner.close();

        // Remove items from queue until desired item is found
        for (int i = 0; i < n; i++) string = queue.dequeue();
        
        // print result
        out.printf(format, message, string);

    }

}
