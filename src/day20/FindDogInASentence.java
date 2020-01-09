package day20;

public class FindDogInASentence {

    public static void main(String[] args) {

        //given the sentence, find out the location of the dog
        //our approach is
        //going through the sentence 3 character at a time
        //the if this 3 character happen to be A DOG
        //we print out the index

        /*
//      0123456789012345678901234567890123456789013245
        I like Dog , Dogs are cute , Dogs are friendly"
        I l
         li
        lik
        ike
        ke
         Do
         etc...

        I need to stop 2 before the last character
         */

        String msg = "I like Dog , Dogs are cute, Dogs are friendly";
        int lastCharIndex = msg.length()-1;
        for ( int x= 0 ; x <=lastCharIndex-2 ; x++){ // how we determine it is -2 or - 4 etc..
          //  String current

//IMPORT from GITHUB
        }

        System.out.println();
    }
}
