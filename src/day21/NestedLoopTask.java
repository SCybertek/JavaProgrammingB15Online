package day21;

public class NestedLoopTask {
    public static void main(String[] args) {

        //count from 1 to 10 --> print only odd numbers
        //repeat this 4 times

//        for (int i = 0; i <= 10; i++) {
//            if (i % 2 == 1) {
//                System.out.println("this is odd number" + i);
//            }
//
//        }
//
//        for (int i = 0; i <= 10; i++) {
//            if (i % 2 == 1) {
//                System.out.println("this is odd number" + i);
//            }
//        }
//
//            for (int i = 0; i <= 10; i++) {
//                if (i % 2 == 1) {
//                    System.out.println("this is odd number" + i);
//                }


        for (int m = 1; m <= 4; m++) {
            System.out.println("This is " + m + " iteration ");

            for (int i = 0; i <= 10; i++) {

                if (i % 2 == 0) {
                    continue;
                }
                System.out.println(i);

            }
        }
    }  }

