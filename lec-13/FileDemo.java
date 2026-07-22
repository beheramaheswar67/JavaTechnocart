import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        FileWriter obj = null;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a line");
            String line = br.readLine();
            obj = new FileWriter("~/Mahesh Dev/JavaCode/JavaTechnocart/lec-13/aa.txt");
            obj.write(line);
        }catch(FileNotFoundException fe){
            System.out.println("file not found");
        }
        catch(IOException ie){
        }
        finally{
            try{
                obj.close();
            }catch(IOException ii){
                
            }
        }

    }
    
}
