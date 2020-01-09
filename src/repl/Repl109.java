package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl109 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 5 items
        //write your code below

        //logic :
        //System.out.println(arr[0].substring(0,3));

        for (String i : arr) {
            System.out.println(i.substring(0,3));
        }




        //System.out.println (Arrays.toString(arr));

    }
}
