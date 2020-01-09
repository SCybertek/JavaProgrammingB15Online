package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl106 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

//
//

        // logic:
        //create an array of vowels
        // create a loop that will check each and every letter in a word and compare if it
        // if a word corresponds to any in the aray
        // if yes then print if not , dont

        char[] vowels = {'a', 'o', 'e', 'i', 'u'};
         String everyLetter= "";

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == vowels[0] || word.charAt(i) == vowels[1] ||
                    word.charAt(i) == vowels[2] || word.charAt(i) == vowels[3] ||
                    word.charAt(i) == vowels[4]) {

                    everyLetter+=""+word.charAt(i);
            }
        } System.out.print(everyLetter);

//            }
//            if (word.charAt(everyLetter)== vowels[1]) {
//                System.out.print(word.charAt(everyLetter));
//            }
//            if (word.charAt(everyLetter)== vowels[2]) {
//                System.out.print(word.charAt(everyLetter));
//            }
//            if (word.charAt(everyLetter)== vowels[3]) {
//                System.out.print(word.charAt(everyLetter));
//            }
//            if (word.charAt(everyLetter)== vowels[4]) {
//                System.out.print(word.charAt(everyLetter));
//            }

        }


/** : this is skinni code I copied from Ilhan demirhan
 String vowels = "";
 for (char x : word.toCharArray()) {
 if ("aeiouAEIOU".indexOf(x) >= 0) {
 vowels += x + "";
 }
 }
 System.out.println(vowels);
 */


    }

