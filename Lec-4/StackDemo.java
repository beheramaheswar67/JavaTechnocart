import java.util.*;
public class StackDemo{
      public static void main(String args[]){
      Stack ss=new Stack();
      ss.push("First");
      ss.push("Second");
      ss.push("Third");
      ss.push("Forth");
      ss.push("Fifth");
      ss.push("Six");
      System.out.println("Position First is: "+ss.search("First"));
      System.out.println("Position Six is: "+ss.search("Six"));
      System.out.println("Size is: "+ss.size());
      ss.pop();
      System.out.println(ss);
      }

}
