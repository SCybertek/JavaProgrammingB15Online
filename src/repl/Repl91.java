package repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Repl91 {
    public static void main(String[] args) {

        /*
        Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'.
        The combinations should be displayed in descending alphabetical order:

zz
zy
zx
zw
zv
yz
....
vv
         */

        //letters : v,w,x,y,z
//        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('v', 'w', 'x', 'y', 'z') );
//
//        Iterator<Character> myIter = letters.iterator();
           // i dont think it is possible to iterate with this one in here
//        while (myIter.hasNext()) {
//            myIter.next().
//        }


        //code below prints: zz, zy, yy, yv .. etc
char [] letters = {'z', 'y', 'x', 'w', 'v'} ;
        for (int i = 0 ; i < letters.length ; i++) {
            for (int j = 0; j < letters.length ; j++) {
                System.out.println( "" + letters[i]+letters[j] );
            }

        }

        System.out.println("===============");
//
//        for (int i = letters.length - 1; i >= 0; i--) {
//            // should be [4][4] then [4][3] then [4][2]
//            System.out.println(letters[i]+""+letters[i-0]);
//            System.out.println(letters[i]+""+letters[i-1]);
//            System.out.println(letters[i]+""+letters[i-2]);
//            System.out.println(letters[i]+""+letters[i-3]);
//            System.out.println(letters[i]+""+letters[i-4]); //this line throws exception! ArrayIndexOutOfBoundsException
//        } // ???

        char [][] lettersB = { {'z','y','x','w','v'} , {'z','y','x','w','v'} }  ;
        //to loop them fori :
        for ( int x = 0 ; x < lettersB.length ; x ++) {
            for ( int y = 0 ; y < lettersB[x].length ; y++) {
                System.out.println(lettersB[x][y] + "" + lettersB[x][y]);
            }
        }

    }
}
