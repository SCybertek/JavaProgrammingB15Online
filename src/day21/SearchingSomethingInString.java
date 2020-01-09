package day21;

public class SearchingSomethingInString {
    public static void main(String[] args) {

        //NO MAGIC IN THE LOOP!!!!!
                    // 0123456789
        String name = "Daria Ozer";

        int charCount = name.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount-1;
        System.out.println("lastCharIndex = " + lastCharIndex);




            //TASK:
            //find out index of all the letter a in cases insensitive manner
            //I will go thorugh each and every letter of the String -->loop
            //While I am going through each and every character
                //I will check whether current character I am looking at
                    //each character I can use substring(0,1)
                    //going from 0 to last index--- for loop
                //equals a or A ---->>currentCharacter.equalsIgnoreCase("a")
                //if it is I will print the index ---> println(the variable you use to keep the index)
                // if not --> just move on
            //perform this action until I reach last character --> if I go over the last charachter index I stop!!! (Where to end)


        System.out.println("---1-----");
        //for (int x=0; x<charCount ; x++){
        for (int i = 0; i <=lastCharIndex ; i++) {

            String currentChar = (name.substring(i,i+1));
            //we store currentChar in String thats why we can use it in equalIgnoreCase!!
            //String is action

            if (currentChar.equalsIgnoreCase("a")) {
                System.out.println("The index of a or A is: "+ i );
            }

        }

    }
}
