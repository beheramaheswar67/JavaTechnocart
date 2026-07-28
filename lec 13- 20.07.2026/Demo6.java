
public class Demo6 {
    static class Text{
        Text(){
            System.out.println("Object is constructed");
        }
    }
    public static void main(String[] args) {
        Runnable rr = Text::new;
        Thread t1 = new Thread(rr);
        t1.start();
    }
    
}
