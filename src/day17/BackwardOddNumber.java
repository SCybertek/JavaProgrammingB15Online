package day17;

public class BackwardOddNumber {
    public static void main(String[] args) {
        int x = 100 ;

        while (x>0) {
            if (x%2 ==1) { // for odd number .same as (x%2 !=0)
                System.out.println(x + " odd number");
            }
            --x;
        }
    }
}
