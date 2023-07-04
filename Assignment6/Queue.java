public class Queue<Item> {
    
    private Node first;
    private Node last;

    private class Node {
        private Item item;
        private Node next;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    // Insert a new node at the end of the list.
    public void enqueue(Item item) {

        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())
            first = last;
        else
            oldLast.next = last;
    }

    // Remove the first node from the list and return item.
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty())
            last = null;
        return item;
    }

    // Test client is similar to Program 4.3.2.
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();
    }
    
}