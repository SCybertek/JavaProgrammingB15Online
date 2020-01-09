package day20;

public class SumOfOdd {
    public static void main(String[] args) {

        int sum = 0; // it is 0 because we dont have anything in here yet

        //for loop is good if you have exact number of itiration!!
        //here we have a beginning x=10 and end x=100
        //then we are using for


        for (int i = 10; i <= 100; i++) {

            if (i%2== 1) {
                sum = sum + i ;
                System.out.println(i);

            }

        }
        System.out.println(sum);
    }
}
