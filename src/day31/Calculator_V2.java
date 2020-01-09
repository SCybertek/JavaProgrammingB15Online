package day31;

public class Calculator_V2 {
    public static void main(String[] args) {

//        char operator= '+' ; // it can be + - * /
//        int num1 = 10;
//        int num2 = 2;

        calculate('-',2,1);
        calculate('+',2,9);
        calculate('*',2,3);
        calculate('/',4,2);
        calculate('A',12,4);




    }

    public static void calculate (char operator , int num1 , int num2) { // this order MATTER
        //wehn you call this method then it will ask exactly same order

        switch (operator){

            case '+':
                System.out.println("Addition result is "+ (num1+num2));
                break;
            case '-':
                System.out.println("Subtraction result is "+ (num1-num2));
                break;

            case '*':
                System.out.println("multiplication result is "+ (num1*num2));
                break;
            case '/':
                System.out.println("Division result is "+ (num1/num2));
                break;
            default:
                System.out.println("Invalid operator");

        }


    }


}
