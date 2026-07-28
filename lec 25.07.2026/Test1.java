import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Test1 {
    public static void main(String[] args) {
        
        List<String> name = Arrays.asList("Amit","Ankit","Sumit","Ajay","Dev","Anuska","Rohit","Sanjay");
        List<String> result =name.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(result);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(76);
        list.add(78);
        list.add(90);
        list.add(23);
        list.add(75);
        list.add(88);
        System.out.println(list);

        List<Integer> result1 = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(result1);

        List<Integer> result2 = list.stream().filter(i -> i%2!=0).collect(Collectors.toList());
        System.out.println(result2);

        List<Integer> result3 = list.stream().filter(i -> i>80).collect(Collectors.toList());
        System.out.println(result3);

        List <String> country = Arrays.asList("India","Pakistan","China","Bangladesh","America","Vieatname","Zimbaway","Cuba");
        List<String> CountryResult=country.stream().filter(i -> i.length()<=5).collect(Collectors.toList());
        System.out.println(CountryResult);

        List<String> CountryResult1 = country.stream().filter(i -> i.startsWith("I")).collect(Collectors.toList());
        System.out.println(CountryResult1);
        
        

    }
    
}
