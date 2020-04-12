package repl;

public class Repl209and210 {
//a method that cleans any non number string from a string it gets
//and returns the clean string
//input:
//-s (string)- a string the method gets
//return: string: a string of numbers only

    public static String extractNum (String s) {
//        parseInt : returns integare
//        valueOf : returns Integer object
        String numbers = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) ){
                numbers+= s.charAt(i);
            }
        }
        return numbers;


    }


    //Repl210 :

    public static String reverseLetters(String word){
        //TODO
        //Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
        // reverse the string in a way that special characters are not affected.
        //example : ba23ll. --- ll23ab.
        //in here  b - index 0 is becoming index 5 and etc.

        String reversedWord = "";

        int i = word.length() - 1;

        if (Character.isLetter(word.charAt(i)) ) {

            for (int j = word.length() - 1; j == 0; j--) {
                if (Character.isLetter(word.charAt(i))) {

                    reversedWord += word.charAt(j);

                }



                //  i--;
            }

        }




               //  i = word.charAt(i);

        return reversedWord;
        //String output = "";
        //   for (int i=0, k=word.length()-1; i<word.length(); i++) {
        //        if (Character.isLetter(word.charAt(i))) {
        //            while (!Character.isLetter(word.charAt(k))) {
        //                 k--;
        //            }
        //            output += word.charAt(k);
        //            k--;
        //      } else {
        //            output += word.charAt(i);
        //        }
        //   }
        //    return output;
        //}
    }

    public static void main(String[] args) {
        System.out.println(reverseLetters("ball$"));


       // System.out.println(result.equals("..dvcx..z")); //true
    }
}
