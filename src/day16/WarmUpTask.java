package day16;
import java.util.Scanner;
public class WarmUpTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        //wake up task 1:
        // given a word with 4 character . assign word 1 .. and assign in empty value to word2
        //change Java --> avaJ

        // last character - third caharcter - second character - first character
        //start getting character from last location till first location then save it

        System.out.println("Give me a word with 4 characters");
        String word1 = scan.next();
        String word2 ="";
        char firstLetter = word1.charAt(0);
        char secondLetter = word1.charAt(1);
        char thirdLetter = word1.charAt(2);
        char lastLetter = word1.charAt(3);

       // String word2 = word1.replace(firstLetter,lastLetter);
        //System.out.println(word2);

        //start getting character from last location till first colation then save it

        // word2 = " "+ lastLetter+thirdLetter+secondLetter+firstLetter;
       // word2 = word2+lastLetter+thirdLetter+secondLetter+firstLetter;
       // word2+= word2+lastLetter+thirdLetter+secondLetter+firstLetter;

       // word2+= word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0); //---> Java ; word2:418 because it does not have ""

        word2+= word1.charAt(3)+""+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        System.out.println("word2 = "+ word2);


       String msg = "Hello ";
       msg= msg+"World";
       msg += "World";

        System.out.println("msg = "+ msg);



    }
}
