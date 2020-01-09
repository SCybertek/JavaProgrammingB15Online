package repl;

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
        char[] letters = {'v', 'w', 'x', 'y', 'z'};

//        System.out.println(letters[4] + "" + letters[4]);
//        System.out.println((letters[4] + "" + letters[4 - 1]));

        //code below prints: zz, zy, yy, yv .. etc

        for (int i = letters.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.println(letters[i] + "" + letters[i]);
                System.out.println(letters[i] + "" + letters[i - 1]);
            } else {
                System.out.println(letters[i]+""+letters[i]);
            }
        }

        System.out.println("===============");

        for (int i = letters.length - 1; i >= 0; i--) {
            // should be [4][4] then [4][3] then [4][2]
            System.out.println(letters[i]+""+letters[i-0]);
            System.out.println(letters[i]+""+letters[i-1]);
            System.out.println(letters[i]+""+letters[i-2]);
            System.out.println(letters[i]+""+letters[i-3]);
            System.out.println(letters[i]+""+letters[i-4]);
        } // ???
    }
}
