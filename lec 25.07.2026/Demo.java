import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Student{
    String name;
    Student(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}

public class Demo {
    public static void main(String[] args) {
        
        List<String> name = List.of("Amit","Ankit","Raj","Dev","Sagar","Vinit","Vivek","Deepak");
        List<String> case1 = name.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(name);
        System.out.println(case1);

        List<Integer> size = name.stream().map(String::length).collect(Collectors.toList());
        System.out.println(size);

        List<Student> student = name.stream().map(Student::new).collect((Collectors.toList()));
        System.out.println(student);

        List<String> st = name.stream().map(e -> e.toLowerCase()).collect(Collectors.toList());
        System.out.println(st);

        List<String> n = st.stream().map(e -> e.toLowerCase()).collect(Collectors.toList());
        System.out.println("New: "+n);
       
        
    }
    
}
