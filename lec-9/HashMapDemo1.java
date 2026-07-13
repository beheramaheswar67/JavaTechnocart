import java.util.*;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put(new String("java"), "Core java for Beginners");
        map.put(new String("java"), "Complete Referance");
        map.put(new String("java"),"Head First");

        System.out.println(map);
    }   
}
