package repl;

import java.util.Scanner;

public class Repl93 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
      //  boolean exists = false;
        if ( word.contains("java")) {
            String firstLetter = ""+ word.charAt(0);
            String secondLetter = "" + word.charAt(1);
            if (firstLetter.equalsIgnoreCase("j") || secondLetter.equalsIgnoreCase("j")){
                System.out.println(true);
            }
            System.out.println(false);
        } else { //this condition in here is to make sure that empty or single letter string or string with no java doe snot print empty line. it has to show : false
            System.out.println(false);
        }
//serdars solution:
//        boolean exists = false;
//
//
//        if (word.length()>=4) {
//            System.out.println(word.substring(0,5).contains("java"));
//        }
//        else {
//            System.out.println(exists);
//        }
//
//        //alisas solution:
//
//        String word = scan.next();
//        String word1 = word.substring(1);
//        if (word.startsWith("java")) {
//            System.out.println("true");
//        } else if (word1.startsWith("java")) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//    }
  }
}
