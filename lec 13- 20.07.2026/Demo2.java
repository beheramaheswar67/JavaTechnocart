@FunctionalInterface
interface X<A,B>{
Object call(A aa, B bb);
}

class A{
    public static int add( int x, int y){
        return x+y;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static String add(String s1, String s2){
        return s1+s2;
    }
}

public class Demo2{
    public static void main(String[] args) {
        X<Integer , Integer> aa1 = A::add;
        X<Double, Double> aa2 = A::add;
        X<String, String> aa3 = A::add;

        System.out.println("Sum of Number is: "+aa1.call(12, 12));
        System.out.println("Sum of double is: "+aa2.call(125.65,265.99));
        System.out.println("Sum of String is: "+aa3.call("Mahesh", "Anjali"));


    }

}