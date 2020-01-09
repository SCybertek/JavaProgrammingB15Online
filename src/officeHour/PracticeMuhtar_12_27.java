package officeHour;


import java.util.Arrays;

public class PracticeMuhtar_12_27 {
    public static void main(String[] args) {

        //write method that can verify any number is odd or even
        oddEven(6);
        System.out.println(convertKmToMiles(123));
        System.out.println(convertGallonToLitters(100));


        int[] arr = {12, 2, 45, 6};
        // printArray(arr);

        printInDescending(arr);

        calculate(4, 3, "-");
        gradeCalculator(46);
        gradeCalculator(67);
        gradeCalculator(88);
    }

    public static void oddEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even");
            return;
        } //else  {
        System.out.println(number + " is odd");
    }


    /**
     * 1. write a method that can convert km to miles
     * Hint: 1 km = 0.612 miles
     */

    public static double convertKmToMiles(double km) {

        double miles = 0;
        miles = km * 0.612;

        return miles;

    }

    /**
     * 2. write a method that can convert gallons to litters
     * Hint: 1 G = 3.75 L
     */

    public static double convertGallonToLitters(double gallon) {
        double litters = gallon * 3.75;
        //gallon = 3.75
        return litters;
    }


    /**
     * 3. write a method that can print out the array in Descending order
     */
    public static void printArray(int[] arr) {
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));

        System.out.println();
    }


    public static void printInDescending(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    /**
     * 4. write a method that accepts 3 parameters: 2 numbers and one operator,
     * and prints out the calculation
     * if operator is not between [-, +, *, /, %] output should be Invalid Operator
     * Ex: calculate(10, 2, "*") ==> 20;
     * calculate(20, 2, "~") ==> invalid operator
     */

    public static void calculate(int a, int b, String operators) {
        if (operators.equals("-")) {
            System.out.println(a - b);
        } else if (operators.equals("+"))
            System.out.println(a + b);
        else if (operators.equals("*"))
            System.out.println(a * b);
        else if (operators.equals("/"))
            System.out.println(a / b);
        else if (operators.equals("%"))
            System.out.println(a % b);
        else
            System.out.println("Invalid operator");

    }

    public static void calculate2(int a, int b, char operator) {

        switch (operator) {
            case '-':
                System.out.println(a - b);
                break;
            case '+':
                System.out.println(a + b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

/**
 * 		5. write a method that can calculate grade
 * 					if score is 100 ~ 90 ==> A
 * 					if score is 89 ~ 80 ==> B
 * 					if score is 79 ~ 70 ==> C
 * 					if score is 69 ~ 60 ==> D
 * 					if score is 0 ~ 59 ==> F
 * 					otherwise ==> Invalid Score
 */

    public static void gradeCalculator (double score) {
       // String grade = "";

        if (score >=90 || score==100 ) {
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("B");
        } else if (score>=70) {
            System.out.println("C");
        } else if (score>=60) {
            System.out.println("D");
        } else if (score == 0 || score<60) {
            System.out.println("F");
        } else {
            System.out.println("Invalid Score");
        }



    }

}


