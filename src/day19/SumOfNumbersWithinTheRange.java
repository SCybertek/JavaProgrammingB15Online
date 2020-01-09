package day19;

public class SumOfNumbersWithinTheRange {
    public static void main(String[] args) {
        // get the sum of numbers 1 - 10
        // when we loop from 1 to 10

         int sum = 0; //before we add any number this is our sum


//        sum = sum +1 ; // 1
//        sum = sum +2 ; // 3
//        sum = sum +3 ; //6
//        sum = sum +4 ; //10
//        sum = sum +5 ; //15

        // --- > sum = sum + i ;

        for (int i = 1; i <=100; i++) {
            //System.out.print(i);
            sum = sum + i;
//            System.out.println(sum);
//
        }
        System.out.println("your final sum is " + sum);

        //HOMEWORK
        // create a program to ask user 2 number and add numbers within those range



    }
}
