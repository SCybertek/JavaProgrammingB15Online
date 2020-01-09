package repl;

import java.util.Scanner;

public class Repl87 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int dayCount = 0;
        if (inhabitants > 0) {
            while (inhabitants > 0) {

                System.out.println("Day " + dayCount + " [" + inhabitants + "]");
                inhabitants = inhabitants / 2;
                dayCount+=1;
                //inhabitants--;

            }
            System.out.println("----EXTINCT----");
        } else {
            System.out.println("inhabitants is 0");
            System.out.println("----EXTINCT----");
        }


    }
}
