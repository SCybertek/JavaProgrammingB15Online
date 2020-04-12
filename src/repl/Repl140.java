package repl;


import java.util.Arrays;

public class Repl140 {
    public static void main(String[] args) {


        // String array of words is given
        // iterate through each word and print fist and last letter of each element

        String [] words = { "hello", "why", "by", "apple" , "note" } ;

        // LOGIC:
        // use for loop and use charAt
//        int i = 0 ;
//        for (String each: words) {
//            words [i] = each.charAt(0) +"" + each.charAt(each.length()-1);
//            i++;
//        }
//        System.out.println(words);

        //for loop


        for (int i = 0; i < words.length; i++) {
           words[i] = "" + words[i].charAt(0) + words[i].charAt(words[i].length()-1);
            //adding "" to make it a string
        }
        System.out.println(Arrays.toString(words) );




    }
}
