package day17;

import java.util.Scanner;

public class PrintNameWithOddIndexes {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your name please: ");

        String name = scan.nextLine();

        int x = 0 ;

        //starting from 0 until last index : x <= name.length ()-1)
        //starting from 0 until right before the count of characters : ( x < name.length())


        while ( x < name.length()){ // x <= name.length ()-1) both work because . read above
            if (x%2 ==1) {
                System.out.println(name.charAt(x)); /// gave numbers 1 3 5 7 9 (sofiya nur
            }
            ++x;

        }
    }
}
