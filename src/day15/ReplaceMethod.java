package day15;

public class ReplaceMethod {
    public static void main(String[] args) {
        //replace method of the String
        String message = " I love Pumpkin , Pumpkin is FUN!";
        message.replace("Pumpkin", "Java");

        System.out.println(message); // it did not changed in my console! String is IMMUTABLE

        message = message.replace("Pumpkin", "Java");
        System.out.println(message); //now it will replace Pumpkin to Java! because we assigned a new value,
                                    // gave our message a new LEASH , REFERENCE , POINTER



        String message2 = "Happy Thanks Giving to All!!";
        //Happy Thanks Giving to All --> "Happy thanksgiving to All!!"
        message2 = message2.replace("Thanks Giving", "Thanksgiving");
        System.out.println(message2);

        message2 =message2.replace("!!","!");
        System.out.println(message2);

        //what if I want to remove every space?

        message2 = message2.replace(" ", "");
        System.out.println("message2 ="+message2);

        String message3 = "TOMORROW IS OFF NO!";
        //how do we remove NO!
        System.out.println(message3);

        message3 = message3.replace(" NO","");
        System.out.println(message3);
    }
}
