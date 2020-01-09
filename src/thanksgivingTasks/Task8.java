package thanksgivingTasks;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Ask user to enter a sentence
Assuming the sentence has at least 2 words
also assuming there is single space between words
-->
first trim empty spaces in two sides
then
check if the first index of space
is equal to last index of the space
if so print you have entered two words
else print you have more than 2 words
For example :
Jon Snow -->>
first index of the space is 3
last index of the space is also 3
this means there is only 2 words
King in the North -->>
first index of the space is 4
last index of the space is also 11
this means there is more than 2 words
         */

        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();
        String trimmedSentenced = sentence.trim();

        int firstSpace = trimmedSentenced.indexOf(" ");

        int lastSpace = trimmedSentenced.lastIndexOf(" ");

        if (firstSpace == lastSpace) {
            System.out.println("there are only two words");
        } else {
            System.out.println("there are more than two words");
        }


    }
}
