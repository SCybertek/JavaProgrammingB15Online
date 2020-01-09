package day32;

public class MethodWithReturnTypePractice {
    public static void main(String[] args) {
        /*
        create a method called divide
        it has two double parameter
        and the return the result as double

        @param num1
        @param num2
        @return the division result
        this is called method documentation

         */
       // System.out.println(10/0); //Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println(divide(10,3));
        System.out.println(divide(10,0)); // infinity
        System.out.println(divide (0,10));

    }

    public static double divide (double num1, double num2){
        //if num2 is zero
        // to avoid the unwanted result we check the condition
        //if num2 is zero
        //if yes then return willbe 0

        if (num2==0) {
            return 0.0;
        } else {
            return  num1/num2;
        }

    }

    //task no brainer :)
    //create a method  called seniorCitizen
    //Ashraf : Vegan Chef Turned SDET
    //you test

}
