package repl;

import java.util.Scanner;

public class Repl33 {
    public static void main(StringMethodsPractice[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink: ");
        int milligrams = scan.nextInt();

        int gram = milligrams/1000;

        int lethalDose= gram *10;

        System.out.println("It would take about "+ lethalDose+" drinks for a lethal overdose.");

    }
}
