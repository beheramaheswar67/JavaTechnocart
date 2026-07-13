import java.util.*;

public class PriorityQueDemo{
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        System.out.println("Element is : "+p.peek());
        for(int i=1; i<=10; i++){
            p.offer(new Integer(1));
            System.out.println(p);
            System.out.println("Extracted element is: "+p.peek());
            System.out.println("Removed element is: "+p.poll());
        }
    }
}   