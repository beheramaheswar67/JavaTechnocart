import java.util.*;
import java.io.*;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("abc.properties");
        Properties pp = new Properties();
        pp.load(fis);
        String name = pp.getProperty("username");
        String password = pp.getProperty("password");
        System.out.println("User Name is: "+name+" Password is: "+password);
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter new name: ");
        String s1 = dis.readLine();
        System.out.println("Enter new Password: ");
        String s2 = dis.readLine();
        pp.setProperty("username", s1);
        pp.setProperty("password", s2);
        FileOutputStream fos = new FileOutputStream("abc.properties");
        pp.store(fos, "username and password is changed.");
    }
    
}
