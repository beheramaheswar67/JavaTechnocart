
import java.util.*;

public class CompareableDemo {

    public static void main(String[] args) {

        String s1 = new String("A");
        String s2 = new String("B");
        String s3 = new String("C");
        String s4 = new String("D");
        String s5 = new String("E");
        String s6 = new String("F");

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo(s5));
        System.out.println(s1.compareTo(s6));

        TreeSet ts = new TreeSet();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        System.out.println(ts);

    }

}
