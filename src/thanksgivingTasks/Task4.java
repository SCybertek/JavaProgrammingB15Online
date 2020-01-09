package thanksgivingTasks;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Ask user to enter a word with at least 3 characters
print the first character
print the last character
print the middle character
for example : Uighur
first character : U
last character  : r
middle character: g
(if the length is even number get the one on the left)
         */
        System.out.println("enter a word with at least 3 characters:");
        String enteredWord = scan.next();
        int characterCount = enteredWord.length();
        System.out.println(characterCount);

        char firstCharacter = enteredWord.charAt(0);
        System.out.println("First character is :"+ firstCharacter);

        int middleCharNum = characterCount/2;
        if (characterCount/2==0){
          //  System.out.println("Middle character is : " + middleCharNum);
        } else {
         //   System.out.println("Middle character is : " + (middleCharNum+1));
        }

        int lastCharIndex = characterCount - 1;
        char lastCharacter = enteredWord.charAt(lastCharIndex);
        System.out.println("Last character is :" + lastCharacter);



    }
}
