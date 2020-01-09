package thanksgivingTasks;


public class NumbersTasksAndLogicalOPerators {
    public static void main(String[] args) {

        /*
        Task 1 :
 given 3 whole numbers variable num1, num2 , num3 with value already set .
 If the sum of the numbers are more than 100 print you have won
 if not print sum of 3 numbers are not more than 100
 */
        int num1= 67;
        int num2= 30;
        int num3= 25;

        if (num1+num2+num3>100){
            System.out.println("you have won");
        }else {
            System.out.println("sum of 3 numbers is not more than 100");
        }


        /*
 Task 2 :
 given 3 whole numbers variable  num1, num2 , num3 with value already set .
 and another int variable called sumOfSpecialNumber with initial value 0
 Write a program to print
 Only the sum of numbers that more than 20
 for example  10, 25, 30 . --->> 25+30=55 */
        int sumOfSpecialNumber = 0;
if (num1>=20 || num2>=20 || num3>=20) {
    sumOfSpecialNumber = num1 + num2 + num3;
    System.out.println(sumOfSpecialNumber);
}



 /*
 Task 3 :
 given 3 whole numbers variable num1, num2 , num3 with value already set .
 Write a program to
 find out the largest number and print the result
 */

 if (num1>num2 && num1>num3){
     System.out.println("num1 is the largest number");
 } else if (num2>num1 && num2>num3) {
     System.out.println("num2 is the largest number");
 } else if (num3>num1 && num3>num2){
     System.out.println("num3 is the largest number");
 }


 /*
 Task 4 :
given 3 whole numbers variable num1, num2 , num3 with value already set .
 Write a program with below logic
 it should print true if all the individual numbers are more than 100
 if not print not all numbers are more than 100 */

 if (num1>100 && num2>100 && num3>100){
     System.out.println("true");
 } else {
     System.out.println("not all numbers are more than 100");
 }
 /*
 Task 5 :
given 3 whole numbers variable num1, num2 , num3 with value already set .
 Write a program with below logic
 add 100 to all the numbers less than 20 ;
 print out the value of each variable to test your code.
 */
//bu olmadi bence!!!!

 if (num1<20)  {
     num1+=100;
     System.out.println(num1);}
 else {
     System.out.println(num1);
 }
 if ( num2<20 ) {
     num2+=100;
     System.out.println(num2);}
 else {
     System.out.println(num2);}
 if ( num3<20 ) {
         num3+=100;
         System.out.println(num3);
     } else {
        System.out.println(num3);}
 /*
Task 6 :
given 3 whole numbers variable num1, num2 , num3 with value already set .
 Write a program with below logic

 if multiplication result of num1 and num2 greater than sum of all the numbers
        print excellent result
 else
    not the numebrs combination I am looking for

         */
 if ((num1*num2)>(num1+num2+num3)){
     System.out.println("Excellent Result");
 } else {
     System.out.println("Not number combination I am looking for");
 }



    }
}
