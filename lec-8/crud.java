import java.util.*;
import java.io.*;

class Student{
        int roll;
        String name;
        double fees;

        @Override
        public String toString(){
            return "Name is: "+name+" Roll: "+roll+" Fees: "+fees;
        }
    }

public class crud {
    static ArrayList aa = new ArrayList();

        public static void addStudent()throws IOException {
            Student ss = new Student();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the Roll Number: ");
            ss.roll = Integer.parseInt(br.readLine());
            System.out.println("Enter Student Name: ");
            ss.name = br.readLine();
            System.out.println("Enter Fees: ");
            ss.fees = Double.parseDouble(br.readLine());

            aa.add(ss);
        }
    
    public static void remove()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the Student whome u want to delete: ");
        String s1 = br.readLine();
        for(int i = 0; i<aa.size(); i++){
            Student ss = (Student)aa.get(i);
            if(s1.equals(ss.name)){
                System.out.println("This data is removed");
                aa.remove(ss);
            }
        }
    }

    public static void retrive(){
        for(int i = 0; i<aa.size(); i++){
            Student ss = (Student)aa.get(i);
            System.out.println(ss);
        }
    }

    public static void update()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Student whom you want to update ?: ");
        String s1 = br.readLine();
        System.out.println("Enter the new Name: ");
        String s2 = br.readLine();
        for(int i=0; i<aa.size(); i++){
            Student ss = (Student)aa.get(i);
            if(ss.name.equals(s1)){
                ss.name=s2;
                System.out.println("name is updated: ");
                System.out.println(ss);
            }
        }
    }

    public static void main(String[] args)throws IOException {
        while (true) {
            System.out.println("See the element");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the choice: ");
            System.out.println("1>For Add Student");
            System.out.println("2>For Remove Student");
            System.out.println("3>Retrive Student");
            System.out.println("4>Update Student");
            System.out.println("0>For Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    remove();
                    break;

                case 3:
                    retrive();
                    break;

                case 4:
                    update();
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Invalid Input");
                    break;
            }

            
        }
    }
}
    

