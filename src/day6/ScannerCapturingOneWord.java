package day6;
import java.util.Scanner;
public class ScannerCapturingOneWord {
    public static void main(String[] args) {
        Scanner blabla = new Scanner (System.in);

        System.out.println("What is your name? ");

        String name = blabla.next(); //will only capture first ONE word separated by space!
        //String anotherWord = blabla.next();
        int age = blabla.nextInt();

        System.out.println("You have entered "+ name);
       // System.out.println("Another word is "+ anotherWord);
        System.out.println("you have entered age "+ age);




    }
}
