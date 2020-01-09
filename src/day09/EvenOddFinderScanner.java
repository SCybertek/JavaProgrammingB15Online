package day09;
import java.util.Scanner;

public class EvenOddFinderScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number");

        int number = scan.nextInt();

        if (number%2==0) {
            System.out.println( "Number is even!");

        }else {
            System.out.println("Your number is odd");
        }

        System.out.println("THE END");

    }


    }

