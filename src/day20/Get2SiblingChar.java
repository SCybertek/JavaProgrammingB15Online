package day20;

public class Get2SiblingChar {

    public static void main(String[] args) {

        //given a String with even number character count
        //print 2 characters in one Line as below example
//                0123
       // example Arya
        /*
        Ay
        yr
        ra
         */
        String name = "Ayra";

        //if you dont put lastCharIndex -1 : but only ;astCharIndex:
        System.out.println(name.substring(2,4));
        System.out.println(name.substring(3,5)); //THERE is no 4 .OUT oF BOUND

//        System.out.println(name.substring(0,2));
//        System.out.println(name.substring(1,3));
//        System.out.println(name.substring(2,4));
//
//        int x = 0;
//        System.out.println(name.substring(x,x+2));
//        x+=2;
//        System.out.println(name.substring(x, x+2));

        int charCount = name.length();
        int lastCharIndex = charCount-1;

        for (int x=0; x<=lastCharIndex-1 ; x++) { //jump by one
            System.out.println(name.substring(x, x + 2));
        }
// for 3 characters
        //     0123
        // ex: Ayra
        /*
        Ayr
         */

        //this is for dog repl

    }
}
