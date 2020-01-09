package day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {
        //                0123456789012345678901
        String message = "     REPL is COMING ! ";
        System.out.println(message);
        System.out.println("message character count is = " + message.length()); //-->22

        message = message.trim(); // this is a new reference or new leash or pointer .. previous message went to garbage
        System.out.println(message);

        //System.out.println( message.trim());
        System.out.println("message character count is = " + message.length());//-->16

        String message1 = "dance party";

        System.out.println(message1.isEmpty());
        System.out.println(message.substring(5,10));

       String concat = message.concat(message1+"bebebe");
        System.out.println(concat);

        System.out.println(message.replace('E','A'));
        System.out.println(message1.replace("ance","anzzz"));

    }
}
