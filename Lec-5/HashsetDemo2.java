
import java.util.*;

public class HashsetDemo2 {

    static void displayList() {
        Collection cc = new ArrayList();
        cc.add("Java");
        cc.add("Python");
        cc.add("PHP");
        cc.add("Scala");
        cc.add("JSP");
        cc.add("Scala");
        cc.add("Java");
        cc.add("JSP");
        cc.add("Scala");

        Iterator ii = cc.iterator();
        System.out.println("List Iteams are: ");
        while (ii.hasNext()) {
            String name = (String) ii.next();
            System.out.print(name + " ");
        }
        displaySet(cc);

    }

    static void displaySet(Collection aa) {
        HashSet set = new HashSet(aa);
        System.out.println("\n\nSee the elements of set: ");
        Iterator ii = set.iterator();
        while (ii.hasNext()) {
            String name = (String)ii.next();
            System.out.println(name + "  ");
        }
    }

    public static void main(String[] args) {
        displayList();
    }

}
