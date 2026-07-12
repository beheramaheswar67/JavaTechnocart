import java.util.*;
class MyDemo implements Comparator{
    @Override
    public int compare(Object obj1, Object obj2){
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;

        if(i1 > i2){
            return -1;
        }
        else if(i1 < i2){
            return 1;
        }else{
            return 0;
        }
    }

}
public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(105);
        ts.add(103);
        ts.add(109);
        ts.add(102);
        ts.add(107);
        ts.add(104);
        ts.add(106);
        ts.add(102);
        ts.add(109);
        System.out.println(ts);

    }
    
    
}
