import java.util.*;

public class ArrayDemo {
    public static void main(String[] args) {
        int number[] = {5,2,8,6,4,9,7};

        //sorting the array
        Arrays.sort(number);
        System.out.println("Sorted Array: " + Arrays.toString(number));

        //searching the array
        int index = Arrays.binarySearch(number, 7);
        System.out.println("Index of 7: " + index);

        int xx[] = new int[5];
        Arrays.fill(xx, 9);
        System.out.println("Filled Array: " + Arrays.toString(xx));

        //copying the array
        int cc[] = Arrays.copyOf(xx, xx.length);
        System.out.println("Copied Array: " + Arrays.toString(cc));

        int arr1[] = {11,15,20};
        int arr2[] = {11,15,20};
        System.out.println("Is the content are equal: " + Arrays.equals(arr1, arr2));

        Integer ii[] = {10,20,30,40,50};
        List ll = Arrays.asList(ii);
        System.out.println("List: " + ll);

        int x1[][] = {{1,2},{4,5}};
        System.out.println("2D Array: " + Arrays.deepToString(x1));

    }
    
}
