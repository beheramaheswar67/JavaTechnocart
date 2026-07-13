import java.util.*;
class X{
    @Override
    public String toString(){
        return "Java Technocart";
    }

    @Override
    public void finalize(){
        System.out.println("|Pleaseb do not kill me.");
    }
}

public class HashMapDemo {
    public static void main(String[] args) {
        X key = new X();
        HashMap map = new HashMap();
        map.put(key, "Java Center");
        System.out.println(map);
        key = null;
        try{
            Thread.sleep(3000);
        }catch(InterruptedException ie){
            System.out.println(map);
        }
    }    
}
