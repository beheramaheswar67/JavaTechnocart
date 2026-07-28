import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Demo2 {
    public static void main(String[] args) {
        List<String> student = Arrays.asList("Amit","Ankit","Suneel","Raj","Dev","Sanjukta","Sukant","Sanket");
        List<String> result = student.stream().sorted().collect(Collectors.toList());
        System.out.println(student);
        System.out.println("The shorted Name are: "+result);

        List<String> result2 = student.stream().sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());   
        System.out.println(result2);

        List<Integer> numList = List.of(15,14,2,56,52,14,56,95,47,12,56,48,36,25,14,7,44,89);
        List<Integer> result3 = numList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted: "+result3);

        List<Integer> result4 = numList.stream().sorted((a,b)->(b-a)).collect(Collectors.toList());
        System.out.println("ReverseOrder: "+result4);

        //---------------------------------------------------------------------------------------------------
        List<Integer> res1 = numList.stream().sorted((a,b) ->((a<b)? 1 : (a>b) ? -1 : 0 )).collect(Collectors.toList());
        System.out.println(res1); // Not Recommanded

        Comparator<String> cc = (s1,s2) -> {
            int x = s1.length();
            int y = s2.length();

            if(x<y)
                return -1;
            else if(x>y)
                return +1;
            else
                return s1.compareTo((s2));

        };

        List<String> fnl= student.stream().sorted(cc).collect(Collectors.toList());
        System.out.println(fnl);

    
  
}

}
