/*
 * Written/Modified by Carter Lee
 * LinkedStackOfStrings - Modify program 4.3.2 in the textbook
 * by adding a find method that takes a string argument
 */
import java.util.Scanner;
import static java.lang.System.out;

public class LinkedStackOfStrings {
    private Node first;

    private class Node {
        private String item;
        private Node next;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    // Insert a new node at the beginning of the list.
    public void push(String item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    // Remove the first node from the list and return item.
    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }

    // This method looks for a string in the LinkedStack
    public boolean find(String string) {
        String stringFromStack = "";
        // This creates a copy of the stack to use the 
        // pop method to search and not modify the instance stack itself.
        LinkedStackOfStrings stack = this;
        while(!stack.isEmpty()) {
            stringFromStack = stack.pop();
            if (stringFromStack.contains(string))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        

        // store command line string to look for it in the linked stack
        String string = args[0];
        // initiliaze scanner
        Scanner scanner = new Scanner(System.in);
        // create LinkedStack object
        LinkedStackOfStrings stack = new LinkedStackOfStrings();
        // this final string will contain the standard message for the result
        String message = " in the linked stack";
        // this string is used for the format for printf
        final String format = "%s %s\n";
        
        // Add user lines into LinkedStack untl Ctrl D or Ctrl Z on Windows is pressed
        while(scanner.hasNextLine()) stack.push(scanner.nextLine());
        
        // close scanner
        scanner.close();

        // use find method from the LinkedStack object to find if a string is contained
        boolean result = stack.find(string);

        // dont neccessarily need '== true' but easier to read
        if (result == true) message = "exists" + message;
        else message = "does not exist" + message;
        
        // print result
        out.printf(format, string, message);
    }
}