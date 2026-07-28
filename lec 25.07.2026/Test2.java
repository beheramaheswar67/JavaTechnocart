import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Student{

        String name;
        int marks;

        Student(String name, int marks){
            this.name = name;
            this.marks = marks;
        }

        public String toString(){
            return "Student Name: "+name+" Student Mark: "+marks;
        }
    }

public class Test2 {

    public static void main(String[] args) {

        List<Student> list=Arrays.asList(
            new Student("Mahesh",750),
            new Student("Anjali",650),
            new Student("Sumit",550),
            new Student("Sanket",450),
            new Student("Ranjan",650),
            new Student("Bharat",698),
            new Student("Rahul",547),
            new Student("Sanjay",658));

            List<Student> marks = list.stream().filter(s -> s.marks>500).collect(Collectors.toList());
            System.out.println("All Psssed Student are: "+marks);

            List<Student> topper = list.stream().filter(t -> t.marks<600).collect(Collectors.toList());
            System.out.println("Topper Student are: "+topper);
    }
    
}
