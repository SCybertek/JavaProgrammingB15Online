package day19;
import java.util.Scanner;

public class WarmUp_SpeedUp_SlowDown {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("What is your start speed? ");
        int start = scan.nextInt();
        System.out.println("What is your end speed?");
        int end = scan.nextInt();

        if (start<end) {

            System.out.print("Increasing the speed: ");
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");

            }
        } else if ( start> end) {

            System.out.print("Decreasing the speed: ");

            for (int x = start; x >= end; x--)  {
                System.out.print(x + ", ");
            }

        } else{
            System.out.print(" NO change in speed");


        }




    }
}
