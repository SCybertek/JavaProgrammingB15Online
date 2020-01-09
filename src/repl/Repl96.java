package repl;

import java.util.Scanner;

public class Repl96 {
    public static void main(String[] args) {
        /**
         * input: Word
         * input: X
         * input: 3
         * output: WordXWordXWord
         */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        for (int i = 1; i <=count; i++) {
            if (i != count) {
            System.out.print(word+separator);}
            else {
                System.out.println(word);
            }
        }
    }
}
