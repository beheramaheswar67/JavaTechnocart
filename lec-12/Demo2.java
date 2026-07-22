import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");
        map.put(104, "JavaScript");
        map.put(105, "Ruby");

        System.out.println("\n See the elements of HashMap object.\n");
        // System.out.println(map);


        Set<Integer> keys = map.keySet();
        Iterator<Integer> ii = keys.iterator();
        while (ii.hasNext()) {
            Integer key = ii.next();
            String value = map.get(key);
            System.out.println(key + " : " + value); 

    }
    
  }

}
