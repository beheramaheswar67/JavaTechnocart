import java.util.*;

public class TreeSetDemo {
    public static void main(String args[]){
        TreeSet ts = new TreeSet();
        ts.add(109);
        ts.add(105);
        ts.add(101);
        ts.add(107);
        ts.add(110);
        ts.add(103);
        ts.add(102);
        System.out.println(ts);
        System.out.println("Lower value is: "+ts.lower(105));
        System.out.println("Floor value is: "+ts.floor(105));
        System.out.println("Higher Value is:"+ts.higher(105));
        System.out.println("Celling value is: "+ts.ceiling(105));
        System.out.println("Delete first element: "+ts.pollFirst());
        System.out.println("Delete last element: "+ts.pollLast());
        System.out.println(ts);


    }
    
}
