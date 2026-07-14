import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put(105, "Java");
        map.put(103,"Python");
        map.put(101,"Adv Java");
        map.put(102, "React JS");
        map.put(104, "Angular");
        //map.put(106.0,"Scala");
        //map.put(null, "JavaScript");

        Set ss = map.keySet();

        Iterator ii = ss.iterator();
        while (ii.hasNext()) {
            Integer key = (Integer)ii.next();
            String value = (String)map.get(key);
            System.out.println("Key is: "+key+" Value is: "+value);
            
        }
    }
    
}
