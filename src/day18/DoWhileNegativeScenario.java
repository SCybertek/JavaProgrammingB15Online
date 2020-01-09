package day18;

public class DoWhileNegativeScenario {
    public static void main(String[] args) {


        int x = 1000;

        do {
            System.out.println("Keep doing");

        } while (x<5) ;

        System.out.println("The End");

        // runs once and get out!

        while (x< 5) {
            System.out.println("Keep going in While");
        }
    }
}
