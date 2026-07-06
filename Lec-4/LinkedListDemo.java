import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");

        ll.offerFirst("Java");
        ll.offerLast("Python");
        System.out.println("Size of LinkedList is: "+ll.size());
        System.out.println("Last element is: "+ll.peekLast());
        System.out.println(ll);
        ll.pollFirst();
        ll.pollLast();
        System.out.println(ll);

    }
}
