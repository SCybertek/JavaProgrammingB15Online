package day23;

public class FindMinadnMax {
    public static void main(String[] args) {


        //find min and max number

        int[] num = {12, 34, 65, 43, 78, 89, 76};
        int minNumber = num[0];

        for (int i = 0; i <= num.length - 1; i++) {
            if (num[i] > minNumber) {
                System.out.println("greater number = " + num[i]);

            } else {
                System.out.println(minNumber);
            }

        }


        int maxNumber = num[0];

        for (int i = 0; i <= num.length - 1; i++) {


        }

    }
}