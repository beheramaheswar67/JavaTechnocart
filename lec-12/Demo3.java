import java.util.*;

public class Demo3 {
    Object obj;
    Demo3(Object obj) {
        this.obj = obj;
    }
    public Object get(){
        return obj;
    }
    
    public static void main(String[] args) {
        Demo3 d1 = new Demo3(new String("Java Technocart"));
        String name = (String)d1.get();
        System.out.println("Name is : "+name);
        Demo3 d2 = new Demo3(new Integer(1));
        Integer val = (Integer)d2.get();
        System.out.println("Value is: "+val);
    }
    
}
