import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("first", "Java");
        map.put("second", "Python");
        map.put("third", "Scala");
        map.put("forth", ".Net");
        map.put("fifth","PHP");
        map.put("sixth", "Java");
        map.put("second", "C++");
        map.put("eight", "CSS");

        Set ss = map.keySet();

        Iterator ii = ss.iterator();
        System.out.println("See the elements of Map Object: ");
        while (ii.hasNext()) {
            String key = (String)ii.next();
            String value = (String)map.get(key);
            System.out.println("Key is: "+key+" Value is: "+value);
            
        }

    }

}
   
