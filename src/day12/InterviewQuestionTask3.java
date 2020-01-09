package day12;

public class InterviewQuestionTask3 {
    public static void main(String[] args) {
        /*
        given a number
        if this number can be divided by 5 without the remainder= Fizz number
        example : 5,15,25,..
        if this n umber can be divided by 3 without remainder= Buzz number
        example : 3, 9, 15, ..
        if this num can be divided by 3 and 5 without the reminder is FizzBuzz number
        example: 15,45,30,90...
         */

        int number = 15;
        if (number%5==0 && number%3!=0) {
            System.out.println("It is a Fizz number");
        } else if (number%3==0 && number%5!=0){
            System.out.println("It is a Buzz number");
        } else if (number%3==0 && number%5==0){
            System.out.println("It is a FizzBuzz number");
        } else {
            System.out.println("not my number!");
        }



            //THIS IS HOW AKBAR DID IT

            int num = 45;

            if (num % 5 == 0 && num % 3 == 0) {

                System.out.println("FIZZ BUZZ NUMBER!");

            } else if (num % 5 == 0) {

                System.out.println("FIZZ NUMBER");

            } else if (num % 3 == 0) {

                System.out.println("BUZZ NUMBER");

            } else {
                System.out.println("NOT MY NUMBER!!!!");
            }

    }

}
