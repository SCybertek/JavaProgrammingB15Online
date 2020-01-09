package day21;

public class WakeUpTask1_NamePrinter {
    public static void main(String[] args) {

        //given your name stored in variable myName String
        //loop through each and every char print them like this:
        //M-.y- n-a-m-e...
        //put arrow in between the character
        //use substring
        //               01234567890123456789012345
        String myName = "My name is Sofiya Nuryyeva";
        // int x = 0;
        //System.out.println(myName.charAt(x));
        // x = x + 1;
        //M
        //y
        //
        //n

        // Hello
        //int x =0
      //  System.out.println(a,a+1);
        //we keep looping if :
        //if the x value is less than or equal to 4  , x<=4 (last char index)
        //if the x value is less than 5, x<5 ; (char count)


        int charCount = myName.length(); //26
        int lastCharIndex = charCount-1; // 25

        for (int i = 0; i < charCount; i++) { // int x= 0 ; x<=lastCharIndex ; x++ //akbar way of doing
            // System.out.print(myName.charAt(i)+"->");
            System.out.print(myName.substring(i, i + 1) + "->");}

            //print the sentence by 2 char at a time just incrementing by 1;

            System.out.println("-----------------------");

         for (int j = 0;j<=lastCharIndex-1 ; j++) { //j < charCount - 1
            System.out.print(myName.substring(j, j + 2) + "->");
            }

            //print the sentence by 3 character at a time
            System.out.println("-----------------------");

            for (int m = 0; m < charCount - 2; m++) {//m<=lastCharIndex-
                String threeChar = myName.substring(m,m+3);
                System.out.print( threeChar+"->");
            }
/*
  System.out.println("------");
        System.out.println("---2 chars ---");
        for (int x = 0; x <= lastCharIndex - 1; x++) {
            //for (int x = 0; x < charCount-2 ; x++) {

            String twoChar = myName.substring(x, x + 2);
            System.out.print(twoChar + "->");

        }
        System.out.println("------");
        System.out.println("---3 chars ---");
        for (int x = 0; x <= lastCharIndex - 2; x++) {
            //for (int x = 0; x < charCount-3 ; x++) {

            String threeChar = myName.substring(x, x + 3);
            System.out.print(threeChar + "->");
 */

        }
    }


