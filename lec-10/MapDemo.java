import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put(107, "Quba");
        map.put(105, "USA");
        map.put(108,"Japan");
        map.put(103, "Pakistan");
        map.put(101, "India");
        map.put(109, "Chaina");
        map.put(102, "Nepal");
        map.put(104, "Korea");
        map.put(106, "Afganistan");

        System.out.println("Fisrt key is: "+map.firstKey());
        System.out.println("Last key is: "+map.lastKey());
        System.out.println("Head map is:"+map.headMap(105));
        System.out.println("Tail map is: "+map.tailMap(105));
        System.out.println("Sub map is: "+map.subMap(103, 108));
        System.out.println("Higher key is: "+map.higherKey(105));
        System.out.println("Celling key is: "+map.ceilingKey(105));
        System.out.println("Lower key is: "+map.lowerKey(105));
        System.out.println("Floor key is: "+map.floorKey(105));
        System.out.println("Delete forst element: "+map.pollFirstEntry());
        System.out.println("Delete last element: "+map.pollLastEntry());
    }
    
}
