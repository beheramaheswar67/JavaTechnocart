import java.util.*;
import java.io.*;

class Student{
    int roll;
    String name;
    double fee;

    @Override
    public String toString(){
        return "Name: "+name+" Roll: "+roll+" Fee: "+fee;
    }
}
public class HashMapCRUD {

    static HashMap aa = new HashMap();

    public static void addObject()throws IOException{
        Student ss = new Student();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter roll number: ");
        ss.roll=Integer.parseInt(br.readLine());
        System.out.println("Enter your name: ");
        ss.name=br.readLine();
        System.out.println("Enter yor Fee: ");
        ss.fee=Double.parseDouble(br.readLine());
        System.out.println("Enter a String for Key: ");
        String key = br.readLine();
        aa.put(key,ss);
    }

    public static void remove()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of student whome you want to delete: ");
        String s1 = br.readLine();
        Set hh = aa.keySet();

        Iterator ii = hh.iterator();
        while ((ii.hasNext())) {
            String key = (String) ii.next();
            Student value = (Student) aa.get(key);
            if(value.name.equals(s1)){
                aa.remove(key);
                System.out.println("Data is removed..");

            }
        }

    }

    public static void retrive(){
        Set hh = aa.keySet();
        Iterator ii = hh.iterator();
        while (ii.hasNext()) {
            String key = (String) ii.next();
            Student value = (Student) aa.get(key);
            System.out.println(value);
            System.out.println(" ");
        }
    }

    public static void update()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the Student you want to Update: ");
        String s1 = br.readLine();
        System.out.println("Enter New Name..");
        String s2 = br.readLine();
        Set hh = aa.keySet();
        Iterator ii = hh.iterator();
        while (ii.hasNext()) {
            String key = (String)ii.next();
            Student value = (Student)aa.get(key);
            if(value.name.equals(s1)){
                value.name = s2;
                System.out.println("Student Updated..");
            }
        }

    }

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("!!!---Welcome To HashMap CRUD Application---!!!");
            System.out.println(" ");
            System.out.println("-----------------------------------------------------");
            System.out.println(" ");
            System.out.println("1> Add an Object");
            System.out.println("2> Remove the Object");
            System.out.println("3> Update the Object");
            System.out.println("4> Retrive the data");
            System.out.println("5>Quit");
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                     addObject();
                    break;

                case 2:
                     remove();
                    break;

                case 3:
                     update();
                    break;

                case 4:
                    retrive();
                    break;

                case 5:
                    System.out.println("Thank you for using my Application.....");
                    System.exit(0);

                default:
                    System.out.println("!!!!Invalid Choice.!!!!");
                    break;
            }
            
        }
        
    }
    
}
