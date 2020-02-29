package day05;

import java.util.Scanner;

public class ScannerPracticeBoolean {
    public static void main(String[] args) {
        //creating scanner object
        Scanner input = new Scanner (System.in);

        //asking user are you recording
        System.out.println("Are you recording? ");
        boolean isRecording = input.nextBoolean();
        //the result of concatenating a string to any data type will result in -->String
System.out.println("We are recording "+ isRecording);



                /*
        System.out.println("Are you married? : (yes/no) ");
        boolean marritalStatus = scan.nextBoolean();
        System.out.println("Your marrital status is: "+ marritalStatus);
                 */


    }
}
