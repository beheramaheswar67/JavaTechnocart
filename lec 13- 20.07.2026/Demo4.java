@FunctionalInterface

interface X<A, B>{
    Object call(A aa, B bb);
}

class A{
    public int add(int x, int y){
    return x+y;
    }

    public double add(double a, double b){
        return a+b;
    }

    public String add(String s1, String s2){
        return s1+s2;
    }

}

public class Demo4 {
    public static void main(String[] args) {

       A aa = new A();
       X<Integer, Integer> aa1= aa::add;
       X<Double, Double> aa2 = aa::add;
       X<String, String> aa3 = aa::add;

       System.out.println("Sum is: "+aa1.call(50, 75));
       System.out.println("Addition is: "+aa2.call(35.26, 66.55));
       System.out.println("Addition of String is: "+aa3.call("Anjali", "Mahesh"));

    }
    
}
