package repl;

public class Repl137and138 {
    public static void main(String[] args) {


        //reverse print string
        // each word should be printed in reversed order in different line
        // LOGIC:
        // to reverse sentence we have to divide String by space and create a String array
        // then we have to use for loop to print every word in reversed order

        String sentence = "Java is fun" ;
        // to divide String to String Array : use split
        String [] arrSentence = sentence.split(" ");

        for (int i = arrSentence.length-1; i >= 0 ; i--) {
            System.out.println(arrSentence[i]);

        }


        String sentence1 = "I love Java";
        // get each word out of this sentence and assigne in reversed order to a new String
        // LOGIC:
        // first we split and create array
        // loop and add each in nee String ? ()

        String reversed = "";

        String [] arrSplit = sentence1.split(" ");

        for (int i = arrSplit.length-1; i >= 0 ; i--) {

            if (i != 0) {
                reversed += arrSplit[i] + " ";
            } else {
                reversed+=arrSplit[i];
            }
        }

            System.out.println("reversed = " + reversed);


    }
}
