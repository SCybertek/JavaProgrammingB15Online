package repl;

import java.util.Scanner;

public class Repl153 {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {

        //your code here

        String [] splittedS = info.split(",");
        System.out.println( "person name: " + splittedS[0] + " last name: " + splittedS[1] + " age: " + splittedS[2]);


    }//end person

}

