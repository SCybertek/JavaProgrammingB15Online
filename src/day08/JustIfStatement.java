package day08;
import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your current speed, dear driver: ");

        int currentSpeed = scan.nextInt();

        System.out.println( "What is speed limit? ");
        int speedLimit =scan.nextInt();



        if (currentSpeed>= speedLimit) {
            System.out.println("Get pulled over by police");
            System.out.println("Get a ticket!");

    }
        //there is no ELSE
    System.out.println("Move on!");
}}

