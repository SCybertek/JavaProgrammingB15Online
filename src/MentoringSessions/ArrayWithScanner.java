package MentoringSessions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write 5 numbers");
        int[] arr = new int[5];
//        System.out.println("Enter 1st number");
//        arr[0] = scan.nextInt();
//        System.out.println("Enter 2nd number");
//        arr[1] = scan.nextInt();
//        System.out.println("Enter 3rd number");
//        arr[2] = scan.nextInt();
//        System.out.println("Enter 4th number");
//        arr[3] = scan.nextInt();
//        System.out.println("Enter 5th number");
//        arr[4] = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {//i=0,1,2,3,4
            System.out.println("Enter a number");
            arr[i] = scan.nextInt();
        }
        //System.out.println("Your number list = " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Your number list = " + Arrays.toString(arr));

    }

}
