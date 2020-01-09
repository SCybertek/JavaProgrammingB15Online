package repl;

import java.util.Scanner;

public class Repl92 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long m = 1;

        while (n > 1){
            m = m * n ;
            n--;
        }
        System.out.println(m);




    }
}
