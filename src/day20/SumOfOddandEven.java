package day20;

public class SumOfOddandEven {
    public static void main(String[] args) {

        // it is 0 because we dont have anything in here yet
        //create variable SumOfOdd and SumOfEven as int loop through 10 -100
        //add odd number to generate sumofOdd
        //add even number to generate SumofEven



        //for loop is good if you have exact number of itiration!!
        //here we have a beginning x=10 and end x=100
        //then we are using for

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 10; i <= 100; i++) {

            if (i%2== 0) {
                sumOfEven = sumOfEven + i ;
                System.out.println(i);

            } else {
                sumOfOdd = sumOfOdd +i;
                System.out.println(i);
            }

        }
        System.out.println("sumOfEven = " + sumOfEven);
        System.out.println("sumOfOdd = " + sumOfOdd);
    }
}
