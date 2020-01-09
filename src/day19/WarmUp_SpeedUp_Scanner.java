package day19;
import java.util.Scanner;
public class WarmUp_SpeedUp_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("What is your start speed? ");
        int start = scan.nextInt();
        System.out.println("What is your end speed?");
        int end = scan.nextInt();

        for ( int i = start; i<=end ; i++ ) {
            System.out.print("Your speed went like this: "+i);
        }




    }
}
