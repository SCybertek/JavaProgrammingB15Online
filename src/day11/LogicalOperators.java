package day11;

public class LogicalOperators {
    public static void main(String[] args) {

        //combining multiple conditions together
        // in java there is no range check directly like math
        // for example int x = 70
        // in math: 60< x<100 ---> true <100
        // in Java: x> 60 && x<100
        //&& : means "and"
        // && -- 2 ampersand & 1 ampersand --> logical AND operator

        /* int = 70; x>60 && x<100 ; true

        int x= 10; x>60 && x<100; false

        int x= 110; x>60 && x=100; false

        Think about password login example : only when login and password  both are true you can login

         */

        /*

        || 2 pipe or | 1 pipe is used for compiling 2 conditions: Logical OR operator

        If you have two conditions to check

        When will be this true: As long as one side is true , whole result will be true
        think about buying milk from 2 stores:
        As long as you found the milk in one store, you got the milk then get out!

                    true   false
        int x=70; x>10 || x<5  --> false

        int x = 7; x>10 || x<5 --> false

        int = 17; x >10 || x<5 --> true

        int= -8; x>10 || x<5 --> true

        AS LONG as one side is true the result is true!!!
         */


        System.out.println("Truth table &&");
        System.out.println("result OF true && true is "+ (true && true));

        System.out.println("result OF false && true is "+ (true && false));

        System.out.println("result OF true && false is "+ (false && true));

        System.out.println("result OF false && false is "+ (false && false));


        System.out.println("Truth table ||");
        System.out.println("result OF true || true is "+ (true || true));

        System.out.println("result OF false || true is "+ (true || false));

        System.out.println("result OF true || false is "+ (false || true));

        System.out.println("result OF false || false is "+ (false || false));

// create a varible called num and type int
        // find out whether this number is more than 100 or less than 10


        // find out the number is within the range of 10 -60
        //print out the result

        int num = 55;

        System.out.println("the result is "+ (num > 100 || num <10));
        System.out.println("the result is "+ (num>10 && num<60 ));
        ////if (num > 100 || num <10) {
         //   System.out.println("result is" + (num>100 || num<10) );
       // } else {

      //  }

        // more than 2 conditions at the same  time

        System.out.println(true || false || false); // true
        System.out.println(true && true && false ); //false

        System.out.println( num ==50 || num ==51 ||num==55  );
                           // false --- false --- true : TRUE

        System.out.println( num >50 && num != 52 || num==57 );
                           // true -- true ---false = true

        System.out.println( false || true && true);






    }

}