package day30;

import java.util.Arrays;

public class SplitandDefineTheSize {
    public static void main(String[] args) {
        /*
        Split has two methods:
        first split by some separator and get whatever the count of the item we get from the result

        second version:
        accepts 2 external data
        1 is separator and 2 is limitation of your array size
        ex: if you have 5 words and split by space and give 2 size militation then
        result will be splitted --> first word , the rest of the sentence

         */
        
        String sentence = "I love Java Java Java";
        
        //String [] wordArray = sentence.split(" ");

        //String [] wordArray = sentence.split(" ", 1);
        // result : Arrays.toString(wordArray) = [I love Java Java Java]

        //String [] wordArray = sentence.split(" ", 2); // it limits the size of your Array!
        // limit is how many pieces you want
        //result : Arrays.toString(wordArray) = [I, love Java Java Java]

      //  String [] wordArray = sentence.split(" ", 3);
        //result : Arrays.toString(wordArray) = [I, love, Java Java Java]

       // String [] wordArray = sentence.split(" ", 4);
        //result : Arrays.toString(wordArray) = [I, love, Java, Java Java]

        String [] wordArray = sentence.split(" ", 6);

        //String [] wordArray = sentence.split(" ", 7);
        //result : Arrays.toString(wordArray) = [I, love, Java, Java, Java]
        //even if there is no 7 pieces it will only split only how many items you have
        //so result of splitting by 5 and by 25 will be the same!!!



        System.out.println("Arrays.toString(wordArray) = " + Arrays.toString(wordArray));

    }
}
