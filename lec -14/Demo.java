
public class Demo {
    public static void main(String[] args) {
        call();
        call(10,20);
        call(10,76,87,34);
        call(87,99,88,89,100);
    }
    public static void call(int...x){
        int sum = 0;
        for(int a: x){
            sum+=a;
        }
        System.out.println("Sum of argument is : "+x.length);
    }
    
}
