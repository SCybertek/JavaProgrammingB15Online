package repl;

public class Repl78 {
    public static void main(String[] args) {

       // String scan = new Scanner(System.in);
        String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
        String sender;
        String phoneNumber;
        String messageBody;

        sender = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        phoneNumber = message.substring(message.indexOf("[")+1, message.indexOf("]"));
        messageBody = message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("Sender: " + sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message body: " + messageBody);



    }
}
