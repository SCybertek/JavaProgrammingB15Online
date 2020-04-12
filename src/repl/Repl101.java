package repl;

import java.util.Scanner;

public class Repl101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countJ = 0 ;
        int countP = 0 ;

        if (sentence.toLowerCase().contains("java") ) { //if(sentence.substring(i , i+4).equals("java")
            countJ++; // in here if a sentence has more than 1 java then it will still count as one. I added solution in comments in here
        } else if (sentence.toLowerCase().contains("python") ){ //else if(sentence.substring(i , i+6).equals("python")
            countP++;
        }
        if (countJ==countP){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        System.out.println("Solving by using an array");
        //this should be the solution. I think there is a problem in test number 2
        //to make it case sensitive :
        //.toLowerCase().contains("java");

        String [] splited = sentence.split(" ");
        for (String each : splited) {
            if (each.contains("java") ) {
                countJ++;
            } else if (each.contains("python")) {
                countP++;
            }
        }
        System.out.println(countJ==countP);
    }
}
