import java.util.*;

public class Demo {
    static String s = null;

    public static void main(String[] args) {
        while (true) {
            Optional<String> op = Optional.ofNullable(s);
            if(op.isPresent()){
                System.out.println("Length of the String is: "+s.length());
                System.out.println("Content of String is: "+s);
                break;
            }else{
                Scanner ss = new Scanner(System.in);
                System.out.println("Enter a String");
                s = ss.nextLine();
            }
            
        }
    }
    
}
