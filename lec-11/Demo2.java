import java.util.*;
public class Demo2 {
    public static void main(String[] args) {
        ArrayList aa = new ArrayList();
        aa.add("Red");
        aa.add("Green");
        aa.add("Blue");
        //System.out.println("See the elements in the ArrayList: \t"+aa);
        System.out.println("See the elements in the ArrayList: ");
        for (int i = 0; i < aa.size(); i++) {
            String s = (String) aa.get(i);
            System.out.println(s);
        }
    }
    
}
