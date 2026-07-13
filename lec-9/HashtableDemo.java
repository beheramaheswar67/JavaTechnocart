import java.util.*;

public class HashtableDemo {
    public static void main(String[] args) {

    Hashtable table = new Hashtable();
    table.put("first","Java");
    table.put("second","PHP");
    table.put("third","Python");
    table.put("forth",".Net");
    table.put("fifth","Scala");
    //table.put(null,"Spring");
    //table.put("fifth",null);

    Enumeration ee = table.keys();
    
    while(ee.hasMoreElements()){
        String key = (String)ee.nextElement();
        String value = (String)table.get(key);
        System.out.println("Key: "+key+" Value: "+value);
    }
}

}
