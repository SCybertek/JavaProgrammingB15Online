package day10;

public class Calculator_V2 {
    public static void main(String[] args) {
        //declare to numbers and int num 1 and num2 and assign value
        // declare and assign value for char variable operator +-*/
        // according to the operator, print the result of the operation

        int num1 =20;
        int num2 =10;
        char operator = '+';

        switch (operator) {

            case '-':
                System.out.println(num1-num2);
                break;
            case '+':
                System.out.println(num1+num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid Operator!!!");

        }


    }
}

