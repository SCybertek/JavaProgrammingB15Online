package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl138 {
    public static void main(String[] args) {
        // int array is given
        // print first 2 elements
        // if less than 2 elements print all array

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE


            if (num.length >= 2) {
                System.out.println("[" + num[0] + ", " + num[1] + "]");
            } else {
                System.out.println(Arrays.toString(num));
            }


        }
    }



