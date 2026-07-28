@FunctionalInterface
interface X{
    void call();
}
public class Demo3 {
    public void display(){
            System.out.println("This is magic of non-static method referance");
        }
    public static void main(String[] args) {
        X ab = new Demo3()::display;   
        ab.call();
    }
    
}
