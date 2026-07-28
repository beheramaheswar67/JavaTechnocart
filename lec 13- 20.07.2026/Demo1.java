@FunctionalInterface

interface X{
    void call();

}

public class Demo1 {

    public static void display(){
        System.out.println("This is magic static method referance");
    }
    public static void main(String[] args) {
        X ab = Demo1::display;
        ab.call();
        
    }
    
}
