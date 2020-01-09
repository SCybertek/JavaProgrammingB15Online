package repl;

import java.util.Scanner;

public class Repl125 {
    public static void main(String[] args) {
        //primt the shortest word
        Scanner scan = new Scanner( System.in);

        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        String shortest = str[0];

        for (int i = 0; i < str.length; i++) {

            if (shortest.length() > str[i].length()) { // here it has to be shortest.lenght because if we put str[0] it will alywas compare with first input
               shortest = str[i]; }

        }
        System.out.println(shortest);

    }
}
