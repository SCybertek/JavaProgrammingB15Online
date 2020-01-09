package repl;
import java.util.Scanner;
public class Repl66 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        // 2 words with 3 characters each
        //
        // aok
        // lol
        // 031425     012345
        // alookl     aoklol
        //ear
        //pie
        //031425     012345
        //epaire     earpie
        // program needs to merge in this sequense:
        //                                          first word (0) +secondword (0)+ firstword(1)+secondword(1) ..etc.

        int characterLength1 = word1.length();
        int characterLength2 = word2.length();

        if (characterLength1 ==3 && characterLength2==3){
            System.out.println(word1.charAt(0)+""+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2));


        } else {
            System.out.println("cannot merge");
        }


    }
}
