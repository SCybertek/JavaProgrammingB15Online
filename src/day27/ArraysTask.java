package day27;

public class ArraysTask {
    public static void main(String[] args) {


        //task 2: write a program that can find the minimum number from an int array
//        write a program that can find the minimum number for an array
//        DO NOT use sort method
//
//        write a program that can find the second minimum number for an array
//        DO NOT use sort method
//
//        write a program that can find the third minimum number for an array
//        DO NOT use sort method

        int[] score = {100, -99, -1000, 2000, 5000, 0, 1, 2000};
        int min = 999999999; // this number is picked juts to compare ,
        // whenever a number is smaller than this it will be replaces
        //we can also do:
        //              int min= score[0];


        for (int i = 0; i < score.length; i++) {
            if (min > score[i]) {
                min = score[i];
            }

        }

        System.out.println("min number: " + min);

        int secondMin = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] == min) {
                continue;
            }
            if (secondMin > score[i]) {
                secondMin = score[i];
            }

        }
        System.out.println("second minimum number is: " + secondMin);

        int thirdMin = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] == min || score[i] == secondMin) {
                continue;
            }
            if (thirdMin > score[i]) {
                thirdMin = score[i];
            }

        }

        System.out.println("third minimum number is: " + thirdMin);

    }
}


