/*
 * Created/Modified by Carter Lee
 * BinarySearch - modified BinarySearch in java textbook to return 
 * indexes of i where values are found
 */
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.err;

public class BinarySearch {

    public static void main(String[] args) {
        // if not enough arguments show a message on how to use program
        if (args.length < 2) {
            err.println("Usage: java BinarySearch <input_file> <search_key>");
            System.exit(1);
        }

        // inputFile is the filename of the file
        // searchKey is the number to search for
        final String inputFile = args[0];
        final int searchKey = Integer.parseInt(args[1]);

        // try checks for any exceptions thrown
        // catch will grab FileNotFoundException
        // Needed because of compilation errors for unhandled exception
        try {
            // create the scanner variable
            Scanner scanner = new Scanner(new File(inputFile));
            // initialize an array to store integers from the file
            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();

            // close scanner
            scanner.close();

            // sorts the array of ints grabbed from the file 
            Arrays.sort(numbers);

            // store the result and print it
            int result = search(searchKey, numbers);
            out.println(result);
        } catch (FileNotFoundException e) {
            // Tell user the file cannot be found
            err.println("Input file not found: " + inputFile);
        }

        
    }

    // return the index of the key in the sorted array a[]
    public static int search(int key, int[] a) {
        return search(key, a, 0, a.length);
    }

    public static int search(int key, int[] a, int lo, int hi) {
        
        // possible key indices in [lo, hi)
        if (hi <= lo) {
            // Return the largest index -i such that a[i] is less than key
            // subtracting 1 from lo corrects the number to be the i index
            return -(lo - 1);
        }

        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return search(key, a, lo, mid);
        } else if (key > a[mid]) {
            return search(key, a, mid + 1, hi);
        } else {
            // Return the largest index i for which a[i] is equal to key
            while (mid < hi - 1 && a[mid + 1] == key) 
                mid++;
            
            return mid;
        }
    }

    
}
