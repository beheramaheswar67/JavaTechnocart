import java.util.*;
import java.lang.reflect.*;

public class Demo1 {

    Object obj;
    HashMap map = new HashMap();

     public Object creaObject(Class c){
        String name = c.getCanonicalName();
        System.out.println(name);
        try{
            Constructor con1 = c.getDeclaredConstructor();
            System.out.println(con1);
            con1.setAccessible(true);

            if(!map.containsKey(name)){
                obj = c.newInstance();
                if (obj instanceof Mark){
                    map.put(name, obj);
                }
                return obj;

            }else{
                obj = map.get(name);
                return obj;
            }
        }catch(Exception e){
            return null;
        }
    }

        public static void main(String[] args) {
        
        Demo1 dd = new Demo1();
        Test tt = (Test)dd.creaObject(Test.class);
        Test aa = (Test)dd.creaObject(Test.class);
        System.out.println(tt.hashCode()+"\t"+aa.hashCode());

        if(tt.equals(aa)){
            System.out.println("Single Object is Constructed");
        }else{
            System.out.println("Multiple Object is Created");
        }
     }


     

     
    
}
