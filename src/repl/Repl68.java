package repl;

import java.util.Scanner;

public class Repl68 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE

        boolean containsWord = sentence.contains(word);

//           if (containsWord==true){
//            System.out.println(containsWord);
//        } else {
//               System.out.println(containsWord);
//
//           }
        System.out.println(containsWord);
    }
}
