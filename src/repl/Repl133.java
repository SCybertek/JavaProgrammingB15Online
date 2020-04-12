package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl133 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        //TODO: Write your code below.

        //Mehmet Bereket code : finding binary value of a decimal

        for (int index = binary.length-1; decimal > 0 ; index-- ) {
            binary[index] = decimal % 2;
            decimal = decimal / 2;
        }
        System.out.println(Arrays.toString(binary));
    }
}
