import java.util.*;

class MyApp implements Comparator{
    @Override
    public int compare(Object obj1, Object obj2){
        String s1 = (String)obj1;
        String s2 = (String)obj2;
        int i1 = s1.length();
        int i2 = s2.length();

        if(i1 < i2){
            return -1;
        }
        else if(i1 > i2){
            return 1;
        } else{
            return s1.compareTo(s2);
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue(new MyApp());
        p.offer("Pakistan");
        p.offer("USA");
        p.offer("Zimbaway");
        p.offer("Dubai");
        p.offer("Briten");
        p.offer("Englande");
        p.offer("Nepal");
        p.offer("Japan");
        p.offer("Afganistan");
        p.offer("Cuba");

        System.out.println(p);
    }
    
}
