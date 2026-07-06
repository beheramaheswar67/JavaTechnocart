import java.util.*;
public class ShortedDemo {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();

        ts.add(109);
        ts.add(104);
        ts.add(102);
        ts.add(103);
        ts.add(107);
        ts.add(108);
        ts.add(101);
        ts.add(110);
        ts.add(106);
        ts.add(105);

        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.headSet(105));
        System.out.println(ts.tailSet(105));
        System.out.println(ts.subSet(103, 108));
    }
}
