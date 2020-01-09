package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl126 {
    public static void main(String[] args) {
        //
       // Write a program that will find out shortest words in the given string str.
        // If there are few words that are evenly short, print them all.
        // Use split method in order to split str string variable and create an array of strings.
        // Print array with Arrays.toString() method. Sort array before printing.

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String [] words = str.split(", ");


        String shortestWord = words[0];
        String newStr = "";

        for (int i = 0; i < words.length; i++) {

            if (shortestWord.length() > words[i].length()) {
                shortestWord = words[i];
                //System.out.println(shortestWord);
            }
        }
       // System.out.println(shortestWord);
        //if there are evenly shortest words we will find out with another for each loop
        // and store in a string

         for (String each : words) {
             if (each.length()==shortestWord.length()){
               newStr += each + " " ;
           }
            // I dont get how to save all string together ?

        }

       // System.out.println(newStr);
         // we will create an array by using split method that contains newString words
        //then sort then print

        String [] arrayNewString = newStr.split(" ");
        Arrays.sort(arrayNewString);

        System.out.println(Arrays.toString(arrayNewString));




    }
}
