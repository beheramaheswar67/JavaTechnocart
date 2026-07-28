import java.lang.reflect.Field;
import java.util.*;

public class ArrayDemo {
    public static void main(String[] args) throws Exception{

        ArrayList<Integer> list=new ArrayList<>();

        list.add(50);
        list.add(20);
        list.add(10);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        


        // System.out.println(list.get(0));
        // System.out.println(list.get(1));

        // for(int i=0; i<list.size(); i++){
        //     System.out.println(list.get(i));
        // }

        //list.remove(2);
        //list.add(2, 60);
        // list.set(1, 100);

        // for(int x:list){
        //     System.out.println(x);
        // }

        // System.out.println(list);

        // Field field = ArrayList.class.getDeclaredField("elementData");
        // field.setAccessible(true);
        // Object[] elementData= (Object[]) field.get(list);
        // System.out.println("ArrayList capacity: "+elementData.length);

        // list.add(3);
 
        // elementData= (Object[]) field.get(list);
        // System.out.println("ArrayList capacity: "+elementData.length);

        List<Integer> list1 = new ArrayList<>();    //Type-1
        list1.add(1);
        list1.add(2);
        
        System.out.println(list1.getClass().getName());


        List<String> list3 = Arrays.asList("Sunday","Monday","Tuesday"); //Type-2
        System.out.println(list3.getClass().getName());
        list3.set(1, "|Wednessday");
        System.out.println(list3);

        String[] array={"Apple","Banana","Orange"};
        List<String> list4=Arrays.asList(args);
        System.out.println(list4.getClass().getName());

         List<Integer> list5 = List.of(1,2,3,4);
         list5.set(1,"33");




        




    }
    
}
