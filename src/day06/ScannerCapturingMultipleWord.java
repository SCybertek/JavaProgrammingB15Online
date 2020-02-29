package day06;
import java.util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {



        Scanner blabla = new Scanner (System.in);

        System.out.println("What is your name? ");

        //next method will capture whole line

        String name = blabla.nextLine();
        System.out.println("You have entered "+ name);

        //TASK: USe next line ask your bio
        //Whats your name
        //which city and state you live in
        //what is your street address

       /* System.out.println("Can you please tell me about yourself? (Your name, your address)");
        String bio = blabla.nextLine();
        System.out.println("You entered "+ bio);

        */

        System.out.println("Where do you live? including state ");
        String city = blabla.nextLine();
        System.out.println ("You have entered"+ city);


        System.out.println("what is your street address ?");
        String address = blabla.nextLine();
        System.out.println ("You have entered "+ address);

        System.out.println("You have entered:"+ name + city + address);










    }

}
