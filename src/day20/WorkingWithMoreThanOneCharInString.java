package day20;

public class WorkingWithMoreThanOneCharInString {
    public static void main(String[] args) {
        // given a String with even number character count
        //print 2 character in one line

        //for example: Gokyuzum

        /*

        Go 01
        ky 23
        uz 45
        um 67

         */
//                       01234567
//        String name = "Gokyuzum";
//        int charCount = name.length();


//        System.out.println(name.substring(0,2));
//        System.out.println(name.substring(2,4));
//        System.out.println(name.substring(4,6));
//        System.out.println(name.substring(6,8));

//        int x = 0 ;
//
//        System.out.println(name.substring(x,x+2));
//        x= x+2;
//        System.out.println(name.substring(x,x+2));
//        x= x+2;
//        System.out.println(name.substring(x,x+2));
//        x= x+2;
//        System.out.println(name.substring(x,x+2));
//                     01234567 -- index 12345678 -- charCount or length
        String name = "Gokyuzum";
        int charCount = name.length();//8
        int lastCharIndex = charCount-1;//8-1= 7

        //my condition is x<=charCount -2

        //or we could say lastIndex -1

        for (int x = 0; x<=lastCharIndex-1 ; x +=2){ //x<=charCount-2 // jump by two
            System.out.println(name.substring(x,x+2));
        }







    }
}
