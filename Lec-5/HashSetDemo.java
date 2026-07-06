import java .util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Collection cc = new ArrayList();
        cc.add("Java");
        cc.add("Python");
        cc.add("PHP");
        cc.add("Scala");
        cc.add("JSP");
        cc.add("Scala");

        Iterator ii = cc.iterator();
        System.out.println("List iteam are: ");

        while(ii.hasNext()){
            String name = (String)ii.next();
            System.out.print(name+" ");
        }
        displaySet(cc);
    }

    static void displaySet(Collection aa){
        HashSet set = new HashSet(aa);
        System.out.print("\n\n See the element of Set: ");
        Iterator ii = set.iterator();
        while(ii.hasNext()){
            String name = (String)ii.next();
            System.out.print(name+" ");
        }
    }
    
}
