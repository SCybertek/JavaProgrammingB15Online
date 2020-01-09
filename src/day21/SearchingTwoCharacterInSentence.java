package day21;

public class SearchingTwoCharacterInSentence {

    public static void main(String[] args) {

        /*

            //TASK:
            //find out index of all the word AN in cases insensitive manner
            //I will go thorugh each and every letter of the String -->loop
            //While I am going through each and every character
                //I will check whether current character I am looking at
                    //each character I can use substring(0,2)
                    //going from 0 to one character before last character--- for loop
                //equals AN in case in sensitive ---->>currentCharacter.equalsIgnoreCase("an")
                //if it is I will print the index ---> println(the variable you use to keep the index)
                // if not --> just move on
            //perform this action until I reach one character before last character -->
            //because last chance to get 2 character is -- right before last character



         */

        String name = "Hasan Mammadov";

        int charCount = name.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        System.out.println("---2 chars----");

        //for (int x = 0; x < charCount-2 ; x++) {
        for (int x = 0; x <= lastCharIndex - 1; x++) {

            String current2Chars = name.substring(x, x + 2);

            if (current2Chars.equalsIgnoreCase("ma")) {

                System.out.println("The index of an is " + x);


            }
        }
    }
}