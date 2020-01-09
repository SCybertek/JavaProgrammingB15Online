package repl;

public class StringMethodsPractice {
    public static void main(String[] args) {
        //  String name ="begli sofiya miles ";

        // System.out.println(name.x

        //given a string with even number
        //print two character at a time
        //     012345 --index , and 6 char count = length
        String name = "Sofiya";
//        System.out.println(name.substring(0,2));
//        System.out.println(name.substring(2,4));
//        System.out.println(name.substring(4,6));
//
//        int x =0;
//        System.out.println(name.substring(x,x+2));
//        x= x+2;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));
        int charCount = name.length();//6
        int lastCharIndex = charCount - 1;//5
// a <name.length()--6-- bunu kullandim as end point

//                      a<=4 bardeki -1 sebabi souttaki x,x+2 den dolayi
        for (int a = 0; a <= lastCharIndex - 1; a++) {
            System.out.println(name.substring(a, a + 2));
        }
        int num = -55;
        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        }

        //printing last letter of the String

        //  String word = "mama";

        //int lastLetter = word.length()-1;

        //System.out.println(word.charAt(lastLetter));

        //String current2Chars = name.substring(x, x + 2)
//                     012345
        String word = "apples";//

        int charCount1 = word.length();
        int middleLetterPosition = word.length() / 2 - 1; // 2


        //   int charInTheMiddle = word.charAt(word.length()/2);
        //  int lastCharIndex = charCount1-1;

        if (charCount1 == 1) {
            System.out.println(word + word + word);
        } else if (charCount1 % 2 == 1) {
            System.out.println(word.charAt(word.length() / 2));
        } else if (charCount1 == 2) {
            System.out.println(word + word);
        } else if (charCount1 % 2 == 0) {
            System.out.println(word.substring(middleLetterPosition, middleLetterPosition + 2));

        }



    }
}
