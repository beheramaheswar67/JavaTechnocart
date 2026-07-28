
interface X {
    Message getMessage(String message);    
}

class Message{
    Message(String msg){
        System.out.println("To day's Message is: "+msg);
    }
} 

public class Demo5 {
    public static void main(String[] args) {
        X aa = Message::new;
        aa.getMessage("I Love java technocart");    
    }
    
}
