package repl;

import java.util.Scanner;

public class Repl103 {
    public static void main(String[] args) {


       // int i = 1;
        //int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String star = "*";
        for ( int i = 1 ; i <= n; i++ ) {

            System.out.println(star);
            star= star +"*";

        }

    }
}
