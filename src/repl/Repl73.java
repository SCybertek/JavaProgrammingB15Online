package repl;

import java.util.Scanner;

public class Repl73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        //first determine charCount
        //second print using charAt

        int charCount = word.length();

        if (charCount % 2 == 1 && charCount >= 5) {
            System.out.println(word.charAt(charCount / 2 - 1) +
                    "" + word.charAt(charCount / 2) + word.charAt(charCount / 2 + 1));
        } else {
            System.out.println("invalid");
        }
    }
}
