/*
 * Created/Modified by Carter Lee
 * MergeSort - Modified original MergeSort in java textbook
 * to allow searching of subarrays
 */
import static java.lang.System.out;
import static java.lang.System.err;

public class MergeSort {
    
    public static void main(String[] args) {
         // if not enough arguments show a message on how to use program
        if (args.length < 4) {
            err.println("Usage: java MergeSort <start_index> <end_index> <word1> <word2> ...");
            System.exit(1);
        }

        // Extract the index values for the sort
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        
        // args.length-2 makes this array not include the index values
        // for the length of the words array
        String[] words = new String[args.length-2];

        // load the words from the command line arguments into the array
        for (int i = 0, j = 2; i < words.length; i++, j++) {
            words[i] = args[j];
        }

        // Sort the subarray
        sort(words, start, end);

        // print the results
        for (int i = 0; i < words.length; i++) {
            out.print(words[i] + " ");
        }

        // line break
        out.println();
    }

    // method allows sorting a subarray
    @SuppressWarnings("rawtypes")
    public static void sort(Comparable[] a, int lo, int hi) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, lo, hi + 1);
    }

    // method from original MergeSort program 4.2.6 in the textbook
    @SuppressWarnings({"rawtypes","unchecked"})
    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) { 
        // Sort a[lo, hi).
        if (hi - lo <= 1) return;
        int mid = lo + (hi-lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid, hi);
        int i = lo, j = mid;
        for (int k = lo; k < hi; k++) 
            if (i == mid) aux[k] = a[j++];
            else if (j == hi) aux[k] = a[i++];
            else if (a[j].compareTo(a[i]) < 0) aux[k] = a[j++];
            else aux[k] = a[i++];
        
        for (int k = lo; k < hi; k++)
            a[k] = aux[k];
    } 


}