package day21;

public class CountingThreeCharactersInSentence {
    public static void main(String[] args) {

        // Find out how many LIA in the word an in cases insensitive manner
        // I will go through each and every letter of the String  by 2 chars  '
        //                  --->> each character i can use substring(0,3) and so on
        //                  --->> going to 0 to 2 character before last char index  --->>> for loop

        // while i am going through each and every 3 character
        // i will check whether current string i am looking at
        //  equals to <lia> in case insensitive     --->>>  currentCharacter.equalsIngnoreCase("lia")
        // if it is  I will print the index     println ( the variable you use to keep the index )
        //  if not  -->> just move on
        // perform this action until I reach one character before last character
        //  because last chance to get 3 characters is -->> two character before last character


        String myName = "Amelia Israfil Hajitev mehmet Hajitev Amelia Behlia Ashr lia";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        int counter = 0;

        System.out.println("---3 chars ---");
        for (int x = 0; x < charCount-3 ; x++) {
       // for (int x = 0; x <= lastCharIndex - 2; x++) {

            // saving the current 3 characters
            String current3Chars = myName.substring(x, x + 3);

            if (current3Chars.equalsIgnoreCase("lia")) {
                System.out.println("The index of Lia is "+ x);
                counter+=1;
//                counter ++;
//                counter = counter+1;



            }
        }


        System.out.println("Final count is : "+ counter); // we print it outside the FOR loop because you declare a final count after you counted after
        // you dont declare counter in every iteration in the loop
    }
}
