package repl;

import java.util.Scanner;

public class Repl135 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String [] eachWord = sentence.split(" ");
        for ( String word : eachWord) {
            System.out.println(word);
        }
    }
}
