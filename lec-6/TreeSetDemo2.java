import java.util.*;
class MyApp implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2){

        String s1 = (String)obj1;
        String s2 = (String)obj2;

        if(s1.compareTo(s2) < 0){
            return 1;
        }
        else if(s1.compareTo(s2) > 0){
            return -1;
        }else{
            return 0;
        }

    }

}

public class TreeSetDemo2 {
    public static void main(String args[]){
        TreeSet ts = new TreeSet(new MyApp());

        ts.add("Deepak");
        ts.add("Saroj");
        ts.add("Firoj");
        ts.add("Amit");
        ts.add("Alka");
        ts.add("Vivek");
        ts.add("Tanmay");
        //ts.add(new StringBuffer("Java"));
        System.out.println(ts);
    }
}
