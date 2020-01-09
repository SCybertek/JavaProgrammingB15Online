package day31;

import day29.RandomObjectGenerator;

public class Voting {
    public static void main(String[] args) {

      //checkEligibility(); // no parameter in this method
        checkEligibility(89);
        checkEligibility(23);
        checkEligibility(15);

      //  System.out.println(age); // you cannot use age outside of the method

        int youAge = 12;

        checkEligibility(youAge);




    }
    // this method has one int parameter named age
    //whoever is calling this method need to provide a nujmber
    //for each time it is called the age will be different / used once and it is disposed
    //the method parameter can only be accessible within the method
    public static void checkEligibility (int age) {
      //  int age = 15;

        if (age > 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

    }


}
