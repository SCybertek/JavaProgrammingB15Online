package day11;

public class LogicalNotOperator {
    public static void main(String[] args) {

        /*
        Logical not operator ! is used to negate the boolean value
         */
        //IT CANNOT BE USED  WITH ANY OTHER IDEA TYPE , ONLY boolean

       /* System.out.println(true);
        System.out.println( false);
        System.out.println(! true);
        System.out.println(! false);
*/

        // first we can use it directly to boolean value like ture and false
        System.out.println("the result of ! true --->>");
        System.out.println(! true);
        System.out.println("the result of ! false -->>");
        System.out.println(! false);

        boolean isRecording = false;
        // second you can use it in front of a boolean variable and it will give opposite value
        System.out.println("the result of ! isRecording -->");

        // third you can use it in front of boolean expression
        // boolean espression is any expression that result in a boolean value
        // for example 7>5 , x>10 , y == 20, x<= 100, x>y , x>10 && x <100

        System.out.println("the result of !(7>5) is ");
        System.out.println(!(7>5));

        int x = 7;
        System.out.println(" result of (x>10)   is  ");
        System.out.println(x > 10);
        System.out.println(" result of !(x>10)   is  ");
        System.out.println(!(x > 10));

        //  !(x>10)  -->> x<=10
    }
}
