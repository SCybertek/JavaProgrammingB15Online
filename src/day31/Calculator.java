package day31;

public class Calculator {

    public static void main(String[] args) {

        //create static method that add
        //it accepts 2 numbers and print the result of addition

        add(6,23);
        add(3,1);
        add(7,16);
        add3Numbers(1,3,4);


    }

    // a static method that has 2 parameter
    public static void add (int num1 , int num2) {
        System.out.println("Addition result "+ (num1+num2));

    }
    //how many parameter can method have ? as many as you want!!!!

    public static void add3Numbers (int num1, int num2, int num3) {

        System.out.println("Add 3 numbers "+ (num1+num2+num3));
    }

}
