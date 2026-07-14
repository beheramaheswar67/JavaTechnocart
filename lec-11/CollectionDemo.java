import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> number= new ArrayList<>(Arrays.asList(4,6,2,1,3,9,7));
        Collections.sort(number);
        System.out.println("Sorted List: " + number);
        System.out.println("Max value is the list is: " + Collections.max(number));
        System.out.println("Min value is the list is: " + Collections.min(number));
        Collections.sort(number, Collections.reverseOrder());
        System.out.println("Reverse Sorted List: " + number);
        Collections.sort(number);
        System.out.println("Sorted List: " + number);
        Collections.shuffle(number);
        System.out.println("Shuffled List: " + number);
        Collections.sort(number);
        int index = Collections.binarySearch(number, 7);
        System.out.println("Index of 7: " + index); 
        List<Integer> ll= new ArrayList<>(Arrays.asList(0,0,0));
        Collections.fill(ll, 9);
        

    }
    
}
