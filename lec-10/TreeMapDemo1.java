import java.util.*;

class MyApp implements Comparator{
    @Override
    public int compare(Object obj1, Object obj2){
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return s2.compareTo(s1);
    }
}

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap map = new TreeMap(new MyApp());

        map.put(new String("D"), "Japan");
        map.put(new StringBuffer("B"), "Nepal");
        map.put(new StringBuilder("A"), "Kprea");
        map.put(new String("E"),"Cuba");
        map.put(new String("F"),"Afgasithan");
        map.put(new String("G"),"India");
        map.put(new String("H"),"Pakistan");
        map.put(new String("I"),"Russia");

        System.out.println("See the elements. \n");

        Set ss = map.keySet();

        Iterator ii = ss.iterator();

        while(ii.hasNext()){
            Object key = ii.next();
            String value = (String)map.get(key);
            System.out.println("Key is: "+key+" Value is: "+value);
        }
    }
    
}
