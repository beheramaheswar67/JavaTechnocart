import java .util.*;

public class EnumerationDemo{
      public static void main(String args[]){
      Vector v = new Vector();
      v.add("Java");
      v.add("Python");
      v.add(".Net");
      v.add("PHP");
      v.add("Scala");

System.out.println("/n See the element of Vectorobject.\n");

       Enumeration ee = v.elements();

      while(ee.hasMoreElements()){
      String language = (String)ee.nextElement();
      System.out.println(language);

             }

         }

}


