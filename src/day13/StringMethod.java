package day13;

public class StringMethod {
    public static void main(String[] args) {
        //String actions that we already know
        //equal
        String s1 ="hello";
        // s1 is remote
        //hello is TV
        //everything that is not primitive are object

        System.out.println(s1.equals("ABC"));
        //equasIgnoreCase
        System.out.println(s1.equalsIgnoreCase("HELLO"));

        //toUpperCase method of String makes to all String character uppercase
        System.out.println(   s1  );
        System.out.println( s1.toUpperCase()    );

        //method always comes with () either with paranthesis or without .
        // method is to give object some action .LIKE horse is an object and RUNNING is ACTION
        //no need to extra information.external data thats why () are empty in this case

        //toLowerCase method of String is used to make String all characters lowercase
        System.out.println(  s1.toLowerCase());

        //store your name into a variable
        //print your name in all uppercase:
        //you may optionally concatenate: "MY NAME IS : YOURNAME"
        // print your name in all lowercase"
        //my name is: yourname

        String myName = "sofiya nuryyeva";
        System.out.println("MY UPPER CASE NAME : "+ myName.toUpperCase());
        System.out.println("my lowercase name: " +myName.toLowerCase());

        // in order to get how many character we have inside String
        //we can use length method of String
        System.out.println(   s1.length());
        System.out.println(myName.length());
        // length CARES about space !!

        int lengthOfStr = s1.length();

        if (lengthOfStr>4){
            System.out.println("More than 4 character");
        } else {
            System.out.println("Not more than 4");
        }


    }
}
