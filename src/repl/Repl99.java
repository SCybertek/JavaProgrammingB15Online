package repl;

import java.util.Scanner;

public class Repl99 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        int count = 0;
        String a = str.substring(0, 0 + n);

        for (int i = 0; i <= str.length() - n; i++) {
           // System.out.println(str.substring(i,i+n));
            if (a.equals(str.substring(i,i+n)))  {
                count+=1;

               // System.out.println("count increased by one");
                //System.out.println(count);
            }

        }

        System.out.println(count);

        if (count>1){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}




