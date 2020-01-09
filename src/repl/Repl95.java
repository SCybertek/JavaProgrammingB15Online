package repl;

import java.util.Scanner;

public class Repl95 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0); //A
        char end = scan.next().charAt(0); // C

        for ( char iChar = start; iChar <= end; iChar++ ) {
            System.out.print (iChar+"");
        }

    }
}
