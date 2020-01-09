package day21;

public class OrderOfBreakContinue {
    public static void main(String[] args) {

        for (int x = 1; x <=10; x++) {

            //break; this will run 1 iteration (even without the printing part it goe sonce into the loop)
            continue;// continues should go at the very end of block!!
            //System.out.println("Hello"); //this syntax is after break , sompiler cannot read it!! unreachable
        }
        System.out.println("The End");
    }
}
