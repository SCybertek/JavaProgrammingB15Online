package day21;

public class BreakContinue {

    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {
            System.out.println(i);
            if (i==5){
                break;
            }
            continue;// this is pointless , because after each iteration it will
            //will be going to next iteration anyway
        }
    }
}
