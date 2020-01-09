package thanksgivingTasks;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence with more than one word");
        String sentence = scan.nextLine();


        //first I know starting point of first word
        //need to find location / index of where first word ends
        //then need to find the location of last word starting point

        int firstSpace = sentence.indexOf(" ");
        int lastWordStart = sentence.lastIndexOf(" ");

        System.out.println("first and last words are : " +
                sentence.substring(0,firstSpace)+" "+ sentence.substring(lastWordStart+1));


        /*
        Ask user to enter sentence with more than 1 word
For example I love Java
write a program to
print first word and last word
         */



    }
}
