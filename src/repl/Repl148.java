package repl;

import java.util.Scanner;

public class Repl148 {
    public static void main(String[] args) {
        cube();
    }

    public static void cube()
    {

        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();
        int cube = num * num * num ;
        System.out.println(cube);
        //your code here
    }//end cube
}
