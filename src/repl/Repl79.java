package repl;
import java.util.Scanner;
public class Repl79 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word:");
        String word = scan.next();

        //first check if word starts with x or X

        char startsWith = word.charAt(0);
        char endsWith = word.charAt(word.length() - 1);

        System.out.println(startsWith);
        System.out.println(endsWith);

        if ((startsWith == 'x' || startsWith == 'X') && (endsWith == 'x' || endsWith == 'X')) {
           // System.out.println("starts and ends with x or X");
            System.out.println(word.substring(1, word.length()-1));
            } else if (startsWith == 'x' || startsWith == 'X') {
                System.out.println (word.substring(1));
            } else if (endsWith == 'x' || endsWith == 'X') {
                System.out.println (word.substring(0, word.length()-1));
            } else {
                System.out.println(word);
        }
    }
}

        // 0123456 --- index and length is 7
        // xbingoX
// if ( startsWith ==
//   if (startsWith == 'x' || startsWith == 'X') && (endsWith == 'x' || endsWith == 'X')) {
 //         System.out.println(word.substring(word.charAt(1), word.charAt(word.length()-1)));
//
//


//            }
//
//        }


