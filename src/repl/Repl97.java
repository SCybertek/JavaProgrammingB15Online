package repl;

import java.util.Scanner;

public class Repl97 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        //01234567890
        //javayupjava

        int count = 0;

        for ( int i = 0 ; i <=word.length()-4 ; i++ ) {
             String wordJava = word.substring(i, i + 4);
             if (wordJava.equalsIgnoreCase("java")) {
                 count= count+1;
            }

        }
        System.out.println(count);
    }
}
